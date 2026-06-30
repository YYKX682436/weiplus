package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes14.dex */
public class VerifyQQUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f73097q = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f73104n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73105o;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73098e = null;

    /* renamed from: f, reason: collision with root package name */
    public long f73099f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f73100g = "";

    /* renamed from: h, reason: collision with root package name */
    public byte[] f73101h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73102i = "";

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f73103m = null;

    /* renamed from: p, reason: collision with root package name */
    public final p61.s5 f73106p = new p61.s5(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488208ki;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.autogen.events.GetSafeDeviceNameEvent getSafeDeviceNameEvent = new com.tencent.mm.autogen.events.GetSafeDeviceNameEvent();
        getSafeDeviceNameEvent.f54407g.f6951a = this;
        getSafeDeviceNameEvent.e();
        this.f73104n = getSafeDeviceNameEvent.f54408h.f7032a;
        com.tencent.mm.autogen.events.GetSafeDeviceTypeEvent getSafeDeviceTypeEvent = new com.tencent.mm.autogen.events.GetSafeDeviceTypeEvent();
        getSafeDeviceTypeEvent.e();
        this.f73105o = getSafeDeviceTypeEvent.f54409g.f7148a;
        setMMTitle(com.tencent.mm.R.string.aik);
        setBackBtn(new p61.l5(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), this.f73106p);
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(144, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(144, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initView();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r21, int r22, java.lang.String r23, com.tencent.mm.modelbase.m1 r24) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.bind.ui.VerifyQQUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean onSwipeBackFinish() {
        hideVKB();
        finish();
        return true;
    }
}
