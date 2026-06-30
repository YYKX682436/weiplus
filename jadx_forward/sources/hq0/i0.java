package hq0;

/* loaded from: classes7.dex */
public abstract class i0 extends lc3.s implements jc3.h0, jc3.u {

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.List f364526w = kz5.b0.c("surface:frameSet:scroll");

    /* renamed from: f, reason: collision with root package name */
    public final hq0.l0 f364527f;

    /* renamed from: g, reason: collision with root package name */
    public jc3.j0 f364528g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f364529h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364530i;

    /* renamed from: m, reason: collision with root package name */
    public final hq0.k0 f364531m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f364532n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f364533o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f364534p;

    /* renamed from: q, reason: collision with root package name */
    public hq0.f f364535q;

    /* renamed from: r, reason: collision with root package name */
    public hq0.e f364536r;

    /* renamed from: s, reason: collision with root package name */
    public kc3.f f364537s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f364538t;

    /* renamed from: u, reason: collision with root package name */
    public final mq0.a1 f364539u;

    /* renamed from: v, reason: collision with root package name */
    public final hq0.g0 f364540v;

    public i0(hq0.l0 eventHandler, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        eventHandler = (i17 & 1) != 0 ? new hq0.l0() : eventHandler;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventHandler, "eventHandler");
        this.f364527f = eventHandler;
        this.f364529h = new java.util.concurrent.CopyOnWriteArrayList();
        this.f364531m = new hq0.k0();
        this.f364532n = new java.util.HashMap();
        this.f364533o = new java.util.HashMap();
        this.f364534p = new java.util.concurrent.ConcurrentHashMap();
        this.f364539u = new mq0.a1();
        this.f364540v = new hq0.g0(this);
    }

    public static /* synthetic */ hq0.e0 K0(hq0.i0 i0Var, java.lang.Object obj, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFrameSetRoot");
        }
        if ((i17 & 32) != 0) {
            z17 = false;
        }
        return i0Var.H0(obj, context, str, str2, str3, z17);
    }

    public void A1(hq0.e0 root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        hq0.l0 l0Var = this.f364527f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f364513a);
        jSONObject.put("frameSetRootId", root.f364517e);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(je3.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSetRoot:resume", jSONObject2, null, 1.0E-5f, 8, null);
        l0Var.a("surface:frameSetRoot:resume", jSONObject2);
    }

    public final android.app.Activity B1() {
        java.util.Collection values = this.f364534p.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            java.util.Collection<fq0.x> values2 = ((hq0.e0) it.next()).f364518f.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
            for (fq0.x xVar : values2) {
                com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = xVar.f347021l;
                if ((c10867x3e50a04d != null ? c10867x3e50a04d.getContext() : null) instanceof android.app.Activity) {
                    com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d2 = xVar.f347021l;
                    android.content.Context context = c10867x3e50a04d2 != null ? c10867x3e50a04d2.getContext() : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    return (android.app.Activity) context;
                }
            }
        }
    }

    public final jc3.x E1() {
        jc3.j0 j0Var = this.f364528g;
        if (j0Var == null) {
            return null;
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c17, ((rc3.w0) j0Var).f475620e, null, 2, null);
    }

    public final void F1(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "removeFrameSetRoot id:".concat(id6));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f364534p;
        hq0.e0 e0Var = (hq0.e0) concurrentHashMap.get(id6);
        if (e0Var != null) {
            e0Var.c();
        }
        concurrentHashMap.remove(id6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [jz5.f0] */
    public final void G0(int i17) {
        hq0.j0 a17;
        fq0.x S0 = S0(i17);
        if (S0 != null && (a17 = this.f364531m.a(i17)) != null) {
            android.view.View view = a17.f364551g;
            if (view != null) {
                if (view.getParent() == null) {
                    com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = S0.f347021l;
                    if (c10867x3e50a04d != null) {
                        c10867x3e50a04d.addView(view);
                    }
                    com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d2 = S0.f347021l;
                    if (c10867x3e50a04d2 != null) {
                        c10867x3e50a04d2.bringChildToFront(c10867x3e50a04d2 != null ? c10867x3e50a04d2.getCoverViewRoot() : null);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "notifyCanvasAndFrameSet " + S0 + " addView");
                }
                a17.a();
            }
            if (a17.f364554j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "found pendingRedraw, do it");
                S0.f();
                a17.f364554j = false;
            }
            r1 = jz5.f0.f384359a;
        }
        if (r1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m133876xb5887064(), "hy: try insert no " + i17 + " found");
        }
    }

    public void G1(java.lang.String event, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        m1();
        jc3.j0 j0Var = this.f364528g;
        if (j0Var != null) {
            synchronized (j0Var) {
                int i17 = 500;
                if (this.f364530i) {
                    ((rc3.w0) j0Var).k(event, data);
                    if (!f364526w.contains(event)) {
                        java.lang.String m133876xb5887064 = m133876xb5887064();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendEvent event:");
                        sb6.append(event);
                        sb6.append(" value:");
                        int length = data.length();
                        if (length <= 500) {
                            i17 = length;
                        }
                        java.lang.String substring = data.substring(0, i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        sb6.append(substring);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064, sb6.toString());
                    }
                } else {
                    this.f364529h.add(new hq0.f0(event, data));
                    if (!f364526w.contains(event)) {
                        java.lang.String m133876xb58870642 = m133876xb5887064();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sendEvent add PendingEvent key:");
                        sb7.append(event);
                        sb7.append(" value:");
                        int length2 = data.length();
                        if (length2 <= 500) {
                            i17 = length2;
                        }
                        java.lang.String substring2 = data.substring(0, i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                        sb7.append(substring2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb58870642, sb7.toString());
                    }
                }
            }
        }
    }

    public final hq0.e0 H0(java.lang.Object target, android.content.Context context, java.lang.String appId, java.lang.String path, java.lang.String query, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        return Y0(target, context, appId, path, query, z17, false);
    }

    public final void H1(boolean z17) {
        this.f364538t = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "setActive isActive: " + this.f364538t);
        m1();
    }

    public void I1(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b buildConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buildConfig, "buildConfig");
        buildConfig.f229361r = this;
        buildConfig.f229362s = this.f364535q;
        buildConfig.f229363t = this.f364536r;
        buildConfig.f229355i = false;
        jc3.j0 j0Var = this.f364528g;
        if (j0Var != null) {
            rc3.w0 w0Var = (rc3.w0) j0Var;
            w0Var.w(this);
            w0Var.W(buildConfig);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "MagicBrush setup " + O0());
        }
    }

    public void M0(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!this.f364530i) {
            m133876xb5887064();
            return;
        }
        java.util.List list = f364526w;
        java.lang.String str = event.f229414d;
        if (!list.contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "dispatch event: " + event);
        }
        G1(str, event.f229415e);
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onCanvasViewCreated canvasId:" + i17);
        this.f364531m.b(i17, null, view, null);
        G0(i17);
    }

    public void N0(java.lang.String event, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!f364526w.contains(event)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "dispatch event: ".concat(event));
        }
        G1(event, data);
    }

    public abstract java.lang.String O0();

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onCanvasViewLayout canvasId:" + i17 + " left:" + i18 + ",top:" + i19 + ",width:" + i27 + ",height:" + i28);
        hq0.j0 a17 = this.f364531m.a(i17);
        if (a17 != null) {
            a17.f364547c = i18;
            a17.f364548d = i19;
            a17.f364549e = i27;
            a17.f364550f = i28;
            a17.a();
        }
    }

    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m133876xb5887064(), "onJSException envId:" + envId + ", msg:" + msg);
    }

    public final fq0.x S0(int i17) {
        java.lang.String str;
        hq0.j0 j0Var = (hq0.j0) this.f364531m.f364561a.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (str = j0Var.f364546b) == null) {
            str = "";
        }
        return V0(str);
    }

    public final fq0.x V0(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        return (fq0.x) this.f364532n.get(id6);
    }

    public void X0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        this.f364528g = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4.class))).wi(O0());
        i95.m c17 = i95.n0.c(kc3.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jc3.j0 j0Var = this.f364528g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
        this.f364537s = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s5((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.t5) ((kc3.e) c17), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, j0Var);
        this.f364529h.clear();
        this.f364527f.f364563a = new hq0.h0(this);
    }

    public final hq0.e0 Y0(java.lang.Object target, android.content.Context context, java.lang.String appId, java.lang.String path, java.lang.String query, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        java.lang.String b17 = vq0.b.b(target, path);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "invoke createFrameSetRoot,target:" + target + ", path" + path + ", id:" + b17);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        java.util.HashMap hashMap = this.f364533o;
        fq0.r rVar = (fq0.r) hashMap.get(appId);
        if (rVar == null) {
            rVar = new fq0.r(appId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "create AppContext#" + rVar.f346997b + ": " + appId);
            hashMap.put(appId, rVar);
            t1(rVar);
        }
        hq0.e0 e0Var = new hq0.e0(this, appId, rVar.f346997b, path, query, b17, weakReference, z18);
        e0Var.f364519g = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "create FrameSetRoot#" + b17 + ": " + appId);
        v1(e0Var);
        this.f364534p.put(e0Var.f364517e, e0Var);
        return e0Var;
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        java.lang.String str;
        fq0.x V0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onCanvasViewDestroy canvasId:" + i17);
        hq0.k0 k0Var = this.f364531m;
        hq0.j0 j0Var = (hq0.j0) k0Var.f364561a.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (str = j0Var.f364546b) == null) {
            str = "";
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "") && (V0 = V0(str)) != null) {
            com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = V0.f347021l;
            if (c10867x3e50a04d != null) {
                c10867x3e50a04d.removeView(view);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onCanvasViewDestroy frameSetId:" + str + " remove canvasId:" + i17);
        }
    }

    public void b1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m133876xb5887064(), "onConnException");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40976xa01141ab(this.f364540v);
    }

    public void c(int i17, boolean z17) {
        jz5.f0 f0Var;
        fq0.x S0 = S0(i17);
        if (S0 != null) {
            java.lang.String bizName = O0();
            mq0.a1 a1Var = this.f364539u;
            a1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
            a1Var.a(new mq0.x0(a1Var, S0, bizName));
        }
        hq0.j0 a17 = this.f364531m.a(i17);
        if (a17 != null) {
            a17.f364556l = true;
            if (!z17 && a17.f364557m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "draw on off screen and surfaceAvailable! redraw now " + i17 + ' ' + S0);
                if (S0 != null) {
                    S0.f();
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    a17.f364554j = true;
                }
            }
        }
        java.lang.String m133876xb5887064 = m133876xb5887064();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanvasViewFirstFrameRendered canvasId:");
        sb6.append(i17);
        sb6.append(" frameSetName:");
        sb6.append(S0 != null ? S0.f347010a : null);
        sb6.append(" surfaceReady:");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064, sb6.toString());
    }

    /* renamed from: destroy */
    public void mo123041x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "cleanup");
        for (java.util.Map.Entry entry : this.f364534p.entrySet()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(entry);
            ((hq0.e0) entry.getValue()).c();
        }
        this.f364529h.clear();
        jc3.j0 j0Var = this.f364528g;
        if (j0Var != null) {
            ((rc3.w0) j0Var).m162151x5cd39ffa();
        }
        this.f364538t = false;
        jc3.j0 j0Var2 = this.f364528g;
        if (j0Var2 != null) {
            synchronized (j0Var2) {
                this.f364530i = false;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4.class))).Di(((rc3.w0) j0Var2).f475620e, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4.f229752d);
        }
        this.f364528g = null;
        this.f364531m.f364561a.clear();
        this.f364532n.clear();
        this.f364533o.clear();
        this.f364534p.clear();
        mq0.a1 a1Var = this.f364539u;
        a1Var.getClass();
        a1Var.a(new mq0.z0(a1Var));
    }

    public boolean g1() {
        android.app.Activity B0 = B0();
        if (B0 == null) {
            B0 = B1();
        }
        return B0 != null;
    }

    /* renamed from: getTag */
    public final java.lang.String m133876xb5887064() {
        return "MicroMsg.MagicSclBaseBiz." + O0() + ".SCL";
    }

    public final void m1() {
        if (this.f364538t || g1()) {
            kc3.f fVar = this.f364537s;
            if (fVar != null) {
                ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r5((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s5) fVar));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoPauseExt");
                throw null;
            }
        }
        kc3.f fVar2 = this.f364537s;
        if (fVar2 != null) {
            ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o5((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s5) fVar2));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoPauseExt");
            throw null;
        }
    }

    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onMainScriptInjected");
        m1();
        jc3.j0 j0Var = this.f364528g;
        if (j0Var != null) {
            synchronized (j0Var) {
                for (hq0.f0 f0Var : this.f364529h) {
                    ((rc3.w0) j0Var).k(f0Var.f364522a, f0Var.f364523b);
                    int i17 = 200;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f0Var.f364522a, "surface:frameSetRoot:dataChange")) {
                        m133876xb5887064();
                        java.lang.String str = f0Var.f364523b;
                        int length = str.length();
                        if (length <= 200) {
                            i17 = length;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str.substring(0, i17), "substring(...)");
                    } else if (!f364526w.contains(f0Var.f364522a)) {
                        java.lang.String m133876xb5887064 = m133876xb5887064();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("sendEvent pending:");
                        sb6.append(f0Var.f364522a);
                        sb6.append(" value:");
                        java.lang.String str2 = f0Var.f364523b;
                        int length2 = str2.length();
                        if (length2 <= 200) {
                            i17 = length2;
                        }
                        java.lang.String substring = str2.substring(0, i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        sb6.append(substring);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064, sb6.toString());
                    }
                }
                this.f364529h.clear();
                this.f364530i = true;
            }
        }
    }

    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onCreated");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40973x40b15f2e(this.f364540v);
    }

    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onDestroy reason:" + i17);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40976xa01141ab(this.f364540v);
    }

    /* renamed from: onPause */
    public void mo127084xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onPause");
    }

    /* renamed from: onResume */
    public void mo127085x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onResume");
    }

    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        hq0.l0 l0Var = this.f364527f;
        l0Var.getClass();
        qq0.m mVar = (qq0.m) ((qq0.i) i95.n0.c(qq0.i.class));
        java.lang.String str = frameSet.f347013d;
        boolean Bi = mVar.Bi(str);
        java.lang.String str2 = frameSet.f347011b;
        boolean Ai = Bi ? ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(str, str2) : false;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f364513a);
        jSONObject.put("frameSetRootId", root.f364517e);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("frameSetId", str2);
        jSONObject2.put("viewId", frameSet.f347025p);
        jSONObject2.put("frameSetName", frameSet.f347010a);
        jSONObject2.put("width", frameSet.f347015f);
        jSONObject2.put("height", frameSet.f347016g);
        jSONObject2.put("info", info);
        jSONObject2.put("needSnapShotImage", Bi && !Ai);
        if (Bi) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("bizName", str);
            jSONObject3.put("frameSetId", str2);
            jSONObject2.put("needSnapShotImageExtInfo", jSONObject3);
        }
        jSONArray.put(jSONObject2);
        jSONObject.put("frameSets", jSONArray);
        java.lang.String jSONObject4 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        l0Var.a("surface:frameSet:available", jSONObject4);
        i95.m c17 = i95.n0.c(je3.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSet:available", jSONObject4, null, 1.0E-5f, 8, null);
    }

    /* renamed from: start */
    public void mo123044x68ac462() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "start");
        jc3.j0 j0Var = this.f364528g;
        if (j0Var != null) {
            ((rc3.w0) j0Var).m162153x68ac462();
        }
    }

    public void t1(fq0.r appContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appContext, "appContext");
        hq0.l0 l0Var = this.f364527f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", appContext.f346996a);
        jSONObject.put("appContextId", appContext.f346997b);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        l0Var.a("surface:appContext:available", jSONObject2);
    }

    public void v1(hq0.e0 root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        hq0.l0 l0Var = this.f364527f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f364513a);
        jSONObject.put("appContextId", root.f364514b);
        jSONObject.put("frameSetRootId", root.f364517e);
        jSONObject.put("useClientClick", root.f364519g);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, root.f364515c);
        jSONObject2.put("query", root.f364516d);
        jSONObject.put("launchInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        i95.m c17 = i95.n0.c(je3.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSetRoot:available", jSONObject3, null, 1.0E-5f, 8, null);
        l0Var.a("surface:frameSetRoot:available", jSONObject3);
    }

    @Override // jc3.h0
    public void v9(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onCanvasViewSurfaceAvailable canvasId:" + i17);
        hq0.j0 a17 = this.f364531m.a(i17);
        jz5.f0 f0Var = null;
        if (a17 != null) {
            a17.f364557m = true;
            boolean z17 = a17.f364556l;
            jz5.f0 f0Var2 = jz5.f0.f384359a;
            if (z17) {
                fq0.x S0 = S0(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "firstFrame before available, redraw " + i17 + ' ' + S0);
                if (S0 != null) {
                    S0.f();
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    a17.f364554j = true;
                }
            }
            if (a17.f364555k) {
                a17.f364555k = false;
                fq0.x S02 = S0(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onCanvasViewSurfaceAvailable canvas.surfaceDestroyNeedRedraw, redraw " + i17 + ' ' + S02);
                if (S02 != null) {
                    S02.f();
                }
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m133876xb5887064(), "onCanvasViewSurfaceAvailable but canvas not found? " + i17);
        }
    }

    public void w1(hq0.e0 root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        hq0.l0 l0Var = this.f364527f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f364513a);
        jSONObject.put("frameSetRootId", root.f364517e);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(je3.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSetRoot:destroyed", jSONObject2, null, 1.0E-5f, 8, null);
        l0Var.a("surface:frameSetRoot:destroyed", jSONObject2);
    }

    public void x1(hq0.e0 root, fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        hq0.l0 l0Var = this.f364527f;
        l0Var.getClass();
        qq0.m mVar = (qq0.m) ((qq0.i) i95.n0.c(qq0.i.class));
        java.lang.String str = frameSet.f347013d;
        boolean Bi = mVar.Bi(str);
        boolean z17 = false;
        java.lang.String str2 = frameSet.f347011b;
        boolean Ai = Bi ? ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(str, str2) : false;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f364513a);
        jSONObject.put("frameSetRootId", root.f364517e);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("frameSetId", str2);
        jSONObject2.put("viewId", frameSet.f347025p);
        jSONObject2.put("frameSetName", frameSet.f347010a);
        jSONObject2.put("width", frameSet.f347015f);
        jSONObject2.put("height", frameSet.f347016g);
        if (Bi && !Ai) {
            z17 = true;
        }
        jSONObject2.put("needSnapShotImage", z17);
        if (Bi) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("bizName", str);
            jSONObject3.put("frameSetId", str2);
            jSONObject2.put("needSnapShotImageExtInfo", jSONObject3);
        }
        jSONArray.put(jSONObject2);
        jSONObject.put("frameSets", jSONArray);
        java.lang.String jSONObject4 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        l0Var.a("surface:frameSet:init", jSONObject4);
    }

    public void x5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onServiceReady");
    }

    public void y1(hq0.e0 root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        hq0.l0 l0Var = this.f364527f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f364513a);
        jSONObject.put("frameSetRootId", root.f364517e);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(je3.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSetRoot:pause", jSONObject2, null, 1.0E-5f, 8, null);
        l0Var.a("surface:frameSetRoot:pause", jSONObject2);
    }

    @Override // jc3.h0
    public void zf(int i17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onCanvasViewSurfaceDestroy canvasId:" + i17);
        hq0.j0 a17 = this.f364531m.a(i17);
        if (a17 != null) {
            a17.f364555k = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "onCanvasViewSurfaceDestroy canvasId:" + i17 + " surfaceDestroyNeedRedraw");
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m133876xb5887064(), "onCanvasViewSurfaceDestroy but canvas not found? " + i17);
        }
    }
}
