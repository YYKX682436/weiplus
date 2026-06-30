package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes.dex */
public class m4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f259803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 f259804e;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4, java.util.List list) {
        this.f259804e = activityC19016xf99a44c4;
        this.f259803d = list;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.util.Iterator it = this.f259803d.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4 = this.f259804e;
                if (intValue == 2) {
                    g4Var.f(intValue, activityC19016xf99a44c4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqe));
                } else if (intValue == 3) {
                    g4Var.d(intValue, activityC19016xf99a44c4.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), activityC19016xf99a44c4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqb));
                } else if (intValue == 4) {
                    g4Var.a(intValue, com.p314xaae8f345.mm.R.C30867xcad56011.kqc);
                }
            } else {
                g4Var.a(intValue, com.p314xaae8f345.mm.R.C30867xcad56011.kqd);
            }
        }
    }
}
