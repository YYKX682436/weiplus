package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class o4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266849g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266850h;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, nw4.y2 y2Var) {
        this.f266850h = c1Var;
        this.f266846d = str;
        this.f266847e = str2;
        this.f266848f = str3;
        this.f266849g = y2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14217, this.f266846d, 6, this.f266847e, this.f266848f, 3);
        dialogInterface.dismiss();
        this.f266850h.i5(this.f266849g, "add_download_task_straight:fail_network_not_wifi", null);
    }
}
