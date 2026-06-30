package ga2;

/* loaded from: classes2.dex */
public final class e extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f351365e = java.util.regex.Pattern.compile("<_wc_custom_link_>(.*?)</_wc_custom_link_>");

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ed6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ha2.a item = (ha2.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.ad1 ad1Var = (r45.ad1) item.f361324d.m75936x14adae67(6);
        if (ad1Var == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        android.content.Context context = holder.f374654e;
        layoutParams.width = com.p314xaae8f345.mm.ui.bh.a(context).f278668a;
        holder.f3639x46306858.setLayoutParams(layoutParams);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.s0t);
        i95.m c17 = i95.n0.c(zy2.s6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.s6 s6Var = (zy2.s6) c17;
        java.lang.String m75945x2fec8307 = ad1Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        textView.setText(zy2.s6.l6(s6Var, m75945x2fec8307, (int) textView.getTextSize(), false, f351365e, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c), false, null, 100, null));
        int i19 = ad1Var.m75939xb282bd08(1) != 0 ? 0 : 8;
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f3x);
        if (p17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/convert/FinderPoiLbsUploadGuideConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/poi/data/FinderPoiLbsItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/activity/poi/convert/FinderPoiLbsUploadGuideConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/poi/data/FinderPoiLbsItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
