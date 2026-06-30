package ep1;

/* loaded from: classes14.dex */
public final class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f337156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ep1.k f337157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f337158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f337159h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qn5.a f337160i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pv.y f337161m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fp1.b f337162n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f337163o;

    public g(android.view.View view, android.graphics.Point point, ep1.k kVar, android.graphics.Point point2, boolean z17, qn5.a aVar, pv.y yVar, fp1.b bVar, int i17) {
        this.f337155d = view;
        this.f337156e = point;
        this.f337157f = kVar;
        this.f337158g = point2;
        this.f337159h = z17;
        this.f337160i = aVar;
        this.f337161m = yVar;
        this.f337162n = bVar;
        this.f337163o = i17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f337155d;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.graphics.Point point = this.f337158g;
        ep1.k kVar = this.f337157f;
        android.graphics.Point point2 = this.f337156e;
        if (point2 == null) {
            point2 = kVar.g(view, point, this.f337159h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation contentView.width: %s, floatBallPosition: %s", java.lang.Integer.valueOf(view.getWidth()), point2);
        if (point2 == null || point2.x == -1 || point2.y == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation floatBallPosition invalid");
            kVar.j(this.f337160i);
            return;
        }
        pv.y yVar = this.f337161m;
        yVar.f440042f = point2;
        yVar.f440041e = point;
        fp1.b bVar = this.f337162n;
        yVar.f440048l = bVar != null ? bVar.a() : false;
        if (bVar != null) {
            fp1.a aVar = (fp1.a) bVar;
            aVar.getClass();
            if (aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fg) {
                android.view.View view2 = this.f337155d;
                view2.post(new ep1.e(this.f337157f, this.f337163o, view2, this.f337161m, this.f337160i));
                return;
            }
        }
        pm0.v.X(new ep1.f(this.f337157f, this.f337163o, this.f337155d, this.f337161m, this.f337160i));
    }
}
