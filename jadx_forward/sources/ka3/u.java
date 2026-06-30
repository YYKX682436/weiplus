package ka3;

/* loaded from: classes15.dex */
public final class u {

    /* renamed from: r, reason: collision with root package name */
    public static final ka3.m f387620r;

    /* renamed from: s, reason: collision with root package name */
    public static ka3.u f387621s;

    /* renamed from: e, reason: collision with root package name */
    public ka3.i f387626e;

    /* renamed from: f, reason: collision with root package name */
    public dd1.a f387627f;

    /* renamed from: i, reason: collision with root package name */
    public ka3.f f387630i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f387631j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f387632k;

    /* renamed from: m, reason: collision with root package name */
    public final dd1.b f387634m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f387635n;

    /* renamed from: o, reason: collision with root package name */
    public org.json.JSONObject f387636o;

    /* renamed from: p, reason: collision with root package name */
    public final q80.g0 f387637p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f387638q;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f387622a = "";

    /* renamed from: b, reason: collision with root package name */
    public ka3.w f387623b = ka3.w.f387640f;

    /* renamed from: c, reason: collision with root package name */
    public ka3.w f387624c = ka3.w.f387642h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387625d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387628g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387629h = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f387633l = "";

    static {
        ka3.m mVar = new ka3.m(null);
        f387620r = mVar;
        try {
            mVar.a().h(new org.json.JSONObject(), false, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", "init in companion invoke registerProxyService");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppNFCServiceMgr", "init failed", e17);
        }
    }

    public u() {
        ka3.c cVar = ka3.d.f387588b;
        ka3.d dVar = ka3.d.f387589c;
        if (dVar == null) {
            synchronized (cVar) {
                dVar = ka3.d.f387589c;
                if (dVar == null) {
                    dVar = new ka3.d(null);
                    ka3.d.f387589c = dVar;
                }
            }
        }
        this.f387634m = dVar.f387590a;
        this.f387636o = new org.json.JSONObject();
        this.f387637p = (q80.g0) i95.n0.c(q80.g0.class);
    }

    public static final void a(ka3.u uVar) {
        uVar.f387630i = null;
        uVar.f387625d = "";
        uVar.f387622a = "";
        uVar.f387628g = "";
        uVar.f387629h = "";
        uVar.f387633l = "";
        uVar.f387631j = false;
        uVar.f387632k = false;
        uVar.f387635n = false;
        uVar.f387636o = new org.json.JSONObject();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", "reset cache finish");
    }

