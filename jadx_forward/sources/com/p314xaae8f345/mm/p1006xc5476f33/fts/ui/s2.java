package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final t13.k f219709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 f219710e;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var, t13.k kVar, java.lang.String str) {
        this.f219710e = q2Var;
        this.f219709d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        r45.di6 di6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var = this.f219710e;
        boolean z17 = q2Var.I;
        t13.k kVar = this.f219709d;
        if (!z17) {
            java.util.List list = q2Var.f219685q;
            if (((t13.k) ((java.util.LinkedList) list).get(((java.util.LinkedList) list).size() - 1)).mo9548xfb85f7b0() == kVar.mo9548xfb85f7b0()) {
                q2Var.I = true;
            }
        }
        q2Var.f219686r.C = q2Var.I;
        java.util.Iterator it = q2Var.f219685q.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            i18 = ((t13.k) it.next()).j(i18);
        }
        g23.k kVar2 = q2Var.f219686r;
        ((java.util.ArrayList) kVar2.N).addAll(kVar.h(kVar2.f349470b));
        if ((kVar instanceof j23.y) && !((j23.y) kVar).f378829o) {
            q2Var.f219689u = false;
            q2Var.f219693y = i18;
        }
        if (q2Var.f219689u) {
            int i19 = q2Var.f219692x;
            boolean z18 = (i19 < 0 && q2Var.f219691w < 0) || (i19 >= 0 && q2Var.f219691w >= 0);
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "sugResortCanNotify, relevantSearchUIUnitIdx: %d, chatRoomUIUnitIdx: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(q2Var.f219691w));
            }
            if (z18) {
                q2Var.n(i18);
                q2Var.notifyDataSetChanged();
            }
        }
        q2Var.l(i18, q2Var.I);
        if (q2Var.I) {
            q2Var.f219686r.f349471c = c01.id.c();
        }
        if (q2Var.I) {
            if (i18 == q2Var.f219693y) {
                i17 = 0;
                for (t13.k kVar3 : q2Var.f219685q) {
                    if (kVar3 instanceof j23.y) {
                        ((j23.y) kVar3).f378829o = true;
                        q2Var.f219686r.L = q2Var.r(i17);
                    }
                    i17 = kVar3.j(i17);
                }
                q2Var.f219686r.f(i17);
                q2Var.getClass();
                q2Var.t(true, false);
            } else {
                i17 = 0;
                for (t13.k kVar4 : q2Var.f219685q) {
                    i17 = kVar4.j(i17);
                    if (kVar4 instanceof j23.y) {
                        q2Var.f219686r.L = q2Var.r(i17);
                        j23.y yVar = (j23.y) kVar4;
                        g23.k searchStaticsObj = q2Var.f219686r;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchStaticsObj, "searchStaticsObj");
                        android.content.Context context = yVar.f496092e;
                        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity");
                            j75.f m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) context).m67437x4bd5310();
                            if (m67437x4bd5310 != null) {
                                java.lang.String str = yVar.f378827m;
                                if (str == null) {
                                    str = "";
                                }
                                java.lang.String str2 = str;
                                long j17 = yVar.f378828n;
                                java.util.LinkedList linkedList = yVar.f378831q;
                                if (linkedList == null) {
                                    linkedList = new java.util.LinkedList();
                                }
                                m67437x4bd5310.B3(new fi0.e(str2, j17, linkedList, yVar.f378834t));
                            }
                        }
                        int i27 = yVar.f378835u != 0 ? 3 : 2;
                        if (yVar.f378831q != null && (!r6.isEmpty())) {
                            java.lang.String str3 = yVar.f378827m;
                            java.util.LinkedList linkedList2 = yVar.f378831q;
                            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.o1.a(str3, searchStaticsObj, 0, "", "", "", (linkedList2 == null || (di6Var = (r45.di6) linkedList2.get(0)) == null) ? null : di6Var.f454046e, i27);
                        }
                    }
                }
                q2Var.f219686r.f(i17);
                q2Var.getClass();
                q2Var.t(false, false);
            }
            q2Var.n(i17);
            q2Var.notifyDataSetChanged();
        }
    }
}
