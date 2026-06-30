package pg2;

/* loaded from: classes3.dex */
public final class h0 implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewGroup f435643a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f435644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f435645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f435646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws5.f f435647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f435648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435649g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f435650h;

    public h0(boolean z17, boolean z18, ws5.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.View view, long j17) {
        this.f435645c = z17;
        this.f435646d = z18;
        this.f435647e = fVar;
        this.f435648f = h0Var;
        this.f435649g = view;
        this.f435650h = j17;
    }

    @Override // ug5.i
    public void a(android.content.Context context, android.view.View view, android.widget.FrameLayout parent, ug5.v performer) {
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1 view2 = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1) view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        android.view.ViewGroup viewGroup = this.f435643a;
        if (viewGroup != null) {
            viewGroup.removeView(this.f435644b);
        }
        ig2.m mVar = ig2.m.f372926a;
        long j17 = this.f435650h;
        ig2.r f17 = mVar.f(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerLiveEnterAnim onDetachPerformView feedId: ");
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
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1 c10851x9baaeea1 = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1(context);
        boolean z17 = this.f435645c;
        boolean z18 = this.f435646d;
        android.view.View view = this.f435649g;
        if (z17 && z18) {
            ws5.f fVar = this.f435647e;
            android.view.View H = fVar.H();
            android.view.ViewParent parent2 = H.getParent();
            android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup != null) {
                this.f435643a = viewGroup;
                viewGroup.removeView(H);
                android.widget.ImageView imageView = new android.widget.ImageView(context);
                imageView.setImageBitmap(ug5.x.b(H));
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                this.f435644b = imageView;
                viewGroup.addView(imageView, -1, -1);
            }
            c10851x9baaeea1.removeAllViews();
            c10851x9baaeea1.addView(H, -1, -1);
            fVar.h((android.graphics.Rect) this.f435648f.f391656d);
            performer.f("key_enter_voice_mode", java.lang.Boolean.TRUE);
            performer.f("key_enter_bitmap", ug5.x.b(view));
        } else if (z18) {
            c10851x9baaeea1.a();
        } else {
            android.graphics.Bitmap b17 = ug5.x.b(view);
            c10851x9baaeea1.m46541x65d825e6(b17);
            performer.f("key_enter_bitmap", b17);
        }
        return c10851x9baaeea1;
    }
}
