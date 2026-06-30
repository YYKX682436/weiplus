package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.app.w6 {

    /* renamed from: d, reason: collision with root package name */
    public int f75084d;

    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        int i17 = this.f75084d;
        if (i17 > 0) {
            this.f75084d = i17 + 1;
        } else {
            jk1.a.INST.a(activity);
            this.f75084d = 1;
        }
    }

    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        int i17 = this.f75084d - 1;
        this.f75084d = i17;
        if (i17 <= 0) {
            jk1.a.INST.h();
        }
    }
}
