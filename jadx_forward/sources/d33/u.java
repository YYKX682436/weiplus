package d33;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d f307817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307818e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f) {
        this.f307817d = c15652xb39b5f9d;
        this.f307818e = activityC15646xc9a7ee3f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17;
        float f18;
        float f19;
        float f27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307818e;
        int[] iArr = activityC15646xc9a7ee3f.f220014y;
        if (iArr == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mattingImageInfo");
            throw null;
        }
        int i17 = iArr[0];
        if (iArr == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mattingImageInfo");
            throw null;
        }
        int i18 = iArr[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d this_apply = this.f307817d;
        int width = this_apply.getWidth();
        int height = this_apply.getHeight();
        int i19 = activityC15646xc9a7ee3f.f220012w;
        int i27 = (i19 == 90 || i19 == 270) ? i18 : i17;
        if (i19 != 90 && i19 != 270) {
            i17 = i18;
        }
        if (i17 < height && i27 < width) {
            f19 = (width - i27) / 2.0f;
            f27 = i27 + f19;
            f17 = (height - i17) / 2.0f;
            f18 = i17 + f17;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.e(i27, i17)) {
            f27 = width;
            f18 = height;
            f19 = 0.0f;
            f17 = 0.0f;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.c(i27, i17)) {
            f27 = width;
            f17 = (height - i17) / 2.0f;
            f18 = f17 + f27;
            f19 = 0.0f;
        } else {
            float f28 = i17;
            float f29 = i27;
            float f37 = height;
            float f38 = width;
            if (f28 / f29 > f37 / f38) {
                float f39 = (height * i27) / f28;
                float f47 = (f38 - f39) / 2.0f;
                f27 = f47 + f39;
                f19 = f47;
                f17 = 0.0f;
                f18 = f37;
            } else {
                float f48 = (width * i17) / f29;
                f17 = (f37 - f48) / 2.0f;
                f18 = f48 + f17;
                f19 = 0.0f;
                f27 = f38;
            }
        }
        this_apply.f(new android.graphics.RectF(f19, f17, f27, f18), ru3.o.f481298f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this_apply, "$this_apply");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String X6 = activityC15646xc9a7ee3f.X6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X6, "access$getImgPath(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d.g(this_apply, currentTimeMillis, X6, true, null, activityC15646xc9a7ee3f.C, 8, null);
    }
}
