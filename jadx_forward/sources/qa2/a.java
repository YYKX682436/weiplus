package qa2;

/* loaded from: classes2.dex */
public final class a extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f442566e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f442567f;

    public a(java.util.List dataList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f442566e = dataList;
        this.f442567f = z17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_o;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ra2.b item = (ra2.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ogz);
        textView.setTextSize(1, 12.0f);
        textView.setText(item.f475017d.m75945x2fec8307(0));
        boolean z18 = i17 == item.f475018e.f475016a;
        boolean z19 = this.f442567f;
        android.content.Context context = holder.f374654e;
        textView.setTextColor(z18 ? !z19 ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832) : context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560513mj) : !z19 ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833) : context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560518mo));
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ogy);
        int i19 = i17 == this.f442566e.size() - 1 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/topic/convert/FinderTopicInnerTabItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/topic/data/FinderTopicInnerTabData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/topic/convert/FinderTopicInnerTabItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/activity/topic/data/FinderTopicInnerTabData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
