package yf2;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f543320a = new java.util.ArrayList();

    public final void a(r45.q12 q12Var) {
        java.util.List list = this.f543320a;
        kz5.h0.B(list, yf2.s.f543313d);
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            yf2.r rVar = (yf2.r) ((java.lang.ref.WeakReference) it.next()).get();
            if (rVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60) rVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveModeInfoChanged: mode=");
                sb6.append(q12Var != null ? java.lang.Integer.valueOf(q12Var.m75939xb282bd08(0)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", sb6.toString());
                if (q12Var != null) {
                    z60Var.p();
                    z60Var.q();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b60 b60Var = z60Var.f202073n;
                    if (b60Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabAdapter");
                        throw null;
                    }
                    b60Var.m8146xced61ae5();
                } else {
                    continue;
                }
            }
        }
    }
}
