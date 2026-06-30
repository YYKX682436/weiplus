package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class qs extends in5.r {
    public static final boolean n(js2.b bVar) {
        return bVar.f383047n && !bVar.f383048o;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(android.view.View r13, js2.b r14, android.view.View r15, android.view.View r16, android.view.View r17, android.widget.TextView r18, android.widget.TextView r19) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qs.o(android.view.View, js2.b, android.view.View, android.view.View, android.view.View, android.widget.TextView, android.widget.TextView):void");
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b6b;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        js2.b item = (js2.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e_9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tbj);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tbg);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.nej);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.e_8);
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.d0v);
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.tbh);
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.tbi);
        if (i17 != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileAllHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/item/FinderProfileAllHeaderItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderProfileAllHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/item/FinderProfileAllHeaderItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileAllHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/item/FinderProfileAllHeaderItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderProfileAllHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/item/FinderProfileAllHeaderItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(item.f383041e);
        int i19 = item.f383043g;
        sb6.append(i19 > 0 ? holder.f374654e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ckp, java.lang.Integer.valueOf(i19)) : "");
        textView.setText(sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p18);
        dy1.a.i(p18, "profile_more");
        dy1.a.a(p18, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ns(holder, item));
        dy1.a.l(p18, 40, 25496);
        p18.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.os(item));
        textView2.setText(item.f383049p);
        java.lang.String str = item.f383050q;
        textView3.setText(str != null ? r26.i0.u(str, '\n', ' ', false, 4, null) : "");
        o(p18, item, p19, p28, p27, textView3, textView2);
        if (n(item)) {
            holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ps(item, holder, p18, p19, p28, p27, textView3, textView2));
        }
    }
}
