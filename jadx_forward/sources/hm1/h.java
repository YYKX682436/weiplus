package hm1;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hm1.h f363731d = new hm1.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = com.p314xaae8f345.p3210x3857dc.a3.m() && com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useXWebCamera: abtest[");
        hm1.m mVar = hm1.m.f363736a;
        sb6.append(mVar.a());
        sb6.append("], isXWeb[");
        sb6.append(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0());
        sb6.append("], supper[");
        sb6.append(z17);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", sb6.toString());
        return java.lang.Boolean.valueOf(z17 && mVar.a());
    }
}
