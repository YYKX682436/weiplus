package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1207xa5dbae09;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage */
/* loaded from: classes4.dex */
public final class C12721xf273c7e5 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f171468e = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f171469d;

    public C12721xf273c7e5() {
        super(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569607g5;
    }

    public final java.lang.Integer l0(r45.lc7 lc7Var) {
        if (!(1 == lc7Var.f460848e)) {
            return null;
        }
        java.util.LinkedList record_list = lc7Var.f460847d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(record_list, "record_list");
        r45.wf7 wf7Var = (r45.wf7) kz5.n0.k0(record_list);
        if (wf7Var != null) {
            return java.lang.Integer.valueOf(wf7Var.f470675f);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        java.lang.String m78394x7e63ed49 = m78394x7e63ed49(dm.i4.f66875xa013b0d5);
        this.f171469d = m78394x7e63ed49;
        if (m78394x7e63ed49 == null || m78394x7e63ed49.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPrivacyUseRecordPage", "checkContextOnCreateEarly, username is empty");
            mo78641xb4098c93();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        mo78682x9c8c0d33(new dk1.a(this));
        mo78694xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a4_);
        ak1.f.b(this);
        ak1.f.e(this, b3.l.m9702x7444d5ad(ak1.f.d(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        ak1.f.f(this, b3.l.m9702x7444d5ad(ak1.f.d(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.cgs);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = mo26077x4ff8c0f0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f) mo26077x4ff8c0f0 : null;
        if (c12808x5de4409f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPrivacyUseRecordPage", "initContentArea, useRecordContentArea is null");
            mo78641xb4098c93();
            return;
        }
        c12808x5de4409f.setPadding(0, i65.a.f(ak1.f.d(this), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, 0);
        ak1.a aVar = new ak1.a(c12808x5de4409f, com.p314xaae8f345.mm.R.C30867xcad56011.a48);
        c12808x5de4409f.m53682x626a4c3f(aVar.f87096d);
        c12808x5de4409f.m1(false);
        zk1.m.f554947l.a(c12808x5de4409f, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        dk1.k kVar = new dk1.k();
        c12808x5de4409f.mo7960x6cab2c8d(kVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        c12808x5de4409f.m53683x6891e372(new dk1.c(aVar, this, h0Var, kVar));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(ak1.f.d(this), null, null, true, false, null);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = ak1.f.a(this);
        if (a17 != null) {
            a17.mo46316x322b85(new dk1.d(Q));
        }
        p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.z.a(this), null, null, new dk1.e(this, Q, aVar, h0Var, kVar, c12808x5de4409f, null), 3, null);
    }
}
