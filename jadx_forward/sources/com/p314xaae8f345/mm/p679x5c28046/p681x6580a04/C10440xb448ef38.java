package com.p314xaae8f345.mm.p679x5c28046.p681x6580a04;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/emoji/panel/SmileyPanelView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/tencent/mm/pluginsdk/ui/k0;", "C", "Lcom/tencent/mm/pluginsdk/ui/k0;", "getTextOperationListener", "()Lcom/tencent/mm/pluginsdk/ui/k0;", "setTextOperationListener", "(Lcom/tencent/mm/pluginsdk/ui/k0;)V", "textOperationListener", "Lir/h;", "D", "Lir/h;", "getConfig", "()Lir/h;", "setConfig", "(Lir/h;)V", "config", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.emoji.panel.SmileyPanelView */
/* loaded from: classes15.dex */
public final class C10440xb448ef38 extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 {
    public final yz5.a A;
    public final kr.i B;

    /* renamed from: C, reason: from kotlin metadata */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 textOperationListener;

    /* renamed from: D, reason: from kotlin metadata */
    public ir.h config;

    /* renamed from: v, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f146452v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ImageView f146453w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f146454x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.Button f146455y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Rect f146456z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10440xb448ef38(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f146456z = new android.graphics.Rect();
        kr.i iVar = new kr.i();
        this.B = iVar;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a76, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dcg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f146452v = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dcd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f146453w = imageView;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.dce);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f146454x = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.dcw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById4;
        this.f146455y = button;
        imageView.setOnClickListener(new kr.d(this));
        button.setOnClickListener(new kr.e(this));
        imageView.setOnTouchListener(iVar);
        this.A = new kr.f(this);
    }

    public final ir.h getConfig() {
        return this.config;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 getTextOperationListener() {
        return this.textOperationListener;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        post(new kr.g(this));
    }

    /* renamed from: setConfig */
    public final void m43704x78bda44(ir.h hVar) {
        this.config = hVar;
    }

    /* renamed from: setTextOperationListener */
    public final void m43705xedb9864c(com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 k0Var) {
        this.textOperationListener = k0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10440xb448ef38(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
