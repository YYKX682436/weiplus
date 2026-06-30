package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pz extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es {

    /* renamed from: a, reason: collision with root package name */
    android.widget.TextView f132378a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qa.a f132379b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f132380c;

    public pz(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8) {
        this.f132380c = context;
        this.f132378a = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nb(this.f132380c, interfaceC25963x17625b8);
    }

    private android.graphics.Bitmap e() {
        this.f132378a.setTextSize(18.0f);
        this.f132378a.setTextColor(-16777216);
        this.f132378a.setText("鉴权失败,请检查你的key");
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.f132378a);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final void a(com.tencent.mapsdk.internal.eu.b bVar) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn
    public final void b(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final void c() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final com.tencent.mapsdk.internal.eu.b d() {
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.es
    public final android.view.View[] b() {
        return new android.view.View[0];
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public final boolean a(final android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (viewGroup == null || this.f132378a == null) {
            return false;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f132378a.setLayoutParams(layoutParams);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        this.f132378a.setTextSize(18.0f);
        this.f132378a.setTextColor(-16777216);
        this.f132378a.setText("鉴权失败,请检查你的key");
        android.graphics.Bitmap a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.f132378a);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.pz.1
            @Override // java.lang.Runnable
            public final void run() {
                viewGroup.addView(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pz.this.f132378a);
            }
        });
        com.tencent.mapsdk.internal.qa.a aVar = this.f132379b;
        if (aVar == null) {
            return true;
        }
        aVar.a(a17, measuredWidth, measuredHeight);
        return true;
    }

    private void a(com.tencent.mapsdk.internal.qa.a aVar) {
        this.f132379b = aVar;
    }
}
