package t24;

/* loaded from: classes.dex */
public final class y extends a24.g {
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        c24.f item = (c24.f) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p(holder, item, i17, i18, z17, list);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568214m43);
        if (viewGroup != null) {
            int i19 = 0;
            while (true) {
                if (!(i19 < viewGroup.getChildCount())) {
                    break;
                }
                int i27 = i19 + 1;
                android.view.View childAt = viewGroup.getChildAt(i19);
                if (childAt == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingSwitchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/setting/ui/setting_new/model/SettingMvvmListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingSwitchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/setting/ui/setting_new/model/SettingMvvmListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i19 = i27;
            }
        }
        a24.i iVar = item.f119610e;
        if (iVar instanceof s24.g) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) holder.p(com.p314xaae8f345.mm.R.id.btf);
            if (viewOnClickListenerC22631x1cc07cc8 != null) {
                s24.g gVar = (s24.g) iVar;
                viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(gVar.getF243494h());
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(gVar.getF243523i());
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(android.R.id.title);
            if (textView != null) {
                textView.setText(iVar.c7());
            }
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.vaj);
            if (p17 != null) {
                int i28 = ((s24.g) iVar).z7() ? 0 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingSwitchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/setting/ui/setting_new/model/SettingMvvmListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingSwitchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/setting/ui/setting_new/model/SettingMvvmListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            q(holder, iVar.getF243411p(), android.R.id.summary, t24.v.f496874d);
            q(holder, null, android.R.id.icon, t24.w.f496875d);
            q(holder, holder.f374654e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj), com.p314xaae8f345.mm.R.id.oct, t24.x.f496876d);
        }
    }

    @Override // a24.g
    public java.lang.Integer n(in5.s0 holder, a24.i baseItem, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseItem, "baseItem");
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570830c13);
    }
}
