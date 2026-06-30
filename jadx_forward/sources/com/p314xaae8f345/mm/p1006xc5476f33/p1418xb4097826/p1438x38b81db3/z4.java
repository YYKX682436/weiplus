package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class z4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f186615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xl2 f186616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.content.Context context, r45.xl2 xl2Var) {
        super(1);
        this.f186614d = abstractC14490x69736cb5;
        this.f186615e = context;
        this.f186616f = xl2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String txt = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(txt, "txt");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c5 c5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6.f185858i;
        if (!c5Var.k()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f186614d;
            if (!abstractC14490x69736cb5.getIsPreview()) {
                r45.xl2 eventDesc = this.f186616f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eventDesc, "$eventDesc");
                if (!c5Var.k() && !abstractC14490x69736cb5.getIsPreview()) {
                    android.content.Intent intent = new android.content.Intent();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
                    android.content.Context context = this.f186615e;
                    iyVar.c(context, intent);
                    intent.putExtra("key_activity_id", eventDesc.m75942xfb822ef2(0));
                    intent.putExtra("key_activity_name", eventDesc.m75945x2fec8307(1));
                    intent.putExtra("key_nick_name", eventDesc.m75945x2fec8307(2));
                    intent.putExtra("key_feed_ref_id", abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11());
                    intent.putExtra("key_feed_ref_dup_flag", abstractC14490x69736cb5.w());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCommentHeaderConvert", "eventTopicId :" + eventDesc.m75942xfb822ef2(0) + " eventName:" + eventDesc.m75945x2fec8307(1) + " refId: " + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11());
                    intent.putExtra("key_feed_report_id", abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11());
                    intent.putExtra("key_activity_profile_src_type", "1");
                    intent.putExtra("key_entrance_type", 7);
                    s92.g.f486539a.a(context, intent, c01.id.c(), 2);
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).Bi((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, intent, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a5.f206481a.a(context, 1, pm0.v.u(eventDesc.m75942xfb822ef2(0)), pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
