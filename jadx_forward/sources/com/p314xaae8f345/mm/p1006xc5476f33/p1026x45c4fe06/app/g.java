package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.app.w6 {

    /* renamed from: d, reason: collision with root package name */
    public int f156617d;

    @Override // com.p314xaae8f345.mm.app.w6, com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityCreated */
    public void mo9958x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i17 = this.f156617d;
        if (i17 > 0) {
            this.f156617d = i17 + 1;
        } else {
            jk1.a.INST.a(activity);
            this.f156617d = 1;
        }
    }

    @Override // com.p314xaae8f345.mm.app.w6, com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityDestroyed */
    public void mo9959xa9f48fab(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i17 = this.f156617d - 1;
        this.f156617d = i17;
        if (i17 <= 0) {
            jk1.a.INST.h();
        }
    }
}
