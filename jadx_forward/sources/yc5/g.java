package yc5;

/* loaded from: classes5.dex */
public final class g implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f542439a;

    public g(int i17) {
        this.f542439a = i17;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        e3.d a17 = insets.a(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInsets(...)");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f542439a + a17.f328580d);
        return n3.g3.f415870b;
    }
}
