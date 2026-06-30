package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f194571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f194572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f194573f;

    public j(android.view.View view, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar) {
        this.f194571d = view;
        this.f194572e = str;
        this.f194573f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f194571d;
        int i17 = pm0.v.r(view).bottom;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("notify2ChangeCommentHeight", "[notify2CHangeCommentHeight] tag = " + this.f194572e + ", bottom = " + i17 + ") view: " + view);
        ((mm2.x4) this.f194573f.P0(mm2.x4.class)).B.mo523x53d8522f(java.lang.Integer.valueOf(i17));
    }
}
