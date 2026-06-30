package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class u9 implements com.tencent.xweb.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w9 f87143a;

    public u9(com.tencent.mm.plugin.appbrand.page.w9 w9Var) {
        this.f87143a = w9Var;
    }

    @Override // com.tencent.xweb.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        return false;
    }

    @Override // com.tencent.xweb.g1
    public void b(int i17) {
    }

    @Override // com.tencent.xweb.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        com.tencent.mm.plugin.appbrand.page.w9 w9Var = this.f87143a;
        com.tencent.mm.plugin.appbrand.page.ma maVar = w9Var.f87202s;
        if (maVar != null) {
            maVar.d(i17, i18, i19, i27, view);
        }
        w9Var.f87205v.getClass();
    }

    @Override // com.tencent.xweb.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.tencent.mm.plugin.appbrand.page.la laVar = this.f87143a.f87204u;
        if (laVar != null) {
            laVar.a(i17, i18, z17, z18);
        }
    }
}
