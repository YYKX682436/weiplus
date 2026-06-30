package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/StatusPostEntryButton;", "Lcom/tencent/mm/ui/blur/BlurView;", "", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "Ljz5/f0;", "setTitle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.StatusPostEntryButton */
/* loaded from: classes3.dex */
public final class C18622xe469ff12 extends com.p314xaae8f345.mm.ui.p2647x2e3067.C21592xe744b7cc {

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f255010n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18622xe469ff12(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setTitle */
    public final void m71790x53bfe316(java.lang.CharSequence title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f255010n.setText(title);
    }

    public /* synthetic */ C18622xe469ff12(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18622xe469ff12(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setClickable(true);
        setFocusable(true);
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77671x8113c22a);
        float a18 = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 18.5f);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(a17);
        gradientDrawable.setCornerRadius(a18);
        setBackground(gradientDrawable);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12.0f), 0, ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16.0f), 0);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        addView(linearLayout);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(r0, r0);
        layoutParams.setMarginEnd(ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4.0f));
        c22699x3dcdb352.setLayoutParams(layoutParams);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80873x3bd419f7);
        c22699x3dcdb352.m82040x7541828(-1);
        linearLayout.addView(c22699x3dcdb352);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(-1);
        textView.setTextSize(2, 15.0f);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        this.f255010n = textView;
        linearLayout.addView(textView);
    }
}
