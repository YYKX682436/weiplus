package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class ue implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f211447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f211448c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f211450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f211451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f211452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Canvas f211453h;

    public ue(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, int i17, int i18, long j17, boolean z17, android.graphics.Canvas canvas) {
        this.f211446a = activityC15059x3e98c949;
        this.f211447b = bitmap;
        this.f211448c = bitmap2;
        this.f211449d = i17;
        this.f211450e = i18;
        this.f211451f = j17;
        this.f211452g = z17;
        this.f211453h = canvas;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap == null) {
            return;
        }
        if (!z17) {
            int i17 = this.f211449d;
            int i18 = this.f211450e;
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, i17, i18);
            if (bitmap.getHeight() < i18) {
                int height = (i17 - bitmap.getHeight()) / 2;
                rect.top = height;
                rect.bottom = height + bitmap.getHeight();
            }
            if (bitmap.getWidth() < i17) {
                int width = (i17 - bitmap.getWidth()) / 2;
                rect.left = width;
                rect.right = width + bitmap.getWidth();
            }
            this.f211453h.drawBitmap(bitmap, (android.graphics.Rect) null, rect, (android.graphics.Paint) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211446a;
        activityC15059x3e98c949.o7(this.f211447b, this.f211448c, this.f211449d, this.f211450e, this.f211451f, activityC15059x3e98c949.f210215x0, java.lang.Boolean.valueOf(this.f211452g));
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderSelectCoverUI", "gen title error");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211446a;
        android.graphics.Bitmap bitmap = this.f211447b;
        android.graphics.Bitmap bitmap2 = this.f211448c;
        int i17 = this.f211449d;
        int i18 = this.f211450e;
        long j17 = this.f211451f;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f211452g);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.f210201e2;
        activityC15059x3e98c949.o7(bitmap, bitmap2, i17, i18, j17, null, valueOf);
    }
}
