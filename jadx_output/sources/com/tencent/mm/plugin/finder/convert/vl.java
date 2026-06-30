package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yl f104796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104797f;

    public vl(java.lang.String str, com.tencent.mm.plugin.finder.convert.yl ylVar, in5.s0 s0Var) {
        this.f104795d = str;
        this.f104796e = ylVar;
        this.f104797f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f104795d;
        intent.putExtra("Username", str);
        intent.putExtra("WxUserName", str);
        intent.putExtra("FromWxMsg", true);
        intent.putExtra("Action", 1);
        intent.putExtra("FeedId", this.f104796e.f105026e);
        com.tencent.mm.plugin.finder.view.ko koVar = com.tencent.mm.plugin.finder.view.ko.f132520a;
        in5.s0 s0Var = this.f104797f;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        koVar.f(context, intent, 2, new com.tencent.mm.plugin.finder.convert.ul(s0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveLikeConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
