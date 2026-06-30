package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/RoamSelectContactUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.RoamSelectContactUI */
/* loaded from: classes5.dex */
public final class ActivityC12871x42f7168f extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f174377e = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f174378d;

    public ActivityC12871x42f7168f() {
        jz5.h.b(new zo1.a3(this));
    }

    public final void U6() {
        finish();
        if (this.f174378d) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559262q, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eq_;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f174378d) {
            U6();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo78530x8b45058f();
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            mo54450xbf7c1df6(((ap1.c2) m67437x4bd5310.mo140437x75286adb()).f94157e);
            m67437x4bd5310.L2(this, new zo1.y2(this));
            m67437x4bd5310.B3(new ap1.d(ap1.e.f94172d, null));
        }
        mo78578x8b18f126(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.af_));
        boolean booleanExtra = getIntent().getBooleanExtra("contactListPushDownAnim", false);
        this.f174378d = booleanExtra;
        if (booleanExtra) {
            m78560xe21cbbf(false);
            mo78514x143f1b92().x0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvh), new java.lang.Runnable() { // from class: zo1.z2
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12871x42f7168f.f174377e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12871x42f7168f.this.U6();
                }
            });
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(ap1.d2.class);
    }
}
