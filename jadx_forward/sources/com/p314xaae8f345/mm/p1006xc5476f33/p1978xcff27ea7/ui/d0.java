package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vs3.a f236683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.e0 f236684e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.e0 e0Var, vs3.a aVar) {
        this.f236684e = e0Var;
        this.f236683d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.e0 e0Var = this.f236684e;
        e0Var.f236688e.f236722a.f236633J.b(this.f236683d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69 = e0Var.f236688e.f236722a;
        java.lang.String str = e0Var.f236687d;
        activityC16959x6229db69.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "do scene: %s", str);
        gm0.j1.d().g(new vs3.g(str, 0));
    }
}
