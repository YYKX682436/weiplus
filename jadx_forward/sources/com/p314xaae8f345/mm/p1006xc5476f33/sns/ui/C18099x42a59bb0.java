package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsScrollControllableLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager */
/* loaded from: classes4.dex */
public final class C18099x42a59bb0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f248897v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18099x42a59bb0(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f248897v = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean mo2416xc6ea780e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canScrollHorizontally", "com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager");
        boolean z17 = this.f248897v && super.mo2416xc6ea780e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canScrollHorizontally", "com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager");
        return z17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canScrollVertically", "com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager");
        boolean z17 = this.f248897v && super.getF204840r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canScrollVertically", "com.tencent.mm.plugin.sns.ui.SnsScrollControllableLinearLayoutManager");
        return z17;
    }
}
