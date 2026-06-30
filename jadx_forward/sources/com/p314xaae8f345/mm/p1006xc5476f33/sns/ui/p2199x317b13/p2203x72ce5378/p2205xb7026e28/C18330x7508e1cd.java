package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveGameShareCardHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "Landroid/view/ViewGroup;", "layout", "Ljz5/l;", "", "handle", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGameShareCardHandle */
/* loaded from: classes4.dex */
public final class C18330x7508e1cd extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18339xdafb4ef4 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18330x7508e1cd f38431x4fbc8495 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18330x7508e1cd();

    private C18330x7508e1cd() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18339xdafb4ef4
    /* renamed from: getContentStyle */
    public int mo71065x91de6f2e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGameShareCardHandle");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGameShareCardHandle");
        return 101;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18339xdafb4ef4
    /* renamed from: handle */
    public jz5.l mo71074xb7026e28(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj, android.view.ViewGroup layout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGameShareCardHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tlObj, "tlObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        jz5.l mo71074xb7026e28 = super.mo71074xb7026e28(snsInfo, tlObj, layout);
        if (tlObj.f39025x96ae695c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGameShareCardHandle");
            return mo71074xb7026e28;
        }
        if (!tlObj.f39014x86965dde.f451373h.isEmpty()) {
            android.widget.ImageView m71112xbf44e5e = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18341x9636b7d.m71112xbf44e5e(layout);
            if (m71112xbf44e5e != null) {
                m71112xbf44e5e.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
            }
            if (tlObj.f39025x96ae695c.f454600f == 0) {
                android.widget.ImageView m71112xbf44e5e2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18341x9636b7d.m71112xbf44e5e(layout);
                if (m71112xbf44e5e2 != null) {
                    m71112xbf44e5e2.setVisibility(8);
                }
            } else {
                android.widget.ImageView m71112xbf44e5e3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.C18341x9636b7d.m71112xbf44e5e(layout);
                if (m71112xbf44e5e3 != null) {
                    m71112xbf44e5e3.setVisibility(0);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGameShareCardHandle");
        return mo71074xb7026e28;
    }
}
