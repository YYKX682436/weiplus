package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 f264367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f264369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f264370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f264371h;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var, android.content.Context context, android.os.Bundle bundle, int i17, android.app.Dialog dialog) {
        this.f264367d = l2Var;
        this.f264368e = context;
        this.f264369f = bundle;
        this.f264370g = i17;
        this.f264371h = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 webviewDelegate = this.f264367d;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) webviewDelegate).f263436c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) webviewDelegate).f263436c;
            f3Var.getClass();
            android.content.Context ct6 = this.f264368e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ct6, "ct");
            android.os.Bundle resp = this.f264369f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webviewDelegate, "webviewDelegate");
            if (ct6 instanceof android.content.MutableContextWrapper) {
                ct6 = ((android.content.MutableContextWrapper) ct6).getBaseContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ct6, "getBaseContext(...)");
            }
            if (ct6 instanceof android.app.Activity) {
                int i17 = f3Var.f264409b;
                int i18 = this.f264370g;
                if (i17 != i18 && f3Var.f264408a != null) {
                    f3Var.c();
                }
                f3Var.f264409b = i18;
                if (f3Var.f264408a == null) {
                    java.lang.String c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) webviewDelegate).c();
                    java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(ct6);
                    android.app.Dialog dialog = this.f264371h;
                    f3Var.f264408a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3(f3Var, weakReference, dialog != null ? new java.lang.ref.WeakReference(dialog) : null, c17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var = f3Var.f264408a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e3Var);
                int i19 = 0;
                if (!(e3Var.f264388e == null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[showDialogQueue] repeat call");
                    return;
                }
                f3Var.f264410c = new java.lang.ref.WeakReference(webviewDelegate);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var2 = f3Var.f264408a;
                if (e3Var2 != null) {
                    e3Var2.f264388e = resp;
                    java.io.Serializable serializable = resp.getSerializable("scope_list");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(serializable, "null cannot be cast to non-null type java.util.ArrayList<kotlin.ByteArray>");
                    java.util.LinkedList a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m2.a((java.util.ArrayList) serializable);
                    e3Var2.f264386c = a17;
                    e3Var2.f264393j.getClass();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(a17) && a17.size() != 1) {
                        java.util.Iterator it = a17.iterator();
                        int i27 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.jv5) next).f459664d, "snsapi_userinfo")) {
                                i19 = i27;
                                break;
                            }
                            i27 = i28;
                        }
                        if (i19 > 0) {
                            a17.addFirst(a17.remove(i19));
                        }
                    }
                    e3Var2.b();
                }
            }
        }
    }
}
