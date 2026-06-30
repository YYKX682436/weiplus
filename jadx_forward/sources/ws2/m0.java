package ws2;

/* loaded from: classes3.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f530629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws2.p0 f530630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f530631f;

    public m0(android.view.ViewGroup viewGroup, ws2.p0 p0Var, int i17) {
        this.f530629d = viewGroup;
        this.f530630e = p0Var;
        this.f530631f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f530629d;
        int measuredHeight = viewGroup.getMeasuredHeight();
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        int i17 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        at2.b bVar = (at2.b) this.f530630e.f530650a.mo57682x2a5e9229(at2.b.class);
        if (bVar != null) {
            bVar.t1(this.f530631f + i17 + i65.a.b(viewGroup.getContext(), 12));
        }
    }
}
