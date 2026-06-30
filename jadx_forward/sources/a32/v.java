package a32;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13393xb0efbc76 f82578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f82579e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13393xb0efbc76 c13393xb0efbc76, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        this.f82578d = c13393xb0efbc76;
        this.f82579e = c21053xdbf1e5f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17;
        float f18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13393xb0efbc76 c13393xb0efbc76 = this.f82578d;
        if (c13393xb0efbc76.f180198z != null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 c13399xaee30621 = c13393xb0efbc76.f180194v;
        android.graphics.RectF m54949xbd40714a = c13399xaee30621.m54949xbd40714a();
        android.content.Context context = c13393xb0efbc76.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13401x43e552ab c13401x43e552ab = new com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13401x43e552ab(context);
        c13401x43e552ab.m43712xc040f7d2(this.f82579e);
        c13401x43e552ab.m64933xc84dc82d();
        c13393xb0efbc76.f180198z = c13401x43e552ab;
        c13399xaee30621.getClass();
        c13399xaee30621.c(new b32.y(c13399xaee30621, c13401x43e552ab, null));
        android.graphics.drawable.Drawable drawable = c13401x43e552ab.getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float width = m54949xbd40714a.width();
            float height = m54949xbd40714a.height();
            if (intrinsicWidth > intrinsicHeight) {
                f18 = width / 3;
                f17 = (intrinsicHeight * f18) / intrinsicWidth;
            } else {
                f17 = height / 3;
                f18 = (intrinsicWidth * f17) / intrinsicHeight;
            }
            float f19 = m54949xbd40714a.right;
            float f27 = m54949xbd40714a.bottom;
            c13401x43e552ab.m54954x3324feaa().setPolyToPoly(new float[]{0.0f, 0.0f, intrinsicWidth, intrinsicHeight}, 0, new float[]{f19 - f18, f27 - f17, f19, f27}, 0, 2);
            float f28 = (-c13393xb0efbc76.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561884vc)) / 2;
            c13401x43e552ab.m54954x3324feaa().postTranslate(f28, f28);
        }
    }
}
