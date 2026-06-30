package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes8.dex */
public class AppBrandTaskProxyUI extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI {

    /* renamed from: q, reason: collision with root package name */
    public rh1.a f78369q;

    /* renamed from: w, reason: collision with root package name */
    public boolean f78375w;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78370r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f78371s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f78372t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f78373u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f78374v = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f78376x = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f78377y = false;

    /* renamed from: z, reason: collision with root package name */
    public android.webkit.ValueCallback f78378z = null;
    public android.webkit.ValueCallback A = null;
    public final android.webkit.ValueCallback B = new com.tencent.mm.plugin.appbrand.ipc.a0(this);
    public final com.tencent.mm.plugin.appbrand.ipc.l0 C = new com.tencent.mm.plugin.appbrand.ipc.c0(this);

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        rh1.a aVar = this.f78369q;
        if (aVar != null) {
            aVar.getClass();
            uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
            java.lang.String str = this.f78373u;
            java.lang.String str2 = this.f78371s;
            ((th0.u) rVar).getClass();
            com.tencent.mm.xwebutil.i.a(this, str, str2);
        }
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(this.f78370r, this.C);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        rh1.a aVar = this.f78369q;
        if (aVar != null) {
            aVar.A();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        rh1.a aVar = this.f78369q;
        if (aVar != null) {
            aVar.z();
        }
    }
}
