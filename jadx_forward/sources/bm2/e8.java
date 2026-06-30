package bm2;

/* loaded from: classes3.dex */
public final class e8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.h8 f103405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.b8 f103407f;

    public e8(bm2.h8 h8Var, int i17, bm2.b8 b8Var) {
        this.f103405d = h8Var;
        this.f103406e = i17;
        this.f103407f = b8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindBottomViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.h8 h8Var = this.f103405d;
        if (h8Var.f103488h) {
            int i17 = this.f103406e;
            r45.of1 of1Var = i17 >= 0 && i17 < h8Var.mo1894x7e414b06() ? (r45.of1) h8Var.f103486f.get(i17) : null;
            yz5.l lVar = h8Var.f103484d;
            if (lVar != null) {
                if (of1Var == null) {
                    of1Var = new r45.of1();
                    of1Var.set(2, 10001);
                }
                lVar.mo146xb9724478(of1Var);
            }
        } else {
            db5.t7.f(this.f103407f.f3639x46306858.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eia), bm2.d8.f103382a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindBottomViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
