package vm2;

/* loaded from: classes10.dex */
public final class m extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final vm2.f f519631e;

    public m(vm2.f callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f519631e = callback;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ec7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.TextView textView;
        android.view.View view;
        android.widget.ProgressBar progressBar;
        android.view.View view2;
        java.lang.String format;
        vm2.n item = (vm2.n) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View view3 = holder.f3639x46306858;
        int i19 = item.f519633e;
        view3.setPadding(i19, 0, i19, 0);
        holder.f3639x46306858.setOnClickListener(new vm2.l(this, item, i17));
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpo);
        dk2.rf rfVar = item.f519632d;
        if (textView2 != null) {
            textView2.setText(textView2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.owb, rfVar.f315581p));
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpm);
        if (textView3 != null) {
            textView3.setText(textView3.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.owa, java.lang.Integer.valueOf(rfVar.f315582q)));
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpk);
        boolean z18 = true;
        if (textView4 != null) {
            java.lang.String str = rfVar.f315583r;
            if (str == null || str.length() == 0) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
                textView4.setText(textView4.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ow_, rfVar.f315583r));
            }
        }
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpn);
        if (findViewById != null) {
            java.lang.String str2 = rfVar.f315583r;
            if (str2 != null && str2.length() != 0) {
                z18 = false;
            }
            if (z18) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpj);
        if (imageView != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.i().c(new mn2.n(rfVar.f315574f, null, 2, null), imageView, g1Var.h(mn2.f1.f411493n));
        }
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpl);
        android.view.View findViewById3 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpp);
        android.view.View findViewById4 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tph);
        android.widget.ProgressBar progressBar2 = (android.widget.ProgressBar) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpi);
        android.view.View findViewById5 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpf);
        android.widget.TextView textView5 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpg);
        android.widget.TextView textView6 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tpe);
        if (findViewById2 == null) {
            textView = textView5;
            view = findViewById5;
            progressBar = progressBar2;
            view2 = findViewById4;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            textView = textView5;
            view = findViewById5;
            progressBar = progressBar2;
            view2 = findViewById4;
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = view2;
        if (view4 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = view;
        if (view5 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        int i27 = rfVar.f315578m;
        if (i27 == 0) {
            if (findViewById2 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById3 == null) {
                return;
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById3, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i27 == 2) {
            if (findViewById2 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(findViewById2, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (view4 != null) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
                arrayList10.add(0);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ProgressBar progressBar3 = progressBar;
            if (progressBar3 == null) {
                return;
            }
            progressBar3.setProgress((int) rfVar.f315576h);
            return;
        }
        if (i27 != 3) {
            if (findViewById2 != null) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
                arrayList11.add(0);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(findViewById2, arrayList11.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (textView6 == null) {
                return;
            }
            textView6.setVisibility(0);
            return;
        }
        if (view5 != null) {
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal12 = zj0.c.f554818a;
            arrayList12.add(0);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view5, arrayList12.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView7 = textView;
        if (textView7 == null) {
            return;
        }
        long j17 = rfVar.f315575g * 1000;
        if (j17 < 0) {
            format = "00:00";
        } else if (j17 >= 59999000) {
            format = "999:59";
        } else {
            long j18 = j17 / 1000;
            long j19 = 60;
            format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) (j18 / j19)), java.lang.Integer.valueOf((int) (j18 % j19))}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        }
        textView7.setText(format);
    }
}
