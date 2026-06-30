package bm2;

/* loaded from: classes8.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o5 f21839d;

    public d1(r45.o5 o5Var) {
        this.f21839d = o5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveBizListAdapter$BizItemHolder$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizPrepareUI.class);
        r45.o5 o5Var = this.f21839d;
        intent.putExtra("finder_biz_live_article_url", o5Var.f381917h);
        intent.putExtra("finder_biz_live_article_title", o5Var.f381913d);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(5);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveBizListAdapter$BizItemHolder$initClick$1", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveBizListAdapter$BizItemHolder$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
