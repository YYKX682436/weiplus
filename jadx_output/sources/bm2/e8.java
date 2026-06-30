package bm2;

/* loaded from: classes3.dex */
public final class e8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.h8 f21872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.b8 f21874f;

    public e8(bm2.h8 h8Var, int i17, bm2.b8 b8Var) {
        this.f21872d = h8Var;
        this.f21873e = i17;
        this.f21874f = b8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindBottomViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.h8 h8Var = this.f21872d;
        if (h8Var.f21955h) {
            int i17 = this.f21873e;
            r45.of1 of1Var = i17 >= 0 && i17 < h8Var.getItemCount() ? (r45.of1) h8Var.f21953f.get(i17) : null;
            yz5.l lVar = h8Var.f21951d;
            if (lVar != null) {
                if (of1Var == null) {
                    of1Var = new r45.of1();
                    of1Var.set(2, 10001);
                }
                lVar.invoke(of1Var);
            }
        } else {
            db5.t7.f(this.f21874f.itemView.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eia), bm2.d8.f21849a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorRoleAdapter$bindBottomViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
