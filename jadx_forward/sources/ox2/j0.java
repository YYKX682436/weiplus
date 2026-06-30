package ox2;

/* loaded from: classes.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.view.View view) {
        super(0);
        this.f431210d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f431210d;
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(view);
        return jz5.f0.f384359a;
    }
}
