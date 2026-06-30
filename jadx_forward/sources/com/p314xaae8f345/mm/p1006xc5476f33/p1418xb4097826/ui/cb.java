package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class cb implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f f210517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210518b;

    public cb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f, java.lang.String str) {
        this.f210517a = activityC15047x3a53ff1f;
        this.f210518b = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f = this.f210517a;
        android.app.ProgressDialog progressDialog = activityC15047x3a53ff1f.I;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        activityC15047x3a53ff1f.I = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        boolean z17 = result.f183766a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f = this.f210517a;
        boolean z18 = result.f183767b;
        if (!z17) {
            if (z18) {
                return;
            }
            android.app.ProgressDialog progressDialog = activityC15047x3a53ff1f.I;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            activityC15047x3a53ff1f.I = null;
            return;
        }
        if (z18) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.Q;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC15047x3a53ff1f, "", activityC15047x3a53ff1f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.z_), true, false, null);
            activityC15047x3a53ff1f.I = Q;
            if (Q != null) {
                Q.show();
            }
        }
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.Q;
        activityC15047x3a53ff1f.getClass();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.s0 s0Var = hb2.s0.f361623e;
        java.lang.String str3 = activityC15047x3a53ff1f.N;
        s0Var.getClass();
        java.lang.String signature = this.f210518b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(1, signature);
        if (str3 != null) {
            hb2.w0.a(s0Var, str3, ri2Var, activityC15047x3a53ff1f, false, false, null, 56, null);
        }
    }
}
