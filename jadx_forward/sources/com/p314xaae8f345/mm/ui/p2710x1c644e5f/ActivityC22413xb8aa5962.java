package com.p314xaae8f345.mm.ui.p2710x1c644e5f;

@db5.a(m123858x6ac9171 = 4131)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/HalfScreenTransparentActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity */
/* loaded from: classes8.dex */
public class ActivityC22413xb8aa5962 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f290332g;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 f290333d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f290334e = jz5.h.b(new bh5.h(this));

    /* renamed from: f, reason: collision with root package name */
    public boolean f290335f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMHalfScreen.TransparentActivity", "finish() called hasCalledFinished:" + this.f290335f);
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = this.f290333d;
        if (c22415x6ef905d7 != null) {
            android.app.Dialog m7393x15b1203e = c22415x6ef905d7.m7393x15b1203e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMHalfScreen.TransparentActivity", "finish() called isDialogShowing:%s", java.lang.Boolean.valueOf(m7393x15b1203e != null ? m7393x15b1203e.isShowing() : false));
            android.app.Dialog m7393x15b1203e2 = c22415x6ef905d7.m7393x15b1203e();
            if (m7393x15b1203e2 != null ? m7393x15b1203e2.isShowing() : false) {
                c22415x6ef905d7.mo7391x63a3b28a();
                return;
            }
        }
        if (this.f290333d == null || this.f290335f) {
            return;
        }
        this.f290335f = true;
        f290332g = false;
        jz5.o oVar = null;
        if (vk5.a.f519307d) {
            jz5.o oVar2 = new jz5.o(java.lang.Integer.valueOf(vk5.a.f519304a), vk5.a.f519305b, java.lang.Integer.valueOf(vk5.a.f519306c));
            vk5.a.f519304a = 0;
            vk5.a.f519305b = null;
            vk5.a.f519306c = -1;
            vk5.a.f519307d = false;
            oVar = oVar2;
        }
        if (oVar != null) {
            setResult(((java.lang.Number) oVar.f384374d).intValue(), (android.content.Intent) oVar.f384375e);
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        try {
            return ((dh5.a) ((jz5.n) this.f290334e).mo141623x754a37bb()).l();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMHalfScreen.TransparentActivity", th6, "getForceOrientation err", new java.lang.Object[0]);
            return -1;
        }
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
        jz5.g gVar = this.f290334e;
        if (((dh5.a) ((jz5.n) gVar).mo141623x754a37bb()).o()) {
            android.view.View decorView = getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(1792);
            getWindow().setNavigationBarColor(0);
        }
        if (((dh5.a) ((jz5.n) gVar).mo141623x754a37bb()).n()) {
            android.view.View decorView2 = getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView2, "getDecorView(...)");
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 2 | 4);
        }
        m78513xc2a54588().post(new bh5.i(this));
        f290332g = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        f290332g = false;
        super.onDestroy();
    }
}
