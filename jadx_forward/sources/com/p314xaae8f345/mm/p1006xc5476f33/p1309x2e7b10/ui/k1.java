package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l1 f176579f;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l1 l1Var, java.lang.String str, java.lang.String str2) {
        this.f176579f = l1Var;
        this.f176577d = str;
        this.f176578e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l1 l1Var = this.f176579f;
        if (l1Var.f176596d.Z.getVisibility() != 8) {
            l1Var.f176596d.Z.setVisibility(8);
        }
        java.lang.String str = this.f176577d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l1Var.f176596d.f176355f.f176186m) || !str.equals(l1Var.f176596d.f176355f.f176186m)) {
            l1Var.f176596d.M.setVisibility(8);
        } else {
            l1Var.f176596d.M.setVisibility(0);
        }
        android.graphics.Bitmap Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(this.f176578e);
        if (Ai == null) {
            l1Var.f176596d.N.setImageResource(com.p314xaae8f345.mm.R.raw.f78994x211254f4);
        } else {
            l1Var.f176596d.N.setImageBitmap(Ai);
        }
    }
}
