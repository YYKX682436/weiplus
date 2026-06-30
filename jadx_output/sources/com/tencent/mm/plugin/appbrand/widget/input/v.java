package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class v implements com.tencent.mm.plugin.appbrand.widget.input.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f91694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f91695b;

    public v(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var, com.tencent.mm.pointers.PBool pBool, java.lang.Runnable runnable) {
        this.f91694a = pBool;
        this.f91695b = runnable;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.r3
    public void a(int i17) {
        if (this.f91694a.value || i17 != 2) {
            return;
        }
        this.f91695b.run();
    }
}
