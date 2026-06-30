package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001d\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/tencent/mm/ui/widget/MMClearEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "Landroid/view/View$OnFocusChangeListener;", "l", "Ljz5/f0;", "setOnFocusChangeListener", "Landroid/view/View$OnTouchListener;", "getDefaultOnTouchListener", "", "G", "Z", "getMEnableRestoreState", "()Z", "setMEnableRestoreState", "(Z)V", "mEnableRestoreState", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "H", "Landroid/graphics/drawable/Drawable;", "getImgX", "()Landroid/graphics/drawable/Drawable;", "setImgX", "(Landroid/graphics/drawable/Drawable;)V", "imgX", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.MMClearEditText */
/* loaded from: classes5.dex */
public final class C22618x59d05a04 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 {
    public static final /* synthetic */ int K = 0;

    /* renamed from: G, reason: from kotlin metadata */
    public boolean mEnableRestoreState;

    /* renamed from: H, reason: from kotlin metadata */
    public android.graphics.drawable.Drawable imgX;
    public android.view.View.OnFocusChangeListener I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View.OnTouchListener f292838J;

    public C22618x59d05a04(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.imgX = com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f_);
        this.f292838J = new al5.v0(this);
        r();
    }

    private final void r() {
        if (this.imgX == null) {
            this.imgX = com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f_);
        }
        android.graphics.drawable.Drawable drawable = this.imgX;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.imgX.getIntrinsicHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMClearEditText", "imgX width %d height %d", java.lang.Integer.valueOf(this.imgX.getIntrinsicWidth()), java.lang.Integer.valueOf(this.imgX.getIntrinsicHeight()));
        u();
        setHeight(this.imgX.getIntrinsicHeight() + (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561431ib) * 5));
        setOnTouchListener(this.f292838J);
        addTextChangedListener(new al5.t0(this));
        super.setOnFocusChangeListener(new al5.u0(this));
        jg5.c.f381198a.a(this, 1);
    }

    /* renamed from: getDefaultOnTouchListener, reason: from getter */
    public final android.view.View.OnTouchListener getF292838J() {
        return this.f292838J;
    }

    public final android.graphics.drawable.Drawable getImgX() {
        return this.imgX;
    }

    public final boolean getMEnableRestoreState() {
        return this.mEnableRestoreState;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof android.widget.TextView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        if (!this.mEnableRestoreState) {
            parcelable = android.view.View.BaseSavedState.EMPTY_STATE;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017
    public void s(java.lang.String srcString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcString, "srcString");
        int selectionStart = getSelectionStart();
        setText(pg5.d.a(getContext(), srcString));
        int length = getText().length() - srcString.length();
        if (length <= 0) {
            mo81549xf579a34a(selectionStart);
            return;
        }
        int i17 = selectionStart + length;
        if (i17 <= getText().length()) {
            mo81549xf579a34a(i17);
        }
    }

    /* renamed from: setImgX */
    public final void m81320x764b9077(android.graphics.drawable.Drawable drawable) {
        this.imgX = drawable;
    }

    /* renamed from: setMEnableRestoreState */
    public final void m81321x8941af51(boolean z17) {
        this.mEnableRestoreState = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, android.view.View, fl5.i
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.I = onFocusChangeListener;
    }

    public final void u() {
        if (r26.n0.N(getText().toString()) || !isFocused()) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.imgX, getCompoundDrawables()[3]);
        }
    }

    public C22618x59d05a04(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.imgX = com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f_);
        this.f292838J = new al5.v0(this);
        r();
    }
}
