package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.ShowCommentImageView */
/* loaded from: classes5.dex */
public class C17995x112dd83e extends android.widget.ImageView {

    /* renamed from: e, reason: collision with root package name */
    public static android.graphics.Bitmap f248160e;

    /* renamed from: f, reason: collision with root package name */
    public static android.graphics.Bitmap f248161f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Field f248162g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.reflect.Field f248163h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f248164i;

    /* renamed from: d, reason: collision with root package name */
    public boolean f248165d;

    public C17995x112dd83e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248165d = false;
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        if (f248162g != null && f248163h != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
            return;
        }
        try {
            f248162g = android.view.View.class.getDeclaredField("mDrawingCache");
            f248163h = android.view.View.class.getDeclaredField("mUnscaledDrawingCache");
            f248162g.setAccessible(true);
            f248163h.setAccessible(true);
            f248164i = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShowCommentImageView", "init error: %s", e17.getMessage());
            f248164i = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    public final void b(boolean z17, boolean z18) {
        java.lang.reflect.Field field;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        try {
            field = z17 ? f248162g : f248163h;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", e17.getMessage());
        }
        if (z18) {
            field.set(this, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        } else {
            android.graphics.Bitmap bitmap = z17 ? f248161f : f248160e;
            if (bitmap != null) {
                field.set(this, bitmap);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void buildDrawingCache(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = "buildDrawingCache"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.ShowCommentImageView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248164i
            if (r2 == 0) goto La0
            boolean r2 = r8.f248165d
            r3 = 1
            if (r2 != 0) goto L99
            java.lang.String r2 = "checkIfCanReuseDrawingCache"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            boolean r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248164i
            java.lang.String r5 = "MicroMsg.ShowCommentImageView"
            r6 = 0
            if (r4 != 0) goto L21
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
        L1f:
            r3 = r6
            goto L4f
        L21:
            if (r9 == 0) goto L26
            java.lang.reflect.Field r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248162g     // Catch: java.lang.Exception -> L36
            goto L28
        L26:
            java.lang.reflect.Field r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248163h     // Catch: java.lang.Exception -> L36
        L28:
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Exception -> L36
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Exception -> L36
            if (r4 == 0) goto L31
            goto L32
        L31:
            r3 = r6
        L32:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L4f
        L36:
            r3 = move-exception
            java.lang.String r4 = ""
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r5, r3, r4, r7)
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "checkIfCanReuseDrawingCache error: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r4, r3)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L1f
        L4f:
            if (r3 != 0) goto L95
            if (r9 == 0) goto L56
            android.graphics.Bitmap r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248161f
            goto L58
        L56:
            android.graphics.Bitmap r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248160e
        L58:
            if (r2 == 0) goto L64
            boolean r2 = r2.isRecycled()
            if (r2 != 0) goto L64
            r8.b(r9, r6)
            goto La3
        L64:
            super.buildDrawingCache(r9)
            java.lang.String r2 = "getStaticDrawingCache"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            if (r9 == 0) goto L71
            java.lang.reflect.Field r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248162g     // Catch: java.lang.Exception -> L83
            goto L73
        L71:
            java.lang.reflect.Field r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248163h     // Catch: java.lang.Exception -> L83
        L73:
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Exception -> L83
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Exception -> L83
            if (r3 == 0) goto L91
            if (r9 == 0) goto L80
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248161f = r3     // Catch: java.lang.Exception -> L83
            goto L91
        L80:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248160e = r3     // Catch: java.lang.Exception -> L83
            goto L91
        L83:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r3 = "getStaticDrawingCache error: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r3, r9)
        L91:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto La3
        L95:
            super.buildDrawingCache(r9)
            goto La3
        L99:
            r8.b(r9, r3)
            super.buildDrawingCache(r9)
            goto La3
        La0:
            super.buildDrawingCache(r9)
        La3:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.buildDrawingCache(boolean):void");
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        super.destroyDrawingCache();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        try {
            f248162g.set(this, null);
            f248163h.set(this, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n8(this), 100L);
        } else {
            this.f248165d = true;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnClickListener", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        super.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m8(this, onClickListener));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnClickListener", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    public C17995x112dd83e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f248165d = false;
        a();
    }
}
