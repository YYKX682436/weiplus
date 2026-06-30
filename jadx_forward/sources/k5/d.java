package k5;

/* loaded from: classes13.dex */
public abstract class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final b5.c f385655d = new b5.c();

    public void a(b5.w wVar, java.lang.String str) {
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = wVar.f99430c;
        j5.x n17 = abstractC1265x5c5aefcc.n();
        j5.b i17 = abstractC1265x5c5aefcc.i();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            java.lang.String str2 = (java.lang.String) linkedList.remove();
            j5.g0 g0Var = (j5.g0) n17;
            a5.q0 f17 = g0Var.f(str2);
            if (f17 != a5.q0.SUCCEEDED && f17 != a5.q0.FAILED) {
                g0Var.p(a5.q0.CANCELLED, str2);
            }
            linkedList.addAll(((j5.d) i17).a(str2));
        }
        b5.e eVar = wVar.f99433f;
        synchronized (eVar.f99401q) {
            a5.a0.c().a(b5.e.f99390r, java.lang.String.format("Processor cancelling %s", str), new java.lang.Throwable[0]);
            ((java.util.HashSet) eVar.f99399o).add(str);
            b5.a0 a0Var = (b5.a0) ((java.util.HashMap) eVar.f99396i).remove(str);
            boolean z17 = a0Var != null;
            if (a0Var == null) {
                a0Var = (b5.a0) ((java.util.HashMap) eVar.f99397m).remove(str);
            }
            b5.e.b(str, a0Var);
            if (z17) {
                eVar.g();
            }
        }
        java.util.Iterator it = wVar.f99432e.iterator();
        while (it.hasNext()) {
            ((b5.f) it.next()).b(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public void run() {
        b5.c cVar = this.f385655d;
        try {
            b();
            cVar.a(a5.j0.f82935a);
        } catch (java.lang.Throwable th6) {
            cVar.a(new a5.f0(th6));
        }
    }
}
