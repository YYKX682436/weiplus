package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryIconImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "", "clickable", "setClickable", "longClickable", "setLongClickable", "focusable", "setFocusable", "focusableInTouchMode", "setFocusableInTouchMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView */
/* loaded from: classes5.dex */
public final class C21832xcd3ee688 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21832xcd3ee688(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.View
    public boolean performLongClick() {
        return false;
    }

    @Override // android.view.View
    public void setClickable(boolean z17) {
        super.setClickable(false);
    }

    @Override // android.view.View
    public void setFocusable(boolean z17) {
        super.setFocusable(false);
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z17) {
        super.setFocusableInTouchMode(false);
    }

    @Override // android.view.View
    public void setLongClickable(boolean z17) {
        super.setLongClickable(false);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(null);
        super.setClickable(false);
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(null);
        super.setLongClickable(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21832xcd3ee688(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.setOnClickListener(null);
        super.setOnLongClickListener(null);
        super.setClickable(false);
        super.setLongClickable(false);
        super.setFocusable(false);
        super.setFocusableInTouchMode(false);
    }
}
