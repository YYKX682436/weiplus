package ox5;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f431325a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f431326b;

    /* renamed from: c, reason: collision with root package name */
    public final ox5.l f431327c;

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 f431328d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 f431329e;

    /* renamed from: f, reason: collision with root package name */
    public final mx5.c f431330f;

    /* renamed from: g, reason: collision with root package name */
    public final ox5.j f431331g = new ox5.j(this);

    /* renamed from: h, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 f431332h = new ox5.b(this);

    /* renamed from: i, reason: collision with root package name */
    public ox5.k f431333i = null;

    public a(ox5.l lVar, int i17, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e g17;
        boolean z17;
        this.f431326b = null;
        this.f431327c = lVar;
        this.f431326b = abstractC3700xe41a2874;
        this.f431325a = i17;
        kx5.n h17 = kx5.n.h();
        int i18 = this.f431325a;
        h17.getClass();
        if (i18 == 0 || (g17 = kx5.n.h().g(i18)) == null) {
            z17 = false;
        } else {
            if (h17.f394846c == g17) {
                h17.f394846c = null;
                h17.f394851h = java.lang.Boolean.FALSE;
            }
            z17 = true;
        }
        if (!z17) {
            nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Setting up FlutterEngine. engineId:%d", java.lang.Integer.valueOf(this.f431325a));
            a();
            this.f431325a = kx5.n.h().o(false, abstractC3700xe41a2874);
            if (b() != null) {
                nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "flutter engine is not null. engineId:%d", java.lang.Integer.valueOf(this.f431325a));
                if (abstractC3700xe41a2874 != null) {
                    abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.LOAD_FLUTTER_ENGINE_SUCCESS);
                }
            } else {
                nx5.c.b("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "flutter engine is null. engineId:%d", java.lang.Integer.valueOf(this.f431325a));
                if (abstractC3700xe41a2874 != null) {
                    abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.LOAD_FLUTTER_ENGINE_FAILED);
                }
            }
        }
        this.f431330f = new mx5.a(lVar.mo29007xf9fa8515(), this.f431325a);
    }

    public final void a() {
        if (this.f431327c == null) {
            throw new java.lang.IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e b() {
        return kx5.n.h().g(this.f431325a);
    }

    public void c(int i17, int i18, android.content.Intent intent) {
        a();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
            return;
        }
        nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i17 + "\nresultCode: " + i18 + "\ndata: " + intent, new java.lang.Object[0]);
        b17.m137423x1983fc75().mo137487x9d4787cb(i17, i18, intent);
    }

    public void d(boolean z17, boolean z18) {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onBackPressed", new java.lang.Object[0]);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e b17 = b();
        a();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
            ox5.l lVar = this.f431327c;
            if (lVar.m29017x19263085() != null) {
                lVar.m29017x19263085().finish();
                return;
            }
            return;
        }
        nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.", new java.lang.Object[0]);
        mx5.c cVar = this.f431330f;
        ox5.i iVar = new ox5.i(this);
        mx5.a aVar = (mx5.a) cVar;
        aVar.getClass();
        nx5.c.c("WxaRouter.DefaultFlutterViewLifecycle", "onBackPressed", new java.lang.Object[0]);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", aVar.f414168a.mo28568x146a8a26());
        hashMap.put("animation", java.lang.Boolean.valueOf(z17));
        hashMap.put("popPage", java.lang.Boolean.valueOf(z18));
        kx5.n.h().k(aVar.f414169b, "onBackPressed", hashMap, iVar);
    }

    public void e() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onCreate. engineId:%d", java.lang.Integer.valueOf(this.f431325a));
        a();
        ox5.l lVar = this.f431327c;
        this.f431329e = lVar.mo29012xa3c24e87(lVar.m29017x19263085(), b());
        lVar.mo29003xab73cc38(b());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View f(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox5.a.f(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void g(final boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(this.f431325a);
        objArr[1] = z17 ? "true" : "false";
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onDestroy() engineId:%d closeView:%s", objArr);
        mx5.c cVar = this.f431330f;
        final java.util.Map a17 = ((mx5.a) cVar).a();
        final int i17 = this.f431325a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ox5.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                kx5.n h17 = kx5.n.h();
                int i18 = i17;
                java.util.Map map = a17;
                h17.j(i18, "onDestroyView", map);
                if (z17) {
                    kx5.n.h().j(i18, "closeView", map);
                }
                kx5.n.h().p(i18);
            }
        };
        ox5.l lVar = this.f431327c;
        boolean b07 = lVar.b0(runnable);
        if (b07) {
            mx5.a aVar = (mx5.a) cVar;
            aVar.getClass();
            kx5.n.h().j(aVar.f414169b, "keepAlive", aVar.a());
        }
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = java.lang.Integer.valueOf(this.f431325a);
        objArr2[1] = b07 ? "true" : "false";
        nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onDestroyView. engineId:%d onlyDetach:%s", objArr2);
        if (!b07) {
            mx5.a aVar2 = (mx5.a) cVar;
            aVar2.getClass();
            kx5.n.h().j(aVar2.f414169b, "onDestroyView", aVar2.a());
        }
        a();
        if (z17) {
            nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onCloseView()", new java.lang.Object[0]);
            if (!b07) {
                mx5.a aVar3 = (mx5.a) cVar;
                aVar3.getClass();
                kx5.n.h().j(aVar3.f414169b, "closeView", aVar3.a());
            }
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 c28715x8c6f2da6 = this.f431329e;
        if (c28715x8c6f2da6 != null) {
            c28715x8c6f2da6.m138690x5cd39ffa();
            this.f431329e = null;
        }
        kx5.n h17 = kx5.n.h();
        mx5.b mo29007xf9fa8515 = lVar.mo29007xf9fa8515();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f431328d;
        int i18 = this.f431325a;
        h17.getClass();
        nx5.c.c("WxaRouter.WxaRouter", "destroy activityId:%s engineId:%d", mo29007xf9fa8515.mo28568x146a8a26(), java.lang.Integer.valueOf(i18));
        if (h17.f394850g.indexOfKey(i18) < 0) {
            nx5.c.b("WxaRouter.WxaRouter", "destroy fail", new java.lang.Object[0]);
            return;
        }
        if (c28553x45ef20c1 != null) {
            c28553x45ef20c1.m137259xf8d3d6a1();
        } else {
            nx5.c.b("WxaRouter.WxaRouter", "destroy view is null", new java.lang.Object[0]);
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e g17 = h17.g(i18);
        if (lVar.mo29013xbfcd5884()) {
            nx5.c.a("WxaRouter.WxaRouter", "detachFromActivity", new java.lang.Object[0]);
            if (lVar.m29017x19263085().isChangingConfigurations()) {
                g17.m137423x1983fc75().mo137483x3d389304();
            } else {
                g17.m137423x1983fc75().mo137482x32c8cc0c();
            }
        }
        if (!b07) {
            h17.p(i18);
        }
        h17.f394849f.remove(mo29007xf9fa8515.mo28568x146a8a26());
        mx5.b bVar = h17.f394848e;
        if (bVar == null || bVar != mo29007xf9fa8515) {
            return;
        }
        nx5.c.c("WxaRouter.WxaRouter", "detach current activity. set CurrentActivity null", new java.lang.Object[0]);
        h17.f394848e = null;
    }

    public void h(android.content.Intent intent) {
        a();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
        } else {
            nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine.", new java.lang.Object[0]);
            b17.m137423x1983fc75().mo137490xc944513d(intent);
        }
    }

    public void i() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onPause. engineId:%d", java.lang.Integer.valueOf(this.f431325a));
        b();
        mx5.a aVar = (mx5.a) this.f431330f;
        aVar.getClass();
        kx5.n.h().j(aVar.f414169b, "onPauseView", aVar.a());
        kx5.n h17 = kx5.n.h();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f431328d;
        int i17 = this.f431325a;
        h17.getClass();
        nx5.c.c("WxaRouter.WxaRouter", "appIsInactive view:%d engineId:%d", java.lang.Integer.valueOf(c28553x45ef20c1.hashCode()), java.lang.Integer.valueOf(i17));
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e g17 = h17.g(i17);
        if (g17 == null) {
            nx5.c.b("WxaRouter.WxaRouter", "engine is nil", new java.lang.Object[0]);
        } else {
            g17.m137431xae9c49af().m138173x2a6de4b6();
        }
        a();
    }

    public void j() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onPostResume. engineId:%d", java.lang.Integer.valueOf(this.f431325a));
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e b17 = b();
        a();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
            return;
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 c28715x8c6f2da6 = this.f431329e;
        if (c28715x8c6f2da6 != null) {
            c28715x8c6f2da6.m138691xef494f4f();
        }
    }

    public void k(int i17, java.lang.String[] strArr, int[] iArr) {
        a();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
            return;
        }
        nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i17 + "\npermissions: " + java.util.Arrays.toString(strArr) + "\ngrantResults: " + java.util.Arrays.toString(iArr), new java.lang.Object[0]);
        b17.m137423x1983fc75().mo137491x953457f1(i17, strArr, iArr);
    }

    public void l() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onResume. engineId:%d", java.lang.Integer.valueOf(this.f431325a));
        kx5.n h17 = kx5.n.h();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f431328d;
        int i17 = this.f431325a;
        h17.getClass();
        nx5.c.c("WxaRouter.WxaRouter", "appIsResumed view:%d engineId:%d", java.lang.Integer.valueOf(c28553x45ef20c1.hashCode()), java.lang.Integer.valueOf(i17));
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e g17 = h17.g(i17);
        if (g17 == null) {
            nx5.c.b("WxaRouter.WxaRouter", "engine is nil", new java.lang.Object[0]);
        } else {
            g17.m137431xae9c49af().m138175x84ce002c();
        }
        mx5.a aVar = (mx5.a) this.f431330f;
        aVar.getClass();
        kx5.n.h().j(aVar.f414169b, "onResumeView", aVar.a());
        a();
    }

    public void m() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e b17;
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onStart. engineId:%d", java.lang.Integer.valueOf(this.f431325a));
        a();
        ox5.l lVar = this.f431327c;
        if (lVar.mo29005xd9afab35() != null || (b17 = b()) == null || b17.m137427x4255efe8().m137860xb615fc87()) {
            return;
        }
        nx5.c.a("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Executing Dart entrypoint: " + lVar.mo29006x36e4a056() + ", and sending initial route: " + lVar.mo29008x47d0e7db(), new java.lang.Object[0]);
        if (lVar.mo29008x47d0e7db() != null) {
            b17.m137435x8a0ad399().m138193x7e19e2e7(lVar.mo29008x47d0e7db());
        }
        b17.m137427x4255efe8().m137853x820a9012(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint(lVar.mo29004x67b29512(), lVar.mo29006x36e4a056()));
    }

    public void n() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onStop. engineId:%d", java.lang.Integer.valueOf(this.f431325a));
        b();
        a();
        kx5.n h17 = kx5.n.h();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f431328d;
        int i17 = this.f431325a;
        h17.getClass();
        nx5.c.c("WxaRouter.WxaRouter", "appIsPause view:%d engineId:%d", java.lang.Integer.valueOf(c28553x45ef20c1.hashCode()), java.lang.Integer.valueOf(i17));
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e g17 = h17.g(i17);
        if (g17 == null) {
            nx5.c.b("WxaRouter.WxaRouter", "engine is nil", new java.lang.Object[0]);
        } else {
            g17.m137431xae9c49af().m138174x196db839();
        }
    }

    public void o(int i17) {
        a();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onTrimMemory() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
        } else if (i17 == 10) {
            nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onTrimMemory() to FlutterEngine. Level: " + i17, new java.lang.Object[0]);
            b17.m137450x625a5c1e().m138352x27cac7ae();
        }
    }

    public void p() {
        a();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
        } else {
            nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.", new java.lang.Object[0]);
            b17.m137423x1983fc75().mo137494xb1e9ab4();
        }
    }
}
