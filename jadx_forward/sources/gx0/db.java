package gx0;

/* loaded from: classes5.dex */
public final class db implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f357862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f357863e;

    public db(gx0.ac acVar, ex0.a0 a0Var) {
        this.f357862d = acVar;
        this.f357863e = a0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        gx0.ac acVar = this.f357862d;
        acVar.A7().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        gx0.ac.f8(acVar, this.f357863e, null, 2, null);
    }
}
