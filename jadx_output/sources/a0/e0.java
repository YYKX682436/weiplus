package a0;

/* loaded from: classes7.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.view.View view) {
        super(0);
        this.f116d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        android.view.ViewParent parent = this.f116d.getParent();
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
