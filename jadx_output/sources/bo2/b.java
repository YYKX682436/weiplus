package bo2;

/* loaded from: classes2.dex */
public final class b extends yn2.r {
    @Override // yn2.r
    public java.lang.String n() {
        return "Finder.MegaVideo.SeeLaterDetailConvert";
    }

    @Override // yn2.r
    public void p(in5.s0 holder, zn2.c cVar, int i17) {
        bo2.c item = (bo2.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.p(holder, item, i17);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ct7);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailConvert", "setRecommendInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailConvert", "setRecommendInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.m3v);
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailConvert", "setRecommendInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailConvert", "setRecommendInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yn2.r
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, bo2.c item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) holder.p(com.tencent.mm.R.id.f483970cl4);
        android.view.ViewGroup.LayoutParams layoutParams = holder.p(com.tencent.mm.R.id.qh9).getLayoutParams();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
        if (i17 < 0 || i17 != holder.f293122f.getItemCount() - 1) {
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.f10887e = mMRoundCornerImageView.getId();
        } else {
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.f10885d = mMRoundCornerImageView.getId();
        }
    }
}
