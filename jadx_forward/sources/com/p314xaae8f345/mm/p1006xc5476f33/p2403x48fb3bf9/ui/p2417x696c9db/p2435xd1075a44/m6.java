package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class m6 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f268943e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f268944f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f268945g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Bundle f268946h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Bundle f268947i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f268948m;

    /* renamed from: n, reason: collision with root package name */
    public int f268949n;

    public m6(java.lang.ref.WeakReference controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f268943e = controller;
        this.f268949n = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aak);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String E6() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f268943e.get();
            if (r0Var == null) {
                return "";
            }
            java.lang.String i17 = r0Var.i();
            return i17 == null ? "" : i17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PreloadWebViewStubCallback", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String Ni() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f268943e.get();
            if (r0Var == null) {
                return "";
            }
            java.lang.String str = r0Var.E;
            return str == null ? "" : str;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PreloadWebViewStubCallback", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void W1(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        int i17 = 0;
        try {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreloadWebViewStubCallback", "setFontSizeCb, ex = " + e17.getMessage());
        }
        f0Var.f391649d = i17;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.k6(this, f0Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public int X1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f268943e.get();
        if (r0Var == null || (O = r0Var.O()) == null) {
            return 0;
        }
        return O.f264916c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f268943e.get();
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j6(r0Var != null ? r0Var.g0() : null, str, str2, bundle, z17));
            return false;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreloadWebViewStubCallback", "In onHandleEnd method, it happens something unwanted!");
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void b(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.u0 u0Var;
        java.lang.ref.WeakReference weakReference = this.f268945g;
        if (weakReference == null || (u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.u0) weakReference.get()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) u0Var).b(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: callback */
    public boolean mo70207xf5bc2045(int i17, android.os.Bundle bundle) {
        java.util.LinkedList linkedList;
        java.lang.String string;
        java.lang.String string2;
        java.util.ArrayList<java.lang.String> stringArrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f268943e.get();
        nw4.n g07 = r0Var != null ? r0Var.g0() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g07, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f268943e.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = r0Var2 != null ? r0Var2.R : null;
        java.lang.ref.WeakReference weakReference = this.f268944f;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        android.app.Activity activity = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
        switch (i17) {
            case 1002:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c6(activity, g07, wVar, bundle));
                return true;
            case 1003:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d6(g07, wVar, bundle));
                return true;
            case 1004:
            case 1005:
            case 1009:
            default:
                return true;
            case 1006:
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.b6(this, bundle, g07));
                return true;
            case 1007:
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.i6(g07, wVar, bundle.getString("download_manager_appid", ""), bundle.getLong("download_manager_downloadid"), bundle.getInt("download_manager_progress"), bundle.getFloat("download_manager_progress_float")));
                return true;
            case 1008:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e6(g07, wVar, bundle));
                return true;
            case 1010:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f6(g07, wVar, bundle));
                return true;
            case 1011:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.g6(g07, wVar, bundle));
                return true;
            case 1012:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h6(g07, wVar, bundle));
                return true;
            case 1013:
                try {
                    linkedList = new java.util.LinkedList();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PreloadWebViewStubCallback", e17, "parse webCompt", new java.lang.Object[0]);
                }
                if (bundle == null || (string = bundle.getString("__appId")) == null || (string2 = bundle.getString("__url")) == null) {
                    return false;
                }
                if (bundle.containsKey("__webComptList") && (stringArrayList = bundle.getStringArrayList("__webComptList")) != null) {
                    for (java.lang.String str : stringArrayList) {
                        r45.d24 d24Var = new r45.d24();
                        d24Var.mo11468x92b714fd(bundle.getByteArray(str));
                        linkedList.add(d24Var);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 y17 = g07.y();
                if (y17 != null) {
                    y17.b(string, string2, linkedList);
                }
                return true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: getCurrentUrl */
    public java.lang.String mo70208xad58292c() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f268943e.get();
            if (r0Var == null) {
                return "";
            }
            java.lang.String Z = r0Var.Z();
            return Z == null ? "" : Z;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PreloadWebViewStubCallback", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
    
        r7 = r8.getString("key_set_bounce_background_color");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle i(int r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m6.i(int, android.os.Bundle):android.os.Bundle");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void te(int i17, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = this.f268944f;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        android.app.Activity activity = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
        if (activity == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l6(activity, this, i17, bundle));
    }
}
