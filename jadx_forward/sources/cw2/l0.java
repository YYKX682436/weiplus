package cw2;

/* loaded from: classes10.dex */
public final class l0 implements cw2.aa {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 f305353a;

    /* renamed from: b, reason: collision with root package name */
    public final zv3.c f305354b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f305355c;

    /* renamed from: d, reason: collision with root package name */
    public final long f305356d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f305357e;

    public l0(android.content.Context context, r45.mb4 media) {
        java.lang.String wi6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc();
        this.f305355c = c22979xbb268bc;
        this.f305353a = new com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68(context);
        r45.h70 h70Var = (r45.h70) media.m75936x14adae67(21);
        r45.h70 h70Var2 = h70Var == null ? new r45.h70() : h70Var;
        h70Var2.f457434h = "";
        h70Var2.f457433g = false;
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        zv3.c e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.e(h70Var2);
        this.f305354b = e17;
        ((zv3.f) e17).e();
        i95.m c17 = i95.n0.c(bg0.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        rm5.v hj6 = ((b92.u2) ((bg0.v) c17)).hj(h70Var2, c22979xbb268bc, e17, null, 0);
        this.f305356d = hj6.i();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_finder_post_hdr_cover_color_correct, 1) == 1) {
            java.util.Iterator it = hj6.f479117l.iterator();
            while (it.hasNext()) {
                rm5.j jVar = (rm5.j) it.next();
                if (jVar.f479033b == 2 && (wi6 = ((rs0.s) ((ss0.e) i95.n0.c(ss0.e.class))).wi(jVar.f479032a)) != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(wi6);
                        ((ag0.o) ((bg0.w) i95.n0.c(bg0.w.class))).wi(hj6, jSONObject.optInt("colorStandard"), jSONObject.optInt("colorTransfer"), java.lang.Integer.valueOf(jSONObject.optInt("ffmpegColorPrimaries")));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        }
        this.f305353a.o(hj6);
    }

    @Override // cw2.aa
    public void a(yz5.a onReady, yz5.a onDestroy, yz5.l onSeekFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onReady, "onReady");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDestroy, "onDestroy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSeekFrame, "onSeekFrame");
        this.f305357e = onDestroy;
        this.f305353a.m82516xd24ee348(new cw2.k0(this, onReady, onSeekFrame));
    }

    @Override // cw2.aa
    /* renamed from: destroy */
    public void mo122847x5cd39ffa() {
        ((zv3.f) this.f305354b).a();
        this.f305355c.k();
        this.f305353a.g();
        yz5.a aVar = this.f305357e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // cw2.aa
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo122848x12501425() {
        return this.f305353a.getBitmap();
    }

    @Override // cw2.aa
    /* renamed from: getCurrentPositionMs */
    public long mo122849xddd35a52() {
        return this.f305353a.m82509xa86cd69f();
    }

    @Override // cw2.aa
    /* renamed from: getView */
    public android.view.View mo122850xfb86a31b() {
        return this.f305353a;
    }

    @Override // cw2.aa
    /* renamed from: resume */
    public void mo122851xc84dc82d() {
        this.f305353a.h();
    }

    @Override // cw2.aa
    /* renamed from: seekTo */
    public void mo122852xc9fc1b13(long j17) {
        this.f305353a.j(j17 + this.f305356d);
    }
}
