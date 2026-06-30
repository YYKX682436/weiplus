package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes5.dex */
public final class h6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 f187085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f187086e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 l6Var, android.content.Context context) {
        super(0);
        this.f187085d = l6Var;
        this.f187086e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f187086e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 l6Var = this.f187085d;
        l6Var.getClass();
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 85;
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.flags = 56;
        layoutParams.format = 1;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.y = com.p314xaae8f345.mm.ui.bl.c(context) + 40;
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        l6Var.f187213f = (android.view.WindowManager) systemService;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2(context);
        float dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        c22644xc8fbf3b2.c(dimensionPixelSize, 0.0f, dimensionPixelSize, 0.0f);
        c22644xc8fbf3b2.setOrientation(1);
        l6Var.f187214g = c22644xc8fbf3b2;
        android.view.WindowManager windowManager = l6Var.f187213f;
        if (windowManager != null) {
            windowManager.addView(c22644xc8fbf3b2, layoutParams);
        }
        return jz5.f0.f384359a;
    }
}
