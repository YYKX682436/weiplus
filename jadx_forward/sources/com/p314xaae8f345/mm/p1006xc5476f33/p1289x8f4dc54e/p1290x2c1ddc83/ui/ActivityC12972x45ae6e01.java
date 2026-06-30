package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/conversation/ui/BizFansPrivateMsgScopeSettingUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lir1/m1;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.conversation.ui.BizFansPrivateMsgScopeSettingUI */
/* loaded from: classes3.dex */
public final class ActivityC12972x45ae6e01 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements ir1.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f175487d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f175488e = jz5.h.b(new ir1.k1(this));

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f175489f;

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 T6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f175488e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dzm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.nfm);
        mo54448x9c8c0d33(new ir1.j1(this));
        mo78530x8b45058f();
        T6().mo7960x6cab2c8d(new ir1.l1(this.f175487d, this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(mo55332x76847179());
        c22847x422a813d.Q(1);
        T6().mo7967x900dcbe1(c22847x422a813d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 T6 = T6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        in5.t0 t0Var = new in5.t0(mo55332x76847179);
        t0Var.f374662c = in5.q.f374646d;
        t0Var.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f560840vn);
        t0Var.b(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        t0Var.d(com.p314xaae8f345.mm.R.C30860x5b28f31.f561171bd);
        android.content.res.Resources resources = t0Var.f374661b;
        t0Var.f374664e = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        t0Var.f374665f = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        T6.N(t0Var.a());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_ori_scope_type", this.f175489f);
        setResult(-1, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.util.ArrayList arrayList = this.f175487d;
        java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        ir1.j2 j2Var = new ir1.j2(0, string);
        java.lang.String string2 = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        ir1.j2 j2Var2 = new ir1.j2(1, string2);
        java.lang.String string3 = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        ir1.j2 j2Var3 = new ir1.j2(2, string3);
        java.lang.String string4 = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        arrayList.addAll(new java.util.ArrayList(kz5.c0.i(j2Var, j2Var2, j2Var3, new ir1.j2(3, string4))));
        this.f175489f = java.lang.Integer.valueOf(getIntent().getIntExtra("key_ori_scope_type", 0));
        mo43517x10010bd5();
    }
}
