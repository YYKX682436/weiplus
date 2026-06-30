package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class n5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 f211069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f211070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(1);
        this.f211069d = activityC15029x292078;
        this.f211070e = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.v51 resp = (r45.v51) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078 = this.f211069d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC15029x292078.f210105z, this.f211070e)) {
            activityC15029x292078.f210103x = resp.m75939xb282bd08(2) != 0;
            if (activityC15029x292078.f210105z == null) {
                activityC15029x292078.f210102w.clear();
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.l5(resp, activityC15029x292078));
            }
            activityC15029x292078.f210105z = resp.m75934xbce7f2f(4);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m5(activityC15029x292078, resp));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFansListUI", "not my buf, ignore!");
        }
        return jz5.f0.f384359a;
    }
}
