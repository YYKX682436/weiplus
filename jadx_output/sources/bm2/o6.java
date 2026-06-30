package bm2;

/* loaded from: classes10.dex */
public final class o6 extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f22195h;

    /* renamed from: i, reason: collision with root package name */
    public final sf2.d3 f22196i;

    /* renamed from: m, reason: collision with root package name */
    public final int f22197m;

    /* renamed from: n, reason: collision with root package name */
    public final fn2.u1 f22198n;

    /* renamed from: o, reason: collision with root package name */
    public r45.y4 f22199o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ch6 f22200p;

    /* renamed from: q, reason: collision with root package name */
    public r45.in f22201q;

    /* renamed from: r, reason: collision with root package name */
    public final int f22202r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f22203s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f22204t;

    public o6(android.content.Context context, sf2.d3 controller, int i17, fn2.u1 sourceScene, kotlinx.coroutines.y0 y0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        this.f22195h = context;
        this.f22196i = controller;
        this.f22197m = i17;
        this.f22198n = sourceScene;
        this.f22199o = r45.y4.AddSongSourceType_MusicBoard;
        this.f22202r = context.getResources().getColor(com.tencent.mm.R.color.f479206su);
        this.f22203s = "";
        this.f22204t = new java.util.ArrayList();
        hn2.h hVar = new hn2.h(y0Var, controller.g7());
        bm2.d6 d6Var = new bm2.d6(this);
        bm2.e6 e6Var = new bm2.e6(this);
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new hn2.g(hVar, d6Var, e6Var, null), 3, null);
        }
    }

    public final void E(java.util.List songList, java.util.List resourceInfoList, java.lang.String searchKey) {
        kotlin.jvm.internal.o.g(songList, "songList");
        kotlin.jvm.internal.o.g(resourceInfoList, "resourceInfoList");
        kotlin.jvm.internal.o.g(searchKey, "searchKey");
        this.f22203s = searchKey;
        java.util.List list = this.f22204t;
        int size = ((java.util.ArrayList) list).size() - 1;
        int i17 = 0;
        if (size < 0) {
            size = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(songList, 10));
        for (java.lang.Object obj : songList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new bm2.h6(bm2.g6.f21917d, hn2.d.f282504o.a((r45.ay1) obj, (r45.cy1) kz5.n0.a0(resourceInfoList, i17))));
            i17 = i18;
        }
        ((java.util.ArrayList) list).addAll(size, arrayList);
        notifyItemRangeInserted(size, songList.size());
    }

    public final void I(int i17, int i18, hn2.d songInfo) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        boolean x17 = zl2.r4.f473950a.x1();
        fn2.u1 u1Var = this.f22198n;
        if (x17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.W1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            jSONObject.put("element", i18);
            jSONObject.put("song_id", songInfo.f282505a);
            jSONObject.put("song_name", songInfo.f282506b);
            jSONObject.put("duration", songInfo.a());
            jSONObject.put("singer_mid", songInfo.f282507c);
            jSONObject.put("singer_name", songInfo.f282508d);
            jSONObject.put("source_scene", u1Var.f264417d);
            if (songInfo.f282516l) {
                jSONObject.put("part_id", 1);
            }
            r45.in inVar = this.f22201q;
            if (inVar != null) {
                jSONObject.put("tab_id", inVar.f377156d);
            }
            r45.in inVar2 = this.f22201q;
            if (inVar2 != null && (str4 = inVar2.f377157e) != null) {
                jSONObject.put("tab_name", str4);
            }
            r45.ch6 ch6Var = this.f22200p;
            if (ch6Var != null) {
                jSONObject.put("tab_sub_id", ch6Var.f371555d);
            }
            r45.ch6 ch6Var2 = this.f22200p;
            if (ch6Var2 != null && (str3 = ch6Var2.f371556e) != null) {
                jSONObject.put("tab_sub_name", str3);
            }
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f327253o2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", i17);
        jSONObject2.put("element", i18);
        jSONObject2.put("song_id", songInfo.f282505a);
        jSONObject2.put("song_name", songInfo.f282506b);
        jSONObject2.put("duration", songInfo.a());
        jSONObject2.put("singer_mid", songInfo.f282507c);
        jSONObject2.put("singer_name", songInfo.f282508d);
        jSONObject2.put("source_scene", u1Var.f264417d);
        if (songInfo.f282516l) {
            jSONObject2.put("part_id", 1);
        }
        r45.in inVar3 = this.f22201q;
        if (inVar3 != null) {
            jSONObject2.put("tab_id", inVar3.f377156d);
        }
        r45.in inVar4 = this.f22201q;
        if (inVar4 != null && (str2 = inVar4.f377157e) != null) {
            jSONObject2.put("tab_name", str2);
        }
        r45.ch6 ch6Var3 = this.f22200p;
        if (ch6Var3 != null) {
            jSONObject2.put("tab_sub_id", ch6Var3.f371555d);
        }
        r45.ch6 ch6Var4 = this.f22200p;
        if (ch6Var4 != null && (str = ch6Var4.f371556e) != null) {
            jSONObject2.put("tab_sub_name", str);
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void J(java.util.List songList, java.util.List resourceInfoList, boolean z17, java.lang.String searchKey) {
        kotlin.jvm.internal.o.g(songList, "songList");
        kotlin.jvm.internal.o.g(resourceInfoList, "resourceInfoList");
        kotlin.jvm.internal.o.g(searchKey, "searchKey");
        this.f22203s = searchKey;
        java.util.List list = this.f22204t;
        ((java.util.ArrayList) list).clear();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(songList, 10));
        int i17 = 0;
        for (java.lang.Object obj : songList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new bm2.h6(bm2.g6.f21917d, hn2.d.f282504o.a((r45.ay1) obj, (r45.cy1) kz5.n0.a0(resourceInfoList, i17))));
            i17 = i18;
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        if ((!songList.isEmpty()) && z17) {
            ((java.util.ArrayList) list).add(new bm2.h6(bm2.g6.f21918e, null));
        }
        notifyDataSetChanged();
    }

    public final void K(android.view.View view, boolean z17) {
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongListAdapter", "setViewVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void L(hn2.d dVar, bm2.i6 i6Var) {
        java.lang.String str;
        nm2.a aVar = (nm2.a) ((kotlinx.coroutines.flow.h3) this.f22196i.g7()).getValue();
        java.lang.String str2 = dVar.f282505a;
        boolean z17 = (str2 == null || aVar == null || !aVar.c(str2, dVar.f282516l)) ? false : true;
        hn2.a.f282498a.a(i6Var, dVar.b() != null, z17, aVar);
        if ((aVar instanceof nm2.b) && z17) {
            str = dVar.f282506b;
            if (str == null) {
                str = this.f22203s;
            }
        } else {
            str = this.f22203s;
        }
        i6Var.f21979e.getA().setText(bm2.p6.a(i6Var.f21979e.getA().getText().toString(), str, this.f22202r));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f22204t).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((bm2.h6) ((java.util.ArrayList) this.f22204t).get(i17)).f21946a.ordinal();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f9, code lost:
    
        if (r1 != 2) goto L24;
     */
    @Override // in5.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(in5.r0 r14, int r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.o6.x(in5.r0, int):void");
    }

    @Override // in5.q0
    public void y(in5.r0 holder, int i17, java.util.List payloads) {
        hn2.d dVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (!(!payloads.isEmpty()) || !payloads.contains("payload_audition_state")) {
            x(holder, i17);
            return;
        }
        if (holder instanceof bm2.i6) {
            java.util.List list = this.f22204t;
            if (((bm2.h6) ((java.util.ArrayList) list).get(i17)).f21946a != bm2.g6.f21917d || (dVar = ((bm2.h6) ((java.util.ArrayList) list).get(i17)).f21947b) == null) {
                return;
            }
            L(dVar, (bm2.i6) holder);
        }
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        bm2.g6 g6Var = bm2.g6.f21917d;
        android.content.Context context = this.f22195h;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489003ec4, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new bm2.i6(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ami, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new bm2.f6(this, inflate2);
    }
}
