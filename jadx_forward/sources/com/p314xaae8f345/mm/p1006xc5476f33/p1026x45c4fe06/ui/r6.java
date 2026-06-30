package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class r6 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f171513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12662x7403fcf1 f171514f;

    public r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12662x7403fcf1 activityC12662x7403fcf1, java.lang.String str, android.view.View view) {
        this.f171514f = activityC12662x7403fcf1;
        this.f171512d = str;
        this.f171513e = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        k01.u0 u0Var = (k01.u0) i95.n0.c(k01.u0.class);
        ((ij1.j) u0Var).Ui(this.f171512d, this.f171513e);
        this.f171514f.finish();
    }
}
