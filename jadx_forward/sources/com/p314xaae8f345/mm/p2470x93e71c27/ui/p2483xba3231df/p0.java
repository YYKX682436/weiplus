package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public class p0 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.o0 {
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.o0, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e5e;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.o0, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w data, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.h(holder, data, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.tab);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.d0v);
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/otherway/OpenWayLineItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayOpenWayInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/pluginsdk/ui/otherway/OpenWayLineItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayOpenWayInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z18 = data.f272557q;
        if (z18 && data.f272558r) {
            p17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cxh);
            return;
        }
        if (z18) {
            p17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cxk);
            return;
        }
        if (!data.f272558r) {
            p17.setBackgroundColor(holder.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            return;
        }
        p17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cxi);
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/otherway/OpenWayLineItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayOpenWayInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/pluginsdk/ui/otherway/OpenWayLineItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayOpenWayInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
