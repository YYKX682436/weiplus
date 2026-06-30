package hm1;

/* loaded from: classes7.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hm1.i f363732d = new hm1.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_wxa_use_xweb_input, 0) == 1) {
            z17 = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useXWebInput: abtest[");
            sb6.append(z17);
            sb6.append("], isXWeb[");
            sb6.append(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0());
            sb6.append("], supper[");
            hm1.m mVar = hm1.m.f363736a;
            sb6.append(mVar.b());
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", sb6.toString());
            return java.lang.Boolean.valueOf(!z17 && mVar.b());
        }
        z17 = false;
        java.lang.StringBuilder sb62 = new java.lang.StringBuilder("useXWebInput: abtest[");
        sb62.append(z17);
        sb62.append("], isXWeb[");
        sb62.append(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0());
        sb62.append("], supper[");
        hm1.m mVar2 = hm1.m.f363736a;
        sb62.append(mVar2.b());
        sb62.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", sb62.toString());
        return java.lang.Boolean.valueOf(!z17 && mVar2.b());
    }
}
