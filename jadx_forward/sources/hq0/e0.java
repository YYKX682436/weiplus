package hq0;

/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f364513a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f364514b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f364515c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364516d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f364517e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f364518f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f364519g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f364520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hq0.i0 f364521i;

    public e0(hq0.i0 i0Var, java.lang.String appId, java.lang.String appContextId, java.lang.String path, java.lang.String query, java.lang.String id6, java.lang.ref.WeakReference wkContext, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appContextId, "appContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wkContext, "wkContext");
        this.f364521i = i0Var;
        this.f364513a = appId;
        this.f364514b = appContextId;
        this.f364515c = path;
        this.f364516d = query;
        this.f364517e = id6;
        this.f364518f = new java.util.concurrent.ConcurrentHashMap();
        this.f364520h = z17;
    }

    public static void b(hq0.e0 e0Var, java.lang.String data, java.lang.String frameSetName, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = null;
        }
        e0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        cl0.g gVar = new cl0.g();
        gVar.h("frameSetName", frameSetName);
        gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, data);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        e0Var.a(gVar2, str);
    }

    public final void a(java.lang.String data, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        hq0.i0 i0Var = this.f364521i;
        i0Var.getClass();
        hq0.l0 l0Var = i0Var.f364527f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", this.f364513a);
        jSONObject.put("frameSetRootId", this.f364517e);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, data);
        if (str == null) {
            str = "";
        }
        jSONObject.put("extInfo", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        l0Var.a("surface:frameSetRoot:dataChange", jSONObject2);
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364521i.m133876xb5887064(), "FrameSetRoot#" + this.f364517e + " destroy: " + this.f364513a);
        java.util.LinkedList<fq0.x> linkedList = new java.util.LinkedList(this.f364518f.values());
        hq0.i0 i0Var = this.f364521i;
        for (fq0.x xVar : linkedList) {
            xVar.i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "frameSetWithRoot unBind " + xVar.f347011b);
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList(this.f364521i.f364532n.values());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList2) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fq0.x) obj).f347012c, this)) {
                arrayList.add(obj);
            }
        }
        hq0.i0 i0Var2 = this.f364521i;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fq0.x xVar2 = (fq0.x) it.next();
            mq0.d1 d1Var = mq0.d1.f412079a;
            java.lang.String frameSetId = xVar2.f347011b;
            synchronized (d1Var) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
                if (((mq0.b1) mq0.d1.f412080b.remove(frameSetId)) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandReporter", "removeFrameSetInfo ".concat(frameSetId));
                }
            }
            fq0.z zVar = (fq0.z) ((gq0.r) i95.n0.c(gq0.r.class));
            zVar.getClass();
            zVar.f347028e.remove(xVar2.f347011b);
            i0Var2.f364532n.remove(xVar2.f347011b);
        }
        this.f364521i.w1(this);
        this.f364518f.clear();
    }

    public final java.lang.String d() {
        java.lang.String str;
        jc3.j0 j0Var = this.f364521i.f364528g;
        return (j0Var == null || (str = ((rc3.w0) j0Var).f475620e) == null) ? "" : str;
    }

    public final jz5.l e(java.lang.String frameSetName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        java.lang.String a17 = vq0.a.a(this.f364517e, frameSetName);
        fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(a17);
        if (Ai != null) {
            return new jz5.l(Ai, java.lang.Boolean.FALSE);
        }
        fq0.x wi6 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).wi(new fq0.x(frameSetName, a17, this, d(), null, null, 0, 0, 240, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364521i.m133876xb5887064(), "create new frameSet: " + wi6);
        return new jz5.l(wi6, java.lang.Boolean.TRUE);
    }

    public final void f() {
        hq0.i0 i0Var = this.f364521i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "FrameSetRoot#" + this.f364517e + " pause: " + this.f364513a);
        i0Var.y1(this);
    }

    public final void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364521i.m133876xb5887064(), "FrameSetRoot#" + this.f364517e + " reDraw: " + this.f364513a);
        java.util.Collection<fq0.x> values = this.f364518f.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (fq0.x xVar : values) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xVar);
            h(xVar);
        }
    }

    public final void h(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        hq0.i0 i0Var = this.f364521i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "redraw " + frameSet);
        i0Var.getClass();
        hq0.l0 l0Var = i0Var.f364527f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frameSetRootId", this.f364517e);
        jSONObject.put("frameSetId", frameSet.f347011b);
        jSONObject.put("viewId", frameSet.f347025p);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        l0Var.a("surface:frameSet:redraw", jSONObject2);
    }

    public final void i(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364521i.m133876xb5887064(), "resize " + frameSet);
        hq0.i0 i0Var = this.f364521i;
        i0Var.getClass();
        hq0.l0 l0Var = i0Var.f364527f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frameSetRootId", this.f364517e);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("frameSetId", frameSet.f347011b);
        jSONObject2.put("viewId", frameSet.f347025p);
        jSONObject2.put("frameSetName", frameSet.f347010a);
        jSONObject2.put("width", frameSet.f347015f);
        jSONObject2.put("height", frameSet.f347016g);
        jSONArray.put(jSONObject2);
        jSONObject.put("frameSets", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        l0Var.a("surface:frameSet:resize", jSONObject3);
        hq0.f fVar = this.f364521i.f364535q;
        if (fVar != null) {
            long b17 = vp0.b.b(java.lang.Integer.valueOf(frameSet.f347015f));
            long b18 = vp0.b.b(java.lang.Integer.valueOf(frameSet.f347016g));
            dq0.q qVar = ((dq0.a0) fVar).f323821d;
            qVar.getClass();
            java.lang.String viewGroupId = frameSet.f347011b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroupId, "viewGroupId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushFlutterPlugin.SCL", "onViewGroupResize viewGroupId: " + viewGroupId + ", size = (" + b17 + ", " + b18 + ')');
            if (qVar.f323858d) {
                com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27672xb7462a39 c27672xb7462a39 = (com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27672xb7462a39) com.p314xaae8f345.p3248x6e8731b.C27980x1de85921.m121408x9cf0d20b().m121421xcf9b80a7();
                if (c27672xb7462a39 != null) {
                    c27672xb7462a39.m119328x68fb707(viewGroupId, 0, 0, (int) b17, (int) b18);
                }
            } else {
                com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23976x8577590e c23976x8577590e = qVar.f323860f;
                if (c23976x8577590e != null) {
                    c23976x8577590e.m88738x68fb707(viewGroupId, 0L, 0L, b17, b18, dq0.p.f323857d);
                }
            }
        }
        if (this.f364521i.f364536r != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclMBFrameBiz", "onFrameSetResize frameSet:" + frameSet);
        }
        tq0.e eVar = (tq0.e) i95.n0.c(tq0.e.class);
        java.lang.String bizName = frameSet.f347013d;
        java.lang.String frameSetId = frameSet.f347011b;
        int i17 = frameSet.f347016g;
        ((sq0.f) eVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        java.lang.String c17 = vq0.b.c(bizName);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, "MagicWxGameDynamicCard") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, "MagicEcsKFDynamicCard")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclPlaceHolderService.SCL", "updateHeight, bizName: " + bizName + ", frameSetId: " + frameSetId + ", dpHeight: " + i17);
            ((ku5.t0) ku5.t0.f394148d).r(new sq0.e(i17, bizName, frameSetId), "MagicSclPlaceHolderService.SCL");
        }
    }

    public final void j() {
        hq0.i0 i0Var = this.f364521i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "FrameSetRoot#" + this.f364517e + " resume: " + this.f364513a);
        i0Var.A1(this);
    }
}
