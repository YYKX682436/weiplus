package gr;

/* loaded from: classes12.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.jni.p801x7810c374.C10772xa0df3c00 f356211a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f356212b = new jt0.i(200, gr.r.class);

    /* renamed from: c, reason: collision with root package name */
    public final kk.j f356213c = new jt0.i(150, gr.r.class);

    public r(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        fp.d0.o("voipComm");
        fp.d0.o("voipChannel");
        fp.d0.o("voipCodec");
        fp.d0.o("emojihelper");
        this.f356211a = zk0.b.f554935a;
    }

    public final boolean a(boolean z17) {
        com.p314xaae8f345.mm.jni.p801x7810c374.C10772xa0df3c00 c10772xa0df3c00 = this.f356211a;
        if (c10772xa0df3c00 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiRgbaCacheManager", "clearCache, cacheManager null");
        }
        if (z17) {
            this.f356213c.mo143584x5a5b64d();
        } else {
            this.f356212b.mo143584x5a5b64d();
        }
        if (c10772xa0df3c00 != null) {
            return c10772xa0df3c00.a(z17);
        }
        return false;
    }

    public final int b(boolean z17) {
        com.p314xaae8f345.mm.jni.p801x7810c374.C10772xa0df3c00 c10772xa0df3c00 = this.f356211a;
        if (c10772xa0df3c00 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiRgbaCacheManager", "getEmojiRgbaCacheCurrentSize, cacheManager null");
            return -1;
        }
        if (c10772xa0df3c00 != null) {
            return c10772xa0df3c00.b(z17);
        }
        return -1;
    }

    public final android.graphics.Bitmap c(java.lang.String str) {
        if (str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return (android.graphics.Bitmap) this.f356213c.get(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiRgbaCacheManager", "getQQNewEmojiCacheBitmap failed, cacheKey error");
        return null;
    }

    public final android.graphics.Bitmap d(java.lang.String str) {
        if (str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return (android.graphics.Bitmap) this.f356212b.get(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiRgbaCacheManager", "getSystemEmojiCacheBitmap failed, cacheKey error");
        return null;
    }

    public final void e(java.lang.String str, boolean z17, android.graphics.Bitmap bitmap) {
        if (bitmap == null || str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiRgbaCacheManager", "putEmojiRgbaCacheFrame failed, bitmap null");
        } else if (z17) {
            this.f356213c.put(str, bitmap);
        } else {
            this.f356212b.put(str, bitmap);
        }
    }
}
