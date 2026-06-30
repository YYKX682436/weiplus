package el2;

/* loaded from: classes3.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f335401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f335403f;

    public n0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, el2.i1 i1Var, r45.kv1 kv1Var) {
        this.f335401d = k0Var;
        this.f335402e = i1Var;
        this.f335403f = kv1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$checkAndShowGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f335401d.u();
        el2.i1 i1Var = this.f335402e;
        android.view.ViewGroup viewGroup = i1Var.f335345d;
        viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.0f), 0L);
        java.lang.String m75945x2fec8307 = this.f335403f.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        i1Var.p(24, m75945x2fec8307, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$checkAndShowGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
