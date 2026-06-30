package com.p314xaae8f345.mm.p2470x93e71c27.ui.pin;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002B\u001d\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB%\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/pin/PinnedHeaderRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lx35/d;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOnPinnedHeaderClickListener", "Lx35/a;", "getPinnedHeaderDecoration", "()Lx35/a;", "pinnedHeaderDecoration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView */
/* loaded from: classes10.dex */
public final class C19702x122ad0c9 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19702x122ad0c9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
    }

    /* renamed from: getPinnedHeaderDecoration */
    public final x35.a m75600xa7f28a0b() {
        int i17 = 0;
        while (true) {
            java.lang.Object B0 = B0(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B0, "getItemDecorationAt(...)");
            if (B0 instanceof x35.a) {
                return (x35.a) B0;
            }
            i17++;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return super.onInterceptTouchEvent(e17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        return super.onTouchEvent(ev6);
    }

    /* renamed from: setOnPinnedHeaderClickListener */
    public final void m75601x9f8e0ef6(x35.d dVar) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19702x122ad0c9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
    }
}
