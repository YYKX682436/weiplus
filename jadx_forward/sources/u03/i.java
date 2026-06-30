package u03;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u03.j f504999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f505000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u03.j jVar, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504999d = jVar;
        this.f505000e = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new u03.i(this.f504999d, this.f505000e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((u03.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s0 s0Var = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s0();
            s0Var.mo11468x92b714fd(this.f505000e);
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(s0Var.f149614n);
            xe0.d0 d0Var = (xe0.d0) i95.n0.c(xe0.d0.class);
            java.lang.String id6 = s0Var.f149607d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(id6, "id");
            java.lang.String mediaUrl = s0Var.f149614n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaUrl, "mediaUrl");
            ((we0.w0) d0Var).getClass();
            java.lang.String g17 = bk4.n.f103046a.g("video", id6, mediaUrl);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            ck4.c cVar = ck4.c.f124081a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            java.lang.String mediaUrl2 = s0Var.f149614n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaUrl2, "mediaUrl");
            this.f504999d.getClass();
            return cVar.b(a17, mediaUrl2, g17, 0, "xV2", "", "", "", null, "MicroMsg.TextStatusCdnTaskFactory");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
