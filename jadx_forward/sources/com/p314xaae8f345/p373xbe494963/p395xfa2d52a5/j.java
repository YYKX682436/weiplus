package com.p314xaae8f345.p373xbe494963.p395xfa2d52a5;

/* loaded from: classes15.dex */
final /* synthetic */ class j implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g f128095a;

    /* renamed from: b, reason: collision with root package name */
    private final android.widget.Button f128096b;

    private j(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar, android.widget.Button button) {
        this.f128095a = gVar;
        this.f128096b = button;
    }

    public static android.view.View.OnClickListener a(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar, android.widget.Button button) {
        return new com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.j(gVar, button);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar = this.f128095a;
        boolean z17 = gVar.f128084m;
        if (z17) {
            android.view.WindowManager.LayoutParams layoutParams = gVar.f128073b;
            int i17 = gVar.f128085n;
            layoutParams.height = i17;
            int i18 = layoutParams.y;
            int i19 = i17 + i18;
            int i27 = gVar.f128072a.heightPixels;
            if (i19 > i27) {
                layoutParams.height = i27 - i18;
            }
        } else {
            gVar.f128073b.height = gVar.f128085n / 2;
        }
        gVar.f128084m = !z17;
        gVar.f128077f.updateViewLayout(gVar.f128078g, gVar.f128073b);
        android.view.ViewGroup.LayoutParams layoutParams2 = gVar.f128082k.getLayoutParams();
        layoutParams2.height = gVar.b();
        gVar.f128082k.setLayoutParams(layoutParams2);
        gVar.f128075d.post(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.l.a(gVar));
    }
}
