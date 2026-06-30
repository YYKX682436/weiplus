package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveOneWayHorizontalBounceView;", "Lcom/tencent/mm/ui/widget/pulldown/HorizontalNestedBounceView;", "Lkotlin/Function1;", "", "Ljz5/f0;", "callback", "setBounceBackListener", "x", "I", "getSupportedDirection", "()I", "setSupportedDirection", "(I)V", "supportedDirection", "y", "Lyz5/l;", "getOnBounceBackListener", "()Lyz5/l;", "setOnBounceBackListener", "(Lyz5/l;)V", "onBounceBackListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "xt2/t", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveOneWayHorizontalBounceView */
/* loaded from: classes15.dex */
public final class C14972x8aaba4cc extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22715x5d5f7a08 {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int supportedDirection;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public yz5.l onBounceBackListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14972x8aaba4cc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        m82132xb1172400(new xt2.t(this));
    }

    public final yz5.l getOnBounceBackListener() {
        return this.onBounceBackListener;
    }

    public final int getSupportedDirection() {
        return this.supportedDirection;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22715x5d5f7a08
    public void k(android.view.View child) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        super.k(child);
        yz5.l lVar = this.onBounceBackListener;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(f(child)));
        }
    }

    /* renamed from: setBounceBackListener */
    public final void m59082x35fcf965(yz5.l lVar) {
        this.onBounceBackListener = lVar;
    }

    /* renamed from: setOnBounceBackListener */
    public final void m59083xefb9b124(yz5.l lVar) {
        this.onBounceBackListener = lVar;
    }

    /* renamed from: setSupportedDirection */
    public final void m59084xe0819a73(int i17) {
        this.supportedDirection = i17;
    }
}
