package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class h5 extends com.tencent.mm.plugin.appbrand.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.l5 f78263c;

    public h5(com.tencent.mm.plugin.appbrand.l5 l5Var) {
        this.f78263c = l5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.oc
    public boolean a(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f78263c.f84225i;
        if (h1Var != null) {
            return h1Var.f(keyEvent);
        }
        return false;
    }
}
