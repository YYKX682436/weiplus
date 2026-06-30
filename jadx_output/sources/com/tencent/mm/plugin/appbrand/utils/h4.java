package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class h4 extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.f4 f90459a;

    /* renamed from: b, reason: collision with root package name */
    public int f90460b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.g4 f90461c;

    public h4(android.content.Context context, com.tencent.mm.plugin.appbrand.utils.g4 g4Var) {
        super(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context));
        this.f90459a = com.tencent.mm.plugin.appbrand.utils.f4.NONE;
        this.f90460b = 45;
        this.f90461c = g4Var;
    }

    @Override // android.view.OrientationEventListener
    public void disable() {
        super.disable();
        this.f90459a = com.tencent.mm.plugin.appbrand.utils.f4.NONE;
    }

    @Override // android.view.OrientationEventListener
    public void enable() {
        super.enable();
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        if (i17 == -1) {
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.f4 f4Var = this.f90459a;
        int i18 = this.f90460b;
        com.tencent.mm.plugin.appbrand.utils.f4 f4Var2 = ((i17 < 360 - i18 || i17 >= 360) && (i17 < 0 || i17 > i18 + 0)) ? (i17 < 270 - i18 || i17 > i18 + 270) ? (i17 < 180 - i18 || i17 > i18 + 180) ? (i17 < 90 - i18 || i17 > i18 + 90) ? f4Var : com.tencent.mm.plugin.appbrand.utils.f4.REVERSE_LANDSCAPE : com.tencent.mm.plugin.appbrand.utils.f4.REVERSE_PORTRAIT : com.tencent.mm.plugin.appbrand.utils.f4.LANDSCAPE : com.tencent.mm.plugin.appbrand.utils.f4.PORTRAIT;
        if (f4Var2 != f4Var) {
            com.tencent.mm.plugin.appbrand.utils.g4 g4Var = this.f90461c;
            if (g4Var != null && f4Var != com.tencent.mm.plugin.appbrand.utils.f4.NONE) {
                g4Var.a(f4Var, f4Var2);
            }
            this.f90459a = f4Var2;
        }
    }
}
