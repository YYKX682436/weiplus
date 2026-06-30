package mp4;

/* loaded from: classes10.dex */
public final class d implements com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f412002a;

    public d() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f412002a = context;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa
    /* renamed from: getDecoder */
    public com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 mo83827x99bce80e(byte[] bytes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
        return new mp4.c("test");
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa
    /* renamed from: getDecoder */
    public com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 mo83826x99bce80e(java.lang.String path) {
        java.lang.String optString;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        try {
            optString = new org.json.JSONObject(path).optString("scheme");
        } catch (java.lang.Exception unused) {
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)) {
            return new mp4.b(this.f412002a, path);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "emoji")) {
            return new mp4.c(path);
        }
        return new mp4.a();
    }
}
