package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class s6 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u6 f259902a;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u6 u6Var) {
        this.f259902a = u6Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u6 u6Var = this.f259902a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = u6Var.f259932d;
        boolean z17 = false;
        activityC19020x7623dbfb.f259607x1 = false;
        activityC19020x7623dbfb.getClass();
        if (obj != null) {
            boolean z18 = obj instanceof r45.an5;
            if (z18) {
                r45.an5 an5Var = (r45.an5) obj;
                z17 = np5.t.a(u6Var.f259932d, null, 1000, an5Var.f451675d, an5Var.f451676e);
            }
            if (z17) {
                return;
            }
            db5.e1.t(u6Var.f259932d, obj instanceof java.lang.String ? obj.toString() : z18 ? ((r45.an5) obj).f451676e : u6Var.f259932d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpu), "", new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.r6(this));
        }
    }
}
