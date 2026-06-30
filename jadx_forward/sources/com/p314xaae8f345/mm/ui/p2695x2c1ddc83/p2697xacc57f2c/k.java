package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.l f289058d;

    public k(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.l lVar) {
        this.f289058d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.l lVar = this.f289058d;
        android.content.Intent intent = new android.content.Intent((android.content.Context) lVar.f484375g.get(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.class);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a & (-257));
        intent.putExtra("list_type", 10);
        intent.putExtra("received_card_name", lVar.f289073m);
        intent.putExtra("recommend_friends", true);
        intent.putExtra("titile", ((android.content.Context) lVar.f484375g.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
        android.content.Context context = (android.content.Context) lVar.f484375g.get();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c01.d9.b().n().b(lVar.f289073m);
        c01.d9.b().n().b(lVar.f289074n);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11003, lVar.f289073m, 2, 0);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
