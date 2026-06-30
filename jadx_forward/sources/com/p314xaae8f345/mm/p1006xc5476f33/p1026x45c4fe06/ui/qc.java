package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class qc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc f171498c;

    public qc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc ucVar) {
        this.f171498c = ucVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc
    public boolean a(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = this.f171498c.getRuntime();
        boolean z17 = false;
        if (runtime == null) {
            return false;
        }
        if (keyEvent != null && 1 == keyEvent.getAction()) {
            z17 = true;
        }
        if (z17) {
            if (runtime.J0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.pc pcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.pc(this.f171498c);
                java.lang.String str = runtime.f156336n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
                cf.m mVar = new cf.m(str);
                pcVar.mo146xb9724478(mVar);
                runtime.N.a(mVar);
                runtime.S();
            } else {
                runtime.l0();
            }
        }
        return true;
    }
}
