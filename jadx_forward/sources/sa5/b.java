package sa5;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f486853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f486854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f486855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f486856g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f486857h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f486858i;

    public b(float f17, android.view.View view, long j17, int i17, long j18, yz5.a aVar) {
        this.f486853d = f17;
        this.f486854e = view;
        this.f486855f = j17;
        this.f486856g = i17;
        this.f486857h = j18;
        this.f486858i = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sa5.o oVar = new sa5.o(java.lang.Float.valueOf(this.f486853d), null);
        android.view.View view = this.f486854e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        oVar.f486884d = view;
        int i17 = this.f486856g;
        android.view.View view2 = this.f486854e;
        float f17 = this.f486853d;
        long j17 = this.f486855f;
        oVar.b(new sa5.a(i17, view2, f17, j17, this.f486857h, this.f486858i), j17);
    }
}
