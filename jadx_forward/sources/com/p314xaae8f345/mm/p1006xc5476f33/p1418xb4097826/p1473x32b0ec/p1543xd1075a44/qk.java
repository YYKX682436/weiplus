package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk f201063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f201065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f201066g;

    public qk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk rkVar, java.lang.String str, java.util.Map map, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f201063d = rkVar;
        this.f201064e = str;
        this.f201065f = map;
        this.f201066g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1 = this.f201063d.f201187b;
        if (c14940x2aae97e1 != null) {
            c14940x2aae97e1.m58937xcde73672(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e12 = this.f201063d.f201187b;
        if (c14940x2aae97e12 != null) {
            c14940x2aae97e12.m58935xa92fde5d(this.f201064e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk rkVar = this.f201063d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e13 = rkVar.f201187b;
        if (c14940x2aae97e13 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk pkVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pk(rkVar, this.f201066g);
            synchronized (c14940x2aae97e13.f207033m) {
                c14940x2aae97e13.f207033m.add(pkVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e14 = this.f201063d.f201187b;
        if (c14940x2aae97e14 != null) {
            c14940x2aae97e14.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playGiftAnim magicRewardView isShow:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e15 = this.f201063d.f201187b;
        sb6.append(c14940x2aae97e15 != null ? java.lang.Boolean.valueOf(c14940x2aae97e15.isShown()) : null);
        sb6.append(" play params:");
        sb6.append(this.f201065f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayMagicRewardWidget", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e16 = this.f201063d.f201187b;
        if (c14940x2aae97e16 != null) {
            c14940x2aae97e16.f(this.f201065f);
        }
        this.f201063d.f201186a.u1();
    }
}
