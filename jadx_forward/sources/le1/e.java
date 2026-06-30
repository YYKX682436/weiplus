package le1;

/* loaded from: classes7.dex */
public class e implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f399662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f399663b;

    public e(le1.f fVar, android.view.Window window, int i17) {
        this.f399662a = window;
        this.f399663b = i17;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0) {
            this.f399662a.getDecorView().setSystemUiVisibility(this.f399663b);
        }
    }
}
