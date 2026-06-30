package bm2;

/* loaded from: classes.dex */
public final class y4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.b5 f22448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f22449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f22450f;

    public y4(bm2.b5 b5Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f22448d = b5Var;
        this.f22449e = linkedList;
        this.f22450f = linkedList2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberViewHolder$addGiftItem$2$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.b5 b5Var = this.f22448d;
        com.tencent.mm.plugin.finder.view.FinderTagFlowLayout finderTagFlowLayout = b5Var.f21797h;
        ((android.widget.TextView) finderTagFlowLayout.getChildAt(finderTagFlowLayout.getChildCount() - 1).findViewById(com.tencent.mm.R.id.fkg)).setText("x" + ((r45.mt3) this.f22449e.get(0)).getInteger(1));
        java.util.Iterator it = this.f22450f.iterator();
        while (it.hasNext()) {
            b5Var.f21797h.addView((android.view.View) it.next());
        }
        b5Var.f21797h.setOnClickListener(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberViewHolder$addGiftItem$2$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
