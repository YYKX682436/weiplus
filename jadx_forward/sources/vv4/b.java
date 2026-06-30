package vv4;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f521978a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f521979b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f521980c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f521981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f521982e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75, java.lang.String preRequestKey, java.lang.String imagePath, android.graphics.RectF rect, java.lang.String extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preRequestKey, "preRequestKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        this.f521982e = activityC19216xc2476b75;
        this.f521978a = preRequestKey;
        this.f521979b = imagePath;
        this.f521980c = rect;
        this.f521981d = extInfo;
    }

    /* renamed from: toString */
    public java.lang.String m172714x9616526c() {
        android.graphics.RectF rectF = this.f521980c;
        dv4.o oVar = new dv4.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("preRequestKey", this.f521978a), new jz5.l("initialSliceList", kz5.b0.c(kz5.c1.k(new jz5.l("url", this.f521982e.Z6(this.f521979b, oVar)), new jz5.l("box", oVar.a()), new jz5.l("extInfo", this.f521981d)))))));
    }
}
