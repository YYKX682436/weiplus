package com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/vas/launcher/VASFragmentContainerView;", "Lcom/tencent/mm/ui/vas/launcher/FragmentContainerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.vas.launcher.VASFragmentContainerView */
/* loaded from: classes7.dex */
public final class C22589xa9231c2e extends com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.C22588x8ca9b236 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22589xa9231c2e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if ((view != null ? indexOfChild(view) : -1) != -1) {
            return;
        }
        super.addView(view, i17);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
    }
}
