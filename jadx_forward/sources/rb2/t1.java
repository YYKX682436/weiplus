package rb2;

/* loaded from: classes10.dex */
public final class t1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f475298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f475299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f475300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f475301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475303h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475304i;

    public t1(rb2.z2 z2Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3) {
        this.f475296a = z2Var;
        this.f475297b = s0Var;
        this.f475298c = j17;
        this.f475299d = j18;
        this.f475300e = j60Var;
        this.f475301f = viewGroup;
        this.f475302g = view;
        this.f475303h = view2;
        this.f475304i = view3;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imageLoader: result:");
        sb6.append(bitmap != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", sb6.toString());
        rb2.z2 z2Var = this.f475296a;
        in5.s0 s0Var = this.f475297b;
        long j17 = this.f475298c;
        long j18 = this.f475299d;
        r45.j60 j60Var = this.f475300e;
        android.view.ViewGroup loadLayout = this.f475301f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadLayout, "$loadLayout");
        android.view.View loadProgress = this.f475302g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadProgress, "$loadProgress");
        android.view.View loadFailIcon = this.f475303h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadFailIcon, "$loadFailIcon");
        android.view.View loadFailText = this.f475304i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadFailText, "$loadFailText");
        rb2.z2.B(z2Var, s0Var, j17, j18, j60Var, loadLayout, loadProgress, loadFailIcon, loadFailText, bitmap != null);
    }
}
