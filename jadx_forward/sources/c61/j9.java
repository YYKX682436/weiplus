package c61;

/* loaded from: classes3.dex */
public final class j9 implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f120601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f120602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f120603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f120604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f120605e;

    public j9(boolean z17, zy2.g5 g5Var, int i17, int i18, long j17) {
        this.f120601a = z17;
        this.f120602b = g5Var;
        this.f120603c = i17;
        this.f120604d = i18;
        this.f120605e = j17;
    }

    @Override // ug5.i
    public void a(android.content.Context context, android.view.View view, android.widget.FrameLayout parent, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "onDetachPerformView feedId: ".concat(pm0.v.u(this.f120605e)));
        super.a(context, view, parent, performer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ug5.i
    public android.view.View b(android.content.Context context, android.widget.FrameLayout parent, ug5.v performer) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56 c18687x1c450e56;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        boolean z17 = this.f120601a;
        int i17 = this.f120604d;
        int i18 = this.f120603c;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768 c18686x59ce5768 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768(context);
            c18686x59ce5768.a(i18, i17);
            c18686x59ce5768.setZOrderOnTop(true);
            c18686x59ce5768.setBackgroundColor(-16777216);
            c18687x1c450e56 = c18686x59ce5768;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56 c18687x1c450e562 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56(context);
            c18687x1c450e562.a(i18, i17);
            c18687x1c450e56 = c18687x1c450e562;
        }
        c18687x1c450e56.mo71930xbeb0f48a(this.f120602b.toString());
        return c18687x1c450e56;
    }
}
