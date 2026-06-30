package wo5;

/* loaded from: classes13.dex */
public final class b implements uo5.n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f529848a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f529849b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f529850c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f529851d;

    public b(boolean z17, android.os.Handler codecHandler, yz5.a qosGetter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codecHandler, "codecHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qosGetter, "qosGetter");
        this.f529848a = z17;
        this.f529849b = codecHandler;
        this.f529850c = qosGetter;
        this.f529851d = z17 ? "video/hevc" : "video/avc";
    }

    @Override // uo5.n
    public uo5.a a(boolean z17) {
        uo5.u uVar = (uo5.u) this.f529850c.mo152xb9724478();
        java.lang.String str = this.f529851d;
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HW.ILinkVoIPEncodeConfigProviderImpl", "getCodecConfig: get qos params null");
            android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(str, 0, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createVideoFormat, "createVideoFormat(...)");
            return new uo5.a(true, str, createVideoFormat);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HW.ILinkVoIPEncodeConfigProviderImpl", "getCodecConfig: qos " + uVar);
        int i17 = uVar.f511277a;
        android.media.MediaFormat createVideoFormat2 = android.media.MediaFormat.createVideoFormat(str, i17, uVar.f511278b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createVideoFormat2, "createVideoFormat(...)");
        createVideoFormat2.setInteger("color-format", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48031x5e80f9d5);
        createVideoFormat2.setInteger("stride", i17);
        boolean z18 = this.f529848a;
        short s17 = uVar.f511279c;
        if (z17 || z18) {
            createVideoFormat2.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, s17 * 1000);
        } else {
            createVideoFormat2.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, s17 * 1200);
        }
        createVideoFormat2.setInteger("frame-rate", uVar.f511280d);
        createVideoFormat2.setInteger("i-frame-interval", 160);
        if (!z18) {
            createVideoFormat2.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, z17 ? 8 : 1);
            createVideoFormat2.setInteger(ya.b.f77487x44fa364, 256);
        }
        createVideoFormat2.setInteger("bitrate-mode", 2);
        return new uo5.a(true, str, createVideoFormat2);
    }

    @Override // uo5.n
    public android.os.Handler b() {
        return this.f529849b;
    }

    @Override // uo5.n
    public int c() {
        return 1;
    }
}
