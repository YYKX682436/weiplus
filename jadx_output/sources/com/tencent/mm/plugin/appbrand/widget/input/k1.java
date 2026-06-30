package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class k1 implements com.tencent.mm.plugin.appbrand.widget.input.u5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.h1 f91521a;

    public k1(com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var) {
        this.f91521a = h1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public void a(boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f91521a;
        ql1.a aVar = h1Var.f91472p;
        if (aVar != null) {
            if (!z17) {
                ((com.tencent.mm.plugin.appbrand.widget.input.l2) aVar).e(h1Var, false, 0);
            } else {
                ((com.tencent.mm.plugin.appbrand.widget.input.l2) aVar).e(h1Var, true, h1Var.f91468i);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public int b() {
        return this.f91521a.f91468i;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public void d(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f91521a;
        ql1.a aVar = h1Var.f91472p;
        if (aVar != null) {
            ((com.tencent.mm.plugin.appbrand.widget.input.l2) aVar).e(h1Var, i17 > 0, i17);
        }
        h1Var.f91468i = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public android.app.Activity getActivity() {
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f91521a;
        java.lang.ref.WeakReference weakReference = h1Var.f91467h;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (android.app.Activity) h1Var.f91467h.get();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u5
    public android.view.View getContentView() {
        return this.f91521a;
    }
}
