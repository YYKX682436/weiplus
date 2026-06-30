package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class s0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f182609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f182610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.t0 f182611f;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.t0 t0Var, java.util.ArrayList arrayList, boolean z17) {
        this.f182611f = t0Var;
        this.f182609d = arrayList;
        this.f182610e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.t0 t0Var = this.f182611f;
        android.app.Activity activity = t0Var.f182614a.f182485l;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r0(this);
        java.util.ArrayList arrayList = this.f182609d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.a(activity, arrayList, r0Var, 27, null);
        if (this.f182610e) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.e7(t0Var.f182614a.f182485l);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0 y0Var = t0Var.f182614a.f182488o;
        if (y0Var != null) {
            y0Var.n4(0, arrayList.size());
        }
    }
}
