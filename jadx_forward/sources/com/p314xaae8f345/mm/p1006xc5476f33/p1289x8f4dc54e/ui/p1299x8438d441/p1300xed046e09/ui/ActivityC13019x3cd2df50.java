package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.ui;

@db5.a(m123858x6ac9171 = 640)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI;", "Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI */
/* loaded from: classes8.dex */
public class ActivityC13019x3cd2df50 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d {
    public static final /* synthetic */ int G3 = 0;
    public ls1.e0 E3;
    public final java.lang.String A3 = "MicroMsg.TmplWebViewToolUI";
    public final long B3 = 800;
    public final jz5.g C3 = jz5.h.b(new ls1.m0(this));
    public final jz5.g D3 = jz5.h.b(new ls1.k0(this));
    public final ls1.n0 F3 = new ls1.n0(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean S8() {
        return !m9();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 d7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 d76;
        if (this.M1) {
            d76 = super.d7();
        } else {
            ls1.e0 e0Var = this.E3;
            d76 = e0Var == null ? super.d7() : e0Var.f263449a;
        }
        if (d76 == null) {
            return null;
        }
        this.H1.a(d76, com.p314xaae8f345.mm.ui.b4.c(this));
        return d76;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e7() {
        ls1.e0 e0Var = this.E3;
        return e0Var != null ? e0Var : super.e7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean i9() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean l7() {
        return true;
    }

    public final boolean m9() {
        return ((java.lang.Boolean) ((jz5.n) this.D3).mo141623x754a37bb()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean n7(java.lang.String str) {
        return com.p314xaae8f345.mm.ui.b4.c(this) && this.G1.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ls1.e0 e0Var = this.E3;
        if (e0Var != null) {
            e0Var.L0(this.F3);
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y8() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.ui.ActivityC13019x3cd2df50.y8():void");
    }
}
