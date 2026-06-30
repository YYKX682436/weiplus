package y94;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y94.a0 f541922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(y94.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f541922d = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        y94.o oVar = new y94.o(this.f541922d, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        return oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        java.lang.Object mo150x989b7ca4 = ((y94.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.os.Bundle bundle;
        boolean z17;
        float f17;
        android.os.Bundle bundle2;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        y94.a0 a0Var = this.f541922d;
        if (y94.a0.z(a0Var) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            android.graphics.Bitmap bitmap = a0Var.f541886x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            if (bitmap != null) {
                bn5.f z19 = y94.a0.z(a0Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z19);
                int width = z19.getWidth();
                bn5.f z27 = y94.a0.z(a0Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z27);
                int height = z27.getHeight();
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                rect.left = 0;
                rect.right = width;
                int i17 = (height - width) / 2;
                rect.top = i17;
                rect.bottom = height - i17;
                rect2.left = 0;
                rect2.right = width;
                rect2.top = 0;
                rect2.bottom = height;
                bn5.f z28 = y94.a0.z(a0Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z28);
                android.graphics.Matrix matrix = new android.graphics.Matrix(z28.m10942xfeaf52d0());
                if (!y94.a0.A(a0Var)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBlurBitmapOffsetHeight$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    int i18 = a0Var.f541883u;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBlurBitmapOffsetHeight$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    if (i18 != 0) {
                        float[] fArr = new float[9];
                        matrix.getValues(fArr);
                        float f18 = fArr[0];
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBlurBitmapOffsetHeight$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                        int i19 = a0Var.f541883u;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBlurBitmapOffsetHeight$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                        matrix.postTranslate(0.0f, (i19 * f18) / 2);
                    }
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    matrix.invert(matrix2);
                    android.graphics.RectF rectF = new android.graphics.RectF(rect);
                    matrix2.mapRect(rectF);
                    rectF.round(rect);
                    android.graphics.RectF rectF2 = new android.graphics.RectF(rect2);
                    matrix2.mapRect(rectF2);
                    rectF2.round(rect2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    android.graphics.Bitmap bitmap2 = a0Var.f541886x;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa C = y94.a0.C(a0Var, bitmap2, rect2, dw3.h.d(dw3.h.f325744a, "sns_cover_img", null, 2, null), og3.a.f426689e);
                    if (C != null) {
                        arrayList.add(C);
                    }
                    if (arrayList.size() > 0) {
                        bundle = null;
                        z17 = true;
                    } else {
                        bundle = null;
                        z17 = false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f c16505x35e9c14f = new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f(z17, arrayList, bundle);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
                    return c16505x35e9c14f;
                }
                android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                matrix.invert(matrix3);
                bn5.f z29 = y94.a0.z(a0Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z29);
                android.graphics.RectF rectF3 = new android.graphics.RectF(z29.m10949x6b00ea39());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                float f19 = width;
                float f27 = height;
                android.graphics.RectF rectF4 = new android.graphics.RectF(new android.graphics.RectF(0.0f, 0.0f, f19, f27));
                matrix3.mapRect(rectF4);
                android.graphics.RectF rectF5 = new android.graphics.RectF();
                if (rectF5.setIntersect(rectF4, rectF3)) {
                    rectF5.offset(-rectF3.left, -rectF3.top);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCoverEffectImagePlugin", "cropRectInValidLocal no intersection!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    rectF5 = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportCoverImage mainMatrix:");
                sb6.append(matrix);
                sb6.append(", previewWidth:");
                sb6.append(width);
                sb6.append(", previewHeight:");
                sb6.append(height);
                sb6.append(", validRect:");
                bn5.f z37 = y94.a0.z(a0Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z37);
                sb6.append(z37.m10949x6b00ea39());
                sb6.append(' ');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverEffectImagePlugin", sb6.toString());
                if (rectF5 != null) {
                    rectF5.round(rect2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCoverEffectImagePlugin", "exportCoverImage contentRectF is null");
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                android.graphics.Bitmap bitmap3 = a0Var.f541886x;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa C2 = y94.a0.C(a0Var, bitmap3, rect2, dw3.h.d(dw3.h.f325744a, "sns_cover_img", null, 2, null), og3.a.f426689e);
                if (C2 != null) {
                    arrayList2.add(C2);
                }
                bn5.f z38 = y94.a0.z(a0Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z38);
                android.graphics.Matrix m10942xfeaf52d0 = z38.m10942xfeaf52d0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m10942xfeaf52d0, "getMainMatrix(...)");
                bn5.f z39 = y94.a0.z(a0Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z39);
                android.graphics.RectF rectF6 = new android.graphics.RectF(z39.m10949x6b00ea39());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                android.graphics.Matrix matrix4 = new android.graphics.Matrix();
                m10942xfeaf52d0.invert(matrix4);
                android.graphics.RectF rectF7 = new android.graphics.RectF(0.0f, 0.0f, f19, f27);
                android.graphics.RectF rectF8 = new android.graphics.RectF(rectF7);
                matrix4.mapRect(rectF8);
                android.graphics.RectF rectF9 = new android.graphics.RectF();
                if (rectF9.setIntersect(rectF8, rectF6)) {
                    m10942xfeaf52d0.mapRect(rectF9);
                    float f28 = 2;
                    float height2 = (((rectF9.top + rectF9.bottom) / f28) - ((rectF7.top + rectF7.bottom) / f28)) / rectF9.height();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverEffectImagePlugin", "calculateCoverOffset:" + height2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    f17 = height2;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCoverEffectImagePlugin", "calculateCoverOffset no intersection!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    f17 = 0.0f;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                if (arrayList2.size() > 0) {
                    bundle2 = null;
                    z18 = true;
                } else {
                    bundle2 = null;
                    z18 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f c16505x35e9c14f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f(z18, arrayList2, bundle2);
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putFloat("snsCoverOffsetKey", f17);
                c16505x35e9c14f2.f230141f = bundle3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
                return c16505x35e9c14f2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f c16505x35e9c14f3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f(false, new java.util.ArrayList(), null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        return c16505x35e9c14f3;
    }
}
