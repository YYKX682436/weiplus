package up4;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final up4.g f511406a = new up4.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f511407b = new java.util.HashMap();

    public final long a(byte[] info, com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 playView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playView, "playView");
        r45.h70 h70Var = new r45.h70();
        try {
            h70Var.mo11468x92b714fd(info);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoPlayManager", "key: " + currentTimeMillis);
            if (z17) {
                h70Var.f457434h = "";
                h70Var.f457433g = false;
            }
            f511407b.put(java.lang.Long.valueOf(currentTimeMillis), new up4.h(h70Var, playView));
            return currentTimeMillis;
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsFakeVideoPlayManager", "parse byte error");
            return -1L;
        }
    }
}
