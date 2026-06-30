package com.tencent.mm.plugin.card.ui.v2;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public abstract class CardNewBaseUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public boolean f95214f;

    /* renamed from: d, reason: collision with root package name */
    public float f95212d = -85.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f95213e = -1000.0f;

    /* renamed from: g, reason: collision with root package name */
    public final i11.c f95215g = new iu1.s0(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f95216h = new iu1.u0(this);

    public static /* synthetic */ void U6(com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI cardNewBaseUI, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFinishLocationThings");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        cardNewBaseUI.T6(i17, z17);
    }

    public abstract void T6(int i17, boolean z17);

    public final void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardNewBaseUI", "request location: %s", java.lang.Boolean.valueOf(this.f95214f));
        if (this.f95214f) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().k(this.f95215g, false);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
            com.tencent.mm.sdk.platformtools.u3.i(this.f95216h, 4000L);
        }
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardNewBaseUI", "stop location");
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this.f95215g);
        com.tencent.mm.sdk.platformtools.u3.l(this.f95216h);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardNewBaseUI", "requestCode: %s, resultCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 563) {
            V6();
            return;
        }
        if (i17 != 564) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((sb0.f) jVar).getClass();
        this.f95214f = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        if ((getContext() instanceof com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI) || (getContext() instanceof com.tencent.mm.plugin.card.ui.v2.CardTicketListUI) || (getContext() instanceof com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI) || (getContext() instanceof com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI)) {
            this.f95214f = false;
            return;
        }
        java.lang.String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.h(this, strArr)) {
            for (int i17 = 0; i17 < 2; i17++) {
                java.lang.String str = strArr[i17];
                long j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong("had_show_rationale_dlg_" + str + "_69", 0L);
                long f17 = j35.u.f(str, 69);
                if (java.lang.System.currentTimeMillis() - j17 < 172800000 || !(f17 == 0 || z2.h.b(this, str))) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (!z17) {
            U6(this, -2, false, 2, null);
            return;
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, null, getContext() instanceof com.tencent.mm.plugin.card.ui.v3.VipCardListUI ? getString(com.tencent.mm.R.string.aw8) : null);
        this.f95214f = Di;
        if (Di) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227175z, new iu1.r0(this))) {
                return;
            }
            V6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.sdk.platformtools.u3.l(this.f95216h);
        W6();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i17 != 69) {
            super.onRequestPermissionsResult(i17, permissions, grantResults);
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            this.f95214f = true;
            V6();
        } else {
            this.f95214f = false;
            db5.e1.C(this, getString(com.tencent.mm.R.string.at7), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.baz), false, new iu1.t0(this), null);
            U6(this, -2, false, 2, null);
        }
    }
}
