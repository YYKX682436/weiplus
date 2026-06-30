package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class t4 extends ik1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af f170497d;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af) {
        this.f170497d = c11527x5889d9af;
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af = this.f170497d;
        if (c11527x5889d9af.w() == activity) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "onActivityDestroyed %s", activity.getLocalClassName());
            c11527x5889d9af.S();
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af = this.f170497d;
        if (c11527x5889d9af.w() == activity) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "onActivityPaused %s", activity.getLocalClassName());
            c11527x5889d9af.f156376v = false;
            c11527x5889d9af.f156377w = true;
            c11527x5889d9af.mo51612x60543150().mo52317xb01dfb57();
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af = this.f170497d;
        if (c11527x5889d9af.w() == activity) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "onActivityResumed %s", activity.getLocalClassName());
            c11527x5889d9af.f156376v = true;
            c11527x5889d9af.f156377w = false;
            c11527x5889d9af.mo51612x60543150().mo52318x57429eec();
        }
    }
}
