package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/FavChangeTagUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/fav/ui/n0", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fav.ui.FavChangeTagUI */
/* loaded from: classes3.dex */
public final class ActivityC13561xae558fe3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n0 f181830e = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n0(null);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f181831d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aav;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6(i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.c9g));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dhu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f181831d = (android.widget.EditText) findViewById;
        java.lang.String stringExtra = getIntent().getStringExtra("origin_name");
        android.widget.EditText editText = this.f181831d;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coreEditText");
            throw null;
        }
        editText.setText(stringExtra);
        android.widget.EditText editText2 = this.f181831d;
        if (editText2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coreEditText");
            throw null;
        }
        editText2.requestFocus();
        android.widget.EditText editText3 = this.f181831d;
        if (editText3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coreEditText");
            throw null;
        }
        editText3.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.o0());
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p0(this, stringExtra), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.q0(this));
    }
}
