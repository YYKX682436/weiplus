package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class vb implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc f168714d;

    public vb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc dcVar) {
        this.f168714d = dcVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc dcVar = this.f168714d;
        if (android.text.TextUtils.isEmpty(dcVar.f168072a.X1())) {
            return;
        }
        if (dcVar.f168077f) {
            try {
                dcVar.f168072a.mo51313xaf0c0532().removeOnLayoutChangeListener(this);
            } catch (java.util.ConcurrentModificationException unused) {
                dcVar.f168072a.P0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ub(this, this));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "pageArea onLayoutChange appId[%s], url[%s], frozen[%b]", dcVar.f168072a.mo48798x74292566(), dcVar.f168072a.X1(), java.lang.Boolean.valueOf(dcVar.f168078g));
            if (dcVar.f168078g) {
                dcVar.f168079h = true;
            } else {
                dcVar.e();
            }
        }
    }
}
