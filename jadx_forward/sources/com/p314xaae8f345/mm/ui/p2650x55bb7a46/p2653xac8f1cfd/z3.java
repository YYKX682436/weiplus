package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes12.dex */
public class z3 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3 f281888b;

    public z3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3 x3Var, java.lang.String str) {
        this.f281888b = x3Var;
        this.f281887a = str;
    }

    public void a(final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b4 b4Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 q17 = this.f281888b.f280113d.q();
        final java.lang.String str = this.f281887a;
        q17.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.z3$$a
            @Override // java.lang.Runnable
            public final void run() {
                final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z3 z3Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z3.this;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3 x3Var = z3Var.f281888b;
                x3Var.q0(str, b4Var);
                x3Var.f280113d.q().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.z3$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z3.this.f281888b.f280113d.K();
                    }
                });
            }
        });
    }
}
