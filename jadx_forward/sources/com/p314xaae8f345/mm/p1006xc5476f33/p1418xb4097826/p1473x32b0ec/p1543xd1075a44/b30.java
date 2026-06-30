package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class b30 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f199350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 f199351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f199352f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var, yz5.l lVar) {
        super(0);
        this.f199350d = bitmap;
        this.f199351e = e30Var;
        this.f199352f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar = this.f199352f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = this.f199351e;
        android.graphics.Bitmap bitmap = this.f199350d;
        if (bitmap != null) {
            e30Var.f199750v.setLayerPaint(null);
            e30Var.f199750v.setImageBitmap(bitmap);
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e30Var.f199746r, "updateCheerIcon resource is null!");
            e30Var.f199750v.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(e30Var.f446856d.getContext(), com.p314xaae8f345.mm.R.raw.f79655x5636c5e6, e30Var.G));
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f384359a;
    }
}
