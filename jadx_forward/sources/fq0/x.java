package fq0;

/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f347010a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f347011b;

    /* renamed from: c, reason: collision with root package name */
    public final hq0.e0 f347012c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f347013d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f347014e;

    /* renamed from: f, reason: collision with root package name */
    public int f347015f;

    /* renamed from: g, reason: collision with root package name */
    public int f347016g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f347017h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f347018i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f347019j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e f347020k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d f347021l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f347022m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f347023n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f347024o;

    /* renamed from: p, reason: collision with root package name */
    public int f347025p;

    public x(java.lang.String name, java.lang.String id6, hq0.e0 e0Var, java.lang.String bizName, java.util.concurrent.CopyOnWriteArraySet canvasIds, java.lang.String processName, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        e0Var = (i19 & 4) != 0 ? null : e0Var;
        canvasIds = (i19 & 16) != 0 ? new java.util.concurrent.CopyOnWriteArraySet() : canvasIds;
        if ((i19 & 32) != 0) {
            processName = bm5.f1.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(processName, "getProcessName(...)");
        }
        i17 = (i19 & 64) != 0 ? 0 : i17;
        i18 = (i19 & 128) != 0 ? 0 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasIds, "canvasIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        this.f347010a = name;
        this.f347011b = id6;
        this.f347012c = e0Var;
        this.f347013d = bizName;
        this.f347014e = canvasIds;
        this.f347015f = i17;
        this.f347016g = i18;
        this.f347019j = true;
        this.f347020k = com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e.f29656x87b94ce8;
    }

    public final void a() {
        if (this.f347024o) {
            return;
        }
        this.f347024o = true;
        hq0.e0 e0Var = this.f347012c;
        if (e0Var != null) {
            hq0.i0 i0Var = e0Var.f364521i;
            java.lang.String m133876xb5887064 = i0Var.m133876xb5887064();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach frameSet#");
            java.lang.String str = this.f347011b;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064, sb6.toString());
            hq0.l0 l0Var = i0Var.f364527f;
            l0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appId", e0Var.f364513a);
            jSONObject.put("frameSetRootId", e0Var.f364517e);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("frameSetId", str);
            jSONObject2.put("viewId", this.f347025p);
            jSONObject2.put("frameSetName", this.f347010a);
            jSONArray.put(jSONObject2);
            jSONObject.put("frameSets", jSONArray);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            l0Var.a("surface:frameSet:attach", jSONObject3);
            i95.m c17 = i95.n0.c(je3.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String d17 = e0Var.d();
            je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSet:attach", jSONObject3, null, 1.0E-5f, 8, null);
        }
    }

    public final void b() {
        hq0.e0 e0Var = this.f347012c;
        if (e0Var != null) {
            hq0.i0 i0Var = e0Var.f364521i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "FrameSetRoot#" + e0Var.f364517e + " bind: " + this);
            mq0.a1 a1Var = i0Var.f364539u;
            a1Var.getClass();
            a1Var.a(new mq0.y0(a1Var, this));
            fq0.x wi6 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).wi(this);
            java.util.HashMap hashMap = i0Var.f364532n;
            java.lang.String str = wi6.f347011b;
            hashMap.put(str, wi6);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = e0Var.f364518f;
            if (concurrentHashMap.containsKey(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), wi6 + " already bound!");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "onBind " + wi6);
                concurrentHashMap.put(str, wi6);
                i0Var.s1(e0Var, wi6, "");
                wi6.f347022m = true;
            }
            if (wi6.f347015f <= 0 || wi6.f347016g <= 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "frameSet layout, notify size now: " + wi6);
            d75.b.g(new hq0.c0(e0Var, wi6));
        }
    }

    public final void c() {
        if (this.f347024o) {
            this.f347024o = false;
            hq0.e0 e0Var = this.f347012c;
            if (e0Var != null) {
                hq0.i0 i0Var = e0Var.f364521i;
                java.lang.String m133876xb5887064 = i0Var.m133876xb5887064();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detach frameSet#");
                java.lang.String str = this.f347011b;
                sb6.append(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064, sb6.toString());
                hq0.l0 l0Var = i0Var.f364527f;
                l0Var.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", e0Var.f364513a);
                jSONObject.put("frameSetRootId", e0Var.f364517e);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("frameSetId", str);
                jSONObject2.put("viewId", this.f347025p);
                jSONObject2.put("frameSetName", this.f347010a);
                jSONArray.put(jSONObject2);
                jSONObject.put("frameSets", jSONArray);
                java.lang.String jSONObject3 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                l0Var.a("surface:frameSet:detach", jSONObject3);
                i95.m c17 = i95.n0.c(je3.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                java.lang.String d17 = e0Var.d();
                je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSet:detach", jSONObject3, null, 1.0E-5f, 8, null);
            }
        }
    }

    public final void d() {
        hq0.e0 e0Var = this.f347012c;
        if (e0Var != null) {
            hq0.i0 i0Var = e0Var.f364521i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "FrameSetRoot#" + e0Var.f364517e + " init: " + this.f347011b);
            fq0.x wi6 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).wi(this);
            if (wi6.f347023n) {
                return;
            }
            i0Var.f364532n.put(wi6.f347011b, wi6);
            wi6.f347023n = true;
            i0Var.x1(e0Var, wi6);
        }
    }

    public final boolean e() {
        hq0.e0 e0Var = this.f347012c;
        if (e0Var == null) {
            return false;
        }
        return e0Var.f364518f.containsKey(((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).wi(this).f347011b);
    }

    /* renamed from: equals */
    public boolean m130017xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fq0.x.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.scl.MagicSclFrameSet");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347011b, ((fq0.x) obj).f347011b);
    }

    public final void f() {
        hq0.e0 e0Var;
        if (this.f347022m && (e0Var = this.f347012c) != null) {
            e0Var.h(this);
        }
    }

    public final void g(double d17, double d18) {
        hq0.e0 e0Var = this.f347012c;
        if (e0Var != null) {
            hq0.i0 i0Var = e0Var.f364521i;
            i0Var.getClass();
            hq0.l0 l0Var = i0Var.f364527f;
            l0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("frameSetRootId", e0Var.f364517e);
            jSONObject.put("frameSetId", this.f347011b);
            jSONObject.put("frameSetName", this.f347010a);
            jSONObject.put("offsetHeight", d17);
            jSONObject.put("offsetTop", d18);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            l0Var.a("surface:frameSet:scroll", jSONObject2);
        }
    }

    public final void h(com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d) {
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d2 = this.f347021l;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10867x3e50a04d, c10867x3e50a04d2)) {
            f();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclFrameSet.SCL", "setViewContainer " + c10867x3e50a04d + " for " + this + ' ');
        this.f347021l = c10867x3e50a04d;
        if (this.f347022m) {
            if (c10867x3e50a04d2 != null) {
                c10867x3e50a04d2.d();
            }
            pm0.v.X(new fq0.w(this, c10867x3e50a04d));
            f();
        }
    }

    /* renamed from: hashCode */
    public int m130018x8cdac1b() {
        return this.f347011b.hashCode();
    }

    public final void i() {
        if (this.f347022m) {
            hq0.e0 e0Var = this.f347012c;
            if (e0Var != null) {
                hq0.i0 i0Var = e0Var.f364521i;
                java.lang.String m133876xb5887064 = i0Var.m133876xb5887064();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FrameSetRoot#");
                java.lang.String str = e0Var.f364517e;
                sb6.append(str);
                sb6.append(" unbind: ");
                sb6.append(this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064, sb6.toString());
                java.util.HashMap hashMap = i0Var.f364532n;
                java.lang.String str2 = this.f347011b;
                hashMap.remove(str2);
                e0Var.f364518f.remove(str2);
                fq0.z zVar = (fq0.z) ((gq0.r) i95.n0.c(gq0.r.class));
                zVar.getClass();
                zVar.f347028e.remove(str2);
                hq0.l0 l0Var = i0Var.f364527f;
                l0Var.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("frameSetRootId", str);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("frameSetId", str2);
                jSONObject2.put("viewId", this.f347025p);
                jSONObject2.put("frameSetName", this.f347010a);
                jSONArray.put(jSONObject2);
                jSONObject.put("frameSets", jSONArray);
                java.lang.String jSONObject3 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                i95.m c17 = i95.n0.c(je3.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                java.lang.String d17 = e0Var.d();
                je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSet:destroyed", jSONObject3, null, 1.0E-5f, 8, null);
                l0Var.a("surface:frameSet:destroyed", jSONObject3);
                int i17 = this.f347025p;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBDynamicBizContext", "removeCustomView,viewId:" + i17);
                i0Var.f399452d.b(i17);
            }
            com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = this.f347021l;
            if (c10867x3e50a04d != null) {
                c10867x3e50a04d.d();
            }
            this.f347017h = null;
            this.f347018i = null;
            this.f347022m = false;
        }
    }

    public final void j(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclFrameSet.SCL", "updateSize name:" + this.f347010a + ' ' + i17 + " x " + i18);
        pm0.v.X(new fq0.v(this, i17, i18));
    }

    /* renamed from: toString */
    public java.lang.String m130019x9616526c() {
        return "MagicSclFrameSet(" + super.hashCode() + " name='" + this.f347010a + "', bizName='" + this.f347013d + "', id='" + this.f347011b + "', canvasIds=" + fq0.a0.a(this.f347014e) + ", container=" + this.f347021l + ", isClip=" + this.f347019j + ", size=" + this.f347015f + 'x' + this.f347016g + " root=" + this.f347012c + ", pScene=" + this.f347020k + ", init=" + this.f347023n + ", bound=" + this.f347022m + ')';
    }
}
