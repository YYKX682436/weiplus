package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusTransparentActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity */
/* loaded from: classes11.dex */
public final class ActivityC18675x35ba4862 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f255234g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f255235d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ng(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f255236e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.og(this));

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f255237f = "ACTION_SHOW_DISABLE_TIPS_DIALOG";

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) this.f255235d).mo141623x754a37bb();
        if (resultReceiver != null) {
            resultReceiver.send(0, null);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255237f, "ACTION_SHOW_DISABLE_TIPS_DIALOG")) {
            qj4.s sVar = qj4.s.f445491a;
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255236e).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            sVar.k((bi4.d1) mo141623x754a37bb, 7L);
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        mo64405x4dab7448(0);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        java.lang.String stringExtra = getIntent().getStringExtra("INTENT_KEY_ACTION");
        if (stringExtra == null) {
            stringExtra = "ACTION_SHOW_DISABLE_TIPS_DIALOG";
        }
        this.f255237f = stringExtra;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "ACTION_SHOW_DISABLE_TIPS_DIALOG")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.TextStatusTransparentActivity", "onCreate: action error :%s", this.f255237f);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
        u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvb));
        u1Var.a(true);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.pg(this));
        u1Var.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.qg(this));
        u1Var.q(false);
    }
}
