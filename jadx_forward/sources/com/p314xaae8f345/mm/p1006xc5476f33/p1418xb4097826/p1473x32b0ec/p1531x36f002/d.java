package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f197003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f197004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f197005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.graphics.Bitmap bitmap, yz5.l lVar) {
        super(1);
        this.f197003d = h0Var;
        this.f197004e = bitmap;
        this.f197005f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        yz5.l lVar = this.f197005f;
        if (bitmap != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i.f197074b;
            java.lang.Object obj2 = this.f197003d.f391656d;
            android.graphics.Bitmap resource = this.f197004e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resource, "$resource");
            r2Var.put(obj2, new jz5.l(resource, bitmap));
            new android.graphics.Canvas(bitmap).drawColor(1711276032);
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } else if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
