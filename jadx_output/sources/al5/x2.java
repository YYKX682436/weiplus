package al5;

/* loaded from: classes8.dex */
public final class x2 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f6086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f6087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout f6088f;

    public x2(android.view.View view, kotlin.jvm.internal.f0 f0Var, com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout) {
        this.f6086d = view;
        this.f6087e = f0Var;
        this.f6088f = edgeToEdgeWrapperLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.view.View view2 = this.f6086d;
        int visibility = view2.getVisibility();
        kotlin.jvm.internal.f0 f0Var = this.f6087e;
        if (visibility != f0Var.f310116d) {
            view2.getClass();
            f0Var.f310116d = visibility;
            this.f6088f.L();
        }
    }
}
