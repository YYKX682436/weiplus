package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes4.dex */
public class p implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f237083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f237084b;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.q qVar, q80.d0 d0Var, android.content.Context context) {
        this.f237083a = d0Var;
        this.f237084b = context;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OtherViewWrapper", "openLiteApp fail %s.", this.f237083a.f442182a);
        db5.t7.m123882x26a183b(this.f237084b, com.p314xaae8f345.mm.R.C30867xcad56011.ggb, 0).show();
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OtherViewWrapper", "openLiteApp success %s.", this.f237083a.f442182a);
    }
}
