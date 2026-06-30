package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class vu {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f201622a;

    /* renamed from: b, reason: collision with root package name */
    public final sf2.d3 f201623b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f201624c;

    /* renamed from: d, reason: collision with root package name */
    public final fn2.u1 f201625d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f201626e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f201627f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f201628g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f201629h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 f201630i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f201631j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f201632k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.TextView f201633l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f201634m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f201635n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f201636o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f201637p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f201638q;

    public vu(android.view.ViewGroup root, sf2.d3 controller, p3325xe03a0797.p3326xc267989b.y0 y0Var, fn2.u1 sourceScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        this.f201622a = root;
        this.f201623b = controller;
        this.f201624c = y0Var;
        this.f201625d = sourceScene;
        this.f201626e = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.jyj);
        this.f201627f = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.qg7);
        this.f201628g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) root.findViewById(com.p314xaae8f345.mm.R.id.f566082qf5);
        this.f201629h = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) root.findViewById(com.p314xaae8f345.mm.R.id.rfq);
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c653 = (com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653) root.findViewById(com.p314xaae8f345.mm.R.id.f567573jz2);
        this.f201630i = c22787x6853c653;
        this.f201631j = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) root.findViewById(com.p314xaae8f345.mm.R.id.ree);
        this.f201632k = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) root.findViewById(com.p314xaae8f345.mm.R.id.ref);
        this.f201633l = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.s9i);
        this.f201634m = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.rs7);
        this.f201635n = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.s9q);
        this.f201636o = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f567579uj0);
        this.f201637p = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) root.findViewById(com.p314xaae8f345.mm.R.id.f568482v65);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        if (c22787x6853c653 != null) {
            c22787x6853c653.o(ae2.in.f85221a.a(ym5.f6.f544850p));
        }
        if (c22787x6853c653 != null) {
            c22787x6853c653.m82583xcde73672(0);
        }
        b();
    }

    public final android.content.Context a() {
        return this.f201622a.getContext();
    }

    public final void b() {
        android.view.ViewGroup viewGroup = this.f201622a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewGroup.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c653 = this.f201630i;
        if (c22787x6853c653 != null) {
            c22787x6853c653.n();
        }
    }

    public final void c(int i17, bm2.y8 element, int i18, r45.ay1 ay1Var) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        boolean x17 = zl2.r4.f555483a.x1();
        hn2.c cVar = hn2.d.f364037o;
        fn2.u1 u1Var = this.f201625d;
        boolean z17 = false;
        int i27 = element.f104000d;
        if (x17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.Y1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            jSONObject.put("element", i27);
            jSONObject.put("tab_name", a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mni));
            jSONObject.put("pos", i18);
            jSONObject.put("source_scene", u1Var.f345950d);
            if (ay1Var != null && ay1Var.f451893q) {
                z17 = true;
            }
            if (z17) {
                jSONObject.put("part_id", 1);
            }
            if (ay1Var != null) {
                jSONObject.put("song_id", ay1Var.f451883d);
                jSONObject.put("song_name", ay1Var.f451884e);
                jSONObject.put("duration", cVar.a(ay1Var, null).a());
                jSONObject.put("singer_mid", ay1Var.f451885f);
                jSONObject.put("singer_name", ay1Var.f451886g);
            }
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f408794q2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", i17);
        jSONObject2.put("element", i27);
        jSONObject2.put("tab_name", a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mni));
        jSONObject2.put("pos", i18);
        jSONObject2.put("source_scene", u1Var.f345950d);
        if (ay1Var != null) {
            i19 = 1;
            if (ay1Var.f451893q) {
                z17 = true;
            }
        } else {
            i19 = 1;
        }
        if (z17) {
            jSONObject2.put("part_id", i19);
        }
        if (ay1Var != null) {
            jSONObject2.put("song_id", ay1Var.f451883d);
            jSONObject2.put("song_name", ay1Var.f451884e);
            jSONObject2.put("duration", cVar.a(ay1Var, null).a());
            jSONObject2.put("singer_mid", ay1Var.f451885f);
            jSONObject2.put("singer_name", ay1Var.f451886g);
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
