package e20;

/* loaded from: classes9.dex */
public final class b implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pq.a f328000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e20.h f328001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f328002c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f328003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f328005f;

    public b(pq.a aVar, e20.h hVar, l81.b1 b1Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, boolean z17) {
        this.f328000a = aVar;
        this.f328001b = hVar;
        this.f328002c = b1Var;
        this.f328003d = c0Var;
        this.f328004e = str;
        this.f328005f = z17;
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
    }

    @Override // l81.e1
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea c11563x992ab6ea) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11562x60b4066e c11562x60b4066e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f c11564xab6b880f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLaunchComplete appId:");
        l81.b1 b1Var = this.f328002c;
        sb6.append(b1Var.f398547b);
        sb6.append(", username:");
        sb6.append(b1Var.f398545a);
        sb6.append(", isWarmLaunch:");
        boolean z17 = false;
        sb6.append(c11563x992ab6ea != null && c11563x992ab6ea.f156509f);
        sb6.append(", onCompleteHandled: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f328003d;
        sb6.append(c0Var.f391645d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.Wxa", sb6.toString());
        boolean z18 = c0Var.f391645d;
        java.lang.String str2 = this.f328004e;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ECS_O.Router.Wxa", "onLaunchComplete already handled " + str2);
            return;
        }
        c0Var.f391645d = true;
        if (this.f328005f) {
            this.f328001b.getClass();
            if (c11563x992ab6ea != null) {
                int ordinal = c11563x992ab6ea.f156514n.ordinal();
                if (ordinal == 1) {
                    str = "webview";
                } else if (ordinal == 2) {
                    str = "skyline";
                }
                if (!(c11563x992ab6ea == null && c11563x992ab6ea.f156509f) && (c11564xab6b880f = c11563x992ab6ea.f156511h) != null) {
                    z20.e eVar = z20.e.f551076e;
                    z20.b bVar = new z20.b();
                    bVar.f551070a = eVar;
                    bw5.q9 q9Var = new bw5.q9();
                    q9Var.f113532d = "ecso_open";
                    q9Var.f113546u[1] = true;
                    java.lang.String str3 = str;
                    q9Var.c(java.lang.System.currentTimeMillis());
                    q9Var.b(2);
                    bVar.f551071b = q9Var;
                    bVar.f(str2);
                    bVar.c("native_LaunchComplete");
                    bVar.f551071b.f113545t.add("wxa_service");
                    jz5.l lVar = new jz5.l("isWarmLaunch", "1");
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c11563x992ab6ea.f156508e);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<this>");
                    jz5.l lVar2 = new jz5.l("isPreRender", valueOf.toString());
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c11564xab6b880f.f156517f.ordinal());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf2, "<this>");
                    bVar.e(kz5.c1.k(lVar, lVar2, new jz5.l("entryPageNavigationType", valueOf2.toString()), new jz5.l("start_mode", "hot"), new jz5.l("version", c11563x992ab6ea.f156513m), new jz5.l("render_mode", str3)));
                    bVar.d();
                    if (c11564xab6b880f.f156517f != l81.a1.f398540e) {
                        z20.e eVar2 = z20.e.f551077f;
                        z20.b bVar2 = new z20.b();
                        bVar2.f551070a = eVar2;
                        bw5.q9 q9Var2 = new bw5.q9();
                        q9Var2.f113532d = "ecso_open";
                        q9Var2.f113546u[1] = true;
                        q9Var2.c(java.lang.System.currentTimeMillis());
                        q9Var2.b(2);
                        bVar2.f551071b = q9Var2;
                        bVar2.f(str2);
                        bVar2.c("native_done");
                        bVar2.a();
                        return;
                    }
                    return;
                }
                if (c11563x992ab6ea != null && !c11563x992ab6ea.f156509f) {
                    z17 = true;
                }
                if (z17 || (c11562x60b4066e = c11563x992ab6ea.f156510g) == null) {
                }
                int i17 = c11563x992ab6ea.f156507d;
                z20.e eVar3 = z20.e.f551076e;
                z20.b bVar3 = new z20.b();
                bVar3.f551070a = eVar3;
                bw5.q9 q9Var3 = new bw5.q9();
                q9Var3.f113532d = "ecso_open";
                q9Var3.f113546u[1] = true;
                q9Var3.c(java.lang.System.currentTimeMillis());
                q9Var3.b(2);
                bVar3.f551071b = q9Var3;
                bVar3.f(str2);
                bVar3.c("native_LaunchComplete");
                bVar3.f551071b.f113545t.add("wxa_service");
                jz5.l lVar3 = new jz5.l("isWarmLaunch", "0");
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf((i17 / 10) % 10);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf3, "<this>");
                jz5.l lVar4 = new jz5.l("preloadAppServiceType", valueOf3.toString());
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17 % 10);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf4, "<this>");
                bVar3.e(kz5.c1.k(lVar3, lVar4, new jz5.l("preloadWebViewType", valueOf4.toString()), new jz5.l("start_mode", "cold"), new jz5.l("version", c11563x992ab6ea.f156513m), new jz5.l("render_mode", str)));
                bVar3.d();
                for (java.util.Map.Entry entry : kz5.c1.k(new jz5.l("wxa_TotalStart", java.lang.Long.valueOf(c11562x60b4066e.f156492d)), new jz5.l("wxa_TotalEnd", java.lang.Long.valueOf(c11562x60b4066e.f156493e)), new jz5.l("wxa_GetContactStart", java.lang.Long.valueOf(c11562x60b4066e.f156494f)), new jz5.l("wxa_GetContactEnd", java.lang.Long.valueOf(c11562x60b4066e.f156495g)), new jz5.l("wxa_RscPreStart", java.lang.Long.valueOf(c11562x60b4066e.f156496h)), new jz5.l("wxa_RscPreEnd", java.lang.Long.valueOf(c11562x60b4066e.f156497i)), new jz5.l("wxa_LaunchStart", java.lang.Long.valueOf(c11562x60b4066e.f156498m)), new jz5.l("wxa_LaunchEnd", java.lang.Long.valueOf(c11562x60b4066e.f156499n)), new jz5.l("wxa_PkgPreStart", java.lang.Long.valueOf(c11562x60b4066e.f156500o)), new jz5.l("wxa_PkgPreEnd", java.lang.Long.valueOf(c11562x60b4066e.f156501p)), new jz5.l("wxa_JsApiPreStart", java.lang.Long.valueOf(c11562x60b4066e.f156502q)), new jz5.l("wxa_JsApiPreEnd", java.lang.Long.valueOf(c11562x60b4066e.f156503r))).entrySet()) {
                    java.lang.String str4 = (java.lang.String) entry.getKey();
                    long longValue = ((java.lang.Number) entry.getValue()).longValue();
                    if (longValue > 0) {
                        z20.e eVar4 = z20.e.f551076e;
                        z20.b bVar4 = new z20.b();
                        bVar4.f551070a = eVar4;
                        bw5.q9 q9Var4 = new bw5.q9();
                        q9Var4.f113532d = "ecso_open";
                        q9Var4.f113546u[1] = true;
                        q9Var4.c(java.lang.System.currentTimeMillis());
                        q9Var4.b(2);
                        bVar4.f551071b = q9Var4;
                        bVar4.f(str2);
                        bVar4.c(str4);
                        bVar4.f551071b.c(longValue);
                        bVar4.a();
                    }
                }
                return;
            }
            str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
            if (!(c11563x992ab6ea == null && c11563x992ab6ea.f156509f)) {
            }
            if (c11563x992ab6ea != null) {
                z17 = true;
            }
            if (z17) {
            }
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.Wxa", "onAppBrandUIEnter");
        yz5.p pVar = this.f328000a.f439086c;
        if (pVar != null) {
            bw5.i8 i8Var = new bw5.i8();
            i8Var.f110025d = bw5.k8.EcsOpenPlatform_Native;
            boolean[] zArr = i8Var.f110029h;
            zArr[1] = true;
            i8Var.f110026e = this.f328001b.f496083a;
            zArr[2] = true;
            pVar.mo149xb9724478(bw5.j8.EcsOpenEventType_wxaDidShow, i8Var);
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.Wxa", "onAppBrandUIExit");
        yz5.p pVar = this.f328000a.f439086c;
        if (pVar != null) {
            bw5.i8 i8Var = new bw5.i8();
            i8Var.f110025d = bw5.k8.EcsOpenPlatform_Native;
            boolean[] zArr = i8Var.f110029h;
            zArr[1] = true;
            i8Var.f110026e = this.f328001b.f496083a;
            zArr[2] = true;
            pVar.mo149xb9724478(bw5.j8.EcsOpenEventType_wxaDidExit, i8Var);
        }
    }
}
