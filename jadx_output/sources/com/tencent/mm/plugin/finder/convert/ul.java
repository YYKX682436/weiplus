package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class ul extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(in5.s0 s0Var) {
        super(1);
        this.f104716d = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent i17 = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(i17, "i");
        i17.putExtra("keyFromSource", 2);
        in5.s0 s0Var = this.f104716d;
        i17.setClass(s0Var.f293121e, com.tencent.mm.plugin.finder.feed.ui.FinderLikePrivacyUI.class);
        android.content.Context context = s0Var.f293121e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(i17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert$onBindViewHolder$4$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert$onBindViewHolder$4$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
