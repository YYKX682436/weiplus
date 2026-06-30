package ox3;

/* loaded from: classes10.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f431257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.view.View view, ox3.f0 f0Var) {
        super(0);
        this.f431256d = view;
        this.f431257e = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f431256d;
        if (view != null) {
            this.f431257e.f431279m.add(view);
        }
        return jz5.f0.f384359a;
    }
}
