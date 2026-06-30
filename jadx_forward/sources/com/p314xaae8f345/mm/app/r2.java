package com.p314xaae8f345.mm.app;

/* loaded from: classes13.dex */
public class r2 implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.s2 f135279d;

    public r2(com.p314xaae8f345.mm.app.s2 s2Var) {
        this.f135279d = s2Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.mm.app.s2 s2Var = this.f135279d;
        if (s2Var.mo42988x67189314() != null) {
            s2Var.mo42988x67189314().post(new com.p314xaae8f345.mm.app.q2(this, str));
        } else {
            s2Var.mo8889x3be51a90(str);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.mm.app.s2 s2Var = this.f135279d;
        if (s2Var.mo42988x67189314() != null) {
            s2Var.mo42988x67189314().post(new com.p314xaae8f345.mm.app.p2(this, str));
        } else {
            s2Var.mo8890x1952ea5(str);
        }
    }
}
