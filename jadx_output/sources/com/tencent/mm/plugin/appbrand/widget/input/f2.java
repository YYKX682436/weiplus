package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class f2 implements com.tencent.mm.plugin.appbrand.widget.input.i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91441a;

    public f2(com.tencent.mm.plugin.appbrand.widget.input.h2 h2Var, int i17) {
        this.f91441a = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.i2
    public void a(com.tencent.mm.plugin.appbrand.widget.input.k2 k2Var) {
        int height = k2Var.getHeight();
        int i17 = this.f91441a;
        if (height != i17) {
            k2Var.d(i17);
        }
    }
}