    public final boolean b() {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f387628g, "") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f387629h, "")) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppNFCServiceMgr", "checkAndlaunchLiteApp failed, appId or storeActionName is empty, appId=" + this.f387628g + ", storeActionName=" + this.f387629h);
        return false;
    }

    public final void c(org.json.JSONObject jSONObject) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", "dispatchStoreCommand");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) this.f387637p).rj(this.f387628g, this.f387629h, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppNFCServiceMgr", "dispatchStore=%s", e17.toString());
        }
    }

    public final void d() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f387628g, "") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f387629h, "")) {
            ka3.f fVar = this.f387630i;
            if (fVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppNFCServiceMgr", "ensureNfcRegistionKvInfo failed registerData is null");
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
            java.lang.String str = fVar.f387596f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-appId>(...)");
            this.f387628g = str;
            ka3.f fVar2 = this.f387630i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar2);
            java.lang.String str2 = fVar2.f387593c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "<get-storeActionName>(...)");
            this.f387629h = str2;
            ka3.f fVar3 = this.f387630i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar3);
            java.lang.String str3 = fVar3.f387597g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "<get-payHomePage>(...)");
            this.f387633l = str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", "registerData appId=" + this.f387628g + ", storeActionName=" + this.f387629h + ", payHomePage=" + this.f387633l);
        }
    }

    public final android.content.Context e() {
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 != null) {
            return (android.app.Activity) k17.get();
        }
        return null;
    }

    public final void f(org.json.JSONObject option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        this.f387638q = true;
        if (this.f387636o.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", "firstMessageMap is empty, ignored");
            return;
        }
        c(this.f387636o);
        this.f387636o = new org.json.JSONObject();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", "onStoreReady finish");
    }

    public final void g(org.json.JSONObject option) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        dd1.b bVar = this.f387634m;
        android.content.Context e17 = e();
        ka3.q qVar = new ka3.q();
        ((dd1.c) bVar).getClass();
        if (ed1.f.f332775d == null) {
            ed1.f.f332775d = new ed1.f();
        }
        ed1.f fVar = ed1.f.f332775d;
        if (fVar != null) {
            org.json.JSONArray jSONArray = option.getJSONArray("aidList");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
            java.util.List a17 = fVar.a(e17, qVar);
            java.util.Set linkedHashSet = new java.util.LinkedHashSet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray);
            c75.c.d(jSONArray, new ed1.e(linkedHashSet));
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add((java.lang.String) it.next());
            }
            linkedHashSet.removeAll(linkedHashSet2);
            if (linkedHashSet.isEmpty()) {
                qVar.b(fVar.d("need to register is empty"));
                return;
            }
            linkedHashSet.addAll(linkedHashSet2);
            if (linkedHashSet.isEmpty()) {
                qVar.b(fVar.d("mergedAid to register is empty"));
            } else {
                fVar.g(e17, linkedHashSet, qVar);
            }
        }
    }

    public final void h(org.json.JSONObject option, boolean z17, ka3.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", "registerProxyService nfcModuleCallback=" + this.f387626e + ", proxyServiceCallback=" + this.f387627f);
        if (iVar != null) {
            this.f387626e = iVar;
        }
        if (this.f387627f == null) {
            this.f387627f = new ka3.r(this);
        }
        dd1.b bVar = this.f387634m;
        android.content.Context e17 = e();
        dd1.a aVar = this.f387627f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        ((dd1.c) bVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NFCHceProxyService", "registerHCE data=%s", option.toString());
        ed1.f.f332774c = aVar;
        if (z17) {
            ed1.h hVar = new ed1.h();
            option.put("liteAppId", "liteAppId");
            if (e17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HceRegisterService", "context is null, retry with a delay");
                ((ka3.r) aVar).b(hVar.c(13009, "context is null, retry with a delay"));
            } else {
                hVar.f332779c = e17;
                hVar.f332780d = aVar;
                hVar.f332781e = option;
                hVar.f332782a = new ed1.g(hVar);
                new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.api.ext.C12194x70e2b4ea(hVar, false).d();
            }
        }
    }

    public final void i(org.json.JSONObject option, bd.e moduleCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleCallback, "moduleCallback");
        dd1.b bVar = this.f387634m;
        android.content.Context e17 = e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        ka3.s sVar = new ka3.s(moduleCallback);
        ((dd1.c) bVar).getClass();
        java.lang.String optString = option.optString("permission", "");
        ed1.o oVar = new ed1.o();
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1018707417) {
                if (hashCode != 108971) {
                    if (hashCode == 633465929 && optString.equals("paymentSettings")) {
                        android.content.Intent intent = new android.content.Intent("android.settings.NFC_PAYMENT_SETTINGS");
                        if (intent.resolveActivity(e17.getPackageManager()) != null) {
                            nf.g.a(e17).j(intent, ed1.n.f332784a);
                            sVar.b(ed1.k.e(oVar, null, 1, null));
                            return;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HceStateService", "cannot resolveActivity with intent");
                            sVar.b(oVar.c(14000, "cannot resolveActivity with intent"));
                            return;
                        }
                    }
                } else if (optString.equals("nfc")) {
                    android.content.Intent intent2 = new android.content.Intent("android.settings.NFC_SETTINGS");
                    android.content.pm.PackageManager packageManager = e17.getPackageManager();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageManager, "getPackageManager(...)");
                    java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 65536);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(queryIntentActivities, "queryIntentActivities(...)");
                    int i17 = 0;
                    if (queryIntentActivities.size() > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HceStateService", "NFC activity not null, activities size: " + queryIntentActivities.size());
                        int size = queryIntentActivities.size();
                        while (i17 < size) {
                            android.content.pm.ResolveInfo resolveInfo = queryIntentActivities.get(i17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(resolveInfo, "null cannot be cast to non-null type android.content.pm.ResolveInfo");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HceStateService", "NFC activity: %s", resolveInfo.activityInfo.name);
                            i17++;
                        }
                        i17 = 1;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HceStateService", "Cannot jump to NFC setting");
                    }
                    if (i17 == 0) {
                        sVar.b(oVar.b("cannot jump nfc setting"));
                        return;
                    }
                    nf.g.a(e17).j(new android.content.Intent("android.settings.NFC_SETTINGS"), new ed1.l(oVar));
                    sVar.b(ed1.k.e(oVar, null, 1, null));
                    return;
                }
            } else if (optString.equals("defaultWalletApp")) {
                android.content.Intent intent3 = new android.content.Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
                intent3.putExtra("category", "payment");
                intent3.putExtra("component", new android.content.ComponentName(e17, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.C12193x5bbe54ab.class));
                if (intent3.resolveActivity(e17.getPackageManager()) != null) {
                    nf.g.a(e17).j(intent3, ed1.m.f332783a);
                    sVar.b(ed1.k.e(oVar, null, 1, null));
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HceStateService", "cannot resolveActivity with intent");
                    sVar.b(oVar.c(14000, "cannot resolveActivity with intent"));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NFCHceProxyService", "unsupport request permission type, action=" + optString);
        sVar.b(oVar.b("unsupport request permission type"));
    }

    public final void j(org.json.JSONObject option, ka3.i moduleCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleCallback, "moduleCallback");
        dd1.b bVar = this.f387634m;
        android.content.Context e17 = e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        ka3.t tVar = new ka3.t(this, moduleCallback);
        ((dd1.c) bVar).getClass();
        if (ed1.f.f332775d == null) {
            ed1.f.f332775d = new ed1.f();
        }
        ed1.f fVar = ed1.f.f332775d;
        if (fVar != null) {
            fVar.f332782a = new ed1.d(option, fVar, e17, tVar);
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.api.ext.C12194x70e2b4ea(fVar, false).d();
        }
    }
}
