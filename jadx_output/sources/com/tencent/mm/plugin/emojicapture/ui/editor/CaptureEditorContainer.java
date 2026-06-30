package com.tencent.mm.plugin.emojicapture.ui.editor;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010%J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer;", "Landroid/widget/RelativeLayout;", "Lr22/d;", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "reporter", "Ljz5/f0;", "setReporter", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView;", "getVideoPlayView", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "getItemContainer", "", "visibility", "setVisibility", "Lr22/c;", "e", "Lr22/c;", "getPresenter", "()Lr22/c;", "setPresenter", "(Lr22/c;)V", "presenter", "", "B", "J", "getStartTick", "()J", "setStartTick", "(J)V", "startTick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class CaptureEditorContainer extends android.widget.RelativeLayout implements r22.d {
    public final android.graphics.drawable.Drawable A;

    /* renamed from: B, reason: from kotlin metadata */
    public long startTick;
    public yz5.a C;
    public final b32.m D;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98693d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public r22.c presenter;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter f98695f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f98696g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f98698i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView f98699m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f98700n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f98701o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f98702p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f98703q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f98704r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f98705s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.ImageView f98706t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel f98707u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f98708v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f98709w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f98710x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f98711y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f98712z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureEditorContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98693d = "MicroMsg.CaptureEditorContainer";
        new android.graphics.Matrix();
        android.view.View.inflate(context, com.tencent.mm.R.layout.a6m, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dag);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f98696g = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d8g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer = (com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer) findViewById2;
        this.f98698i = editorItemContainer;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.bet);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView = (com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView) findViewById3;
        this.f98699m = editorChangeTextView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.d96);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f98700n = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.d8s);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f98701o = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.d8w);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f98702p = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.d7f);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f98703q = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.d8t);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById8;
        this.f98704r = imageView;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.d8x);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById9;
        this.f98705s = imageView2;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.d7g);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById10;
        this.f98706t = imageView3;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.odz);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.f485934jl1);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_remove_bg, y22.n.c(this));
        kotlin.jvm.internal.o.f(e17, "getColorDrawable(...)");
        this.f98708v = e17;
        android.graphics.drawable.Drawable e18 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_remove_bg, y22.n.b(this));
        kotlin.jvm.internal.o.f(e18, "getColorDrawable(...)");
        this.f98709w = e18;
        android.graphics.drawable.Drawable e19 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_play_quickly, y22.n.c(this));
        kotlin.jvm.internal.o.f(e19, "getColorDrawable(...)");
        this.f98710x = e19;
        android.graphics.drawable.Drawable e27 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_play_quickly, y22.n.b(this));
        kotlin.jvm.internal.o.f(e27, "getColorDrawable(...)");
        this.f98711y = e27;
        android.graphics.drawable.Drawable e28 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_add_emoji, y22.n.c(this));
        kotlin.jvm.internal.o.f(e28, "getColorDrawable(...)");
        this.f98712z = e28;
        android.graphics.drawable.Drawable e29 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_add_emoji, y22.n.b(this));
        kotlin.jvm.internal.o.f(e29, "getColorDrawable(...)");
        this.A = e29;
        imageView.setImageDrawable(e18);
        imageView2.setImageDrawable(e27);
        imageView3.setImageDrawable(e29);
        ((android.widget.ImageView) findViewById11).setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_previous, y22.n.b(this)));
        ((android.widget.ImageView) findViewById12).setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_done, y22.n.c(this)));
        findViewById5.setOnClickListener(new b32.a(this));
        findViewById6.setOnClickListener(new b32.b(this));
        findViewById7.setOnClickListener(new b32.c(this));
        findViewById(com.tencent.mm.R.id.d_x).setOnClickListener(new b32.d(this));
        findViewById(com.tencent.mm.R.id.d_w).setOnClickListener(new b32.e(this));
        setOnClickListener(new b32.f(this));
        editorChangeTextView.setCallback(new b32.g(this));
        editorItemContainer.setStateChangeListener(new b32.h(this));
        com.tencent.mm.api.SmileyPanel b17 = qk.w9.b(context);
        this.f98707u = b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureEditorContainer", "initSmileyPanel " + b17);
        int i18 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        b17.setEntranceScene(3);
        b17.setSearchSource(6);
        b17.setShowSmiley(false);
        b17.setShowClose(true);
        b17.setVisibility(8);
        b17.i();
        qk.v9 d17 = qk.w9.d();
        d17.f364351a = new b32.i(this);
        b17.setCallback(d17);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, qk.w9.a(getContext()));
        layoutParams.addRule(12);
        addView(b17, layoutParams);
        b17.setTranslationY(layoutParams.height);
        this.D = new b32.m(this);
    }

    public void a(boolean z17) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f98707u;
        float f17 = chatFooterPanel.getLayoutParams().height;
        android.view.View view = this.f98703q;
        if (z17) {
            view.setSelected(true);
            chatFooterPanel.setVisibility(0);
            chatFooterPanel.animate().translationY(0.0f).start();
        } else {
            view.setSelected(false);
            chatFooterPanel.animate().translationY(f17).withEndAction(new b32.j(this)).start();
        }
        this.f98706t.setImageDrawable(view.isSelected() ? this.f98712z : this.A);
    }

    public void b(boolean z17, java.lang.CharSequence charSequence, int i17) {
        int safeInsetTop;
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView editorChangeTextView = this.f98699m;
        if (!z17) {
            editorChangeTextView.e();
            return;
        }
        editorChangeTextView.setVisibility(0);
        android.widget.EditText editText = editorChangeTextView.f98715q;
        editText.setText(charSequence);
        if (charSequence != null) {
            editText.setSelection(charSequence.length());
        }
        int[] iArr = y22.n.f459105a;
        int V = kz5.z.V(iArr, i17);
        if (V == -1) {
            V = 0;
        }
        editorChangeTextView.f98717s.setSelected(V);
        int i18 = iArr[V];
        editorChangeTextView.f98718t = i18;
        int i19 = y22.n.f459106b[V];
        editText.setTextColor(i18);
        editorChangeTextView.textChanged = false;
        if (fp.h.c(28)) {
            android.view.WindowInsets rootWindowInsets = editorChangeTextView.getRootWindowInsets();
            android.view.DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
            if (displayCutout == null || (safeInsetTop = displayCutout.getSafeInsetTop()) <= 0 || editorChangeTextView.getPaddingTop() == safeInsetTop) {
                return;
            }
            editorChangeTextView.setPadding(0, safeInsetTop, 0, 0);
        }
    }

    @Override // r22.d
    /* renamed from: getItemContainer, reason: from getter */
    public com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer getF98698i() {
        return this.f98698i;
    }

    public final r22.c getPresenter() {
        return this.presenter;
    }

    public final long getStartTick() {
        return this.startTick;
    }

    @Override // r22.d
    /* renamed from: getVideoPlayView, reason: from getter */
    public com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView getF98697h() {
        return this.f98697h;
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (windowInsets != null) {
            findViewById(com.tencent.mm.R.id.dah).setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
        }
        android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        kotlin.jvm.internal.o.f(onApplyWindowInsets, "onApplyWindowInsets(...)");
        return onApplyWindowInsets;
    }

    public final void setPresenter(r22.c cVar) {
        this.presenter = cVar;
    }

    public final void setReporter(com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter reporter) {
        kotlin.jvm.internal.o.g(reporter, "reporter");
        this.f98695f = reporter;
        this.f98699m.setReporter(reporter);
    }

    public final void setStartTick(long j17) {
        this.startTick = j17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f98697h;
        if (emojiVideoPlayTextureView == null) {
            return;
        }
        emojiVideoPlayTextureView.setVisibility(i17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureEditorContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
