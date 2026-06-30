package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f105081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f105082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xl2 f105083f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context, r45.xl2 xl2Var) {
        super(1);
        this.f105081d = baseFinderFeed;
        this.f105082e = context;
        this.f105083f = xl2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String txt = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(txt, "txt");
        com.tencent.mm.plugin.finder.convert.c5 c5Var = com.tencent.mm.plugin.finder.convert.q6.f104325i;
        if (!c5Var.k()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f105081d;
            if (!baseFinderFeed.getIsPreview()) {
                r45.xl2 eventDesc = this.f105083f;
                kotlin.jvm.internal.o.f(eventDesc, "$eventDesc");
                if (!c5Var.k() && !baseFinderFeed.getIsPreview()) {
                    android.content.Intent intent = new android.content.Intent();
                    com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
                    android.content.Context context = this.f105082e;
                    iyVar.c(context, intent);
                    intent.putExtra("key_activity_id", eventDesc.getLong(0));
                    intent.putExtra("key_activity_name", eventDesc.getString(1));
                    intent.putExtra("key_nick_name", eventDesc.getString(2));
                    intent.putExtra("key_feed_ref_id", baseFinderFeed.getFeedObject().getFeedObject().getId());
                    intent.putExtra("key_feed_ref_dup_flag", baseFinderFeed.w());
                    com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "eventTopicId :" + eventDesc.getLong(0) + " eventName:" + eventDesc.getString(1) + " refId: " + baseFinderFeed.getFeedObject().getFeedObject().getId());
                    intent.putExtra("key_feed_report_id", baseFinderFeed.getFeedObject().getFeedObject().getId());
                    intent.putExtra("key_activity_profile_src_type", "1");
                    intent.putExtra("key_entrance_type", 7);
                    s92.g.f405006a.a(context, intent, c01.id.c(), 2);
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.assist.i0) c17).Bi((com.tencent.mm.ui.MMActivity) context, intent, false);
                    com.tencent.mm.plugin.finder.report.a5.f124948a.a(context, 1, pm0.v.u(eventDesc.getLong(0)), pm0.v.u(baseFinderFeed.getItemId()));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
