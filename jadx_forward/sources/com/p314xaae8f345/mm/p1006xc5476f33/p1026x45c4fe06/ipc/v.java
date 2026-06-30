package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes7.dex */
public abstract class v implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: mProxyUI */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.e0 f33639x8bafa455;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: attach */
    public final void m50419xac1eee45(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.e0 e0Var) {
        this.f33639x8bafa455 = e0Var;
        if (this instanceof p012xc85e97e9.p093xedfae76a.x) {
            m50421x3c6fed6a().mo273xed6858b4().a((p012xc85e97e9.p093xedfae76a.x) this);
        }
    }

    /* renamed from: finishProcess */
    public final void m50420x7b736e5c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        m50429x925811a8(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.s(this, abstractC11888x1a859600));
    }

    /* renamed from: getActivityContext */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 activityC11883xd41f5bb9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9) this.f33639x8bafa455;
        activityC11883xd41f5bb9.getClass();
        return activityC11883xd41f5bb9;
    }

    /* renamed from: getAppBrandTaskProxyUI */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57 m50422x8f77ef41() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.e0 e0Var = this.f33639x8bafa455;
        if (e0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57) e0Var;
        }
        return null;
    }

    /* renamed from: getString */
    public final java.lang.String m50423x2fec8307(int i17) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(i17);
    }

    /* renamed from: handleRequest */
    public abstract void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c);

    /* renamed from: isProcessTerminated */
    public final boolean m50424x3966f5e8() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.e0 e0Var = this.f33639x8bafa455;
        if (e0Var == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9 activityC11883xd41f5bb9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9) e0Var;
        return activityC11883xd41f5bb9.m78477x9d1e994e() || activityC11883xd41f5bb9.isFinishing() || activityC11883xd41f5bb9.f159886i;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
    }

    /* renamed from: onConfigurationChanged */
    public void mo50425x50e1c15d(android.content.res.Configuration configuration) {
    }

    /* renamed from: onInterceptFinishActivityAction */
    public boolean m50426xa07c53db() {
        return false;
    }

    /* renamed from: onProcessInterrupted */
    public void mo50427x5b335c92() {
    }

    /* renamed from: onRequestPermissionsResult */
    public void m50428x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
    }

    /* renamed from: runOnUiThread */
    public final void m50429x925811a8(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.e0 e0Var = this.f33639x8bafa455;
        if (e0Var == null) {
            return;
        }
        e0Var.m50412x925811a8(runnable);
    }

    /* renamed from: sendResult */
    public final void m50430x1a60bdc5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.e0 e0Var = this.f33639x8bafa455;
        if (e0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9) e0Var).U6(abstractC11888x1a859600);
        }
    }

    /* renamed from: shouldOverrideExitAnimation */
    public boolean mo50431x33f85ba7() {
        return false;
    }

    /* renamed from: startActivity */
    public final void m50432xa4df9991(java.lang.String str, java.lang.String str2) {
        j45.l.h(m50421x3c6fed6a(), str, str2);
    }

    /* renamed from: startActivityForResult */
    public final void m50434x5dc77fb5(java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17) {
        m50421x3c6fed6a().m78545xde66c1f2(this);
        j45.l.n(m50421x3c6fed6a(), str, str2, intent, i17);
    }

    /* renamed from: startActivityForResult */
    public final void m50433x5dc77fb5(android.content.Intent intent, int i17) {
        m50421x3c6fed6a().m78545xde66c1f2(this);
        m50421x3c6fed6a().startActivityForResult(intent, i17);
    }
}
