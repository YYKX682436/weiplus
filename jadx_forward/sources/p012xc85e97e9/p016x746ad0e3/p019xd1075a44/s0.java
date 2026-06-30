package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class s0 extends d3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f91230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 f91231b;

    public s0(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var, java.lang.ref.WeakReference weakReference) {
        this.f91231b = t0Var;
        this.f91230a = weakReference;
    }

    @Override // d3.p
    public void c(int i17) {
    }

    @Override // d3.p
    public void d(android.graphics.Typeface typeface) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f91231b;
        if (t0Var.f91245k) {
            t0Var.f91244j = typeface;
            android.widget.TextView textView = (android.widget.TextView) this.f91230a.get();
            if (textView != null) {
                textView.setTypeface(typeface, t0Var.f91243i);
            }
        }
    }
}
