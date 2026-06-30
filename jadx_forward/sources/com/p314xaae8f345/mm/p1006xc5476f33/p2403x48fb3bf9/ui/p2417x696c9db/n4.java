package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class n4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 f267388d;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5) {
        this.f267388d = activityC19328xb24711f5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5 = this.f267388d;
        if (j17 == activityC19328xb24711f5.f265298w) {
            java.lang.String stringExtra = activityC19328xb24711f5.getIntent().getStringExtra("task_url");
            java.lang.String stringExtra2 = activityC19328xb24711f5.getIntent().getStringExtra("task_name");
            java.lang.String stringExtra3 = activityC19328xb24711f5.getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                stringExtra3 = stringExtra2;
            }
            activityC19328xb24711f5.getClass();
            if (((qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class))).xj(stringExtra, stringExtra3)) {
                qg5.e3 e3Var = (qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class));
                java.util.Map nj6 = e3Var.nj(e3Var.f444496n);
                if (nj6.isEmpty()) {
                    return;
                }
                ((cy1.a) e3Var.ij()).Ej("jump_yuanbao_download_succ", nj6, 35480);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
    }
}
