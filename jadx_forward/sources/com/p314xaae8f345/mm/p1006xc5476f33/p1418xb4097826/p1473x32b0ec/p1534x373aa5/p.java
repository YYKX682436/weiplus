package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f198102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f198104f;

    public p(android.view.View view, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        this.f198102d = view;
        this.f198103e = str;
        this.f198104f = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = pm0.v.r(this.f198102d).bottom;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BasePluginLayout_notify2ChangeCommentHeight", "[notify2CHangeCommentHeight] tag = " + this.f198103e + ", bottom = " + i17);
        ((mm2.x4) this.f198104f.m57635xbba4bfc0(mm2.x4.class)).B.mo523x53d8522f(java.lang.Integer.valueOf(i17));
    }
}
