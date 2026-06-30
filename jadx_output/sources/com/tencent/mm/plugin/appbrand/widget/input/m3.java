package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f91546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.u3 f91547f;

    public m3(com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var, int i17, boolean z17) {
        this.f91547f = u3Var;
        this.f91545d = i17;
        this.f91546e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f91547f;
        int i18 = u3Var.f91682o;
        if (u3Var.isShown()) {
            u3Var.f91682o = this.f91545d;
        } else {
            u3Var.f91682o = 2;
        }
        com.tencent.mm.plugin.appbrand.widget.input.r3 r3Var = u3Var.f91681n;
        if (r3Var == null || i18 == (i17 = u3Var.f91682o) || this.f91546e) {
            return;
        }
        r3Var.a(i17);
    }
}
