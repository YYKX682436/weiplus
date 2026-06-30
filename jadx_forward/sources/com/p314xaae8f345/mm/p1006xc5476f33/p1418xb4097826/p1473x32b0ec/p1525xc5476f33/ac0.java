package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ac0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f193387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f193388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 f193389f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f193390g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f193391h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f193392i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(android.graphics.Bitmap bitmap, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var, cm2.g0 g0Var, boolean z17, android.graphics.Bitmap bitmap2) {
        super(0);
        this.f193387d = bitmap;
        this.f193388e = view;
        this.f193389f = dc0Var;
        this.f193390g = g0Var;
        this.f193391h = z17;
        this.f193392i = bitmap2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cm2.g0 g0Var = this.f193390g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var = this.f193389f;
        android.graphics.Bitmap bitmap = this.f193387d;
        if (bitmap != null) {
            this.f193388e.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(dc0Var.f193787d.getResources(), bitmap));
            dc0Var.c(g0Var, false, this.f193391h);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dc0Var.f193791h, "resource is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var2 = this.f193389f;
            bw5.mb0 P0 = zl2.r4.f555483a.P0(g0Var.f124879v);
            java.lang.String c17 = P0 != null ? P0.c() : null;
            if (c17 == null) {
                c17 = "";
            }
            dc0Var2.d(c17, this.f193388e, this.f193392i, this.f193390g, this.f193391h);
        }
        return jz5.f0.f384359a;
    }
}
