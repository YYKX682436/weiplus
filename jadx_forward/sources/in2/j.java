package in2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f374380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f374381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(in2.s sVar, boolean z17, android.view.View view) {
        super(0);
        this.f374380d = sVar;
        this.f374381e = z17;
        this.f374382f = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in2.s sVar = this.f374380d;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = ((mm2.m6) sVar.H.a(mm2.m6.class)).f410778m;
        boolean z17 = !this.f374381e;
        j0Var.mo7808x76db6cb1(java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = sVar.P;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
        }
        sVar.I.q7(z17);
        android.view.View view = this.f374382f;
        db5.t7.g(view.getContext(), view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ef9));
        return jz5.f0.f384359a;
    }
}
