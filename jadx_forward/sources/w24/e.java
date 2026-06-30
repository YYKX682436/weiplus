package w24;

/* loaded from: classes.dex */
public final class e extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clj;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        boolean z18;
        w24.d item = (w24.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        item.f524148f = itemView;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupListControl", item + " onBindView");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) itemView.findViewById(com.p314xaae8f345.mm.R.id.gu_);
        linearLayout.removeAllViews();
        java.util.List list2 = item.f524149g;
        if (!(list2 instanceof java.util.Collection) || !((java.util.ArrayList) list2).isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
            while (it.hasNext()) {
                if (!((w24.l) it.next()).f524163d) {
                    z18 = false;
                    break;
                }
            }
        }
        z18 = true;
        if (z18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(itemView, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/widget/GroupItem", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            itemView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(itemView, "com/tencent/mm/plugin/setting/ui/widget/GroupItem", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemView.getLayoutParams(), item.f524152m)) {
                return;
            }
            item.f524152m = new android.view.ViewGroup.LayoutParams(0, 0);
            item.f524151i = itemView.getLayoutParams();
            itemView.setLayoutParams(item.f524152m);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = item.f524151i;
        if (layoutParams != null) {
            itemView.setLayoutParams(layoutParams);
            item.f524151i = null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(itemView, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/widget/GroupItem", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        itemView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(itemView, "com/tencent/mm/plugin/setting/ui/widget/GroupItem", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        int i19 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            w24.l lVar = (w24.l) next;
            if (!lVar.f524163d) {
                if (i19 != 0) {
                    android.content.Context context = itemView.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cli, (android.view.ViewGroup) null, false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                    linearLayout.addView(inflate);
                }
                android.content.Context context2 = itemView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                android.view.View a17 = lVar.a(context2);
                android.view.ViewParent parent = a17.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(a17);
                }
                android.content.Context context3 = itemView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                linearLayout.addView(lVar.a(context3));
            }
            i19 = i27;
        }
    }
}
