package bm2;

/* loaded from: classes10.dex */
public final class k7 extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f22039h;

    /* renamed from: i, reason: collision with root package name */
    public final sf2.d3 f22040i;

    /* renamed from: m, reason: collision with root package name */
    public final int f22041m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f22042n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f22043o;

    /* renamed from: p, reason: collision with root package name */
    public final fn2.u1 f22044p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f22045q;

    public k7(android.content.Context context, sf2.d3 controller, int i17, androidx.recyclerview.widget.RecyclerView recyclerView, kotlinx.coroutines.y0 y0Var, fn2.u1 sourceScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        this.f22039h = context;
        this.f22040i = controller;
        this.f22041m = i17;
        this.f22042n = recyclerView;
        this.f22043o = y0Var;
        this.f22044p = sourceScene;
        this.f22045q = new java.util.ArrayList();
    }

    public static final void E(bm2.k7 k7Var, int i17, r45.yx1 yx1Var) {
        k7Var.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(k7Var.f22039h, false, 1);
        k0Var.f211872n = new bm2.i7(k7Var);
        k0Var.f211881s = new bm2.j7(k7Var, i17, yx1Var);
        k7Var.I(2, bm2.y8.f22464g, k7Var.f22041m, 1, yx1Var.f391466o.f371143d);
        k0Var.v();
    }

    public final void I(int i17, bm2.y8 element, int i18, int i19, r45.ay1 ay1Var) {
        int i27;
        kotlin.jvm.internal.o.g(element, "element");
        boolean x17 = zl2.r4.f473950a.x1();
        hn2.c cVar = hn2.d.f282504o;
        fn2.u1 u1Var = this.f22044p;
        boolean z17 = false;
        int i28 = element.f22467d;
        if (x17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.Y1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            jSONObject.put("element", i28);
            jSONObject.put("tab_name", L(i18));
            jSONObject.put("pos", i19);
            jSONObject.put("source_scene", u1Var.f264417d);
            if (ay1Var != null && ay1Var.f370360q) {
                z17 = true;
            }
            if (z17) {
                jSONObject.put("part_id", 1);
            }
            if (ay1Var != null) {
                jSONObject.put("song_id", ay1Var.f370350d);
                jSONObject.put("song_name", ay1Var.f370351e);
                jSONObject.put("duration", cVar.a(ay1Var, null).a());
                jSONObject.put("singer_mid", ay1Var.f370352f);
                jSONObject.put("singer_name", ay1Var.f370353g);
            }
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f327261q2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", i17);
        jSONObject2.put("element", i28);
        jSONObject2.put("tab_name", L(i18));
        jSONObject2.put("pos", i19);
        jSONObject2.put("source_scene", u1Var.f264417d);
        if (ay1Var != null) {
            i27 = 1;
            if (ay1Var.f370360q) {
                z17 = true;
            }
        } else {
            i27 = 1;
        }
        if (z17) {
            jSONObject2.put("part_id", i27);
        }
        if (ay1Var != null) {
            jSONObject2.put("song_id", ay1Var.f370350d);
            jSONObject2.put("song_name", ay1Var.f370351e);
            jSONObject2.put("duration", cVar.a(ay1Var, null).a());
            jSONObject2.put("singer_mid", ay1Var.f370352f);
            jSONObject2.put("singer_name", ay1Var.f370353g);
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void J(java.util.List songList, boolean z17) {
        kotlin.jvm.internal.o.g(songList, "songList");
        java.util.List list = this.f22045q;
        ((java.util.ArrayList) list).clear();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(songList, 10));
        java.util.Iterator it = songList.iterator();
        while (it.hasNext()) {
            arrayList.add(new bm2.v6(bm2.w6.f22413f, (r45.yx1) it.next(), null, 4, null));
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        if ((!songList.isEmpty()) && z17) {
            ((java.util.ArrayList) list).add(new bm2.v6(bm2.w6.f22414g, null, null, 6, null));
        }
        notifyDataSetChanged();
    }

    public final void K(android.view.View view, boolean z17) {
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String L(int i17) {
        android.content.Context context = this.f22039h;
        if (i17 == 0) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f491818mo3);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 1) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f491816mo1);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 != 2) {
            return "";
        }
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.mnn);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        return string3;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f22045q).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((bm2.v6) ((java.util.ArrayList) this.f22045q).get(i17)).f22387a.ordinal();
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
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        x(holder, i17);
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        bm2.w6 w6Var = bm2.w6.f22411d;
        android.content.Context context = this.f22039h;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ami, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new bm2.s6(this, inflate);
        }
        bm2.w6 w6Var2 = bm2.w6.f22411d;
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dss, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new bm2.t6(this, inflate2);
        }
        bm2.w6 w6Var3 = bm2.w6.f22411d;
        if (i17 == 1) {
            android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dsk, parent, false);
            kotlin.jvm.internal.o.d(inflate3);
            return new bm2.r6(this, inflate3);
        }
        android.view.View inflate4 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ami, parent, false);
        kotlin.jvm.internal.o.d(inflate4);
        return new bm2.q6(this, inflate4);
    }
}
