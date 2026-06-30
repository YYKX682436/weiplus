package fe2;

/* loaded from: classes3.dex */
public final class n implements oa.c {
    @Override // oa.c
    public void h0(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "onTabReselected: ");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof he2.e) {
            he2.e eVar = (he2.e) obj;
            eVar.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
            eVar.a(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "onTabUnselected: ");
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof he2.e) {
            he2.e eVar = (he2.e) obj;
            eVar.b(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz);
            eVar.a(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "onTabSelected: " + eVar.f362421b);
        }
    }
}
