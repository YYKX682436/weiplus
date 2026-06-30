package up4;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 f511408a;

    /* renamed from: b, reason: collision with root package name */
    public final zv3.c f511409b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f511410c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f511411d;

    public h(r45.h70 compositionInfo, com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 playView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compositionInfo, "compositionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playView, "playView");
        this.f511408a = playView;
        zv3.c e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.e(compositionInfo);
        this.f511409b = e17;
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc();
        this.f511410c = c22979xbb268bc;
        ((zv3.f) e17).e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.d(compositionInfo, c22979xbb268bc);
        this.f511411d = d17;
        d17.p(e17);
        d17.t(new android.graphics.Rect());
    }

    public final void a() {
        rs0.q a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = this.f511411d;
        java.util.Iterator it = h1Var.f257130c.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
            if (i1Var.f257150b == 2 && (a17 = rs0.r.f480849a.a(i1Var.f257149a)) != null) {
                h1Var.b(a17.f480846b, a17.f480847c, a17.f480848d);
            }
        }
    }
}
