package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class a2 implements mv2.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f232555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f232556e;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f232555d = c16668xffb9dd68;
        this.f232556e = activityC0065xcd7aa112;
    }

    @Override // mv2.w0
    /* renamed from: onPostErr */
    public void mo56114x385435c6(long j17, boolean z17) {
        lm3.e eVar;
        fm3.u uVar;
        java.lang.Long l17;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232555d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "onPostEnd " + j17 + ' ' + z17);
        java.util.ArrayList arrayList = c16668xffb9dd68.f232510g;
        if (!(arrayList.size() > 0)) {
            arrayList = null;
        }
        if (arrayList == null || (eVar = (lm3.e) arrayList.get(0)) == null || (uVar = eVar.f401015d) == null || (l17 = uVar.f345654a) == null || l17.longValue() != j17 || z17) {
            return;
        }
        uVar.f345669p = 3;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w1(c16668xffb9dd68));
    }

    @Override // mv2.w0
    /* renamed from: onPostFakeOk */
    public void mo56115x10614c10(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232555d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "onPostFakeOk " + j17);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x1(c16668xffb9dd68));
    }

    @Override // mv2.w0
    /* renamed from: onPostNotify */
    public void mo56116x1ed18348(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f232555d.f232507d, "onPostNotify " + j17 + ' ' + z17);
    }

    @Override // mv2.w0
    /* renamed from: onPostOk */
    public void mo56117x5465d15b(long j17, long j18) {
        lm3.e eVar;
        fm3.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232555d;
        java.util.ArrayList arrayList = c16668xffb9dd68.f232510g;
        jz5.f0 f0Var = null;
        if (!(arrayList.size() > 0)) {
            arrayList = null;
        }
        if (arrayList != null && (eVar = (lm3.e) arrayList.get(0)) != null && (uVar = eVar.f401015d) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "onPostOk " + j17 + ' ' + j18);
            java.lang.Long l17 = uVar.f345654a;
            if (l17 != null && l17.longValue() == j17) {
                uVar.f345669p = 4;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j18);
                if (h17 != null) {
                    uVar.f345673t = h17.getFeedObject();
                    c16668xffb9dd68.U6(h17.m59251x5db1b11(), h17.m59276x6c285d75(), uVar);
                }
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y1(c16668xffb9dd68, this.f232556e));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "first item difference local id " + uVar.f345654a + ' ' + j17);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "onPostOk not found mv " + j17 + ' ' + j18);
        }
    }

    @Override // mv2.w0
    /* renamed from: onPostStart */
    public void mo55429x74e3dc83(long j17) {
        lm3.e eVar;
        fm3.u uVar;
        java.lang.Long l17;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232555d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "onPostStart " + j17);
        java.util.ArrayList arrayList = c16668xffb9dd68.f232510g;
        if (!(arrayList.size() > 0)) {
            arrayList = null;
        }
        if (arrayList == null || (eVar = (lm3.e) arrayList.get(0)) == null || (uVar = eVar.f401015d) == null || (l17 = uVar.f345654a) == null || l17.longValue() != j17) {
            return;
        }
        uVar.f345669p = 2;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z1(c16668xffb9dd68));
    }
}
