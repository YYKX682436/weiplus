package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ae implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f184408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f184411g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184412h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f184413i;

    public ae(android.graphics.Bitmap bitmap, in5.s0 s0Var, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f184408d = bitmap;
        this.f184409e = s0Var;
        this.f184410f = textView;
        this.f184411g = qeVar;
        this.f184412h = view;
        this.f184413i = abstractC14490x69736cb5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f184408d;
        if (bitmap != null) {
            in5.s0 s0Var = this.f184409e;
            int dimension = (int) s0Var.f374654e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            android.content.Context context = s0Var.f374654e;
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f5w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.CharSequence l17 = hc2.x0.l(string, context, '#', new android.graphics.drawable.BitmapDrawable(bitmap), com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6, dimension, 0, 0, 0, 224, null);
            this.f184410f.setText(l17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t8 t8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.U;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f184411g;
            android.view.View view = this.f184412h;
            qeVar.F1("social_recommend_bubble", view, this.f184413i, l17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$setRecommendFriendLike$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$setRecommendFriendLike$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
