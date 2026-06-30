package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB!\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR8\u0010\u0016\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/LazyBitmapDrawableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "g", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "h", "getInvalidateVerifyTag", "setInvalidateVerifyTag", "(Ljava/lang/String;)V", "invalidateVerifyTag", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "Ljz5/f0;", "i", "Ljava/lang/ref/WeakReference;", "getInvalidDrawableCallback", "()Ljava/lang/ref/WeakReference;", "setInvalidDrawableCallback", "(Ljava/lang/ref/WeakReference;)V", "invalidDrawableCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.LazyBitmapDrawableTextView */
/* loaded from: classes15.dex */
public final class C14368x94f70033 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public java.lang.String invalidateVerifyTag;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public java.lang.ref.WeakReference invalidDrawableCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14368x94f70033(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.TAG = "LazyBitmapDrawableTextView";
        this.invalidateVerifyTag = "";
    }

    /* renamed from: getInvalidDrawableCallback */
    public final java.lang.ref.WeakReference<yz5.l> m57539x588756e4() {
        return this.invalidDrawableCallback;
    }

    public final java.lang.String getInvalidateVerifyTag() {
        return this.invalidateVerifyTag;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        java.lang.ref.WeakReference weakReference;
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invalidateDrawable drawable:");
        boolean z17 = drawable instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.n1;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var = z17 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.n1) drawable : null;
        sb6.append(n1Var != null ? n1Var.f272434m : null);
        r4Var.M2(this.TAG, sb6.toString());
        java.lang.String str = this.invalidateVerifyTag;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var2 = z17 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.n1) drawable : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, n1Var2 != null ? n1Var2.f272434m : null) && (weakReference = this.invalidDrawableCallback) != null && (lVar = (yz5.l) weakReference.get()) != null) {
            lVar.mo146xb9724478(this.invalidateVerifyTag);
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(who, "who");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(what, "what");
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scheduleDrawable drawable:");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var = who instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.n1) who : null;
        sb6.append(n1Var != null ? n1Var.f272434m : null);
        r4Var.M2(this.TAG, sb6.toString());
        super.scheduleDrawable(who, what, j17);
    }

    /* renamed from: setInvalidDrawableCallback */
    public final void m57542x6eb73c58(java.lang.ref.WeakReference<yz5.l> weakReference) {
        this.invalidDrawableCallback = weakReference;
    }

    /* renamed from: setInvalidateVerifyTag */
    public final void m57543xab957da4(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.invalidateVerifyTag = str;
    }

    @Override // android.view.View
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable) {
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unscheduleDrawable drawable:");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var = drawable instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.n1) drawable : null;
        sb6.append(n1Var != null ? n1Var.f272434m : null);
        r4Var.M2(this.TAG, sb6.toString());
        super.unscheduleDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable who) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(who, "who");
        boolean verifyDrawable = super.verifyDrawable(who);
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verifyDrawable superValud:");
        sb6.append(verifyDrawable);
        sb6.append(" view tag:");
        sb6.append(this.invalidateVerifyTag);
        sb6.append(",drawable tag:");
        boolean z17 = who instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.n1;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var = z17 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.n1) who : null;
        sb6.append(n1Var != null ? n1Var.f272434m : null);
        r4Var.M2(this.TAG, sb6.toString());
        if (!verifyDrawable) {
            java.lang.String str = this.invalidateVerifyTag;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var2 = z17 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.n1) who : null;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, n1Var2 != null ? n1Var2.f272434m : null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14368x94f70033(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.TAG = "LazyBitmapDrawableTextView";
        this.invalidateVerifyTag = "";
    }
}
