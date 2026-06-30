package vc5;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f516882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941 f516883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad5.l0[] f516884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f516885g;

    public x(android.view.View view, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941 c21820xe15c1941, ad5.l0[] l0VarArr, yz5.l lVar) {
        this.f516882d = view;
        this.f516883e = c21820xe15c1941;
        this.f516884f = l0VarArr;
        this.f516885g = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f516882d.removeOnAttachStateChangeListener(this);
        ad5.l0[] l0VarArr = this.f516884f;
        this.f516883e.b((ad5.l0[]) java.util.Arrays.copyOf(l0VarArr, l0VarArr.length), this.f516885g);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
