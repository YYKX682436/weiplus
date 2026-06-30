package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class k0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f182521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f182522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 f182523f;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var, java.util.ArrayList arrayList, boolean z17) {
        this.f182523f = h0Var;
        this.f182521d = arrayList;
        this.f182522e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182523f;
        android.app.Activity activity = h0Var.f182485l;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.j0(this);
        java.util.ArrayList arrayList = this.f182521d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.a(activity, arrayList, j0Var, 27, null);
        if (this.f182522e) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.e7(h0Var.f182485l);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0 y0Var = h0Var.f182488o;
        if (y0Var != null) {
            y0Var.n4(0, arrayList.size());
        }
    }
}
