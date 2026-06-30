package al5;

/* loaded from: classes8.dex */
public final class x2 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f87619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f87620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 f87621f;

    public x2(android.view.View view, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 c22602x8bae1c88) {
        this.f87619d = view;
        this.f87620e = f0Var;
        this.f87621f = c22602x8bae1c88;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.view.View view2 = this.f87619d;
        int visibility = view2.getVisibility();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f87620e;
        if (visibility != f0Var.f391649d) {
            view2.getClass();
            f0Var.f391649d = visibility;
            this.f87621f.L();
        }
    }
}
