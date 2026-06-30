package vv4;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f521972a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f521973b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f521974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f521975d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75, java.lang.String query, java.lang.String imagePath, android.graphics.RectF rect, java.lang.String extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        this.f521975d = activityC19216xc2476b75;
        this.f521972a = imagePath;
        this.f521973b = rect;
        this.f521974c = extInfo;
    }

    /* renamed from: toString */
    public java.lang.String m172712x9616526c() {
        android.graphics.RectF rectF = this.f521973b;
        dv4.o oVar = new dv4.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("referrer", this.f521974c), new jz5.l("initialSliceList", kz5.b0.c(kz5.c1.k(new jz5.l("url", this.f521975d.Z6(this.f521972a, oVar)), new jz5.l("box", oVar.a())))))));
    }
}
