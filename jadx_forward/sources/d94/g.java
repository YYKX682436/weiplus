package d94;

/* loaded from: classes4.dex */
public class g implements d94.b {

    /* renamed from: a, reason: collision with root package name */
    public final d94.i f309088a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f309089b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Point f309090c = new android.graphics.Point();

    /* renamed from: d, reason: collision with root package name */
    public final d94.a f309091d;

    /* renamed from: e, reason: collision with root package name */
    public d94.f f309092e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f309093f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f309094g;

    /* renamed from: h, reason: collision with root package name */
    public final int f309095h;

    public g(android.content.Context context, android.widget.FrameLayout frameLayout, d94.a aVar, int i17) {
        this.f309088a = new d94.i(context, frameLayout);
        this.f309089b = frameLayout;
        this.f309091d = aVar;
        this.f309095h = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r9 != 3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "handleTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            if (r9 != 0) goto Le
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        Le:
            r9.getAction()     // Catch: java.lang.Throwable -> L8a
            d94.a r2 = r8.f309091d
            r3 = 2
            if (r2 == 0) goto L30
            android.graphics.Point r4 = r8.f309093f     // Catch: java.lang.Throwable -> L8a
            int r5 = r8.f309095h
            if (r4 == 0) goto L1e
            if (r5 != r3) goto L24
        L1e:
            android.graphics.Point r4 = r2.b()     // Catch: java.lang.Throwable -> L8a
            r8.f309093f = r4     // Catch: java.lang.Throwable -> L8a
        L24:
            android.graphics.Rect r4 = r8.f309094g     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L2a
            if (r5 != r3) goto L30
        L2a:
            android.graphics.Rect r2 = r2.a()     // Catch: java.lang.Throwable -> L8a
            r8.f309094g = r2     // Catch: java.lang.Throwable -> L8a
        L30:
            float r2 = r9.getX()     // Catch: java.lang.Throwable -> L8a
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L8a
            android.graphics.Point r4 = r8.f309093f     // Catch: java.lang.Throwable -> L8a
            int r4 = r4.x     // Catch: java.lang.Throwable -> L8a
            int r2 = r2 + r4
            float r4 = r9.getY()     // Catch: java.lang.Throwable -> L8a
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L8a
            android.graphics.Point r5 = r8.f309093f     // Catch: java.lang.Throwable -> L8a
            int r5 = r5.y     // Catch: java.lang.Throwable -> L8a
            int r4 = r4 + r5
            android.graphics.Point r5 = r8.f309090c
            r5.set(r2, r4)     // Catch: java.lang.Throwable -> L8a
            int r9 = r9.getAction()     // Catch: java.lang.Throwable -> L8a
            d94.i r6 = r8.f309088a
            if (r9 == 0) goto L86
            r7 = 1
            if (r9 == r7) goto L70
            if (r9 == r3) goto L5a
            r3 = 3
            if (r9 == r3) goto L70
            goto La3
        L5a:
            android.graphics.Rect r9 = r8.f309094g     // Catch: java.lang.Throwable -> L8a
            if (r9 != 0) goto L62
            r6.a(r5)     // Catch: java.lang.Throwable -> L8a
            goto La3
        L62:
            boolean r9 = r9.contains(r2, r4)     // Catch: java.lang.Throwable -> L8a
            if (r9 == 0) goto L6c
            r6.a(r5)     // Catch: java.lang.Throwable -> L8a
            goto La3
        L6c:
            r6.h()     // Catch: java.lang.Throwable -> L8a
            goto La3
        L70:
            android.graphics.Rect r9 = r8.f309094g     // Catch: java.lang.Throwable -> L8a
            if (r9 == 0) goto L7a
            boolean r9 = r9.contains(r2, r4)     // Catch: java.lang.Throwable -> L8a
            if (r9 == 0) goto L7d
        L7a:
            r6.a(r5)     // Catch: java.lang.Throwable -> L8a
        L7d:
            r6.h()     // Catch: java.lang.Throwable -> L8a
            r9 = 0
            r8.f309094g = r9     // Catch: java.lang.Throwable -> L8a
            r8.f309093f = r9     // Catch: java.lang.Throwable -> L8a
            goto La3
        L86:
            r6.h()     // Catch: java.lang.Throwable -> L8a
            goto La3
        L8a:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "handleTouchEvent, exp="
            r2.<init>(r3)
            java.lang.String r9 = r9.toString()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "ParticleAnimProxy"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r9)
        La3:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d94.g.a(android.view.MotionEvent):void");
    }

    public void b(d94.f fVar) {
        d94.i iVar = this.f309088a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy");
        try {
            if (this.f309092e != fVar) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleAnimProxy", "setAnimConfig, old=" + this.f309092e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleAnimProxy", "setAnimConfig, new=" + fVar);
                iVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleGenerator", "clear");
                iVar.f309099b.clear();
                iVar.f309100c.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                android.view.ViewGroup viewGroup = this.f309089b;
                viewGroup.removeAllViews();
                if (fVar != null) {
                    iVar.j(fVar);
                    viewGroup.setVisibility(0);
                } else {
                    viewGroup.setVisibility(8);
                }
                this.f309092e = fVar;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ParticleAnimProxy", "setAnimConfig, config not change");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ParticleAnimProxy", "setAnimConfig, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy");
    }
}
