package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H&J0\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0004J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0004J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0014JH\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\rH\u0004¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "", "getDefaultTitle", "getDescStr", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Landroid/view/ViewGroup;", "layout", "Ljz5/l;", "handle", "Lcom/tencent/mm/plugin/sns/ui/i2;", "getTagObject", "", "checkClickValid", "checkMediaValid", "Landroid/view/View;", "Ljz5/f0;", "postClickEvent", "first", "second", "pickValidContent", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle */
/* loaded from: classes4.dex */
public abstract class AbstractC18339xdafb4ef4 {
    /* renamed from: getDefaultTitle */
    private final java.lang.String m71104x3990af0d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDefaultTitle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        java.lang.String str = tlObj.f39014x86965dde.f451371f;
        if (str != null && str.length() > 40) {
            boolean z17 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
            java.lang.String substring = str.substring(0, com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.h(str, 0, 40));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            str = substring.concat("...");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDefaultTitle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return str;
    }

    /* renamed from: getDescStr */
    private final java.lang.String m71105x9a98adaa(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDescStr", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs.l(tlObj) ? com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs.h(tlObj.f39014x86965dde.f451372g) : "";
        r45.a90 a90Var = tlObj.f39014x86965dde;
        int i17 = a90Var.f451370e;
        if (i17 == 9 || i17 == 14 || i17 == 12 || i17 == 13) {
            h17 = a90Var.f451369d;
        }
        r45.hh4 hh4Var = a90Var.f451376n;
        if (hh4Var != null && hh4Var.f457692q == 1) {
            h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574097gz4);
        }
        java.lang.String str = h17 != null ? h17 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDescStr", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return str;
    }

    /* renamed from: checkClickValid */
    public boolean mo71067x18eb267c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return true;
    }

    /* renamed from: checkMediaValid */
    public final boolean m71106xbad995a0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkMediaValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = snsInfo.m70371x485d7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
        boolean z17 = m70371x485d7.f39014x86965dde.f451373h.size() > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMediaValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return z17;
    }

    /* renamed from: getContentStyle */
    public abstract int mo71065x91de6f2e();

    /* renamed from: getTagObject */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 m71107x5fc924c3(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagObject", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        java.lang.String m70363x51f8f990 = snsInfo.m70363x51f8f990();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = snsInfo.m70371x485d7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2(m70371x485d7, m70363x51f8f990, snsInfo.m70373x5384133c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagObject", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return i2Var;
    }

    /* renamed from: handle */
    public jz5.l mo71074xb7026e28(final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj, android.view.ViewGroup layout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tlObj, "tlObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        layout.setTag(m71107x5fc924c3(snsInfo));
        layout.setOnClickListener(null);
        if (mo71067x18eb267c(snsInfo)) {
            java.lang.String t07 = ca4.z0.t0(snsInfo.f68891x29d1292e);
            zy1.f fVar = (zy1.f) ((dy1.s) i95.n0.c(dy1.s.class));
            fVar.Bi(12076, "ClickFeedCount", 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t07);
            fVar.Di(12076, "ClickFeedId", t07);
            layout.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle$handle$2

                /* renamed from: _hellAccFlag_ */
                private byte f38442x7f11beae;

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle$handle$2");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle$handle$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18339xdafb4ef4 abstractC18339xdafb4ef4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2205xb7026e28.AbstractC18339xdafb4ef4.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                    abstractC18339xdafb4ef4.mo71098x6f5c1eb2(view, snsInfo);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle$handle$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle$handle$2");
                }
            });
        }
        jz5.l lVar = new jz5.l(m71104x3990af0d(tlObj), m71105x9a98adaa(tlObj));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return lVar;
    }

    /* renamed from: pickValidContent */
    public final jz5.l m71108xa3a0339e(jz5.l first, jz5.l second) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pickValidContent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(first, "first");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(second, "second");
        java.lang.Object obj = first.f384366d;
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) obj)) {
            obj = second.f384366d;
        }
        java.lang.String str = (java.lang.String) obj;
        java.lang.Object obj2 = first.f384367e;
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) obj2)) {
            obj2 = second.f384367e;
        }
        jz5.l lVar = new jz5.l(str, (java.lang.String) obj2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pickValidContent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return lVar;
    }

    /* renamed from: postClickEvent */
    public void mo71098x6f5c1eb2(android.view.View layout, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        ot5.g.c("MicroMsg.Improve.ImproveOtherTimelineItemHandle", "postClickEvent type:" + mo71065x91de6f2e() + " snsid:" + snsInfo.m70367x7525eefd());
        yc4.b0 b0Var = yc4.b0.f542372a;
        java.lang.String t07 = ca4.z0.t0(snsInfo.f68891x29d1292e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "longToString(...)");
        b0Var.b(t07);
        java.lang.String t08 = ca4.z0.t0(snsInfo.f68891x29d1292e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t08, "longToString(...)");
        b0Var.c(t08, 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8 c6081xbb9388e8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6081xbb9388e8();
        int mo71065x91de6f2e = mo71065x91de6f2e();
        am.iw iwVar = c6081xbb9388e8.f136359g;
        iwVar.f88510a = mo71065x91de6f2e;
        iwVar.f88511b = m71107x5fc924c3(snsInfo);
        iwVar.f88512c = layout;
        c6081xbb9388e8.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
    }
}
