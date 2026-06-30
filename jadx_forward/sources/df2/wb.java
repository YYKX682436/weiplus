package df2;

/* loaded from: classes10.dex */
public final class wb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f313207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.zb f313209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f313210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313211h;

    public wb(int i17, int i18, df2.zb zbVar, boolean z17, yz5.a aVar) {
        this.f313207d = i17;
        this.f313208e = i18;
        this.f313209f = zbVar;
        this.f313210g = z17;
        this.f313211h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(this.f313207d, this.f313208e);
        ofInt.setDuration(200L);
        df2.zb zbVar = this.f313209f;
        ofInt.addUpdateListener(new df2.rb(zbVar));
        ofInt.addListener(new df2.vb(this.f313210g, zbVar, this.f313211h));
        ofInt.start();
    }
}
