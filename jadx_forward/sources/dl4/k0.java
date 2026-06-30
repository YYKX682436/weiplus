package dl4;

/* loaded from: classes3.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.z f316958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f316960f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ff0.z zVar, android.view.View view, dl4.m0 m0Var) {
        super(0);
        this.f316958d = zVar;
        this.f316959e = view;
        this.f316960f = m0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f316959e;
        ff0.z zVar = this.f316958d;
        if (zVar != null) {
            boolean C = com.p314xaae8f345.mm.ui.bk.C();
            int i17 = zVar.f343129b;
            if (C) {
                if (view != null) {
                    view.setBackgroundColor(e3.b.c(i17, -16777216, 0.5f));
                }
            } else if (view != null) {
                view.setBackgroundColor(i17);
            }
        } else if (view != null) {
            this.f316960f.getClass();
            view.setBackgroundColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a8u);
        }
        return jz5.f0.f384359a;
    }
}
