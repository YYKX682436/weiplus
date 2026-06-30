package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class dg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 f210605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f210606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 activityC15062xd67d4d74, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        super(0);
        this.f210605d = activityC15062xd67d4d74;
        this.f210606e = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f210606e.f152150c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15062xd67d4d74 activityC15062xd67d4d74 = this.f210605d;
        android.widget.ProgressBar progressBar = activityC15062xd67d4d74.B;
        if (progressBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loading");
            throw null;
        }
        progressBar.setVisibility(8);
        android.view.View view = activityC15062xd67d4d74.C;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshArea");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "handleFailureCallback", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "handleFailureCallback", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = activityC15062xd67d4d74.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggb);
        }
        db5.t7.m123883x26a183b(activityC15062xd67d4d74, str, 1).show();
        return jz5.f0.f384359a;
    }
}
