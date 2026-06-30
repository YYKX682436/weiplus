package a24;

/* loaded from: classes.dex */
public abstract class g extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ek8;
    }

    public java.lang.Integer n(in5.s0 holder, a24.i baseItem, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseItem, "baseItem");
        return null;
    }

    public boolean o() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(in5.s0 holder, xm3.a item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        a24.i j17 = ((c24.a) item).j();
        android.content.Context context = holder.f374654e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 abstractActivityC17508x8f0972f6 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6) context : null;
        if (o()) {
            j17.getClass();
            super.h(holder, item, i17, i18, z17, list);
            android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.gzf);
            java.lang.String str = abstractActivityC17508x8f0972f6 != null ? abstractActivityC17508x8f0972f6.f243372f : null;
            java.util.List list2 = abstractActivityC17508x8f0972f6 != null ? abstractActivityC17508x8f0972f6.f243373g : null;
            if (str != null) {
                if ((list2 != null && list2.contains(j17.a7())) && (!list2.isEmpty()) && list2.contains(j17.a7())) {
                    java.lang.String key = j17.a7();
                    abstractActivityC17508x8f0972f6.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                    java.util.List list3 = abstractActivityC17508x8f0972f6.f243373g;
                    if (list3 != null) {
                        list3.remove(key);
                    }
                    holder.f3639x46306858.post(new a24.e(holder, this));
                }
            }
            java.lang.Integer Y6 = j17.Y6();
            if (Y6 == null) {
                android.view.View itemView = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                com.p314xaae8f345.mm.ui.kk.f(itemView, 0);
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (Y6.intValue() == 0) {
                android.view.View itemView2 = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
                com.p314xaae8f345.mm.ui.kk.f(itemView2, i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aih));
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else {
                android.view.View itemView3 = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
                com.p314xaae8f345.mm.ui.kk.f(itemView3, 0);
                if (textView != null) {
                    textView.setVisibility(0);
                }
                if (textView != null) {
                    textView.setText(i65.a.r(context, Y6.intValue()));
                }
            }
            if (j17.X6()) {
                holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.m7k).setOnClickListener(new a24.f(j17, holder, i17));
            } else {
                holder.f3639x46306858.setClickable(false);
                holder.f3639x46306858.setFocusable(false);
                holder.f3639x46306858.setLongClickable(false);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            if (c22699x3dcdb352 != null) {
                if (j17.T6() != null) {
                    c22699x3dcdb352.setVisibility(0);
                    yz5.l T6 = j17.T6();
                    if (T6 != null) {
                        T6.mo146xb9724478(c22699x3dcdb352);
                    }
                } else if (j17.V6() != 0) {
                    c22699x3dcdb352.setVisibility(0);
                    c22699x3dcdb352.s(j17.V6(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c);
                } else {
                    c22699x3dcdb352.setVisibility(8);
                }
                c22699x3dcdb352.setOnClickListener(j17.U6());
            }
        } else {
            super.h(holder, item, i17, i18, z17, list);
        }
        java.lang.Integer n17 = n(holder, j17, i17, i18);
        if (n17 != null) {
            int intValue = n17.intValue();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                android.view.LayoutInflater.from(context).inflate(intValue, viewGroup, true);
            }
        }
    }

    public final void q(in5.s0 s0Var, java.lang.Object obj, int i17, yz5.p action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (obj == null) {
            android.view.View p17 = s0Var.p(i17);
            if (p17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert", "setOptionView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/Object;ILkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert", "setOptionView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/Object;ILkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p18 = s0Var.p(i17);
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert", "setOptionView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/Object;ILkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert", "setOptionView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/Object;ILkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            action.mo149xb9724478(obj, p18);
        }
    }
}
