package el2;

/* loaded from: classes3.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f335412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f335413f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f335414g;

    public o0(el2.i1 i1Var, r45.kv1 kv1Var, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f335411d = i1Var;
        this.f335412e = kv1Var;
        this.f335413f = z17;
        this.f335414g = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$checkAndShowGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        el2.i1 i1Var = this.f335411d;
        i1Var.f335354p = true;
        android.view.ViewGroup viewGroup = i1Var.f335345d;
        viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.0f), i1Var.f335357s);
        r45.kv1 kv1Var = this.f335412e;
        el2.i1.l(i1Var, kv1Var, 1, this.f335413f);
        el2.i1.m(i1Var);
        this.f335414g.u();
        java.lang.String m75945x2fec8307 = kv1Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        i1Var.p(25, m75945x2fec8307, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$checkAndShowGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
