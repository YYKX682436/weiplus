package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes3.dex */
public class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb f260033d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb) {
        this.f260033d = activityC18999x8e4b0cb;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = this.f260033d;
        intent.putExtra("rawUrl", activityC18999x8e4b0cb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.klr));
        intent.putExtra("showShare", false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC18999x8e4b0cb.mo55332x76847179(), intent);
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16398, activityC18999x8e4b0cb.L, 3, "", "");
    }
}
