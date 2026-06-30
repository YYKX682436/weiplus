package k23;

/* loaded from: classes12.dex */
public final class f2 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f385104e;

    public f2(k23.j2 j2Var, android.view.View view) {
        this.f385103d = j2Var;
        this.f385104e = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        k23.j2 j2Var = this.f385103d;
        j2Var.o();
        this.f385104e.removeOnLayoutChangeListener(this);
        j2Var.D = null;
    }
}
