package k1;

/* loaded from: classes14.dex */
public final class b implements k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f384695a;

    public b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f384695a = view;
    }

    public void a(int i17) {
        boolean z17 = i17 == 0;
        android.view.View view = this.f384695a;
        if (z17) {
            view.performHapticFeedback(0);
            return;
        }
        if (i17 == 9) {
            view.performHapticFeedback(9);
        }
    }
}
