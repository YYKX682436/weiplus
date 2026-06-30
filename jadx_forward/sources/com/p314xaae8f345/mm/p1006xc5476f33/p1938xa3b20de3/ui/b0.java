package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes3.dex */
public class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f234118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234119e;

    public b0(android.app.Activity activity, java.lang.String str) {
        this.f234118d = activity;
        this.f234119e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f234118d, this.f234119e, true);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(3, 1);
        dialogInterface.dismiss();
    }
}
