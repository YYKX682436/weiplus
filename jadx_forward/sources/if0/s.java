package if0;

/* loaded from: classes9.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f372573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zs4 f372574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ if0.w f372575f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.view.View view, r45.zs4 zs4Var, if0.w wVar) {
        super(0);
        this.f372573d = view;
        this.f372574e = zs4Var;
        this.f372575f = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f372573d;
        if (view != null) {
            boolean z17 = this.f372574e.f473891p;
            if0.w wVar = this.f372575f;
            if (z17) {
                view.setBackgroundColor(view.getContext().getResources().getColor(((java.lang.Number) ((jz5.n) wVar.f372587e).mo141623x754a37bb()).intValue()));
            } else {
                view.setBackgroundColor(view.getContext().getResources().getColor(((java.lang.Number) ((jz5.n) wVar.f372586d).mo141623x754a37bb()).intValue()));
            }
        }
        return jz5.f0.f384359a;
    }
}
