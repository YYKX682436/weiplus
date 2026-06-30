package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ae implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f102875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f102877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f102878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102879h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102880i;

    public ae(android.graphics.Bitmap bitmap, in5.s0 s0Var, android.widget.TextView textView, com.tencent.mm.plugin.finder.convert.qe qeVar, android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f102875d = bitmap;
        this.f102876e = s0Var;
        this.f102877f = textView;
        this.f102878g = qeVar;
        this.f102879h = view;
        this.f102880i = baseFinderFeed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f102875d;
        if (bitmap != null) {
            in5.s0 s0Var = this.f102876e;
            int dimension = (int) s0Var.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
            android.content.Context context = s0Var.f293121e;
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f5w);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.CharSequence l17 = hc2.x0.l(string, context, '#', new android.graphics.drawable.BitmapDrawable(bitmap), com.tencent.mm.R.color.f479254u6, dimension, 0, 0, 0, 224, null);
            this.f102877f.setText(l17);
            com.tencent.mm.plugin.finder.convert.t8 t8Var = com.tencent.mm.plugin.finder.convert.qe.U;
            com.tencent.mm.plugin.finder.convert.qe qeVar = this.f102878g;
            android.view.View view = this.f102879h;
            qeVar.F1("social_recommend_bubble", view, this.f102880i, l17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$setRecommendFriendLike$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$setRecommendFriendLike$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
