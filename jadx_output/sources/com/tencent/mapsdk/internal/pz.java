package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pz extends com.tencent.mapsdk.internal.es {

    /* renamed from: a, reason: collision with root package name */
    android.widget.TextView f50845a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qa.a f50846b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f50847c;

    public pz(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext) {
        this.f50847c = context;
        this.f50845a = new com.tencent.mapsdk.internal.nb(this.f50847c, tencentMapContext);
    }

    private android.graphics.Bitmap e() {
        this.f50845a.setTextSize(18.0f);
        this.f50845a.setTextColor(-16777216);
        this.f50845a.setText("鉴权失败,请检查你的key");
        return com.tencent.mapsdk.internal.hl.a(this.f50845a);
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final void a(com.tencent.mapsdk.internal.eu.b bVar) {
    }

    @Override // com.tencent.mapsdk.internal.fn
    public final void b(int i17, int i18) {
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final void c() {
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final com.tencent.mapsdk.internal.eu.b d() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.es
    public final android.view.View[] b() {
        return new android.view.View[0];
    }

    @Override // com.tencent.mapsdk.internal.eu
    public final boolean a(final android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (viewGroup == null || this.f50845a == null) {
            return false;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f50845a.setLayoutParams(layoutParams);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        this.f50845a.setTextSize(18.0f);
        this.f50845a.setTextColor(-16777216);
        this.f50845a.setText("鉴权失败,请检查你的key");
        android.graphics.Bitmap a17 = com.tencent.mapsdk.internal.hl.a(this.f50845a);
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.pz.1
            @Override // java.lang.Runnable
            public final void run() {
                viewGroup.addView(com.tencent.mapsdk.internal.pz.this.f50845a);
            }
        });
        com.tencent.mapsdk.internal.qa.a aVar = this.f50846b;
        if (aVar == null) {
            return true;
        }
        aVar.a(a17, measuredWidth, measuredHeight);
        return true;
    }

    private void a(com.tencent.mapsdk.internal.qa.a aVar) {
        this.f50846b = aVar;
    }
}
