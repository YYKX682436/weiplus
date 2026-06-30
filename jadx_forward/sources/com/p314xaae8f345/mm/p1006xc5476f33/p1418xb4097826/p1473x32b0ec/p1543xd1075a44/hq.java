package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class hq implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq f200122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.a63 f200123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f200124c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jq f200125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fq f200126e;

    public hq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar, r45.a63 a63Var, com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jq jqVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fq fqVar) {
        this.f200122a = nqVar;
        this.f200123b = a63Var;
        this.f200124c = c22851x22587864;
        this.f200125d = jqVar;
        this.f200126e = fqVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f200122a.H, "#onRefresh");
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar = this.f200122a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nqVar.H, "#onLoadMore");
        r45.a63 a63Var = this.f200123b;
        if (!a63Var.m75933x41a8a7f2(3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(nqVar.H, "#onLoadMore has_next=false. return");
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f200124c;
            if (c22851x22587864 != null) {
                c22851x22587864.f();
            }
            return true;
        }
        r45.b63 b63Var = new r45.b63();
        b63Var.set(0, java.lang.Integer.valueOf(a63Var.m75939xb282bd08(0)));
        b63Var.set(1, a63Var.m75945x2fec8307(4));
        pq5.g l17 = new ke2.y("", 0, false, null, false, b63Var, 28, null).l();
        android.content.Context context = this.f200125d.f309888d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gq(this.f200122a, this, this.f200124c, this.f200123b, this.f200126e));
        return true;
    }
}
