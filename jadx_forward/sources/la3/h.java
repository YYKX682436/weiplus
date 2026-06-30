package la3;

/* loaded from: classes8.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f399067e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f399068f;

    public h(android.content.Context context, zg0.q2 q2Var) {
        this.f399067e = new java.lang.ref.WeakReference(context);
        this.f399068f = new java.lang.ref.WeakReference(q2Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String Ni() {
        try {
            zg0.q2 q2Var = (zg0.q2) this.f399068f.get();
            if (q2Var != null) {
                return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).E;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "getCommitUrl, controller==null");
            return "";
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "callback: getCommitUrl failed");
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        zg0.q2 q2Var = (zg0.q2) this.f399068f.get();
        if (q2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "onHandleEnd, controller==null");
            return false;
        }
        try {
            nw4.n g07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).g0();
            ((ku5.t0) ku5.t0.f394148d).B(new la3.f(this, g07, str, str2, bundle, z17));
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "In onHandleEnd method, it happens something unwanted!");
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: callback */
    public boolean mo70207xf5bc2045(int i17, android.os.Bundle bundle) {
        zg0.q2 q2Var;
        try {
            q2Var = (zg0.q2) this.f399068f.get();
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "In callback method, it happens something unwanted!");
        }
        if (q2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "callback, controller==null");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var;
        nw4.n g07 = r0Var.g0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = r0Var.R;
        if (i17 == 1006) {
            ((ku5.t0) ku5.t0.f394148d).B(new la3.g(this, bundle, wVar, g07));
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: getCurrentUrl */
    public java.lang.String mo70208xad58292c() {
        try {
            zg0.q2 q2Var = (zg0.q2) this.f399068f.get();
            if (q2Var != null) {
                return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).Z();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "getCurrentUrl, controller==null");
            return "";
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "callback: getCurrentUrl failed");
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.content.Context context = (android.content.Context) this.f399067e.get();
        java.util.Objects.toString(context);
        if (i17 == 101 && context != null && bundle != null) {
            try {
                bundle.setClassLoader(context.getClassLoader());
                android.os.Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
                java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "open_ui_with_webview_ui_plugin_name");
                java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "open_ui_with_webview_ui_plugin_entry");
                android.content.Intent intent = new android.content.Intent();
                if (bundle3 == null) {
                    bundle3 = new android.os.Bundle();
                }
                j45.l.j(context, k17, k18, intent.putExtras(bundle3), null);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "In invokeAsResult method, it happens something unwanted!");
            }
        }
        return bundle2;
    }
}
