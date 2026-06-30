package sc2;

/* loaded from: classes2.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487516g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.ViewGroup viewGroup3, android.view.View view) {
        super(0);
        this.f487513d = viewGroup;
        this.f487514e = viewGroup2;
        this.f487515f = viewGroup3;
        this.f487516g = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup = this.f487513d;
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
        this.f487514e.setVisibility(8);
        this.f487515f.animate().setDuration(250L).alpha(1.0f);
        android.view.View view = this.f487516g;
        if (view.getVisibility() == 0) {
            view.animate().setDuration(250L).alpha(1.0f);
        }
        return jz5.f0.f384359a;
    }
}
