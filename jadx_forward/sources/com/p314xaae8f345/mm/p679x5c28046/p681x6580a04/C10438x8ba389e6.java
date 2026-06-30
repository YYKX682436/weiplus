package com.p314xaae8f345.mm.p679x5c28046.p681x6580a04;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/emoji/panel/EmojiPanelGroupView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "enable", "Ljz5/f0;", "setScrollEnable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.emoji.panel.EmojiPanelGroupView */
/* loaded from: classes4.dex */
public final class C10438x8ba389e6 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public final oj5.a0 f146430b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f146431c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f146432d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10438x8ba389e6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f146430b2 = new oj5.a0(context);
        m7965x440a0e9(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        oj5.a0 a0Var = this.f146430b2;
        a0Var.b(ev6);
        int i17 = a0Var.f427364h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = getLayoutManager();
        com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.p682xbddafb2a.C10442x17c00445 c10442x17c00445 = layoutManager instanceof com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.p682xbddafb2a.C10442x17c00445 ? (com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.p682xbddafb2a.C10442x17c00445) layoutManager : null;
        if (c10442x17c00445 != null) {
            boolean z17 = false;
            if (this.f146431c2) {
                if (!(((i17 & 1) == 0 && (i17 & 2) == 0) ? false : true) && !this.f146432d2) {
                    z17 = true;
                }
            }
            c10442x17c00445.f146457v = z17;
        }
        return super.dispatchTouchEvent(ev6);
    }

    @Override // android.view.View
    public android.view.View focusSearch(int i17) {
        return null;
    }

    /* renamed from: setScrollEnable */
    public final void m43686x52f47832(boolean z17) {
        this.f146431c2 = z17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10438x8ba389e6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
