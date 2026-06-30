package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class cm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd2.b f103075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f103076e;

    public cm(cd2.b bVar, android.widget.ImageView imageView) {
        this.f103075d = bVar;
        this.f103076e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String username;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLiveMsgConvert$initAvatarClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cd2.b bVar = this.f103075d;
        com.tencent.mm.protocal.protobuf.FinderContact b17 = bVar.f40655d.b();
        if (b17 == null || (username = b17.getUsername()) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveMsgConvert$initAvatarClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_enter_profile_type", 0);
        intent.putExtra("emFinderWxMsgFromIsThank", bVar.f40655d.p() == 18);
        r45.pg2 n17 = bVar.f40655d.n();
        intent.putExtra("mention_finder", n17 != null ? n17.toByteArray() : null);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = this.f103076e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e1Var.w(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveMsgConvert$initAvatarClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
