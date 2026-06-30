package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/view/SearchImageBubbleView;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "anchorView", "Ljz5/f0;", "setAnchorView", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "setBubbleText", "", "width", "setViewWidth", "Landroid/view/View$OnClickListener;", "onClickListener", "setBubbleClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView */
/* loaded from: classes2.dex */
public final class C21802x45d2aa24 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f283050d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f283051e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f283052f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f283053g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Point f283054h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Point f283055i;

    /* renamed from: m, reason: collision with root package name */
    public int f283056m;

    /* renamed from: n, reason: collision with root package name */
    public int f283057n;

    /* renamed from: o, reason: collision with root package name */
    public int f283058o;

    /* renamed from: p, reason: collision with root package name */
    public int f283059p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21802x45d2aa24(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21802x45d2aa24.onMeasure(int, int):void");
    }

    /* renamed from: setAnchorView */
    public final void m79645xcf1614fc(android.view.View view) {
        this.f283052f = view;
    }

    /* renamed from: setBubbleClickListener */
    public final void m79646xfa6bc16e(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.f283050d;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bubbleTextView");
            throw null;
        }
    }

    /* renamed from: setBubbleText */
    public final void m79647x26214ddb(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        android.widget.TextView textView = this.f283050d;
        if (textView != null) {
            textView.setText(text);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bubbleTextView");
            throw null;
        }
    }

    /* renamed from: setViewWidth */
    public final void m79648xfd8913df(int i17) {
        this.f283056m = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21802x45d2aa24(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f283053g = true;
        this.f283054h = new android.graphics.Point(0, 0);
        this.f283055i = new android.graphics.Point(0, 0);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bkg, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.mee);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.mef);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f283050d = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b1q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f283051e = findViewById3;
        this.f283058o = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561760ry);
        this.f283057n = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561758rw);
    }
}
