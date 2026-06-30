package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes5.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.w2 f91697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f91698e;

    public v2(com.tencent.mm.plugin.appbrand.widget.input.w2 w2Var, java.lang.Integer num) {
        this.f91697d = w2Var;
        this.f91698e = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer num;
        com.tencent.mm.plugin.appbrand.widget.input.w2 w2Var = this.f91697d;
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var = w2Var.f91706q;
        if (b3Var == null || (num = this.f91698e) == null) {
            return;
        }
        int intValue = num.intValue();
        com.tencent.mars.xlog.Log.i(w2Var.f91704o, "updateStyle, maxLength: " + intValue);
        com.tencent.mm.plugin.appbrand.widget.input.v1 g17 = com.tencent.mm.plugin.appbrand.widget.input.v1.g(b3Var);
        g17.f42561f = 0;
        g17.f42560e = intValue;
        g17.f42556a = false;
        g17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1;
        g17.d(null);
    }
}
