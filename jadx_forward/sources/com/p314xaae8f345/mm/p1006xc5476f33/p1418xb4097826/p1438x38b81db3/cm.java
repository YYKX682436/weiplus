package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class cm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd2.b f184608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f184609e;

    public cm(cd2.b bVar, android.widget.ImageView imageView) {
        this.f184608d = bVar;
        this.f184609e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m76197x6c03c64c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLiveMsgConvert$initAvatarClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cd2.b bVar = this.f184608d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa b17 = bVar.f122188d.b();
        if (b17 == null || (m76197x6c03c64c = b17.m76197x6c03c64c()) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveMsgConvert$initAvatarClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", m76197x6c03c64c);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_enter_profile_type", 0);
        intent.putExtra("emFinderWxMsgFromIsThank", bVar.f122188d.p() == 18);
        r45.pg2 n17 = bVar.f122188d.n();
        intent.putExtra("mention_finder", n17 != null ? n17.mo14344x5f01b1f6() : null);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        android.content.Context context = this.f184609e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        e1Var.w(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveMsgConvert$initAvatarClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
