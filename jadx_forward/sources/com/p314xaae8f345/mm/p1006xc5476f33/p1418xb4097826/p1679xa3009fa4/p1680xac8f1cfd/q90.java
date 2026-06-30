package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes3.dex */
public final class q90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f217209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(android.content.Context context, java.lang.String str) {
        super(0);
        this.f217209d = context;
        this.f217210e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f217209d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View findViewWithTag = ((android.view.ViewGroup) decorView).findViewWithTag(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.rl8));
        android.view.ViewGroup viewGroup = findViewWithTag instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewWithTag : null;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
        }
        c61.s9 s9Var = (c61.s9) ((c50.b1) i95.n0.c(c50.b1.class));
        s9Var.getClass();
        java.lang.String mediaId = this.f217210e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        ug5.v a17 = ug5.v.f509188g.a(mediaId);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "changeToTimelineSurface findViewPerformer == null, mediaId: " + mediaId + ' ');
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "changeToTimelineSurface mediaId: " + mediaId + ' ');
            android.view.View view = a17.f509193c;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/FinderVideoFeatureService", "changeToTimelineSurface", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/FinderVideoFeatureService", "changeToTimelineSurface", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            s9Var.Bi(a17, false);
        }
        return jz5.f0.f384359a;
    }
}
