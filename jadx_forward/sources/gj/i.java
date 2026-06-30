package gj;

/* loaded from: classes12.dex */
public class i implements android.util.Printer {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Printer f353880d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f353881e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f353882f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gj.k f353883g;

    public i(gj.k kVar, android.util.Printer printer) {
        this.f353883g = kVar;
        this.f353880d = printer;
    }

    @Override // android.util.Printer
    public void println(java.lang.String str) {
        android.util.Printer printer = this.f353880d;
        if (printer != null) {
            printer.println(str);
            if (this.f353880d == this) {
                throw new java.lang.RuntimeException("Matrix.LooperMonitor origin == this");
            }
        }
        if (!this.f353881e) {
            boolean z17 = str.charAt(0) == '>' || str.charAt(0) == '<';
            this.f353882f = z17;
            this.f353881e = true;
            if (!z17) {
                oj.j.b("Matrix.LooperMonitor", "[println] Printer is inValid! x:%s", str);
            }
        }
        if (this.f353882f) {
            gj.k kVar = this.f353883g;
            if (!(str.charAt(0) == '>')) {
                synchronized (kVar.f353893h) {
                    java.util.Iterator it = kVar.f353893h.iterator();
                    if (it.hasNext()) {
                        ((gj.l) ((gj.h) it.next())).getClass();
                        throw null;
                    }
                }
                synchronized (kVar.f353894i) {
                    for (gj.g gVar : ((java.util.HashMap) kVar.f353894i).values()) {
                        if (gVar.f353879c.mo53758x7b953cf2() && gVar.f353877a) {
                            gVar.f353877a = false;
                            gVar.f353879c.b(str, gVar.f353878b, java.lang.System.nanoTime());
                        }
                    }
                }
                return;
            }
            synchronized (kVar.f353893h) {
                java.util.Iterator it6 = kVar.f353893h.iterator();
                if (it6.hasNext()) {
                    ((gj.l) ((gj.h) it6.next())).getClass();
                    throw null;
                }
            }
            synchronized (kVar.f353894i) {
                for (gj.g gVar2 : ((java.util.HashMap) kVar.f353894i).values()) {
                    if (gVar2.f353879c.mo53758x7b953cf2() && !gVar2.f353877a) {
                        gVar2.f353877a = true;
                        gVar2.f353878b = java.lang.System.nanoTime();
                        gVar2.f353879c.c(str);
                    }
                }
            }
        }
    }
}
