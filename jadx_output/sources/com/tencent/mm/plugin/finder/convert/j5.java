package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xl2 f103723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f103724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103726g;

    public j5(r45.xl2 xl2Var, so2.z0 z0Var, android.view.View view, in5.s0 s0Var) {
        this.f103723d = xl2Var;
        this.f103724e = z0Var;
        this.f103725f = view;
        this.f103726g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshActivity$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        r45.xl2 xl2Var = this.f103723d;
        intent.putExtra("key_activity_id", xl2Var.getLong(0));
        intent.putExtra("key_activity_name", xl2Var.getString(1));
        intent.putExtra("key_nick_name", xl2Var.getString(2));
        so2.z0 z0Var = this.f103724e;
        intent.putExtra("key_feed_ref_id", z0Var.E.getFeedObject().getId());
        intent.putExtra("key_feed_ref_dup_flag", z0Var.E.getDupFlag());
        com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "eventTopicId :" + xl2Var.getLong(0) + " eventName:" + xl2Var.getString(1) + " refId: " + z0Var.E.getFeedObject().getId());
        intent.putExtra("key_feed_report_id", z0Var.E.getFeedObject().getId());
        intent.putExtra("key_activity_profile_src_type", "1");
        intent.putExtra("key_entrance_type", 7);
        s92.g gVar = s92.g.f405006a;
        android.content.Context context = this.f103725f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gVar.a(context, intent, c01.id.c(), 2);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context2 = this.f103726g.f293121e;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).Bi((com.tencent.mm.ui.MMActivity) context2, intent, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshActivity$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
