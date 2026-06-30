package com.tencent.mm.accessibility.base;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001e\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR$\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010+\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/tencent/mm/accessibility/base/ViewTag;", "", "()V", "disableFocusFlag", "", "getDisableFocusFlag", "()Ljava/lang/Boolean;", "setDisableFocusFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "eBottom", "", "getEBottom", "()Ljava/lang/Integer;", "setEBottom", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "eLeft", "getELeft", "setELeft", "eRight", "getERight", "setERight", "eTop", "getETop", "setETop", "havenExpand", "getHavenExpand", "setHavenExpand", "havenInflate", "getHavenInflate", "setHavenInflate", "passRelativeCoordinate", "getPassRelativeCoordinate", "setPassRelativeCoordinate", "touchDelegate", "Ljava/lang/ref/WeakReference;", "Landroid/view/TouchDelegate;", "getTouchDelegate", "()Ljava/lang/ref/WeakReference;", "setTouchDelegate", "(Ljava/lang/ref/WeakReference;)V", "touchDelegateParent", "Landroid/view/ViewGroup;", "getTouchDelegateParent", "setTouchDelegateParent", "viewType", "", "getViewType", "()Ljava/lang/CharSequence;", "setViewType", "(Ljava/lang/CharSequence;)V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ViewTag {
    public static final int $stable = 8;
    private java.lang.Boolean disableFocusFlag;
    private java.lang.Integer eBottom;
    private java.lang.Integer eLeft;
    private java.lang.Integer eRight;
    private java.lang.Integer eTop;
    private java.lang.Boolean havenExpand;
    private java.lang.Boolean havenInflate;
    private java.lang.Boolean passRelativeCoordinate;
    private java.lang.ref.WeakReference<android.view.TouchDelegate> touchDelegate;
    private java.lang.ref.WeakReference<android.view.ViewGroup> touchDelegateParent;
    private java.lang.CharSequence viewType;

    public final java.lang.Boolean getDisableFocusFlag() {
        return this.disableFocusFlag;
    }

    public final java.lang.Integer getEBottom() {
        return this.eBottom;
    }

    public final java.lang.Integer getELeft() {
        return this.eLeft;
    }

    public final java.lang.Integer getERight() {
        return this.eRight;
    }

    public final java.lang.Integer getETop() {
        return this.eTop;
    }

    public final java.lang.Boolean getHavenExpand() {
        return this.havenExpand;
    }

    public final java.lang.Boolean getHavenInflate() {
        return this.havenInflate;
    }

    public final java.lang.Boolean getPassRelativeCoordinate() {
        return this.passRelativeCoordinate;
    }

    public final java.lang.ref.WeakReference<android.view.TouchDelegate> getTouchDelegate() {
        return this.touchDelegate;
    }

    public final java.lang.ref.WeakReference<android.view.ViewGroup> getTouchDelegateParent() {
        return this.touchDelegateParent;
    }

    public final java.lang.CharSequence getViewType() {
        return this.viewType;
    }

    public final void setDisableFocusFlag(java.lang.Boolean bool) {
        this.disableFocusFlag = bool;
    }

    public final void setEBottom(java.lang.Integer num) {
        this.eBottom = num;
    }

    public final void setELeft(java.lang.Integer num) {
        this.eLeft = num;
    }

    public final void setERight(java.lang.Integer num) {
        this.eRight = num;
    }

    public final void setETop(java.lang.Integer num) {
        this.eTop = num;
    }

    public final void setHavenExpand(java.lang.Boolean bool) {
        this.havenExpand = bool;
    }

    public final void setHavenInflate(java.lang.Boolean bool) {
        this.havenInflate = bool;
    }

    public final void setPassRelativeCoordinate(java.lang.Boolean bool) {
        this.passRelativeCoordinate = bool;
    }

    public final void setTouchDelegate(java.lang.ref.WeakReference<android.view.TouchDelegate> weakReference) {
        this.touchDelegate = weakReference;
    }

    public final void setTouchDelegateParent(java.lang.ref.WeakReference<android.view.ViewGroup> weakReference) {
        this.touchDelegateParent = weakReference;
    }

    public final void setViewType(java.lang.CharSequence charSequence) {
        this.viewType = charSequence;
    }
}
