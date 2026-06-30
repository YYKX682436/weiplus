package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/ChooseLanguageUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.account.ui.ChooseLanguageUI */
/* loaded from: classes.dex */
public final class ActivityC11398x839f4d83 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: f, reason: collision with root package name */
    public int f154801f;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f154799d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f154800e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r0(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f154802g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s0(this));

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 U6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f154799d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dpj;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        U6().m82065xfb86a31b().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        U6().m82070x203ffbdd((java.lang.String[]) v61.h0.f514976c.values().toArray(new java.lang.String[0]));
        U6().addView(U6().m82065xfb86a31b(), new android.widget.FrameLayout.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 U6 = U6();
        jz5.g gVar = this.f154802g;
        U6.c(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
        this.f154801f = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        U6().m82069x5dc03d58(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t0(this));
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f154800e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) mo141623x754a37bb).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v0(this));
    }
}
