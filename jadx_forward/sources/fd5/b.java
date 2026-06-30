package fd5;

/* loaded from: classes10.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f342871n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f342872o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, boolean z17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super(context);
        this.f342871n = z17;
        this.f342872o = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void d() {
        super.d();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        return 25.0f / displayMetrics.densityDpi;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int l(int i17) {
        if (!this.f342871n) {
            return 50;
        }
        android.view.ViewParent viewParent = this.f342872o;
        return (viewParent instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3 ? ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3) viewParent).getF272975e2() : 0) > 0 ? 110 : 50;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int n() {
        int n17 = super.n();
        if (this.f342871n) {
            return 1;
        }
        return n17;
    }
}
