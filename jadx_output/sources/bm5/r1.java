package bm5;

/* loaded from: classes3.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f22730a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f22731b;

    /* renamed from: c, reason: collision with root package name */
    public int f22732c;

    public r1(android.app.Activity activity, yz5.l keyboardCallback) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(keyboardCallback, "keyboardCallback");
        this.f22730a = activity;
        android.view.View decorView = activity.getWindow().getDecorView();
        bm5.q1 q1Var = new bm5.q1(decorView, this, keyboardCallback);
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(q1Var);
        this.f22731b = q1Var;
    }
}
