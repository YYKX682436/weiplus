package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f89681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.f6 f89682e;

    public e6(com.tencent.mm.plugin.appbrand.ui.f6 f6Var, yz5.a aVar) {
        this.f89682e = f6Var;
        this.f89681d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.f6 f6Var = this.f89682e;
        f6Var.setVisibility(8);
        if (f6Var.getParent() != null) {
            ((android.view.ViewGroup) f6Var.getParent()).removeView(f6Var);
        }
        com.tencent.mm.plugin.appbrand.ui.kd kdVar = (com.tencent.mm.plugin.appbrand.ui.kd) f6Var.f89705y;
        com.tencent.mm.plugin.appbrand.widget.y yVar = kdVar.f89838m;
        if (yVar != null) {
            yVar.stop();
        }
        kdVar.removeAllViews();
        kdVar.f89832d = null;
        yz5.a aVar = this.f89681d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
