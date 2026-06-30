package a24;

/* loaded from: classes.dex */
public abstract class g extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ek8;
    }

    public java.lang.Integer n(in5.s0 holder, a24.i baseItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(baseItem, "baseItem");
        return null;
    }

    public boolean o() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(in5.s0 holder, xm3.a item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        a24.i j17 = ((c24.a) item).j();
        android.content.Context context = holder.f293121e;
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI = context instanceof com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI) context : null;
        if (o()) {
            j17.getClass();
            super.h(holder, item, i17, i18, z17, list);
            android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.gzf);
            java.lang.String str = baseSettingPrefUI != null ? baseSettingPrefUI.f161839f : null;
            java.util.List list2 = baseSettingPrefUI != null ? baseSettingPrefUI.f161840g : null;
            if (str != null) {
                if ((list2 != null && list2.contains(j17.a7())) && (!list2.isEmpty()) && list2.contains(j17.a7())) {
                    java.lang.String key = j17.a7();
                    baseSettingPrefUI.getClass();
                    kotlin.jvm.internal.o.g(key, "key");
                    java.util.List list3 = baseSettingPrefUI.f161840g;
                    if (list3 != null) {
                        list3.remove(key);
                    }
                    holder.itemView.post(new a24.e(holder, this));
                }
            }
            java.lang.Integer Y6 = j17.Y6();
            if (Y6 == null) {
                android.view.View itemView = holder.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                com.tencent.mm.ui.kk.f(itemView, 0);
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (Y6.intValue() == 0) {
                android.view.View itemView2 = holder.itemView;
                kotlin.jvm.internal.o.f(itemView2, "itemView");
                com.tencent.mm.ui.kk.f(itemView2, i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aih));
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else {
                android.view.View itemView3 = holder.itemView;
                kotlin.jvm.internal.o.f(itemView3, "itemView");
                com.tencent.mm.ui.kk.f(itemView3, 0);
                if (textView != null) {
                    textView.setVisibility(0);
                }
                if (textView != null) {
                    textView.setText(i65.a.r(context, Y6.intValue()));
                }
            }
            if (j17.X6()) {
                holder.itemView.findViewById(com.tencent.mm.R.id.m7k).setOnClickListener(new a24.f(j17, holder, i17));
            } else {
                holder.itemView.setClickable(false);
                holder.itemView.setFocusable(false);
                holder.itemView.setLongClickable(false);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.a_4);
            if (weImageView != null) {
                if (j17.T6() != null) {
                    weImageView.setVisibility(0);
                    yz5.l T6 = j17.T6();
                    if (T6 != null) {
                        T6.invoke(weImageView);
                    }
                } else if (j17.V6() != 0) {
                    weImageView.setVisibility(0);
                    weImageView.s(j17.V6(), com.tencent.mm.R.color.BW_0_Alpha_0_5);
                } else {
                    weImageView.setVisibility(8);
                }
                weImageView.setOnClickListener(j17.U6());
            }
        } else {
            super.h(holder, item, i17, i18, z17, list);
        }
        java.lang.Integer n17 = n(holder, j17, i17, i18);
        if (n17 != null) {
            int intValue = n17.intValue();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.cgi);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                android.view.LayoutInflater.from(context).inflate(intValue, viewGroup, true);
            }
        }
    }

    public final void q(in5.s0 s0Var, java.lang.Object obj, int i17, yz5.p action) {
        kotlin.jvm.internal.o.g(s0Var, "<this>");
        kotlin.jvm.internal.o.g(action, "action");
        if (obj == null) {
            android.view.View p17 = s0Var.p(i17);
            if (p17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert", "setOptionView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/Object;ILkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert", "setOptionView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/Object;ILkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            action.invoke(obj, p18);
        }
    }
}
