package bm2;

/* loaded from: classes10.dex */
public final class k7 extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f103572h;

    /* renamed from: i, reason: collision with root package name */
    public final sf2.d3 f103573i;

    /* renamed from: m, reason: collision with root package name */
    public final int f103574m;

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f103575n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f103576o;

    /* renamed from: p, reason: collision with root package name */
    public final fn2.u1 f103577p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f103578q;

    public k7(android.content.Context context, sf2.d3 controller, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p3325xe03a0797.p3326xc267989b.y0 y0Var, fn2.u1 sourceScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        this.f103572h = context;
        this.f103573i = controller;
        this.f103574m = i17;
        this.f103575n = c1163xf1deaba4;
        this.f103576o = y0Var;
        this.f103577p = sourceScene;
        this.f103578q = new java.util.ArrayList();
    }

    public static final void E(bm2.k7 k7Var, int i17, r45.yx1 yx1Var) {
        k7Var.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(k7Var.f103572h, false, 1);
        k0Var.f293405n = new bm2.i7(k7Var);
        k0Var.f293414s = new bm2.j7(k7Var, i17, yx1Var);
        k7Var.I(2, bm2.y8.f103997g, k7Var.f103574m, 1, yx1Var.f472999o.f452676d);
        k0Var.v();
    }

    public final void I(int i17, bm2.y8 element, int i18, int i19, r45.ay1 ay1Var) {
        int i27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        boolean x17 = zl2.r4.f555483a.x1();
        hn2.c cVar = hn2.d.f364037o;
        fn2.u1 u1Var = this.f103577p;
        boolean z17 = false;
        int i28 = element.f104000d;
        if (x17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.Y1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            jSONObject.put("element", i28);
            jSONObject.put("tab_name", L(i18));
            jSONObject.put("pos", i19);
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
        jSONObject2.put("element", i28);
        jSONObject2.put("tab_name", L(i18));
        jSONObject2.put("pos", i19);
        jSONObject2.put("source_scene", u1Var.f345950d);
        if (ay1Var != null) {
            i27 = 1;
            if (ay1Var.f451893q) {
                z17 = true;
            }
        } else {
            i27 = 1;
        }
        if (z17) {
            jSONObject2.put("part_id", i27);
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

    public final void J(java.util.List songList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songList, "songList");
        java.util.List list = this.f103578q;
        ((java.util.ArrayList) list).clear();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(songList, 10));
        java.util.Iterator it = songList.iterator();
        while (it.hasNext()) {
            arrayList.add(new bm2.v6(bm2.w6.f103946f, (r45.yx1) it.next(), null, 4, null));
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        if ((!songList.isEmpty()) && z17) {
            ((java.util.ArrayList) list).add(new bm2.v6(bm2.w6.f103947g, null, null, 6, null));
        }
        m8146xced61ae5();
    }

    public final void K(android.view.View view, boolean z17) {
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String L(int i17) {
        android.content.Context context = this.f103572h;
        if (i17 == 0) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573351mo3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 1) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573349mo1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 != 2) {
            return "";
        }
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        return string3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f103578q).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((bm2.v6) ((java.util.ArrayList) this.f103578q).get(i17)).f103920a.ordinal();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    @Override // in5.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(in5.r0 r25, int r26) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.k7.x(in5.r0, int):void");
    }

    @Override // in5.q0
    public void y(in5.r0 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        x(holder, i17);
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        bm2.w6 w6Var = bm2.w6.f103944d;
        android.content.Context context = this.f103572h;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ami, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new bm2.s6(this, inflate);
        }
        bm2.w6 w6Var2 = bm2.w6.f103944d;
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dss, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new bm2.t6(this, inflate2);
        }
        bm2.w6 w6Var3 = bm2.w6.f103944d;
        if (i17 == 1) {
            android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dsk, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
            return new bm2.r6(this, inflate3);
        }
        android.view.View inflate4 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ami, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
        return new bm2.q6(this, inflate4);
    }
}
