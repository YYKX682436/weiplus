package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xl2 f185256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f185257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185259g;

    public j5(r45.xl2 xl2Var, so2.z0 z0Var, android.view.View view, in5.s0 s0Var) {
        this.f185256d = xl2Var;
        this.f185257e = z0Var;
        this.f185258f = view;
        this.f185259g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshActivity$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        r45.xl2 xl2Var = this.f185256d;
        intent.putExtra("key_activity_id", xl2Var.m75942xfb822ef2(0));
        intent.putExtra("key_activity_name", xl2Var.m75945x2fec8307(1));
        intent.putExtra("key_nick_name", xl2Var.m75945x2fec8307(2));
        so2.z0 z0Var = this.f185257e;
        intent.putExtra("key_feed_ref_id", z0Var.E.getFeedObject().m76784x5db1b11());
        intent.putExtra("key_feed_ref_dup_flag", z0Var.E.m59229xb5af1dd5());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCommentHeaderConvert", "eventTopicId :" + xl2Var.m75942xfb822ef2(0) + " eventName:" + xl2Var.m75945x2fec8307(1) + " refId: " + z0Var.E.getFeedObject().m76784x5db1b11());
        intent.putExtra("key_feed_report_id", z0Var.E.getFeedObject().m76784x5db1b11());
        intent.putExtra("key_activity_profile_src_type", "1");
        intent.putExtra("key_entrance_type", 7);
        s92.g gVar = s92.g.f486539a;
        android.content.Context context = this.f185258f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gVar.a(context, intent, c01.id.c(), 2);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context2 = this.f185259g.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).Bi((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, intent, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshActivity$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
