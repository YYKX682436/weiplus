package kk5;

/* loaded from: classes.dex */
public final class o0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f390207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final java.util.List T6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            arrayList.add(c01.a2.e(str));
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.z3(m158354x19263085(), kk5.m0.f390203d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new kk5.n0(this));
    }
}
