package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010#\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010&R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006'"}, d2 = {"Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "Landroid/widget/RelativeLayout;", "", "g", "Z", "getDiscardKeyboard", "()Z", "setDiscardKeyboard", "(Z)V", "discardKeyboard", "Lkotlin/Function1;", "", "h", "Lyz5/l;", "getInsectCallback", "()Lyz5/l;", "setInsectCallback", "(Lyz5/l;)V", "insectCallback", "i", "getForbidLayout", "setForbidLayout", "forbidLayout", "m", "getLayoutOnce", "setLayoutOnce", "layoutOnce", "n", "getHasLaidOut", "setHasLaidOut", "hasLaidOut", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.InsectRelativeLayout */
/* loaded from: classes3.dex */
public class C22611x654ca43e extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292814d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f292815e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f292816f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean discardKeyboard;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l insectCallback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean forbidLayout;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean layoutOnce;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hasLaidOut;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22611x654ca43e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f292814d = "MicroMsg.InsectLayout";
        this.f292815e = new android.graphics.Rect();
        this.f292816f = new int[2];
    }

    public boolean a(int i17) {
        return false;
    }

    public final boolean getDiscardKeyboard() {
        return this.discardKeyboard;
    }

    public final boolean getForbidLayout() {
        return this.forbidLayout;
    }

    public final boolean getHasLaidOut() {
        return this.hasLaidOut;
    }

    public final yz5.l getInsectCallback() {
        return this.insectCallback;
    }

    public final boolean getLayoutOnce() {
        return this.layoutOnce;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        yz5.l lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f292814d, "InsectRelativeLayout onLayout " + this.forbidLayout);
        if (this.forbidLayout) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        if (this.layoutOnce && this.hasLaidOut) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        boolean z18 = true;
        this.hasLaidOut = true;
        android.graphics.Rect rect = this.f292815e;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.f292816f;
        getLocationOnScreen(iArr);
        int i28 = ((i27 - i18) + iArr[1]) - rect.bottom;
        boolean a17 = a(i28);
        if (!a17 && (lVar = this.insectCallback) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
            a17 = ((java.lang.Boolean) lVar.mo146xb9724478(java.lang.Integer.valueOf(i28))).booleanValue();
        }
        boolean z19 = i28 > com.p314xaae8f345.mm.ui.bl.c(getContext()) * 3;
        if (!a17 && (!z19 || !this.discardKeyboard)) {
            z18 = false;
        }
        if (!z18 && i28 >= 0 && getPaddingBottom() != i28) {
            post(new al5.i0(this, i28));
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    /* renamed from: setDiscardKeyboard */
    public final void m81286x376ccde3(boolean z17) {
        this.discardKeyboard = z17;
    }

    /* renamed from: setForbidLayout */
    public final void m81287x8e9e4560(boolean z17) {
        this.forbidLayout = z17;
    }

    /* renamed from: setHasLaidOut */
    public final void m81288x92262de6(boolean z17) {
        this.hasLaidOut = z17;
    }

    /* renamed from: setInsectCallback */
    public final void m81289xaada124f(yz5.l lVar) {
        this.insectCallback = lVar;
    }

    /* renamed from: setLayoutOnce */
    public final void m81290x30bfeecd(boolean z17) {
        this.layoutOnce = z17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22611x654ca43e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
