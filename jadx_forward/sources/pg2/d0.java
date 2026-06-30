package pg2;

/* loaded from: classes3.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c50.e1 f435627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.v f435628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f435629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c50.e1 e1Var, ug5.v vVar, long j17) {
        super(0);
        this.f435627d = e1Var;
        this.f435628e = vVar;
        this.f435629f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        c50.e1 e1Var = this.f435627d;
        if ((e1Var != null ? e1Var.f120133d : -1) != -1) {
            ug5.v vVar = this.f435628e;
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
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.i(this.f435629f);
        }
        return jz5.f0.f384359a;
    }
}
