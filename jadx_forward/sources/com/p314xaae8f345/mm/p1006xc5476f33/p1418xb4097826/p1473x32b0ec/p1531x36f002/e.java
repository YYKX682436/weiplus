package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f197013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f197014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f197015c;

    public e(android.view.View view, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f197013a = view;
        this.f197014b = lVar;
        this.f197015c = h0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i.f197073a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlurAvatarUtil", "loadAvatarBlurBg resource is null!");
            yz5.l lVar = this.f197014b;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.view.View view = this.f197013a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d(this.f197015c, bitmap, this.f197014b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77912xe61cad93);
        zl2.g3 g3Var = new zl2.g3(view, dVar);
        ((ku5.t0) ku5.t0.f394148d).g(new po0.d(bitmap, g3Var, 8.0f, color));
    }
}
