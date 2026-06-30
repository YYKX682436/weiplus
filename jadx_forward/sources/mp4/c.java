package mp4;

/* loaded from: classes10.dex */
public final class c implements com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 {

    /* renamed from: a, reason: collision with root package name */
    public final wq.d f412001a;

    public c(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
        this.f412001a = new wq.b();
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(new org.json.JSONObject(value).optString("emoji_md5"));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(N, "getEmojiInfoFromMD5(...)");
            this.f412001a = com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43681x99bce80e(N);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: destroy */
    public void mo83821x5cd39ffa() {
        this.f412001a.mo174305x5cd39ffa();
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: duration */
    public long mo83822x89444d94() {
        return 1073741824L;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: getFrame */
    public android.graphics.Bitmap mo83823x74704fb7() {
        wq.d dVar = this.f412001a;
        dVar.c();
        return dVar.mo174306x74704fb7();
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: seekTo */
    public void mo83824xc9fc1b13(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: size */
    public android.util.Size mo83825x35e001() {
        wq.d dVar = this.f412001a;
        return new android.util.Size(dVar.e(), dVar.b());
    }
}
