package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes5.dex */
public final class h6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.l6 f105552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f105553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var, android.content.Context context) {
        super(0);
        this.f105552d = l6Var;
        this.f105553e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f105553e;
        kotlin.jvm.internal.o.f(context, "$context");
        com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var = this.f105552d;
        l6Var.getClass();
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 85;
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.flags = 56;
        layoutParams.format = 1;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.y = com.tencent.mm.ui.bl.c(context) + 40;
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        l6Var.f105680f = (android.view.WindowManager) systemService;
        com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = new com.tencent.mm.ui.widget.RoundCornerLinearLayout(context);
        float dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        roundCornerLinearLayout.c(dimensionPixelSize, 0.0f, dimensionPixelSize, 0.0f);
        roundCornerLinearLayout.setOrientation(1);
        l6Var.f105681g = roundCornerLinearLayout;
        android.view.WindowManager windowManager = l6Var.f105680f;
        if (windowManager != null) {
            windowManager.addView(roundCornerLinearLayout, layoutParams);
        }
        return jz5.f0.f302826a;
    }
}
