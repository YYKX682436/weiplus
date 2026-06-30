package vm2;

/* loaded from: classes.dex */
public final class y extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f519664d;

    /* renamed from: e, reason: collision with root package name */
    public int f519665e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f519666f = new java.util.LinkedList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f519666f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        vm2.w holder = (vm2.w) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f519666f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.f62 f62Var = (r45.f62) obj;
        android.widget.TextView textView = holder.f519658e;
        com.p314xaae8f345.mm.ui.bk.q0(textView.getPaint());
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566364ro2);
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566365ro3);
        int i18 = i17 == 0 ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i19 = i17 == mo1894x7e414b06() - 1 ? 4 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f3639x46306858.setOnClickListener(new vm2.x(this, i17));
        ((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ro8)).setText(java.lang.String.valueOf(i17));
        boolean z17 = i17 == this.f519665e;
        android.widget.TextView textView2 = holder.f519659f;
        if (z17) {
            android.view.View view = holder.f519657d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder", "selected", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder", "selected", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
        } else {
            android.view.View view2 = holder.f519657d;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder", "selected", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder", "selected", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            textView.setAlpha(0.3f);
            textView2.setAlpha(0.3f);
        }
        if (zl2.r4.f555483a.u1(f62Var)) {
            android.view.View view3 = holder.f519661h;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = holder.f519660g;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpd));
            textView2.setVisibility(8);
            return;
        }
        android.view.View view5 = holder.f519661h;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view5, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = holder.f519660g;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskTimeAdapter$TaskTimeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setText(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpc));
        textView2.setVisibility(0);
        textView2.setText(android.text.format.DateFormat.format(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpg), f62Var.m75942xfb822ef2(2) * 1000));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dti, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new vm2.w(inflate);
    }
}
