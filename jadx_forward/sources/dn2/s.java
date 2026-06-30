package dn2;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.uj1 f323508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2.v f323509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hi1 f323510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323511g;

    public s(r45.uj1 uj1Var, dn2.v vVar, r45.hi1 hi1Var, android.view.View view) {
        this.f323508d = uj1Var;
        this.f323509e = vVar;
        this.f323510f = hi1Var;
        this.f323511g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveGamePromoteBulletItem$getView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) this.f323508d.m75936x14adae67(4);
        if (c19786x6a1e2862 != null) {
            r45.hi1 hi1Var = this.f323510f;
            java.lang.String m75945x2fec8307 = hi1Var.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hi1Var.m75934xbce7f2f(5);
            dn2.v vVar = this.f323509e;
            vVar.g(2, 2, m75945x2fec8307, m75934xbce7f2f);
            android.content.Context context = this.f323511g.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String m75945x2fec83072 = hi1Var.m75945x2fec8307(6);
            dn2.v.e(vVar, context, c19786x6a1e2862, m75945x2fec83072 != null ? m75945x2fec83072 : "", "FinderLiveAppMsgGameAllPlayingInfo");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveGamePromoteBulletItem$getView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
