package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f171354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f171355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.l4 f171356f;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.l4 l4Var, android.graphics.Bitmap bitmap, long j17) {
        this.f171356f = l4Var;
        this.f171354d = bitmap;
        this.f171355e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f171354d;
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.l4 l4Var = this.f171356f;
            l4Var.f171378b.W.setImageBitmap(bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var = l4Var.f171378b;
            if (w4Var.R) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4.K(w4Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a();
            long j17 = l4Var.f171377a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            a17.b(1002, (int) (android.os.SystemClock.elapsedRealtime() - j17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(1001, (int) this.f171355e);
        }
    }
}
