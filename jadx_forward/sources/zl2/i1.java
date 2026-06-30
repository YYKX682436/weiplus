package zl2;

/* loaded from: classes3.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f555348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f555349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f555351g;

    public i1(gk2.e eVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context, yz5.a aVar) {
        this.f555348d = eVar;
        this.f555349e = k0Var;
        this.f555350f = context;
        this.f555351g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gk2.e eVar = this.f555348d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.c1) eVar.a(mm2.c1.class)).F1;
        if (c19786x6a1e2862 != null) {
            android.content.Context context = this.f555350f;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.ta.g(ya2.e1.f542005a, context, c19786x6a1e2862, new zl2.h1(eVar, context, this.f555351g), null, false, 24, null);
        }
        this.f555349e.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkIfRoleMysterious$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
