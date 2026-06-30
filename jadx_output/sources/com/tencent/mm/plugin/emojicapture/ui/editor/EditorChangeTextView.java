package com.tencent.mm.plugin.emojicapture.ui.editor;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB!\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010)\u001a\u00020\t¢\u0006\u0004\b*\u0010+B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b*\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u000e\u001a\u00020\u00052\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;", "Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "", "", "visible", "Ljz5/f0;", "setImeVisibility", "show", "setShow", "", "visibility", "setVisibility", "Lkotlin/Function1;", "callback", "setOnVisibleChangeCallback", "Lb32/u;", "u", "Lb32/u;", "getCallback", "()Lb32/u;", "setCallback", "(Lb32/u;)V", "x", "Z", "getTextChanged", "()Z", "setTextChanged", "(Z)V", "textChanged", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "y", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "reporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EditorChangeTextView extends com.tencent.mm.ui.widget.InsectRelativeLayout {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f98713o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f98714p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.EditText f98715q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f98716r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.view.TextColorSelector f98717s;

    /* renamed from: t, reason: collision with root package name */
    public int f98718t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public b32.u callback;

    /* renamed from: v, reason: collision with root package name */
    public int f98720v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f98721w;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean textChanged;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter reporter;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f98724z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorChangeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        new android.graphics.Rect();
        android.view.View.inflate(context, com.tencent.mm.R.layout.f488724a60, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.bes);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById;
        this.f98715q = editText;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bep);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f98713o = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ber);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f98714p = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f487275o42);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.view.TextColorSelector textColorSelector = (com.tencent.mm.plugin.recordvideo.ui.editor.view.TextColorSelector) findViewById4;
        this.f98717s = textColorSelector;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.cth);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5;
        this.f98716r = imageView;
        editText.setOnFocusChangeListener(new b32.n(this));
        editText.addTextChangedListener(new b32.o(this));
        findViewById2.setOnClickListener(new b32.p(this));
        findViewById3.setOnClickListener(new b32.q(this));
        imageView.setOnClickListener(new b32.r(this));
        textColorSelector.setColorList(y22.n.f459105a);
        textColorSelector.setSelected(0);
        textColorSelector.setColorSelectedCallback(new b32.s(this));
        setOnClickListener(new b32.t(this));
        setLayerType(1, null);
        this.f98724z = new b32.v(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImeVisibility(boolean z17) {
        java.lang.Runnable runnable = this.f98724z;
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

    @Override // com.tencent.mm.ui.widget.InsectRelativeLayout
    public boolean a(int i17) {
        this.f98720v = i17;
        boolean z17 = i17 > com.tencent.mm.ui.bl.c(getContext());
        if (!this.f98721w) {
            return false;
        }
        if (!z17) {
            return true;
        }
        this.f98721w = false;
        return false;
    }

    public final void e() {
        b32.u uVar = this.callback;
        if (uVar != null) {
            com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = ((b32.g) uVar).f17637a;
            r22.c presenter = captureEditorContainer.getPresenter();
            if (presenter != null) {
                ((w22.v) presenter).j(null, 0, false);
            }
            captureEditorContainer.f98699m.setShow(false);
        }
        this.f98715q.clearFocus();
        if (this.textChanged) {
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(16, getReporter().f98583d, 0L, 0L, 0L, 0L, 0L, 0, 0, getReporter().G);
        }
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(14, getReporter().f98583d, 0L, 0L, 0L, 0L, 0L, 0, 0, getReporter().G);
    }

    public final b32.u getCallback() {
        return this.callback;
    }

    public final com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter getReporter() {
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = this.reporter;
        if (emojiCaptureReporter != null) {
            return emojiCaptureReporter;
        }
        kotlin.jvm.internal.o.o("reporter");
        throw null;
    }

    public final boolean getTextChanged() {
        return this.textChanged;
    }

    public final void setCallback(b32.u uVar) {
        this.callback = uVar;
    }

    public void setOnVisibleChangeCallback(yz5.l lVar) {
    }

    public final void setReporter(com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter) {
        kotlin.jvm.internal.o.g(emojiCaptureReporter, "<set-?>");
        this.reporter = emojiCaptureReporter;
    }

    public void setShow(boolean z17) {
        if (z17) {
            setVisibility(0);
            setPadding(0, 0, 0, this.f98720v);
        } else {
            this.f98721w = true;
            setVisibility(8);
        }
    }

    public final void setTextChanged(boolean z17) {
        this.textChanged = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            this.f98715q.requestFocus();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorChangeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
