package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "rr3/d0", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI */
/* loaded from: classes4.dex */
public final class ActivityC16887xd4079ac4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f235727d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f235728e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a1t;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.an6);
        mo78530x8b45058f();
        mo54448x9c8c0d33(new rr3.e0(this));
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f235727d = stringExtra;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.aor);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.aoq);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.awy);
        java.lang.String str = this.f235727d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(dm.i4.f66875xa013b0d5);
            throw null;
        }
        rr3.c cVar = new rr3.c(str);
        xm3.n0 n0Var = new xm3.n0();
        n0Var.f536890b = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(cVar, n0Var, this, null, null, 24, null);
        this.f235728e = c16718x7059cefe;
        c1163xf1deaba4.mo7960x6cab2c8d(new xm3.t0(c16718x7059cefe, new in5.s() { // from class: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI$buildItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type == 1 ? new rr3.e() : new rr3.g0();
            }
        }, false));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2 = this.f235728e;
        if (c16718x7059cefe2 != null) {
            c16718x7059cefe2.f233604u.mo7806x9d92d11c(this, new rr3.f0(this, c1163xf1deaba4, textView, progressBar));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveList");
            throw null;
        }
    }
}
