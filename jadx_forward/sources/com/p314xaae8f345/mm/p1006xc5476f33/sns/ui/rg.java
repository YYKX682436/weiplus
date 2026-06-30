package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class rg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f251952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 f251953e;

    public rg(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116) {
        this.f251952d = i17;
        this.f251953e = activityC18049x9dc71116;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1$2");
        int i17 = this.f251952d;
        int i18 = i17 > 0 ? i17 - 1 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17988xb8422ef8 t76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.t7(this.f251953e);
        if (t76 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(t76, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$collectFlows$3$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        t76.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(t76, "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$collectFlows$3$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1$2");
    }
}
