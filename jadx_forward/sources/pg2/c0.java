package pg2;

/* loaded from: classes3.dex */
public final class c0 implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ImageView f435622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f435623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f435624c;

    public c0(java.util.Map map, long j17) {
        this.f435623b = map;
        this.f435624c = j17;
    }

    @Override // ug5.i
    public void a(android.content.Context context, android.view.View view, android.widget.FrameLayout parent, ug5.v performer) {
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf view2 = (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        view2.removeView(this.f435622a);
        ig2.m mVar = ig2.m.f372926a;
        long j17 = this.f435624c;
        ig2.r f17 = mVar.f(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachPerformView feedId: ");
        sb6.append(j17);
        sb6.append(" director: ");
        sb6.append(f17);
        sb6.append(" isDetach: ");
        sb6.append(f17 != null ? java.lang.Boolean.valueOf(f17.i()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", sb6.toString());
        if ((f17 == null || f17.i()) ? false : true) {
            f17.h();
        }
        super.a(context, view2, parent, performer);
    }

    @Override // ug5.i
    public android.view.View b(android.content.Context context, android.widget.FrameLayout parent, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614(context);
        android.view.SurfaceView a17 = c10850xc00cf614.a(false);
        a17.getHolder().setFormat(-3);
        a17.setZOrderOnTop(true);
        java.lang.Object obj = this.f435623b.get("key_enter_bitmap");
        android.graphics.Bitmap bitmap = obj instanceof android.graphics.Bitmap ? (android.graphics.Bitmap) obj : null;
        if (bitmap != null) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            this.f435622a = imageView;
            c10850xc00cf614.addView(imageView, -1, -1);
        }
        return c10850xc00cf614;
    }
}
