package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddUI;", "Lcom/tencent/mm/ui/base/BaseLuggageActivity;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI */
/* loaded from: classes7.dex */
public final class ActivityC12543xfc56fe extends com.p314xaae8f345.mm.ui.p2642x2e06d1.ActivityC21468x871b5e34 {
    public vi1.d0 B;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        vi1.e0 e0Var;
        java.lang.String stringExtra = getIntent().getStringExtra("APPID");
        nf.y yVar = nf.x.f418149b;
        if (yVar != null ? yVar.i(stringExtra) : false) {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f576212t9);
        } else {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.t_);
        }
        super.onCreate(bundle);
        m78869x8b18f126(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        P6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().G(0.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberAddUI", "onCreate() appId:" + stringExtra);
        setTitle(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3e));
        Q6(new vi1.c1(this), 0, com.p314xaae8f345.mm.ui.p1.BACK);
        vi1.g0 a17 = vi1.l1.f518932a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        vi1.d0 R5 = a17.R5(this, stringExtra, new vi1.d1(this));
        this.B = R5;
        if (R5 != null) {
            vi1.b1 b1Var = (vi1.b1) R5;
            b1Var.f518809d = new vi1.j1(b1Var.f518806a, b1Var);
            vi1.l2.f518934a.b(b1Var.f518807b);
        }
        vi1.d0 d0Var = this.B;
        setContentView((d0Var == null || (e0Var = ((vi1.b1) d0Var).f518809d) == null) ? null : ((vi1.j1) e0Var).f518879c);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e72905;
        super.onDestroy();
        vi1.d0 d0Var = this.B;
        if (d0Var != null) {
            vi1.b1 b1Var = (vi1.b1) d0Var;
            vi1.e0 e0Var = b1Var.f518809d;
            if (e0Var != null && (c12545x36e72905 = ((vi1.j1) e0Var).f518880d) != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c12545x36e72905.f168951p;
                if (b4Var != null) {
                    b4Var.d();
                }
                c12545x36e72905.f168943e.setText("");
                c12545x36e72905.f168944f.setVisibility(8);
                c12545x36e72905.f168950o = c12545x36e72905.f168949n;
                c12545x36e72905.f168945g.setVisibility(0);
            }
            vi1.l2.f518934a.c(b1Var.f518807b);
        }
    }
}
