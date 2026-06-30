package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes12.dex */
public class oc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11456xd84e63d3 f155627e;

    public oc(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11456xd84e63d3 activityC11456xd84e63d3, java.lang.String str) {
        this.f155627e = activityC11456xd84e63d3;
        this.f155626d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        try {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(com.p314xaae8f345.mm.p971x6de15a2e.n.b(this.f155626d, 10000, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileLoginOrForceReg", "download avatar failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MobileLoginOrForceReg", e17, "", new java.lang.Object[0]);
            bitmap = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f155627e.f155054x;
        n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(0, bitmap));
    }

    /* renamed from: toString */
    public java.lang.String m48701x9616526c() {
        return super.toString() + "|loadBitmap";
    }
}
