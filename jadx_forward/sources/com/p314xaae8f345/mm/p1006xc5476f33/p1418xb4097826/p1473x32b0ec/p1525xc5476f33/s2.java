package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f195740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f195741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195740d = hVar;
        this.f195741e = v3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s2(this.f195740d, interfaceC29045xdcb5ca57, this.f195741e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s2 s2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.h32 h32Var;
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.v71 v71Var = (r45.v71) ((xg2.i) this.f195740d).f535926b;
        r45.j32 j32Var = (r45.j32) v71Var.m75936x14adae67(4);
        if (j32Var == null || (m75941xfb821914 = j32Var.m75941xfb821914(0)) == null || (h32Var = (r45.h32) kz5.n0.Z(m75941xfb821914)) == null) {
            h32Var = (r45.h32) v71Var.m75936x14adae67(1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f195741e;
        android.view.View view = v3Var.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareNoticePanel: noticeId=");
        sb6.append(h32Var != null ? h32Var.m75945x2fec8307(4) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
        if (h32Var == null) {
            v3Var.B.setOnClickListener(null);
            v3Var.C.setVisibility(0);
            android.view.View view2 = v3Var.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v3Var.E.setText(v3Var.f194857f.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572974mi2));
            v3Var.C.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p2(v3Var));
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String username = ((mm2.c1) v3Var.P0(mm2.c1.class)).f410385o;
            long m75942xfb822ef2 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            r0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", username);
            hashMap.put("liveId", java.lang.String.valueOf(m75942xfb822ef2));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.f409567b2;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            zy2.zb.I8(zbVar, u1Var, hashMap, b17, "1002", null, null, false, 112, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndLiveCreateNextNoticeExposed report23057, liveid = " + ((java.lang.String) hashMap.get("liveId")));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a.a("", "", "", "notice_show", "");
            v3Var.C.setVisibility(8);
            android.view.View view3 = v3Var.D;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v3Var.E.setText(zl2.q4.t(zl2.q4.f555466a, h32Var, com.p314xaae8f345.mm.R.C30867xcad56011.csf, false, false, true, 12, null));
            v3Var.B.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q2(v3Var, h32Var));
        }
        v3Var.P1(true);
        return jz5.f0.f384359a;
    }
}
