package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class wc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc f217868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f217869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217870f;

    public wc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc xcVar, yz5.l lVar, in5.s0 s0Var) {
        this.f217868d = xcVar;
        this.f217869e = lVar;
        this.f217870f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC$setupCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc xcVar = this.f217868d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = xcVar.f217978p;
        if (c19781xd1c47b87 != null) {
            if (xcVar.f217981s) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15300xd68c6f82 c15300xd68c6f82 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15300xd68c6f82 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15300xd68c6f82) view : null;
                if (c15300xd68c6f82 != null) {
                    long m76058xa6514d24 = c19781xd1c47b87.m76058xa6514d24();
                    in5.s0 holder = this.f217870f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                    java.lang.Object obj = holder.f374658i;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
                    if (abstractC14490x69736cb5 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.HotCommentLayout", "openDrawer failed: holder=" + holder + ", item=null");
                    } else {
                        if (m76058xa6514d24 != c15300xd68c6f82.f212692n) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.HotCommentLayout", "openDrawer invalid: " + m76058xa6514d24 + "!=" + c15300xd68c6f82.f212692n);
                        }
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = holder.f374655f;
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = f2Var instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) f2Var : null;
                        in5.r w07 = c22848x6ddd90cf != null ? c22848x6ddd90cf.w0(holder.m8185xcdaf1228()) : null;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe) w07 : null;
                        if (qeVar != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.E0(qeVar, holder, abstractC14490x69736cb5, false, m76058xa6514d24, null, 0, 5, false, 1500L, 0, 1, 692, null);
                        }
                    }
                }
            } else {
                yz5.l lVar = this.f217869e;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Long.valueOf(c19781xd1c47b87.m76058xa6514d24()));
                }
            }
        }
        long j17 = xcVar.f217973h;
        xcVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.Object obj2 = ((java.util.LinkedHashMap) xcVar.f217977o).get(java.lang.Long.valueOf(j17));
        if (obj2 == null) {
            obj2 = 0L;
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        long j18 = xcVar.f217974i;
        ((m30.m) rVar).getClass();
        jSONObject2.put("cid", b52.b.q(j18));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        jSONObject2.put("feedid", b52.b.q(j17));
        jSONObject2.put("current_play_sec", obj2);
        jSONObject2.put("video_duration", xcVar.f217975m);
        jSONObject2.put("expose_start_time", xcVar.f217972g);
        jSONObject2.put(ya.b.f77470xbd76cf60, xcVar.f217980r);
        jSONObject.put("hot_comment", jSONObject2);
        xcVar.k7(jSONObject2);
        android.app.Activity context = xcVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, nyVar != null ? nyVar.V6() : null, "hot_comment", 1, jSONObject, false, null, 48, null);
        xcVar.i7(xcVar.f217973h, 2);
        xcVar.f217976n = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC$setupCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
