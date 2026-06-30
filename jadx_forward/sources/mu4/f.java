package mu4;

/* loaded from: classes8.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.x0 {

    /* renamed from: e, reason: collision with root package name */
    public final nw4.n f412938e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f412939f;

    public f(nw4.n jsapi) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        this.f412938e = jsapi;
        this.f412939f = "MicroMsg.JsApiWebViewStub_Callback_AIDL";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void Ae(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean Cg(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.h hVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void D3(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String E6() {
        return this.f412939f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public android.os.Bundle H6(java.lang.String str, java.lang.String str2) {
        return new android.os.Bundle();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void Ic(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String Ni() {
        return this.f412939f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void V1() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void W1(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public int X1() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f412938e.O(str, str2, nw4.a.a(bundle), z17);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.x0, android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void b(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: callback */
    public boolean mo70207xf5bc2045(int i17, android.os.Bundle bundle) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void d5(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void da(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void ec() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: getCurrentUrl */
    public java.lang.String mo70208xad58292c() {
        return this.f412939f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f412939f, "invokeAsResult:" + i17);
        android.os.Bundle bundle2 = new android.os.Bundle();
        nw4.n nVar = this.f412938e;
        if (i17 == 101) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle);
            bundle.setClassLoader(com.p314xaae8f345.mm.ui.w2.class.getClassLoader());
            android.content.Context s17 = nVar.s();
            java.lang.String string = bundle.getString("open_ui_with_webview_ui_plugin_name");
            java.lang.String string2 = bundle.getString("open_ui_with_webview_ui_plugin_entry");
            android.content.Intent intent = new android.content.Intent();
            android.os.Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle3);
            j45.l.j(s17, string, string2, intent.putExtras(bundle3), null);
        } else if (i17 == 200) {
            zq1.z zVar = new zq1.z();
            android.content.Intent intent2 = new android.content.Intent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle);
            int i18 = bundle.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            int i19 = bundle.getInt("subscene", 10000);
            java.lang.String string3 = bundle.getString("url");
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(string3)) {
                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                string3 = ot0.g0.a(string3, i18, i19, currentTimeMillis);
            }
            bundle2.putBoolean(ya.b.f77504xbb80cbe3, ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).F(nVar.s(), string3, bundle.getInt("item_show_type"), bundle.getBoolean("isNativePage"), i18, i19, intent2, bundle.getInt("openType"), zVar));
            if (!zVar.f556557a && (str = zVar.f556558b) != null) {
                bundle2.putString("desc", str);
            }
        }
        return bundle2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void t3(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void te(int i17, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean v3(int i17) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void w8(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String za() {
        return this.f412939f;
    }
}
