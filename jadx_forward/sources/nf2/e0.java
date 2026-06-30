package nf2;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.g0 f418241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f418242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f418243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f418244g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f418245h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f418246i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f418247m;

    public e0(nf2.g0 g0Var, android.view.ViewGroup viewGroup, float f17, float f18, android.view.View view, boolean z17, yz5.a aVar) {
        this.f418241d = g0Var;
        this.f418242e = viewGroup;
        this.f418243f = f17;
        this.f418244g = f18;
        this.f418245h = view;
        this.f418246i = z17;
        this.f418247m = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        nf2.g0 g0Var = this.f418241d;
        if (g0Var.f418275d <= 0 || g0Var.f418276e <= 0) {
            android.view.ViewGroup viewGroup = this.f418242e;
            g0Var.f418275d = viewGroup.getWidth();
            g0Var.f418276e = viewGroup.getHeight();
            g0Var.d();
        }
        int i18 = g0Var.f418275d;
        if (i18 <= 0 || (i17 = g0Var.f418276e) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveLyricsPositionManager", "setPosition failed: container size still 0");
            return;
        }
        float f17 = this.f418243f;
        float f18 = this.f418244g;
        android.view.View view = this.f418245h;
        float width = (i18 * f17) - (view.getWidth() / 2.0f);
        float height = (i17 * f18) - (view.getHeight() / 2.0f);
        if (this.f418246i) {
            jz5.l a17 = g0Var.a(width, height);
            view.setX(((java.lang.Number) a17.f384366d).floatValue());
            view.setY(((java.lang.Number) a17.f384367e).floatValue());
        } else {
            view.setX(width);
            view.setY(height);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsPositionManager", "setPosition: (" + f17 + ", " + f18 + ") -> view.pos=(" + view.getX() + ", " + view.getY() + ')');
        yz5.a aVar = this.f418247m;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
