package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class r7 implements com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19746xa634503c f273413a;

    public r7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19746xa634503c c19746xa634503c) {
        this.f273413a = c19746xa634503c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.k
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar, int i17) {
        if (-1 == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSightCenterView", "error stop, isCompletion: %s", java.lang.Boolean.valueOf(this.f273413a.W));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19746xa634503c c19746xa634503c = this.f273413a;
            if (c19746xa634503c.L == null || c19746xa634503c.W) {
                return;
            }
            this.f273413a.L.mo9756xaf8aa769(0, 0);
            return;
        }
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSightCenterView", "normal stop");
            this.f273413a.W = true;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f273413a.L;
            if (a4Var != null) {
                a4Var.mo9755xa6db431b();
            }
        }
    }
}
