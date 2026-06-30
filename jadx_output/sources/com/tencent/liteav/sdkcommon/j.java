package com.tencent.liteav.sdkcommon;

/* loaded from: classes15.dex */
final /* synthetic */ class j implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.sdkcommon.g f46562a;

    /* renamed from: b, reason: collision with root package name */
    private final android.widget.Button f46563b;

    private j(com.tencent.liteav.sdkcommon.g gVar, android.widget.Button button) {
        this.f46562a = gVar;
        this.f46563b = button;
    }

    public static android.view.View.OnClickListener a(com.tencent.liteav.sdkcommon.g gVar, android.widget.Button button) {
        return new com.tencent.liteav.sdkcommon.j(gVar, button);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.liteav.sdkcommon.g gVar = this.f46562a;
        boolean z17 = gVar.f46551m;
        if (z17) {
            android.view.WindowManager.LayoutParams layoutParams = gVar.f46540b;
            int i17 = gVar.f46552n;
            layoutParams.height = i17;
            int i18 = layoutParams.y;
            int i19 = i17 + i18;
            int i27 = gVar.f46539a.heightPixels;
            if (i19 > i27) {
                layoutParams.height = i27 - i18;
            }
        } else {
            gVar.f46540b.height = gVar.f46552n / 2;
        }
        gVar.f46551m = !z17;
        gVar.f46544f.updateViewLayout(gVar.f46545g, gVar.f46540b);
        android.view.ViewGroup.LayoutParams layoutParams2 = gVar.f46549k.getLayoutParams();
        layoutParams2.height = gVar.b();
        gVar.f46549k.setLayoutParams(layoutParams2);
        gVar.f46542d.post(com.tencent.liteav.sdkcommon.l.a(gVar));
    }
}
