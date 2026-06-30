package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/GateWayMobileUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/account/ui/r1", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.account.ui.GateWayMobileUI */
/* loaded from: classes4.dex */
public final class ActivityC11404xb70180da extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: p, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r1 f154810p = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r1(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f154811d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u1(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f154812e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y1(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f154813f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z1(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f154814g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t1(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f154815h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g2(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f154816i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s1(this));

    /* renamed from: m, reason: collision with root package name */
    public boolean f154817m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f154818n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f154819o;

    public final java.util.List T6() {
        int intValue = ((java.lang.Number) ((jz5.n) this.f154816i).mo141623x754a37bb()).intValue();
        java.lang.String string = intValue != 1 ? intValue != 2 ? intValue != 3 ? "" : getString(com.p314xaae8f345.mm.R.C30867xcad56011.mso) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.msp) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.msq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        java.lang.String str = (java.lang.String) ((jz5.n) this.f154812e).mo141623x754a37bb();
        if (str != null) {
            if (str.length() > 0) {
                string = str;
            }
        }
        return kz5.c0.k(string);
    }

    public final void U6() {
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.i2(this, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 0, null), null), 2, null);
    }

    public final void V6(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.class);
        intent.putExtra("KForceMobileNum", str);
        intent.putExtra("KForceMobileMsgId", (java.lang.String) ((jz5.n) this.f154815h).mo141623x754a37bb());
        intent.putExtras(getIntent());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/GateWayMobileUI", "toReg", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/GateWayMobileUI", "toReg", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dup;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.rqf);
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.msv, (java.lang.String) ((jz5.n) this.f154814g).mo141623x754a37bb()));
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.rqd)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v1(this));
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.rqe)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w1(this));
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x1(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            m78607xef685e15(com.p314xaae8f345.mm.ui.bk.C());
        }
    }
}
