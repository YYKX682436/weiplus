package rp4;

/* loaded from: classes4.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct0.b f480218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ct0.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480218d = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rp4.r(this.f480218d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rp4.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dw3.c0 c0Var = dw3.c0.f325715a;
        java.lang.String videoPath = this.f480218d.f303737a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        if (!gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true)) {
            return null;
        }
        java.lang.String h17 = ai3.d.h("mp4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "auto save " + videoPath + " exportPath " + h17, videoPath, h17);
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, videoPath, h17);
        q75.c.f(h17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        return h17;
    }
}
