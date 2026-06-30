package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/view/OperationLayerWrapper;", "Landroid/widget/RelativeLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.gallery.view.OperationLayerWrapper */
/* loaded from: classes3.dex */
public final class C21801xa1cf70e9 extends android.widget.RelativeLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21801xa1cf70e9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (getVisibility() == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OperationLayerWrapper", "onInterceptTouchEvent return, layer not visible");
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21801xa1cf70e9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
