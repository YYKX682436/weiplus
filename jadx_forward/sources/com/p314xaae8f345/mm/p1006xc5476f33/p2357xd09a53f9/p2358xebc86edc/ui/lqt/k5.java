package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f259771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l5 f259772e;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l5 l5Var, android.graphics.Bitmap bitmap) {
        this.f259772e = l5Var;
        this.f259771d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l5 l5Var = this.f259772e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = l5Var.f259794d;
        if (activityC19020x7623dbfb.U == null || (imageView = activityC19020x7623dbfb.f259594o) == null || imageView.getTag() == null || !l5Var.f259794d.f259594o.getTag().equals(l5Var.f259794d.U.f69225xed6d60f6)) {
            return;
        }
        l5Var.f259794d.f259594o.setImageBitmap(this.f259771d);
    }
}
