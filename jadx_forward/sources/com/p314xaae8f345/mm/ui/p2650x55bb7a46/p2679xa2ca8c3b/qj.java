package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class qj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f286903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f286904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f286905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f286906g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286907h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f286908i;

    public qj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, android.graphics.Bitmap bitmap, int i17, int i18, android.widget.ImageView imageView, java.lang.String str) {
        this.f286908i = c21908xb66fd105;
        this.f286903d = bitmap;
        this.f286904e = i17;
        this.f286905f = i18;
        this.f286906g = imageView;
        this.f286907h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f286908i;
        android.graphics.Bitmap bitmap2 = this.f286903d;
        int i17 = this.f286904e;
        int i18 = this.f286905f;
        c21908xb66fd105.getClass();
        int ceil = (int) java.lang.Math.ceil(bitmap2.getWidth() * (i17 / bitmap2.getHeight()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[createBackgroundBitmap] finalBitmapWidth: %s, finalBitmapHeight: %s, srcBitmapWidth: %s, srcBitmapHeight: %s", java.lang.Integer.valueOf(ceil), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bitmap2.getWidth()), java.lang.Integer.valueOf(bitmap2.getHeight()));
        if (ceil <= 0 || i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[createBackgroundBitmap] error");
            bitmap = null;
        } else {
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, ceil, i17, true);
            int i19 = ceil - i18;
            if (i19 < 0) {
                i19 = 0;
            }
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.u0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a0(createScaledBitmap, new android.graphics.Rect(i19, 0, ceil, i17), false), false, new float[]{0.0f, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8), 0.0f, 0.0f}, false);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pj(this, bitmap));
    }
}
