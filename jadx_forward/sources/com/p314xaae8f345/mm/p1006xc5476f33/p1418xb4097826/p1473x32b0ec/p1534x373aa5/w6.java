package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class w6 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f198305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e f198306b;

    public w6(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e c14335x54feb80e) {
        this.f198305a = imageView;
        this.f198306b = c14335x54feb80e;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        wu5.c cVar;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            android.widget.ImageView imageView = this.f198305a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14335x54feb80e c14335x54feb80e = this.f198306b;
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v6 v6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v6(bitmap, imageView, c14335x54feb80e);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            cVar = t0Var.k(v6Var, 0L);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198306b.getTAG(), "loadBackgroundImage resource is empty!");
        }
    }
}
