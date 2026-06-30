package a0;

/* loaded from: classes7.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f81649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.view.View view) {
        super(0);
        this.f81649d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        android.view.ViewParent parent = this.f81649d.getParent();
        while (parent != null && (parent instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                z17 = true;
                break;
            }
            parent = viewGroup.getParent();
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
