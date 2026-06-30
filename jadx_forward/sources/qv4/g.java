package qv4;

/* loaded from: classes12.dex */
public final class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f448505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qv4.j f448506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f448507f;

    public g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, qv4.j jVar, android.view.ViewGroup viewGroup) {
        this.f448505d = c1163xf1deaba4;
        this.f448506e = jVar;
        this.f448507f = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448505d;
        boolean z17 = c1163xf1deaba4.computeVerticalScrollRange() > c1163xf1deaba4.getHeight();
        qv4.j jVar = this.f448506e;
        boolean z18 = jVar.f().g().f482095c;
        android.view.ViewGroup viewGroup = this.f448507f;
        if (viewGroup != null) {
            viewGroup.setVisibility(z17 ? 8 : 0);
        }
        jVar.f().g().f482095c = z17;
        if (z18 != z17) {
            jVar.f().j();
        }
    }
}
