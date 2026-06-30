package qm2;

/* loaded from: classes3.dex */
public final class o implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.u f446273d;

    public o(qm2.u uVar) {
        this.f446273d = uVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String m76175x6d346f39;
        java.lang.String m76175x6d346f392;
        r45.f50 f50Var = (r45.f50) obj;
        qm2.u uVar = this.f446273d;
        gk2.e eVar = uVar.f446290i;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        boolean z17 = n0Var != null && n0Var.O6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "registerCoLiveBarVisibility: isInCoLive=" + z17);
        android.view.View view = uVar.f446288g;
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC$registerCoLiveBarVisibility$1$1", "emit", "(Lcom/tencent/mm/protocal/protobuf/CoLiveInvitationInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC$registerCoLiveBarVisibility$1$1", "emit", "(Lcom/tencent/mm/protocal/protobuf/CoLiveInvitationInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z17 || f50Var == null || uVar.f446289h == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14393xabbdae9d c14393xabbdae9d = uVar.f446289h;
            if (c14393xabbdae9d != null) {
                c14393xabbdae9d.m57879x8b63f378(kz5.p0.f395529d);
            }
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = f50Var.f455550h;
            if (c19782x23db1cfa != null && (m76175x6d346f392 = c19782x23db1cfa.m76175x6d346f39()) != null) {
                if (!(!r26.n0.N(m76175x6d346f392))) {
                    m76175x6d346f392 = null;
                }
                if (m76175x6d346f392 != null) {
                    arrayList2.add(m76175x6d346f392);
                }
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = f50Var.f455550h;
            java.lang.String m76197x6c03c64c = c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null;
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa> linkedList = f50Var.f455549g;
            if (linkedList != null) {
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 : linkedList) {
                    java.lang.String m76197x6c03c64c2 = c19782x23db1cfa3.m76197x6c03c64c();
                    if (!(m76197x6c03c64c2 == null || m76197x6c03c64c2.length() == 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa3.m76197x6c03c64c(), m76197x6c03c64c) && (m76175x6d346f39 = c19782x23db1cfa3.m76175x6d346f39()) != null) {
                        if (!(!r26.n0.N(m76175x6d346f39))) {
                            m76175x6d346f39 = null;
                        }
                        if (m76175x6d346f39 != null) {
                            arrayList2.add(m76175x6d346f39);
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14393xabbdae9d c14393xabbdae9d2 = uVar.f446289h;
            if (c14393xabbdae9d2 != null) {
                c14393xabbdae9d2.m57879x8b63f378(arrayList2);
            }
        }
        return jz5.f0.f384359a;
    }
}
