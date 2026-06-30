package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegSuccessUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI */
/* loaded from: classes5.dex */
public final class ActivityC16163x5c385b05 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224710d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224711e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224712f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f224713g = jz5.h.b(new z83.d0(this));

    public final w83.k T6() {
        return (w83.k) ((jz5.n) this.f224713g).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570726bn4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16155xa1f2bfdb c16155xa1f2bfdb = T6().f525561e;
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c16155xa1f2bfdb.m65191x53bfe316(string);
        T6().f525561e.m65189x5018364b(new z83.b0(this));
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        this.f224710d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("intent.key.reg.nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
        this.f224711e = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("intent.key.reg.openid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra3);
        this.f224712f = stringExtra3;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = this.f224711e;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickname");
            throw null;
        }
        objArr[0] = str;
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8m, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        T6().f525559c.setText(string2);
        T6().f525560d.setOnClickListener(new z83.c0(this));
        a93.a aVar = a93.a.f83962a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        aVar.c(mo55332x76847179, T6().f525562f, T6().f525558b);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        mo2533x106ab264.o();
        m78583x85ccfe01(8);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77921x1688c237));
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77921x1688c237));
        mo43517x10010bd5();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }
}
