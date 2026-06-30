package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class x9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f192260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14000x822b3ff6 f192261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14000x822b3ff6 activityC14000x822b3ff6) {
        super(2, interfaceC29045xdcb5ca57);
        this.f192260d = hVar;
        this.f192261e = activityC14000x822b3ff6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x9(this.f192260d, interfaceC29045xdcb5ca57, this.f192261e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x9 x9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x9Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.t61 t61Var = (r45.t61) ((xg2.i) this.f192260d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadMoreData success total_count=");
        sb6.append(t61Var.m75939xb282bd08(6));
        sb6.append(" live_info.size=");
        java.util.LinkedList m75941xfb821914 = t61Var.m75941xfb821914(1);
        sb6.append(m75941xfb821914 != null ? new java.lang.Integer(m75941xfb821914.size()) : null);
        sb6.append(" continue_flag=");
        sb6.append(t61Var.m75939xb282bd08(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveHistoryUI", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14000x822b3ff6 activityC14000x822b3ff6 = this.f192261e;
        java.util.List list = activityC14000x822b3ff6.f190908y;
        java.util.LinkedList m75941xfb8219142 = t61Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getLive_info(...)");
        ((java.util.ArrayList) list).addAll(m75941xfb8219142);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.v9 v9Var = activityC14000x822b3ff6.B;
        if (v9Var != null) {
            v9Var.m8153xd399a4d9(((java.util.ArrayList) activityC14000x822b3ff6.f190908y).size() - t61Var.m75941xfb821914(1).size(), t61Var.m75941xfb821914(1).size());
        }
        activityC14000x822b3ff6.f190907x = t61Var.m75934xbce7f2f(2);
        if (t61Var.m75939xb282bd08(3) == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = activityC14000x822b3ff6.f190909z;
            if (c15343x638a173f != null) {
                c15343x638a173f.e(true);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f2 = activityC14000x822b3ff6.f190909z;
            if (c15343x638a173f2 != null) {
                c15343x638a173f2.f();
            }
        }
        return jz5.f0.f384359a;
    }
}
