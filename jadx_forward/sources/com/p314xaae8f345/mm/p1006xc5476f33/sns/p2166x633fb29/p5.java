package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class p5 extends mt0.a {

    /* renamed from: f, reason: collision with root package name */
    public long f246111f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f246112g;

    /* renamed from: h, reason: collision with root package name */
    public final int f246113h;

    public p5(java.lang.String str, com.p314xaae8f345.mm.p872xbfc2bd01.r rVar, long j17) {
        super(str, rVar);
        this.f246112g = false;
        this.f246113h = 255;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (j17 != 0) {
            this.f246111f = j17;
            hashMap.put(str, java.lang.Boolean.TRUE);
            this.f246112g = true;
        } else {
            if (hashMap.containsKey(str)) {
                return;
            }
            this.f246111f = android.os.SystemClock.uptimeMillis();
            hashMap.put(str, java.lang.Boolean.TRUE);
            this.f246112g = true;
        }
    }

    public long d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStartTime", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
        long j17 = this.f246111f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStartTime", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
        return j17;
    }

    @Override // mt0.a, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("draw", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
        android.graphics.Rect bounds = getBounds();
        android.graphics.Bitmap bitmap = this.f412719e.f150503d;
        if (ca4.z0.f(bitmap)) {
            boolean z17 = this.f246112g;
            int i17 = this.f246113h;
            android.graphics.Paint paint = this.f412718d;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                long j17 = this.f246111f;
                float f17 = ((float) (uptimeMillis - j17)) / 150.0f;
                if (j17 == 0) {
                    f17 = 0.0f;
                }
                if (f17 >= 1.0f) {
                    this.f246112g = false;
                    paint.setAlpha(i17);
                    canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
                } else {
                    paint.setAlpha((int) (i17 * f17));
                    canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
                    invalidateSelf();
                }
            } else {
                paint.setAlpha(i17);
                canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
            }
        } else {
            canvas.drawColor(-1118482);
            this.f246111f = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.model.SnsFadeDrawable");
    }
}
