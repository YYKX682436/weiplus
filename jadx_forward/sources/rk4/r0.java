package rk4;

/* loaded from: classes7.dex */
public final class r0 implements com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24960x53d2f52a, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24960x53d2f52a
    /* renamed from: downloadImage */
    public void mo92517xad05b3(java.lang.String url, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        cl4.j jVar = cl4.j.f124483a;
        rk4.q0 q0Var = new rk4.q0(callback);
        int abs = java.lang.Math.abs(url.hashCode() % 5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingDownloadHelper", "download threadId=" + abs);
        ku5.u0 u0Var = ku5.t0.f394148d;
        ((ku5.t0) u0Var).h(new cl4.i(url, q0Var), "TingDownload-" + abs);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24960x53d2f52a
    /* renamed from: getTingCacheDirectory */
    public java.lang.String mo92518xe170a98f() {
        cl4.j jVar = cl4.j.f124483a;
        java.lang.String str = cl4.j.f124484b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-saveDir>(...)");
        return str;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24960x53d2f52a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24960x53d2f52a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24960x53d2f52a.Companion.m92520x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24960x53d2f52a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24960x53d2f52a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24960x53d2f52a.Companion.m92520x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }
}
