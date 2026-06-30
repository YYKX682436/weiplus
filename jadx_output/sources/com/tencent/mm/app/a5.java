package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class a5 implements com.tencent.mm.app.t2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.app.d5 d5Var = com.tencent.mm.app.d5.f53384a;
        com.tencent.mm.app.d5.f53390g = false;
        com.tencent.mm.app.d5.f53392i = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.app.d5 d5Var = com.tencent.mm.app.d5.f53384a;
        com.tencent.mm.app.d5.f53390g = true;
    }
}
