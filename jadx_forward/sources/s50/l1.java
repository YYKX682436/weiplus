package s50;

@j95.b
/* loaded from: classes12.dex */
public final class l1 extends i95.w implements su4.c1 {

    /* renamed from: d, reason: collision with root package name */
    public z21.e f484613d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f484614e;

    /* renamed from: h, reason: collision with root package name */
    public long f484617h;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f484621o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f484615f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f484616g = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public s50.x0 f484618i = s50.x0.f484670d;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f484619m = "";

    /* renamed from: n, reason: collision with root package name */
    public final su4.b1 f484620n = new su4.b1();

    /* renamed from: p, reason: collision with root package name */
    public final s50.e1 f484622p = new s50.e1(this, android.os.Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f484623q = new java.util.LinkedHashMap();

    public static final void Ai(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, int i17) {
        l1Var.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputViewCompletion, bottomHeight=" + i17);
            l1Var.f484618i = s50.x0.f484677n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onVoiceInputViewCompletion");
            jSONObject.put("from", "bottom");
            jSONObject.put("bottomHeight", i17);
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputViewCompletion, error: " + e17);
        }
    }

    public static final void wi(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, java.lang.String str, boolean z17, java.lang.String str2) {
        l1Var.getClass();
        try {
            l1Var.f484618i = s50.x0.f484677n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, str);
            int i17 = 1;
            if (str2.length() > 0) {
                jSONObject.put("voiceid", str2);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", "onsearch");
            jSONObject2.put("extinfo", jSONObject);
            if (!z17) {
                i17 = 2;
            }
            jSONObject2.put("sceneFrom", i17);
            long g17 = o13.n.g(3);
            o13.p.f423784d = g17;
            jSONObject2.put("searchid", g17);
            l1Var.bj(weakReference, jSONObject2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputData, error: " + e17);
        }
    }

    public final void Bi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "doCancel, currVoiceStatus: " + this.f484618i);
        s50.e1 e1Var = this.f484622p;
        e1Var.mo50303x856b99f0(101);
        e1Var.mo50303x856b99f0(102);
        if (this.f484618i == s50.x0.f484673g) {
            this.f484618i = s50.x0.f484674h;
            java.lang.ref.WeakReference weakReference = this.f484614e;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("status", "onstop");
                bj(weakReference, jSONObject);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStop, error: " + e17);
            }
        }
        if (this.f484618i == s50.x0.f484675i) {
            this.f484618i = s50.x0.f484676m;
            Vi(this.f484614e);
        }
        z21.e eVar = this.f484613d;
        if (eVar != null) {
            eVar.mo48278xae7a2e7a(false);
        }
        this.f484613d = null;
        this.f484618i = s50.x0.f484670d;
        this.f484619m = "";
    }

    public final void Di(int i17, float f17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "doStartAfterPermissionGranted");
        Bi();
        this.f484618i = s50.x0.f484671e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
            this.f484613d = new z21.w();
        } else {
            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
            this.f484613d = com.p314xaae8f345.mm.p964x2822171a.BinderC11153x6a3b619.m48277x9cf0d20b();
        }
        z21.e eVar = this.f484613d;
        if (eVar != null) {
            eVar.mo48283x316510((z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).equals("en")) ? 4 : 1, i17, new s50.d1(this));
        }
        this.f484617h = java.lang.System.currentTimeMillis();
        this.f484618i = s50.x0.f484672f;
        z21.e eVar2 = this.f484613d;
        if (eVar2 != null) {
            eVar2.mo48293x799cc6f6(f17);
        }
        z21.e eVar3 = this.f484613d;
        if (eVar3 != null) {
            eVar3.mo48296x68ac462();
        }
        aj(this.f484614e);
    }

    public final android.view.ViewGroup Ni(java.lang.ref.WeakReference weakReference) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) weakReference.get();
        if (abstractC19224x1fe3df6e == null) {
            return null;
        }
        for (android.view.ViewParent parent = abstractC19224x1fe3df6e.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                if (viewGroup.getId() == com.p314xaae8f345.mm.R.id.che) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "findContainerForWebView: found half screen drag_layout, using it directly");
                    return viewGroup;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "findContainerForWebView: not in half screen, return null");
        return null;
    }

    public final k23.v0 Ri(int i17) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) this.f484615f).get(java.lang.Integer.valueOf(i17));
        if (weakReference != null) {
            return (k23.v0) weakReference.get();
        }
        return null;
    }

    public final k23.v0 Ui(int i17) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) this.f484623q).get(java.lang.Integer.valueOf(i17));
        if (weakReference != null) {
            return (k23.v0) weakReference.get();
        }
        return null;
    }

    public final void Vi(java.lang.ref.WeakReference weakReference) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "oncancel");
            bj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputCancel, error: " + e17);
        }
    }

    public final void Zi(java.lang.ref.WeakReference weakReference, s50.w0 w0Var, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("retCode", w0Var.f484667d);
            jSONObject.put("errMsg", str);
            jSONObject.put("status", "onerror");
            bj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputError, error: " + e17);
        }
    }

    public final void aj(java.lang.ref.WeakReference weakReference) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onstart");
            bj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStart, error: " + e17);
        }
    }

    public final void bj(java.lang.ref.WeakReference weakReference, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStatus, event->" + jSONObject + ", status->" + this.f484618i);
            if (this.f484618i == s50.x0.f484670d || weakReference == null || (abstractC19224x1fe3df6e = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) weakReference.get()) == null) {
                return;
            }
            if (!jSONObject.has("retCode")) {
                s50.w0 w0Var = s50.w0.f484662e;
                jSONObject.put("retCode", 0);
                jSONObject.put("errMsg", "ok");
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extinfo");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
                jSONObject.put("extinfo", optJSONObject);
            }
            optJSONObject.put("inputId", this.f484617h);
            java.lang.String str = this.f484621o;
            if (str != null) {
                jSONObject.put("thirdExtInfo", str);
            }
            av4.y0.f95883a.c(abstractC19224x1fe3df6e, "onStreamVoiceInputStatus", jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStatus, error: " + e17);
        }
    }

    public final void cj(java.lang.ref.WeakReference weakReference, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStatusDirect, event->" + jSONObject);
            if (weakReference == null || (abstractC19224x1fe3df6e = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) weakReference.get()) == null) {
                return;
            }
            if (!jSONObject.has("retCode")) {
                s50.w0 w0Var = s50.w0.f484662e;
                jSONObject.put("retCode", 0);
                jSONObject.put("errMsg", "ok");
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extinfo");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
                jSONObject.put("extinfo", optJSONObject);
            }
            optJSONObject.put("inputId", this.f484617h);
            java.lang.String str = this.f484621o;
            if (str != null) {
                jSONObject.put("thirdExtInfo", str);
            }
            av4.y0.f95883a.c(abstractC19224x1fe3df6e, "onStreamVoiceInputStatus", jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStatusDirect, error: " + e17);
        }
    }

    public final void fj(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.ref.WeakReference weakReference, k23.v0 v0Var) {
        android.app.Application application = abstractActivityC21394xb3d2c0cf.getApplication();
        if (application == null) {
            return;
        }
        int identityHashCode = java.lang.System.identityHashCode(abstractActivityC21394xb3d2c0cf);
        java.util.Map map = this.f484616g;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(identityHashCode));
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        s50.f1 f1Var = new s50.f1(abstractActivityC21394xb3d2c0cf, this, weakReference, v0Var, identityHashCode, application);
        map.put(java.lang.Integer.valueOf(identityHashCode), f1Var);
        application.registerActivityLifecycleCallbacks(f1Var);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onAccountInitialized}");
        super.mo204xfac946a6(context);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onAccountInitialized");
        super.mo836xb8969aab(context);
        Bi();
        this.f484614e = null;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onCreate");
        super.mo8845x3e5a77bb(context);
    }
}
