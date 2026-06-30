package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class go implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f213714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f213715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213716f;

    public go(java.util.ArrayList arrayList, android.os.Bundle bundle, java.lang.String str) {
        this.f213714d = arrayList;
        this.f213715e = bundle;
        this.f213716f = str;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f213714d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        dy2.b bVar = (dy2.b) obj;
        if (bVar.f326106d.m75939xb282bd08(5) == 1 && bVar.f326106d.m75939xb282bd08(0) == 5) {
            android.os.Bundle bundle = this.f213715e;
            java.lang.Boolean valueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("FromWxMsg", false)) : null;
            java.lang.String string = bundle != null ? bundle.getString("Username") : null;
            java.lang.String string2 = bundle != null ? bundle.getString("V5UserName") : null;
            if (!(string2 == null || string2.length() == 0)) {
                string = string2;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("InteractionScene", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE) ? 2 : 1);
            intent.putExtra("InteractionRequestScene", 18);
            intent.putExtra("InteractionNickname", this.f213716f);
            intent.putExtra("InteractionUsername", string);
            intent.setClass(holder.f374654e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15084x4121bf5.class);
            android.content.Context context = holder.f374654e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderCommunication$1$5$1", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderCommunication$1$5$1", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
