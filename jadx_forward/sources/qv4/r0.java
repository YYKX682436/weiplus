package qv4;

/* loaded from: classes12.dex */
public final class r0 implements jv4.h, kv4.m, sv4.d, rv4.y {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f448540a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f448541b;

    /* renamed from: c, reason: collision with root package name */
    public final su4.p0 f448542c;

    /* renamed from: d, reason: collision with root package name */
    public jv4.i f448543d;

    /* renamed from: e, reason: collision with root package name */
    public rv4.h f448544e;

    /* renamed from: f, reason: collision with root package name */
    public rv4.b0 f448545f;

    /* renamed from: g, reason: collision with root package name */
    public rv4.a f448546g;

    /* renamed from: h, reason: collision with root package name */
    public rv4.p f448547h;

    /* renamed from: i, reason: collision with root package name */
    public final kv4.g f448548i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f448549j;

    /* renamed from: k, reason: collision with root package name */
    public int f448550k;

    /* renamed from: l, reason: collision with root package name */
    public final int f448551l;

    /* renamed from: m, reason: collision with root package name */
    public final int f448552m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f448553n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f448554o;

    public r0(rv4.w session, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, su4.p0 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f448540a = session;
        this.f448541b = context;
        this.f448542c = config;
        this.f448548i = new kv4.g(0);
        this.f448549j = new java.util.ArrayList();
        new java.lang.ref.WeakReference(null);
        this.f448551l = 1;
        this.f448552m = 2;
        this.f448554o = jz5.h.b(new qv4.q0(this));
    }

