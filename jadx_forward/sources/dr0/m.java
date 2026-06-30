package dr0;

@j95.b
/* loaded from: classes12.dex */
public final class m extends i95.w implements lh.k {

    /* renamed from: f, reason: collision with root package name */
    public static final int f323998f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f323999d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f324000e = jz5.h.a(jz5.i.f384362d, dr0.l.f323990d);

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f323998f = z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c ? 1 : 24;
    }

    public void Ai() {
        synchronized (Ui()) {
            java.util.Iterator it = Ui().iterator();
            while (it.hasNext()) {
                ((lh.j) it.next()).e();
            }
        }
    }

    public void Bi(boolean z17) {
        synchronized (Ui()) {
            java.util.Iterator it = Ui().iterator();
            while (it.hasNext()) {
                ((lh.j) it.next()).b(z17);
            }
        }
    }

    public void Di(long j17) {
        synchronized (Ui()) {
            java.util.Iterator it = Ui().iterator();
            while (it.hasNext()) {
                ((lh.j) it.next()).c(j17);
            }
        }
        synchronized (Ui()) {
            java.util.Iterator it6 = Ui().iterator();
            while (it6.hasNext()) {
                ((lh.j) it6.next()).a();
            }
        }
    }

    public final void Ni(m3.a aVar) {
        dr0.p1 a17 = dr0.p1.f324022d.a();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        a17.getClass();
        java.util.List n17 = sh.c.n(context);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(n17, 10));
        java.util.Iterator it = n17.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((m3.d) it.next()).f404626b);
        }
        java.util.List S0 = kz5.n0.S0(arrayList);
        for (java.lang.String str : Vi()) {
            if (S0.contains(str)) {
                aVar.mo3938xab27b508(str);
            }
        }
    }

    public long Ri() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("batt_last_charged_r2", 0L);
    }

    public final java.util.LinkedList Ui() {
        return (java.util.LinkedList) this.f324000e.mo141623x754a37bb();
    }

    public java.util.List Vi() {
        return kz5.c0.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274591f, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274592g, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274593h, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274594i, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274595j);
    }

    public void Zi(lh.j stats) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stats, "stats");
        if (this.f323999d) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            stats.f(context);
        }
        synchronized (Ui()) {
            Ui().add(stats);
        }
    }

    public void wi() {
        synchronized (Ui()) {
            java.util.Iterator it = Ui().iterator();
            while (it.hasNext()) {
                ((lh.j) it.next()).d();
            }
        }
    }
}
