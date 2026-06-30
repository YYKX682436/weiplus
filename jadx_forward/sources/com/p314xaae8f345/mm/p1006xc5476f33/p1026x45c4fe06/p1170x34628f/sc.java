package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class sc implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f168628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc f168629b;

    public sc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc ucVar, long j17) {
        this.f168629b = ucVar;
        this.f168628a = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean((java.lang.String) obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc ucVar = this.f168629b;
        if (parseBoolean) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vc vcVar = ucVar.f168683d.D;
            vcVar.f168716b = this.f168628a;
            vcVar.f168717c = java.lang.System.currentTimeMillis();
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(parseBoolean);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(ucVar.f168683d.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc wcVar = ucVar.f168683d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vc vcVar2 = wcVar.D;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate onWxConfigReady end, applied=%b, hash=%d, reportWxConfigInjectEnd cost=%dms", valueOf, valueOf2, java.lang.Long.valueOf(vcVar2.f168717c - vcVar2.f168716b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vc vcVar3 = wcVar.D;
        wcVar.d0(vcVar3.f168715a, vcVar3.f168716b, vcVar3.f168717c);
    }
}
