package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class b0 implements com.tencent.mm.plugin.appbrand.widget.input.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91364a;

    public b0(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91364a = q0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p3
    public void a(int i17) {
        long j17 = this.f91364a.f91615t;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 > 50) {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.widget.input.a0(this), 50L);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p3
    public android.widget.EditText b() {
        return this.f91364a.f91612q;
    }
}