    public static final void d(qv4.r0 r0Var, boolean z17) {
        long currentTimeMillis;
        jv4.i iVar = r0Var.f448543d;
        if (iVar != null) {
            java.lang.String value = java.lang.String.valueOf(z17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            jv4.e eVar = (jv4.e) ((jv4.p) iVar).f383795e;
            eVar.getClass();
            eVar.f383768a.e("isAISearchVisible", value);
        }
        rv4.w wVar = r0Var.f448540a;
        rv4.t a17 = wVar.a();
        if (z17) {
            currentTimeMillis = 0;
        } else {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            currentTimeMillis = java.lang.System.currentTimeMillis();
        }
        a17.f482087a.put("hideAiSearch", currentTimeMillis);
        wVar.a().a();
    }

    public static final void e(qv4.r0 r0Var, boolean z17) {
        long currentTimeMillis;
        jv4.i iVar = r0Var.f448543d;
        if (iVar != null) {
            java.lang.String value = java.lang.String.valueOf(z17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            jv4.e eVar = (jv4.e) ((jv4.p) iVar).f383795e;
            eVar.getClass();
            eVar.f383768a.e("isYuanbaoVisible", value);
        }
        rv4.w wVar = r0Var.f448540a;
        rv4.t a17 = wVar.a();
        if (z17) {
            currentTimeMillis = 0;
        } else {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            currentTimeMillis = java.lang.System.currentTimeMillis();
        }
        a17.f482087a.put("hideYuanbaoAd", currentTimeMillis);
        wVar.a().a();
    }

    @Override // jv4.h
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 a(android.view.ViewGroup parent, jv4.m type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        switch (type.ordinal()) {
            case 1:
                android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efu, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                return new qv4.e(inflate);
            case 2:
                android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egl, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
                return new qv4.k0(inflate2);
            case 3:
                android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egc, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
                return new qv4.z(inflate3);
            case 4:
                android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egb, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate4, "inflate(...)");
                return new qv4.m(inflate4);
            case 5:
                android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eg6, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate5, "inflate(...)");
                return new jv4.g(inflate5);
            case 6:
            case 7:
            default:
                return new jv4.g(new android.view.View(parent.getContext()));
            case 8:
                android.view.View inflate6 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570662eg2, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate6, "inflate(...)");
                return new qv4.b0(inflate6);
            case 9:
                if (this.f448550k == this.f448552m) {
                    android.view.View inflate7 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efs, parent, false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate7, "inflate(...)");
                    return new qv4.b(inflate7);
                }
                android.view.View inflate8 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efr, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate8, "inflate(...)");
                return new qv4.b(inflate8);
            case 10:
                android.view.View inflate9 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egc, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate9, "inflate(...)");
                return new kv4.d(inflate9);
            case 11:
                android.view.View inflate10 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egd, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate10, "inflate(...)");
                return new kv4.b(inflate10);
            case 12:
                return new qv4.s0(new android.view.View(parent.getContext()));
        }
    }

    @Override // jv4.h
    public java.util.List b() {
        return this.f448549j;
    }

    @Override // jv4.h
    public void c(jv4.i iVar) {
        this.f448543d = iVar;
    }

    public boolean f() {
        rv4.p pVar = this.f448547h;
        if (pVar == null) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar);
        return !pVar.h();
    }

    public final rv4.x g() {
        return (rv4.x) ((jz5.n) this.f448554o).mo141623x754a37bb();
    }

    public rv4.z h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv4.b0 b0Var = this.f448545f;
        if (b0Var != null) {
            arrayList.add(new rv4.d0(this.f448540a, b0Var.f481977g, b0Var.f481974d, false, 8, null));
            java.util.List list = b0Var.f481975e;
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                rv4.w wVar = this.f448540a;
                rv4.c0 c0Var = (rv4.c0) ((mv4.j) obj);
                boolean b17 = c0Var.b();
                java.lang.String str = c0Var.f481982c;
                java.lang.Integer num = c0Var.f481984e;
                arrayList.add(new rv4.e0(wVar, b17, str, num != null ? num.intValue() : 0, ((java.util.ArrayList) list).size(), i17, b0Var.f481977g));
                i17 = i18;
            }
        }
        rv4.h hVar = this.f448544e;
        if (hVar != null) {
            arrayList.add(new rv4.n(this.f448540a, hVar.f482012h, hVar.f482010f, false, 8, null));
        }
        rv4.p pVar = this.f448547h;
        if (pVar != null && (!pVar.f482061c.isEmpty())) {
            arrayList.add(new rv4.s(this.f448540a, pVar.f482073o, pVar.f482072n, false, 8, null));
        }
        return new rv4.z(arrayList);
    }

    public void i() {
        this.f448553n = true;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jv4.i iVar = this.f448543d;
        su4.e2 c17 = iVar != null ? ((jv4.e) ((jv4.p) iVar).f383795e).f383768a.c() : null;
        rv4.w wVar = this.f448540a;
        if (c17 != null && c17.f494408a) {
            org.json.JSONObject a17 = ri.l0.a(kz5.c1.k(new jz5.l("settingType", 4), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, c17.f494409b), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f482087a.optLong("hideAiSearch", 0L) != 0)))));
            if (a17 != null) {
                arrayList.add(a17);
            }
        }
        jv4.i iVar2 = this.f448543d;
        su4.e2 b17 = iVar2 != null ? ((jv4.e) ((jv4.p) iVar2).f383795e).f383768a.b() : null;
        if (b17 != null && b17.f494408a) {
            org.json.JSONObject a18 = ri.l0.a(kz5.c1.k(new jz5.l("settingType", 5), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, b17.f494409b), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f482087a.optLong("hideYuanbaoAd", 0L) != 0)))));
            if (a18 != null) {
                arrayList.add(a18);
            }
        }
        rv4.b0 b0Var = this.f448545f;
        if (b0Var != null) {
            boolean z17 = wVar.a().f482087a.optLong("hideVertical", 0L) != 0;
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("settingType", 1);
            lVarArr[1] = new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, b0Var.f481974d);
            lVarArr[2] = new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!z17));
            java.util.List list = b0Var.f481975e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                rv4.c0 c0Var = (rv4.c0) ((mv4.j) it.next());
                java.util.Iterator it6 = it;
                java.util.Map l17 = kz5.c1.l(new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, c0Var.f481982c), new jz5.l("visible", java.lang.Boolean.valueOf(c0Var.b())), new jz5.l("settingType", 2));
                java.lang.Long l18 = c0Var.f481983d;
                if (l18 != null) {
                    l17.put("isSwitchOn", java.lang.Long.valueOf(l18.longValue()));
                }
                java.lang.Boolean bool = c0Var.f481987h;
                if (bool != null) {
                    l17.put("isSwitchClosed", java.lang.Boolean.valueOf(bool.booleanValue()));
                }
                java.lang.Integer num = c0Var.f481984e;
                if (num != null) {
                    l17.put("businessType", java.lang.Integer.valueOf(num.intValue()));
                }
                arrayList2.add(l17);
                it = it6;
            }
            lVarArr[3] = new jz5.l("items", arrayList2);
            org.json.JSONObject a19 = ri.l0.a(kz5.c1.k(lVarArr));
            if (a19 != null) {
                arrayList.add(a19);
            }
        }
        rv4.h hVar = this.f448544e;
        if (hVar != null) {
            org.json.JSONObject a27 = ri.l0.a(kz5.c1.k(new jz5.l("settingType", 3), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, hVar.f482010f), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f482087a.optLong("hidehis", 0L) != 0)))));
            if (a27 != null) {
                arrayList.add(a27);
            }
        }
        rv4.p pVar = this.f448547h;
        if (pVar != null && (!pVar.f482061c.isEmpty())) {
            org.json.JSONObject a28 = ri.l0.a(kz5.c1.k(new jz5.l("settingType", 6), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, pVar.f482072n), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f482087a.optLong("hideHotSearch", 0L) != 0)))));
            if (a28 != null) {
                arrayList.add(a28);
            }
        }
        if (this.f448542c.m()) {
            java.lang.String string = this.f448541b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574483ie3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            arrayList.add(ri.l0.a(kz5.c1.k(new jz5.l("settingType", 10), new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, string), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f482087a.optLong("hideVoiceV3Btn", 0L) != 0))))));
        }
        c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.APP;
        c3708xc1f46f80.f14309xf0df6fda = ri.l0.a(kz5.c1.k(new jz5.l(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, wVar.f413207a), new jz5.l("items", kz5.n0.V(arrayList))));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new qv4.l0(this);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f448541b;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite292c2ce0ae0ce2b6ff62226ac60ed4b4");
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "pages/seach-page-setting/entry");
        bundle.putBoolean("forbidRightGesture", true);
        bundle.putString("minVersion", "2.0.0");
        bundle.putDouble("heightPercent", 0.67d);
        bundle.putBoolean("isHalfScreen", true);
        bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).jk(abstractActivityC21394xb3d2c0cf, bundle, true, false, sVar, new qv4.m0());
    }

    public void j() {
        boolean z17;
        rv4.p pVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTS.GlobalTeachViewAdapter", "reloadData, enableLargeGapSection: " + f() + ", aiSearchPosition: " + this.f448550k);
        rv4.b0 b0Var = this.f448545f;
        boolean z18 = false;
        if (b0Var != null && b0Var.c()) {
            rv4.b0 b0Var2 = this.f448545f;
            if (b0Var2 != null) {
                int i17 = 32 - 10;
                int i18 = 24 - 10;
                if (!f()) {
                    i17 = i18;
                }
                b0Var2.f481972b = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
            }
            z17 = false;
        } else {
            z17 = true;
        }
        rv4.h hVar = this.f448544e;
        if (hVar != null && hVar.j()) {
            rv4.h hVar2 = this.f448544e;
            if (hVar2 != null) {
                boolean f17 = f();
                int i19 = z17 ? 14 : 6;
                int i27 = 32 - i19;
                int i28 = 24 - i19;
                if (!f17) {
                    i27 = i28;
                }
                hVar2.f482008d = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i27);
            }
            z17 = false;
        }
        rv4.p pVar2 = this.f448547h;
        if (pVar2 != null && pVar2.h()) {
            z18 = true;
        }
        if (z18 && (pVar = this.f448547h) != null) {
            boolean f18 = f();
            int i29 = z17 ? 14 : 6;
            int i37 = 32 - i29;
            int i38 = 24 - i29;
            if (!f18) {
                i37 = i38;
            }
            pVar.f482070l = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i37);
        }
        jv4.i iVar = this.f448543d;
        if (iVar != null) {
            ((jv4.p) iVar).y(true);
        }
    }

    public final void k() {
        jv4.i iVar = this.f448543d;
        rv4.w session = this.f448540a;
        session.f482090c = iVar;
        qv4.p0 p0Var = new qv4.p0(g());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f448541b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f448544e = new rv4.h(session, context, p0Var);
        this.f448545f = new rv4.b0(session, context);
        jv4.i iVar2 = this.f448543d;
        int i17 = 0;
        int f17 = iVar2 != null ? ((jv4.e) ((jv4.p) iVar2).f383795e).f383768a.f() : 0;
        this.f448550k = f17;
        int i18 = this.f448552m;
        int i19 = this.f448551l;
        if (f17 == i19 || f17 == i18) {
            this.f448546g = new rv4.a(session, context);
        }
        this.f448547h = new rv4.p(session, context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv4.a aVar = this.f448546g;
        if (aVar != null && this.f448550k == i18) {
            arrayList.add(new kv4.h(aVar));
        }
        rv4.b0 b0Var = this.f448545f;
        if (b0Var != null) {
            arrayList.add(new kv4.m0(b0Var, this));
        }
        rv4.h hVar = this.f448544e;
        if (hVar != null) {
            arrayList.add(new kv4.n(hVar, this));
        }
        rv4.p pVar = this.f448547h;
        if (pVar != null) {
            arrayList.add(new kv4.t(pVar, this));
        }
        rv4.a aVar2 = this.f448546g;
        if (aVar2 != null && this.f448550k == i19) {
            arrayList.add(new kv4.h(aVar2));
        }
        su4.p0 p0Var2 = this.f448542c;
        if (!p0Var2.mo134670x74219ae7() && !p0Var2.m()) {
            arrayList.add(new tv4.e(g()));
        }
        arrayList.add(new kv4.f(this.f448548i));
        this.f448549j = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        rv4.b0 b0Var2 = this.f448545f;
        if (b0Var2 != null) {
            arrayList2.add(b0Var2);
        }
        rv4.h hVar2 = this.f448544e;
        if (hVar2 != null) {
            arrayList2.add(hVar2);
        }
        rv4.p pVar2 = this.f448547h;
        if (pVar2 != null) {
            arrayList2.add(pVar2);
        }
        rv4.a aVar3 = this.f448546g;
        if (aVar3 != null) {
            arrayList2.add(aVar3);
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            mv4.c cVar = (mv4.c) next;
            cVar.e(i27);
            cVar.d();
            i17 = i27;
        }
        j();
    }

    public void l(boolean z17) {
        long currentTimeMillis;
        rv4.h hVar = this.f448544e;
        if (hVar != null) {
            hVar.f482012h = z17;
            hVar.f482015k = false;
            hVar.l(false);
            hVar.f482016l = false;
            rv4.w wVar = hVar.f482005a;
            rv4.t a17 = wVar.a();
            if (z17) {
                currentTimeMillis = 0;
            } else {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            a17.f482087a.put("hidehis", currentTimeMillis);
            wVar.a().a();
        }
        j();
    }

    public void m(boolean z17) {
        long currentTimeMillis;
        rv4.p pVar = this.f448547h;
        if (pVar != null) {
            pVar.f482073o = z17;
            rv4.w wVar = pVar.f482059a;
            rv4.t a17 = wVar.a();
            if (z17) {
                currentTimeMillis = 0;
            } else {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            a17.f482087a.put("hideHotSearch", currentTimeMillis);
            wVar.a().a();
        }
        j();
    }

    public void n(boolean z17) {
        long currentTimeMillis;
        rv4.b0 b0Var = this.f448545f;
        if (b0Var != null) {
            b0Var.f481977g = z17;
            rv4.w wVar = b0Var.f481971a;
            rv4.t a17 = wVar.a();
            if (z17) {
                currentTimeMillis = 0;
            } else {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            a17.f482087a.put("hideVertical", currentTimeMillis);
            wVar.a().a();
        }
        j();
    }

    public void o(int i17, boolean z17) {
        rv4.b0 b0Var = this.f448545f;
        if (b0Var != null) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            rv4.w wVar = b0Var.f481971a;
            org.json.JSONObject optJSONObject = wVar.a().f482087a.optJSONObject("localVerticalSwitchMap");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            java.util.Iterator it = ((java.util.ArrayList) b0Var.f481975e).iterator();
            while (it.hasNext()) {
                rv4.c0 c0Var = (rv4.c0) ((mv4.j) it.next());
                java.lang.Integer num = c0Var.f481984e;
                boolean b17 = (num != null && num.intValue() == i17) ? z17 : c0Var.b();
                long j17 = b17 ? 0L : currentTimeMillis;
                c0Var.f481983d = java.lang.Long.valueOf(j17);
                java.lang.Integer num2 = c0Var.f481984e;
                c0Var.f481986g = b17 && num2 != null && num2.intValue() == i17;
                if (num2 != null) {
                    optJSONObject.put(java.lang.String.valueOf(num2.intValue()), j17);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSGlobalTeachVerticalEntryData", "setSubItemVisible: " + i17 + ", " + z17 + ", " + optJSONObject);
            rv4.t a17 = wVar.a();
            a17.getClass();
            a17.f482087a.put("localVerticalSwitchMap", optJSONObject);
            wVar.a().a();
        }
        j();
    }
}
