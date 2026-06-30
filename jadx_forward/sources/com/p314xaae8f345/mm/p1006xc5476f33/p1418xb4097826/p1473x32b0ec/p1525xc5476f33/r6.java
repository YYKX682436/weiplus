package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class r6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f195625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 f195626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var) {
        super(0);
        this.f195625d = bitmap;
        this.f195626e = v6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var = this.f195626e;
        android.graphics.Bitmap bitmap = this.f195625d;
        if (bitmap != null) {
            v6Var.f196201q.setLayerPaint(null);
            v6Var.f196201q.setImageBitmap(bitmap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v6Var.f196200p, "updateCheerIcon resource is null!");
            v6Var.f196210z = null;
            android.view.ViewGroup viewGroup = v6Var.f446856d;
            android.graphics.drawable.Drawable drawable = viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79655x5636c5e6);
            com.p314xaae8f345.mm.ui.uk.f(drawable, viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            v6Var.f196201q.setImageDrawable(drawable);
        }
        return jz5.f0.f384359a;
    }
}
