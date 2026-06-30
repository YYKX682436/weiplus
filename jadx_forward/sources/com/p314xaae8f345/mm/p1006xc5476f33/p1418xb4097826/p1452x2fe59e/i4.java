package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f188521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f188523f;

    public i4(yw2.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        this.f188521d = a0Var;
        this.f188522e = a7Var;
        this.f188523f = c14994x9b99c079;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ec2.d e27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$replayListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yw2.a0 a0Var = this.f188521d;
        int commentTextLimit = (a0Var.n().getCommentTextLimit() / 2) - com.p314xaae8f345.mm.ui.p2740x696c9db.v4.g(a0Var.n().m61859xdb574fcd().getText().toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f188522e;
        if (commentTextLimit < 0) {
            android.content.Context context = a7Var.f187740d;
            db5.t7.m123883x26a183b(context, ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kby, java.lang.Integer.valueOf(a0Var.n().getCommentTextLimit() / 2)), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$replayListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        a7Var.p0(a0Var.n().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String(), a0Var.n().m61875xbe97e77e(), null);
        android.content.Context context2 = a7Var.f187740d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f188523f;
            e27.a(new ec2.a(24, c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079.m59229xb5af1dd5()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$replayListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
