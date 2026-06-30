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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.p(holder, item, i17);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ct7);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailConvert", "setRecommendInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailConvert", "setRecommendInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.m3v);
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailConvert", "setRecommendInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailConvert", "setRecommendInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/megavideo/topstory/seelaterflow/SeeLaterDetailFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yn2.r
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, bo2.c item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) holder.p(com.p314xaae8f345.mm.R.id.f565503cl4);
        android.view.ViewGroup.LayoutParams layoutParams = holder.p(com.p314xaae8f345.mm.R.id.qh9).getLayoutParams();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
        if (i17 < 0 || i17 != holder.f374655f.mo1894x7e414b06() - 1) {
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.f92420e = c22628xfde5d61d.getId();
        } else {
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.f92418d = c22628xfde5d61d.getId();
        }
    }
}
