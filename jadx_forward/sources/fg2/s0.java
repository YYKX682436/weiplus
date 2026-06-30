package fg2;

/* loaded from: classes3.dex */
public final class s0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f343826a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f343827b;

    public s0(android.widget.TextView textView, android.widget.TextView textView2) {
        this.f343826a = textView;
        this.f343827b = textView2;
    }

    public static fg2.s0 a(android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        return new fg2.s0(textView, textView);
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343826a;
    }
}
