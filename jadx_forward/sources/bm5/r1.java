package bm5;

/* loaded from: classes3.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f104263a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f104264b;

    /* renamed from: c, reason: collision with root package name */
    public int f104265c;

    public r1(android.app.Activity activity, yz5.l keyboardCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyboardCallback, "keyboardCallback");
        this.f104263a = activity;
        android.view.View decorView = activity.getWindow().getDecorView();
        bm5.q1 q1Var = new bm5.q1(decorView, this, keyboardCallback);
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(q1Var);
        this.f104264b = q1Var;
    }
}
