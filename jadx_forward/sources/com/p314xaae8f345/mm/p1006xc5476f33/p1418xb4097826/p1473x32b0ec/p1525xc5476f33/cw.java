package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class cw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f193733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f193734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f193735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f193737h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f193738i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193739m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193740n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193741o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193742p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f193743q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar, int i17, java.lang.String str, int i18, int i19, android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3, android.graphics.PointF pointF4, android.graphics.PointF pointF5) {
        super(0);
        this.f193733d = bitmap;
        this.f193734e = owVar;
        this.f193735f = i17;
        this.f193736g = str;
        this.f193737h = i18;
        this.f193738i = i19;
        this.f193739m = pointF;
        this.f193740n = pointF2;
        this.f193741o = pointF3;
        this.f193742p = pointF4;
        this.f193743q = pointF5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f193734e;
        android.graphics.Bitmap bitmap = this.f193733d;
        if (bitmap != null) {
            android.widget.ImageView imageView = new android.widget.ImageView(owVar.f446856d.getContext());
            imageView.setImageBitmap(bitmap);
            int i17 = this.f193735f;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i17, i17);
            marginLayoutParams.setMarginStart(this.f193737h);
            marginLayoutParams.topMargin = this.f193738i;
            imageView.setLayoutParams(marginLayoutParams);
            owVar.B1().addView(imageView);
            imageView.setAlpha(0.0f);
            imageView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bw(imageView, this.f193734e, this.f193739m, this.f193740n, this.f193741o, this.f193742p, this.f193743q));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(owVar.f195320p, "loadOthersAvatar fail: " + this.f193736g);
        }
        return jz5.f0.f384359a;
    }
}
