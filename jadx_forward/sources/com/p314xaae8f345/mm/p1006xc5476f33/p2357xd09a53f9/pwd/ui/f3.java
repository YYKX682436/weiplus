package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class f3 implements vl5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c f260532a;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c) {
        this.f260532a = activityC19056xd4c1806c;
    }

    @Override // vl5.o
    public void a(int i17, int i18) {
        if (i17 == i18) {
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c.f260490s;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c = this.f260532a;
        activityC19056xd4c1806c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "do update unipay order");
        activityC19056xd4c1806c.f260501q = db5.e1.Q(activityC19056xd4c1806c, activityC19056xd4c1806c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), activityC19056xd4c1806c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.n3(activityC19056xd4c1806c));
        activityC19056xd4c1806c.f260492e.a(i17, i18);
        activityC19056xd4c1806c.f260492e.notifyDataSetChanged();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List list = activityC19056xd4c1806c.f260492e.f260579e;
        if (list != null) {
            linkedList.addAll(list);
        }
        new gs4.d(linkedList).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.y2(activityC19056xd4c1806c, i18, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16343, 10);
    }
}
