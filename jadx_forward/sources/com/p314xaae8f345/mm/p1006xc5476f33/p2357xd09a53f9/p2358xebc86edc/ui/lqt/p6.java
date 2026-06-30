package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class p6 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u6 f259860a;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u6 u6Var) {
        this.f259860a = u6Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "save failed: %s", obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u6 u6Var = this.f259860a;
        u6Var.f259932d.getClass();
        if (obj != null) {
            db5.e1.t(u6Var.f259932d, obj instanceof java.lang.String ? obj.toString() : u6Var.f259932d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpu), "", new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.o6(this));
        }
    }
}
