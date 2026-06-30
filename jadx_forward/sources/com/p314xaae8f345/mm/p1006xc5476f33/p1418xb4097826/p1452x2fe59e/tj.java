package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class tj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj f190599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f190600e;

    public tj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar, in5.s0 s0Var) {
        this.f190599d = xjVar;
        this.f190600e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        cw2.da videoView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        java.util.LinkedList<r45.mb4> m59264x7efe73ec;
        r45.mb4 mb4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f190599d.f192613i = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) this.f190600e.p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f != null && (videoView = c15196x85976f5f.getVideoView()) != null) {
            in5.s0 s0Var = this.f190600e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar = this.f190599d;
            ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.FinderLongVideoRelViewCallback");
            java.lang.Object obj = s0Var.f374658i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (m59264x7efe73ec = feedObject.m59264x7efe73ec()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(m59264x7efe73ec)) != null) {
                r45.gn2 gn2Var = (r45.gn2) mb4Var.m75936x14adae67(45);
                if (gn2Var != null && gn2Var.m75933x41a8a7f2(1)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
                    if (c15188xd8bd4bd != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.h0(c15188xd8bd4bd, new cw2.t4((r45.gn2) mb4Var.m75936x14adae67(45), com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CROP), false, 2, null);
                    }
                }
            }
            videoView.mo56716x4121a19(true);
            zy2.g5.u(videoView, null, 1, null);
            bb2.p0 p0Var = bb2.p0.f100473a;
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            bb2.a1 a17 = p0Var.a(itemView);
            if (a17 != null) {
                a17.c();
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = xjVar.f192605a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            bb2.a1 a18 = p0Var.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class)).X6());
            if (a18 != null) {
                a18.c();
            }
            if (videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView;
                c15188xd8bd4bd2.m61420xeb2d9731(c15188xd8bd4bd2.getPlaySpeedRatio());
            }
        }
        android.view.View e17 = this.f190599d.e();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(e17, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f190599d.f192605a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar2 = this.f190599d;
        in5.s0 s0Var2 = this.f190600e;
        jSONObject.put("first_feedid", pm0.v.u(xjVar2.f192606b.f190617v));
        jSONObject.put("feedid", pm0.v.u(((so2.j5) s0Var2.f374658i).mo2128x1ed62e84()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "feed_replay", 1, jSONObject, false, null, 48, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
