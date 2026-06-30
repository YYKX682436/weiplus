package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2208x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/view/ImproveVideoFrameLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "d", "Lyz5/a;", "getVideoRemoveCallback", "()Lyz5/a;", "setVideoRemoveCallback", "(Lyz5/a;)V", "videoRemoveCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout */
/* loaded from: classes3.dex */
public final class C18356x4db012f4 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a videoRemoveCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18356x4db012f4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getVideoRemoveCallback */
    public final yz5.a m71137x9692830e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoRemoveCallback", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
        yz5.a aVar = this.videoRemoveCallback;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoRemoveCallback", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
        return aVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
        super.removeView(view);
        yz5.a aVar = this.videoRemoveCallback;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
    }

    /* renamed from: setVideoRemoveCallback */
    public final void m71138xe4d74282(yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoRemoveCallback", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
        this.videoRemoveCallback = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoRemoveCallback", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18356x4db012f4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
