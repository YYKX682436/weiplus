package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jj0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f194650p;

    /* renamed from: q, reason: collision with root package name */
    public r45.rm1 f194651q;

    /* renamed from: r, reason: collision with root package name */
    public int f194652r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f194653s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f194654t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f194655u;

    /* renamed from: v, reason: collision with root package name */
    public r45.d22 f194656v;

    /* renamed from: w, reason: collision with root package name */
    public bl2.k f194657w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f194658x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194650p = "Finder.FinderLiveVisitorMusicPlugin";
        root.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fj0(this, root));
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.qfa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f194653s = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f564900d16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f194654t = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.qf_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f194655u = findViewById3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f194651q = null;
        this.f194652r = 0;
        this.f194658x = false;
        bl2.k kVar = this.f194657w;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        java.lang.String str = this.f194650p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SEI music info curBgmPlayingInfo:");
        r45.rm1 rm1Var = this.f194651q;
        sb6.append(rm1Var != null ? dk2.q.h(rm1Var) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.rm1 rm1Var2 = this.f194651q;
        if (rm1Var2 != null) {
            int i17 = ((mm2.n0) S0().a(mm2.n0.class)).f410806r ? 16 : 2;
            dk2.xf j17 = dk2.ef.f314905a.j(R0());
            if (j17 != null) {
                long m75942xfb822ef2 = ((mm2.e1) S0().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                byte[] bArr = ((mm2.e1) S0().a(mm2.e1.class)).f410518o;
                android.content.Context context = this.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "<get-context>(...)");
                ((dk2.r4) j17).O(m75942xfb822ef2, bArr, xy2.c.e(context), ((mm2.e1) S0().a(mm2.e1.class)).f410516m, i17, kz5.b0.c(rm1Var2), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ij0(this));
            }
        }
    }

    public final void u1(int i17, boolean z17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("listen_source_type", z17 ? 1 : 2);
        jSONObject.put("base_listenid", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408755d2, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final void v1(boolean z17) {
        android.view.View view = this.f194653s;
        int i17 = z17 ^ true ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f194654t;
        int i18 = z17 ^ true ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f194655u;
        int i19 = z17 ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
