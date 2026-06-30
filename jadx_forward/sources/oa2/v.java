package oa2;

/* loaded from: classes2.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa2.w f425373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r03 f425374e;

    public v(oa2.w wVar, r45.r03 r03Var) {
        this.f425373d = wVar;
        this.f425374e = r03Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$updateViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oa2.w.V6(this.f425373d, this.f425374e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$updateViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
