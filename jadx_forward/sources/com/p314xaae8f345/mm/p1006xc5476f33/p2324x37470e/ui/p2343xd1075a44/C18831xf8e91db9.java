package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002R6\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/PagInputView;", "Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "", "visible", "Ljz5/f0;", "setImeVisibility", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "setup", "getResult", "show", "setShow", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/vlog/ui/widget/ChangeTextCallback;", "t", "Lyz5/l;", "getTextChangeCallback", "()Lyz5/l;", "setTextChangeCallback", "(Lyz5/l;)V", "textChangeCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.PagInputView */
/* loaded from: classes5.dex */
public final class C18831xf8e91db9 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f257656o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f257657p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.EditText f257658q;

    /* renamed from: r, reason: collision with root package name */
    public int f257659r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f257660s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public yz5.l textChangeCallback;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f257662u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18831xf8e91db9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a5o, this);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a7p);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.d6_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f257656o = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.d6a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f257657p = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.d6v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById3;
        this.f257658q = editText;
        editText.setOnFocusChangeListener(new cq4.a(this));
        findViewById.setOnClickListener(new cq4.b(this));
        findViewById2.setOnClickListener(new cq4.c(this));
        setOnClickListener(new cq4.d(this));
        this.f257662u = new cq4.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setImeVisibility */
    public final void m72699x1359fc71(boolean z17) {
        java.lang.Runnable runnable = this.f257662u;
        if (z17) {
            post(runnable);
            return;
        }
        removeCallbacks(runnable);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e
    public boolean a(int i17) {
        this.f257659r = i17;
        boolean z17 = i17 > com.p314xaae8f345.mm.ui.bl.c(getContext());
        if (!this.f257660s) {
            return false;
        }
        if (!z17) {
            return true;
        }
        this.f257660s = false;
        return false;
    }

    /* renamed from: getResult */
    public final java.lang.String m72700x2d64eb13() {
        return this.f257658q.getText().toString();
    }

    public final yz5.l getTextChangeCallback() {
        return this.textChangeCallback;
    }

    /* renamed from: setShow */
    public final void m72702x76500a7f(boolean z17) {
        android.widget.EditText editText = this.f257658q;
        if (z17) {
            setVisibility(0);
            setPadding(0, 0, 0, this.f257659r);
            editText.requestFocus();
        } else {
            editText.clearFocus();
            this.f257660s = true;
            setVisibility(8);
        }
    }

    /* renamed from: setTextChangeCallback */
    public final void m72703xac70caa4(yz5.l lVar) {
        this.textChangeCallback = lVar;
    }

    /* renamed from: setup */
    public final void m72704x6843a7d(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        android.widget.EditText editText = this.f257658q;
        editText.setText(text);
        editText.setSelection(0, text.length());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18831xf8e91db9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
