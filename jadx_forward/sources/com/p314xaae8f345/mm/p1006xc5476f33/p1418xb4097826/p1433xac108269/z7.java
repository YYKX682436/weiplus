package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class z7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f184292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184293e;

    public z7(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String str) {
        this.f184292d = activityC0065xcd7aa112;
        this.f184293e = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f184292d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        objArr[0] = nyVar != null ? nyVar.f216915p : null;
        objArr[1] = this.f184293e;
        objArr[2] = 0;
        objArr[3] = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
        g0Var.d(21180, objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUIUtil", "[checkShowShareSnsLayout] click cancel");
    }
}
