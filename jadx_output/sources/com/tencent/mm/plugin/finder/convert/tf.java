package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class tf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f104609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f104611f;

    public tf(com.tencent.mm.plugin.finder.convert.zf zfVar, in5.s0 s0Var, so2.h1 h1Var) {
        this.f104609d = zfVar;
        this.f104610e = s0Var;
        this.f104611f = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FEED_ENTER_CLICK_AREA", 1);
        com.tencent.mm.plugin.finder.convert.zf zfVar = this.f104609d;
        in5.s0 s0Var = this.f104610e;
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        zfVar.s0(s0Var, itemView, this.f104611f.getFeedObject().getFinderObject(), null, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
