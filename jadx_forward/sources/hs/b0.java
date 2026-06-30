package hs;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd0.g3 f366044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll5.a f366045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f366046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f366047g;

    public b0(kd0.g3 g3Var, ll5.a aVar, int i17, android.view.View.OnClickListener onClickListener) {
        this.f366044d = g3Var;
        this.f366045e = aVar;
        this.f366046f = i17;
        this.f366047g = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/MyQRCodeService$bindItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.E(this.f366044d, this.f366045e.f400803h, this.f366046f);
        android.view.View.OnClickListener onClickListener = this.f366047g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/feature/MyQRCodeService$bindItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
