package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nj0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f195172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xj0 f195173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj0(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xj0 xj0Var) {
        super(0);
        this.f195172d = bitmap;
        this.f195173e = xj0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xj0 xj0Var = this.f195173e;
        android.graphics.Bitmap bitmap = this.f195172d;
        if (bitmap != null) {
            xj0Var.f196625q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(xj0Var.f446856d.getContext().getResources(), bitmap));
            ((mm2.c1) xj0Var.P0(mm2.c1.class)).I4 = bitmap;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        xj0Var.K0(0);
        return jz5.f0.f384359a;
    }
}
