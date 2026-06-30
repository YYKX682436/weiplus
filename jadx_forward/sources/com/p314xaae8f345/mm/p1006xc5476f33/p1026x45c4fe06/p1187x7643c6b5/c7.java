package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public final class c7 implements qk.u6 {

    /* renamed from: a, reason: collision with root package name */
    public final qk.v6 f170173a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 f170174b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f170175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f170176d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f170177e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f170178f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f170179g;

    public c7(qk.v6 devToolsService, com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 inspectorAccessible, yz5.a runtimeProvider, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t jsRuntime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devToolsService, "devToolsService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorAccessible, "inspectorAccessible");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtimeProvider, "runtimeProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsRuntime, "jsRuntime");
        this.f170173a = devToolsService;
        this.f170174b = inspectorAccessible;
        this.f170175c = runtimeProvider;
        this.f170176d = i17;
        this.f170177e = jsRuntime;
        this.f170178f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k7.f170241b;
    }

    @Override // qk.u6
    public java.lang.String a() {
        return mo52338x337a8b();
    }

    @Override // qk.u6
    public void b(java.lang.String str) {
        if (str == null) {
            return;
        }
        java.lang.String str2 = null;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaServiceDevToolsListener", "generateEmptyReply, message is empty");
        } else {
            try {
                int i17 = new org.json.JSONObject(str).getInt(dm.i4.f66865x76d1ec5a);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.f66865x76d1ec5a, i17);
                jSONObject.put("result", new org.json.JSONObject());
                jSONObject.put("type", "recv");
                jSONObject.put("domain", "-");
                str2 = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaServiceDevToolsListener", "generateEmptyReply, fail since " + e17);
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        ((xz1.k) this.f170173a).Di(this, str2);
    }

    @Override // qk.u6
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsListener", "onOpen");
        if (this.f170178f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsListener", "onOpen, waiting for debugger now, not need to start inspector");
        } else {
            this.f170174b.m43177xe5fd64b5(this.f170176d);
        }
    }

    @Override // qk.u6
    public void d(java.lang.String str) {
        if (str == null) {
            return;
        }
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(str) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k7.f170241b && r26.n0.D(str, "WeChat.runIfWaitingForDebugger", false, 2, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsListener", "interceptForCustomRunIfWaitingForDebuggerIfNeed, runIfWaitingForDebugger");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w) this.f170177e.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w.class);
            if (wVar != null) {
                cl.a aVar = (cl.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) wVar).c0();
                synchronized (aVar.f124123w) {
                    boolean[] zArr = aVar.f124123w;
                    zArr[0] = false;
                    zArr.notifyAll();
                }
            }
            this.f170174b.m43176x49114b2(this.f170176d, r26.i0.t(str, "WeChat.runIfWaitingForDebugger", "Runtime.runIfWaitingForDebugger", false));
            this.f170178f = false;
            z17 = true;
        }
        if (z17) {
            return;
        }
        this.f170174b.m43176x49114b2(this.f170176d, str);
    }

    @Override // qk.u6
    /* renamed from: description */
    public java.lang.String mo52337x993583fc() {
        return mo52338x337a8b();
    }

    @Override // qk.u6
    /* renamed from: name */
    public java.lang.String mo52338x337a8b() {
        java.lang.String str = this.f170179g;
        if (str != null) {
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsListener", "getName, generateName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.f170175c.mo152xb9724478();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (c11510xdd90c2f2 == null) {
            sb6.append(android.os.Process.myPid());
            sb6.append(':');
            sb6.append(hashCode());
        } else {
            sb6.append(c11510xdd90c2f2.f156336n);
            sb6.append(':');
            sb6.append(c11510xdd90c2f2.f156338p.f158814g);
        }
        if (this.f170176d == 0) {
            sb6.append(":service");
        } else {
            sb6.append(":worker" + this.f170176d);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsListener", "generateName, name: ".concat(sb7));
        this.f170179g = sb7;
        return sb7;
    }

    @Override // qk.u6
    /* renamed from: onClose */
    public void mo52339xaf6bb359() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsListener", "onClose");
        this.f170174b.m43179x83343515(this.f170176d);
    }
}
