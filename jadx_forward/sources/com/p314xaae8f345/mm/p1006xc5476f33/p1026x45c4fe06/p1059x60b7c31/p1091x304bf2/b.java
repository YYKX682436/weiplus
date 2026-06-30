package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f162787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162788e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.f fVar, android.content.Context context, java.lang.String str) {
        this.f162787d = context;
        this.f162788e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f162787d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(this.f162788e);
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e));
        u1Var.q(false);
    }
}
