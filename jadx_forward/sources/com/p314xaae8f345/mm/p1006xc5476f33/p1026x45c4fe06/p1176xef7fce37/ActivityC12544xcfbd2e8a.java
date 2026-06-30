package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerUI;", "Lcom/tencent/mm/ui/base/BaseLuggageActivity;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI */
/* loaded from: classes7.dex */
public final class ActivityC12544xcfbd2e8a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.ActivityC21468x871b5e34 {
    public static final /* synthetic */ int D = 0;
    public vi1.h0 B;
    public boolean C;

    public final void U6(boolean z17) {
        this.C = z17;
        vi1.h0 h0Var = this.B;
        if (h0Var != null) {
            vi1.b2 b2Var = (vi1.b2) h0Var;
            boolean z18 = !z17;
            b2Var.f518816g = z18;
            vi1.i0 i0Var = b2Var.f518813d;
            if (i0Var != null) {
                ((vi1.i2) i0Var).a(z18, b2Var.f518814e);
            }
        }
    }

    public final void V6() {
        java.util.LinkedList linkedList = this.f278138x;
        if (!linkedList.isEmpty()) {
            linkedList.clear();
            mo2548x55429c53();
        }
        vi1.h0 h0Var = this.B;
        if (h0Var != null) {
            boolean z17 = this.C;
            vi1.b2 b2Var = (vi1.b2) h0Var;
            java.util.ArrayList arrayList = b2Var.f518814e;
            arrayList.clear();
            arrayList.addAll(vi1.o0.f518949a.b());
            vi1.i0 i0Var = b2Var.f518813d;
            if (i0Var != null) {
                ((vi1.i2) i0Var).a(z17, arrayList);
            }
        }
        boolean z18 = this.C;
        com.p314xaae8f345.mm.ui.r1 r1Var = com.p314xaae8f345.mm.ui.r1.TEXT;
        if (z18) {
            O6(0, 0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3k), new vi1.c2(this), null, r1Var);
            Q6(new vi1.d2(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953, com.p314xaae8f345.mm.ui.p1.CUSTOM);
        } else {
            O6(0, 0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3q), new vi1.e2(this), null, r1Var);
            Q6(new vi1.f2(this), 0, com.p314xaae8f345.mm.ui.p1.BACK);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.ActivityC21468x871b5e34, com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120
    /* renamed from: getLayoutId */
    public int mo32073x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569556eo;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (!this.C) {
            super.onBackPressed();
        } else {
            U6(false);
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        vi1.i0 i0Var;
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f576211t8);
        super.onCreate(bundle);
        P6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78869x8b18f126(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().G(0.0f);
        }
        setTitle(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3r));
        java.lang.String stringExtra = getIntent().getStringExtra("APPID");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.view.View view = null;
        iz5.a.c(null, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberManagerUI", "onCreate() appId:" + stringExtra);
        java.lang.String stringExtra2 = getIntent().getStringExtra("PAGEPATH");
        vi1.g0 a17 = vi1.l1.f518932a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
        vi1.h0 U1 = a17.U1(this, stringExtra, stringExtra2);
        this.B = U1;
        if (U1 != null) {
            vi1.b2 b2Var = (vi1.b2) U1;
            b2Var.f518813d = new vi1.i2(b2Var.f518810a, b2Var);
            java.util.ArrayList arrayList = b2Var.f518814e;
            arrayList.clear();
            arrayList.addAll(vi1.o0.f518949a.b());
            vi1.l2.f518934a.b(b2Var.f518811b);
        }
        vi1.h0 h0Var = this.B;
        if (h0Var != null && (i0Var = ((vi1.b2) h0Var).f518813d) != null) {
            view = ((vi1.i2) i0Var).f518866c;
        }
        setContentView(view);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vi1.h0 h0Var = this.B;
        if (h0Var != null) {
            vi1.l2.f518934a.c(((vi1.b2) h0Var).f518811b);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        V6();
    }
}
