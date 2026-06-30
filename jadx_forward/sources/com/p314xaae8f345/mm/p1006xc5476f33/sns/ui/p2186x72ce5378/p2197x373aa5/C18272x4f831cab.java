package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveLayoutManager;", "Lcom/tencent/mm/view/recyclerview/WxLinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager */
/* loaded from: classes4.dex */
public final class C18272x4f831cab extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d {

    /* renamed from: w, reason: collision with root package name */
    public int f250682w;

    public C18272x4f831cab(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollVerticallyBy", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager");
        if (this.f250682w != 0) {
            ot5.g.c("MicroMsg.ImproveLayoutManager", "fix rv scroll distance:" + this.f250682w);
        }
        int mo7922xd8d712a7 = super.mo7922xd8d712a7(i17 + this.f250682w, z2Var, h3Var);
        this.f250682w = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollVerticallyBy", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager");
        return mo7922xd8d712a7;
    }
}
