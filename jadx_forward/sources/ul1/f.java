package ul1;

/* loaded from: classes7.dex */
public class f implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul1.e f510110d;

    public f(ul1.e eVar) {
        this.f510110d = eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        ul1.e eVar = this.f510110d;
        if (view == eVar.f510104b) {
            eVar.f510104b = null;
        }
    }
}
