package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f259769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l3 f259770e;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l3 l3Var, android.graphics.Bitmap bitmap) {
        this.f259770e = l3Var;
        this.f259769d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l3 l3Var = this.f259770e;
        if (l3Var.f259790d == null || l3Var.f259791e.f259522o.getTag() == null || !l3Var.f259791e.f259522o.getTag().equals(l3Var.f259790d.f69225xed6d60f6)) {
            return;
        }
        l3Var.f259791e.f259522o.setImageBitmap(this.f259769d);
    }
}
