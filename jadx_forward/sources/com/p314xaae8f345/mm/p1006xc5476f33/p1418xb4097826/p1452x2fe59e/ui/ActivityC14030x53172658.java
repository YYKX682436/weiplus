package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveRemindConsumeWecoinUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/kc", "com/tencent/mm/plugin/finder/feed/ui/lc", "com/tencent/mm/plugin/finder/feed/ui/mc", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI */
/* loaded from: classes3.dex */
public final class ActivityC14030x53172658 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f190942v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kc f190943w;

    public ActivityC14030x53172658() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f190942v = linkedList;
        this.f190943w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kc(this, linkedList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: X6 */
    public java.lang.String getF190953v() {
        return "FinderLiveMoreOptionSettingUI";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570507ay5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.eco);
        mo78514x143f1b92().x0(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.nc(this));
        m78560xe21cbbf(false);
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.oc(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kc kcVar = this.f190943w;
        c1163xf1deaba4.mo7960x6cab2c8d(kcVar);
        dk2.wa a17 = dk2.wa.f315816b.a(getIntent());
        r45.f82 f82Var = a17 != null ? a17.f315818a : null;
        if (f82Var != null) {
            java.util.LinkedList linkedList = this.f190942v;
            linkedList.clear();
            r45.ql1 ql1Var = (r45.ql1) f82Var.m75936x14adae67(2);
            long m75942xfb822ef2 = ql1Var != null ? ql1Var.m75942xfb822ef2(1) : 0L;
            java.util.LinkedList<r45.uw4> m75941xfb821914 = f82Var.m75941xfb821914(1);
            if (m75941xfb821914 != null) {
                for (r45.uw4 uw4Var : m75941xfb821914) {
                    linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lc(uw4Var.m75942xfb822ef2(0), m75942xfb822ef2 == uw4Var.m75942xfb822ef2(0)));
                }
            }
            kcVar.m8146xced61ae5();
        }
    }
}
