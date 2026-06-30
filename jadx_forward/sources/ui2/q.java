package ui2;

/* loaded from: classes8.dex */
public final class q extends ti2.i {

    /* renamed from: e, reason: collision with root package name */
    public final si2.a f509641e;

    public q(gk2.e eVar, si2.a aVar) {
        this.f509641e = aVar;
    }

    @Override // ti2.i, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570378am5;
    }

    @Override // ti2.i, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, vi2.e item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        vi2.b bVar = item instanceof vi2.b ? (vi2.b) item : null;
        if (bVar == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f93474i = true;
        }
        android.view.View view = holder.f3639x46306858;
        view.setBackgroundColor(b3.l.m9702x7444d5ad(view.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        holder.f3639x46306858.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f6n);
        if (findViewById != null) {
            if (bVar.f519070g) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.im7);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f563876bx);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a3k);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a3l);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            if (bVar.f519073m) {
                textView.setText(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmw));
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
            } else if (bVar.f519074n) {
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else {
                textView.setText(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmv));
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
            }
        }
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new ui2.p(bVar, this, i17));
        }
    }
}
