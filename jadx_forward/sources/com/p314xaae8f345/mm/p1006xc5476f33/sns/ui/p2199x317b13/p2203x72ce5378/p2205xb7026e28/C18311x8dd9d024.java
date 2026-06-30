package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveFinderCollectionHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "Landroid/view/ViewGroup;", "layout", "Ljz5/l;", "", "handle", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle */
/* loaded from: classes4.dex */
public final class C18311x8dd9d024 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18339xdafb4ef4 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18311x8dd9d024 f38411x4fbc8495 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18311x8dd9d024();

    private C18311x8dd9d024() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18339xdafb4ef4
    /* renamed from: getContentStyle */
    public int mo71065x91de6f2e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
        return 56;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18339xdafb4ef4
    /* renamed from: handle */
    public jz5.l mo71074xb7026e28(final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj, android.view.ViewGroup layout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tlObj, "tlObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        jz5.l mo71074xb7026e28 = super.mo71074xb7026e28(snsInfo, tlObj, layout);
        if (tlObj.f39014x86965dde.E == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
            return mo71074xb7026e28;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 m71111xc2134ad4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18341x9636b7d.m71111xc2134ad4(layout);
        if (m71111xc2134ad4 != null) {
            m71111xc2134ad4.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tlObj.f39014x86965dde.E.m75945x2fec8307(3))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().S(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18341x9636b7d.m71111xc2134ad4(layout), -1, com.p314xaae8f345.mm.R.raw.f78435x7b83bce4, hashCode());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 m71111xc2134ad42 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18341x9636b7d.m71111xc2134ad4(layout);
            if (m71111xc2134ad42 != null) {
                m71111xc2134ad42.m81429xebd28962(al5.q2.CENTER_CROP);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                ya2.l.f542035a.i(tlObj.f39014x86965dde.E.m75945x2fec8307(3), m71111xc2134ad42);
            }
        }
        java.lang.String m75945x2fec8307 = tlObj.f39014x86965dde.E.m75945x2fec8307(1);
        java.lang.String string = layout.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ok6, java.lang.Integer.valueOf(tlObj.f39014x86965dde.E.m75939xb282bd08(4)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        ym5.a1.h(layout, new ym5.n0() { // from class: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle$handle$2
            @Override // ym5.n0
            /* renamed from: onViewExposed */
            public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
                r45.ev2 ev2Var;
                r45.ev2 ev2Var2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle$handle$2");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                if (z17) {
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0.f206653d;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720.this;
                    java.lang.String str = c19807x593d1720.f39018xf3f56116;
                    if (str == null) {
                        str = "";
                    }
                    r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
                    int m75939xb282bd08 = (a90Var == null || (ev2Var2 = a90Var.E) == null) ? 0 : ev2Var2.m75939xb282bd08(13);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720.this;
                    java.lang.String str2 = c19807x593d17202.f39018xf3f56116;
                    if (str2 == null) {
                        str2 = "";
                    }
                    r45.a90 a90Var2 = c19807x593d17202.f39014x86965dde;
                    java.lang.String u17 = pm0.v.u((a90Var2 == null || (ev2Var = a90Var2.E) == null) ? 0L : ev2Var.m75942xfb822ef2(0));
                    long j19 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720.this.f39015xc86e6609;
                    fe0.o4 o4Var = (fe0.o4) i95.n0.c(fe0.o4.class);
                    java.lang.String m70363x51f8f990 = snsInfo.m70363x51f8f990();
                    java.lang.String Di = ((ee0.v4) o4Var).Di(m70363x51f8f990 != null ? m70363x51f8f990 : "");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Di, "getSnsPublishId(...)");
                    m0Var.c(3, 8, str, null, "", m75939xb282bd08, str2, u17, j19, Di);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle$handle$2");
            }
        });
        jz5.l lVar = new jz5.l(m75945x2fec8307, string);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
        return lVar;
    }
}
