package pg2;

/* loaded from: classes3.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c50.e1 f435636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.v f435637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f435638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f435639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c50.e1 e1Var, ug5.v vVar, yz5.a aVar, long j17) {
        super(0);
        this.f435636d = e1Var;
        this.f435637e = vVar;
        this.f435638f = aVar;
        this.f435639g = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "handlePlayerInPlaying==frameShow");
        c50.e1 e1Var = this.f435636d;
        if ((e1Var != null ? e1Var.f120133d : -1) != -1) {
            ug5.v vVar = this.f435637e;
            ug5.g gVar = vVar.f509191a;
            android.view.Window window = gVar.f509122c;
            if (window == null) {
                window = gVar.f509121b;
            }
            if (window != null) {
                android.view.View view = new android.view.View(window.getContext());
                view.setBackgroundColor(e1Var != null ? e1Var.f120133d : 0);
                android.view.View decorView = window.getDecorView();
                android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
                if (frameLayout != null) {
                    frameLayout.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
                }
                vVar.f509194d = view;
            }
        }
        yz5.a aVar = this.f435638f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.i(this.f435639g);
        }
        return jz5.f0.f384359a;
    }
}
