package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class s0 extends d3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f9697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.t0 f9698b;

    public s0(androidx.appcompat.widget.t0 t0Var, java.lang.ref.WeakReference weakReference) {
        this.f9698b = t0Var;
        this.f9697a = weakReference;
    }

    @Override // d3.p
    public void c(int i17) {
    }

    @Override // d3.p
    public void d(android.graphics.Typeface typeface) {
        androidx.appcompat.widget.t0 t0Var = this.f9698b;
        if (t0Var.f9712k) {
            t0Var.f9711j = typeface;
            android.widget.TextView textView = (android.widget.TextView) this.f9697a.get();
            if (textView != null) {
                textView.setTypeface(typeface, t0Var.f9710i);
            }
        }
    }
}
