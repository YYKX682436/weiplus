package rn2;

/* loaded from: classes3.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.w2 f479432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.b f479433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f479434f;

    public v2(rn2.w2 w2Var, rn2.b bVar, int i17) {
        this.f479432d = w2Var;
        this.f479433e = bVar;
        this.f479434f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f479432d.f479441e;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f479433e, java.lang.Integer.valueOf(this.f479434f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryPrizeSourceAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
