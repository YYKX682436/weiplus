package bm2;

/* loaded from: classes.dex */
public final class y4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.b5 f103981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f103982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f103983f;

    public y4(bm2.b5 b5Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f103981d = b5Var;
        this.f103982e = linkedList;
        this.f103983f = linkedList2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberViewHolder$addGiftItem$2$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.b5 b5Var = this.f103981d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15351x41e69e8c c15351x41e69e8c = b5Var.f103330h;
        ((android.widget.TextView) c15351x41e69e8c.getChildAt(c15351x41e69e8c.getChildCount() - 1).findViewById(com.p314xaae8f345.mm.R.id.fkg)).setText("x" + ((r45.mt3) this.f103982e.get(0)).m75939xb282bd08(1));
        java.util.Iterator it = this.f103983f.iterator();
        while (it.hasNext()) {
            b5Var.f103330h.addView((android.view.View) it.next());
        }
        b5Var.f103330h.setOnClickListener(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberViewHolder$addGiftItem$2$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
