package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes12.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 f179559e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8, java.lang.String str) {
        this.f179559e = activityC13272x96cd1be8;
        this.f179558d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = this.f179558d;
        if (str == null) {
            str = "";
        }
        d22.d0 d0Var = new d22.d0(str, null, null);
        d0Var.f445731g = 20;
        d22.u uVar = d22.u.f307409a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8 = this.f179559e;
        uVar.a(activityC13272x96cd1be8, d0Var);
        activityC13272x96cd1be8.finish();
    }
}
