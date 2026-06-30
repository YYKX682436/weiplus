package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsMusicAiCreateModelUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI */
/* loaded from: classes8.dex */
public final class ActivityC17446x3014d797 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f242105h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f242106d;

    /* renamed from: e, reason: collision with root package name */
    public int f242107e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.lc0 f242108f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f242109g;

    public ActivityC17446x3014d797() {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f242109g = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public final void V6() {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f242106d;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).t();
        }
        bw5.lc0 lc0Var = this.f242108f;
        if (lc0Var == null || (linkedList = lc0Var.f111280q) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bw5.kc0 kc0Var = (bw5.kc0) it.next();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
            c21560x1fce98fb.C(kc0Var.b());
            c21560x1fce98fb.L(kc0Var.b());
            c21560x1fce98fb.H(this.f242107e == kc0Var.f110878d ? "✓" : "");
            c21560x1fce98fb.f279321y = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19, null);
            c21560x1fce98fb.E(8);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = this.f242106d;
            if (rVar2 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).d(c21560x1fce98fb, -1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        this.f242106d = m79336x8b97809d();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.phu);
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yi(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zi(this));
        p3325xe03a0797.p3326xc267989b.l.d(this.f242109g, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.aj(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        p3325xe03a0797.p3326xc267989b.z0.e(this.f242109g, null, 1, null);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.util.LinkedList linkedList;
        if (c21560x1fce98fb == null) {
            return false;
        }
        java.lang.String str = c21560x1fce98fb.f279313q;
        bw5.lc0 lc0Var = this.f242108f;
        if (lc0Var != null && (linkedList = lc0Var.f111280q) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                bw5.kc0 kc0Var = (bw5.kc0) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kc0Var.b(), str)) {
                    this.f242107e = kc0Var.f110878d;
                }
            }
        }
        V6();
        return true;
    }
}
