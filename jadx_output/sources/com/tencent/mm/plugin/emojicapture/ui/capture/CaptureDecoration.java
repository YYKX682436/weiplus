package com.tencent.mm.plugin.emojicapture.ui.capture;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureDecoration;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "emojiInfo", "Ljz5/f0;", "setImitateEmoji", "Lt85/j;", "stickerInfo", "setStickerInfo", "", "getText", "", "getTextColor", "getAttachEmoji", "Landroid/graphics/Matrix;", "getAttachEmojiMatrix", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class CaptureDecoration extends androidx.constraintlayout.widget.ConstraintLayout {
    public com.tencent.mm.storage.emotion.EmojiInfo A;
    public t85.j B;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer f98661v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView f98662w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sticker.ui.view.CaptureStickerHint f98663x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f98664y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView f98665z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureDecoration(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.f488726a62, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d_t);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer editorItemContainer = (com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer) findViewById;
        this.f98661v = editorItemContainer;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.daf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f98662w = (com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.da7);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f98663x = (com.tencent.mm.sticker.ui.view.CaptureStickerHint) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.d_y);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f98664y = findViewById4;
        editorItemContainer.setDeleteEnalbe(false);
    }

    /* renamed from: getAttachEmoji, reason: from getter */
    public final com.tencent.mm.storage.emotion.EmojiInfo getA() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    public final android.graphics.Matrix getAttachEmojiMatrix() {
        com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView emojiEditorItemView;
        android.graphics.Matrix touchMatrix;
        java.util.Iterator it = this.f98661v.getAllItemViews().iterator();
        while (true) {
            if (!it.hasNext()) {
                emojiEditorItemView = 0;
                break;
            }
            emojiEditorItemView = it.next();
            if (((b32.c0) emojiEditorItemView) instanceof com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView) {
                break;
            }
        }
        com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView emojiEditorItemView2 = emojiEditorItemView instanceof com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView ? emojiEditorItemView : null;
        return (emojiEditorItemView2 == null || (touchMatrix = emojiEditorItemView2.getTouchMatrix()) == null) ? new android.graphics.Matrix() : touchMatrix;
    }

    public final java.lang.String getText() {
        java.lang.CharSequence f98781h = this.f98662w.getF98781h();
        if (f98781h != null) {
            return f98781h.toString();
        }
        return null;
    }

    public final int getTextColor() {
        int f98786p = this.f98662w.getF98786p();
        if (f98786p == 0) {
            return -1;
        }
        int[] iArr = y22.n.f459105a;
        int i17 = iArr[0];
        int red = android.graphics.Color.red(f98786p) - android.graphics.Color.red(i17);
        int green = android.graphics.Color.green(f98786p) - android.graphics.Color.green(i17);
        int blue = android.graphics.Color.blue(f98786p) - android.graphics.Color.blue(i17);
        double sqrt = java.lang.Math.sqrt((red * red) + (green * green) + (blue * blue));
        kz5.x0 it = new e06.k(1, 6).iterator();
        while (((e06.j) it).f246214f) {
            int i18 = iArr[it.b()];
            int red2 = android.graphics.Color.red(f98786p) - android.graphics.Color.red(i18);
            int green2 = android.graphics.Color.green(f98786p) - android.graphics.Color.green(i18);
            int blue2 = android.graphics.Color.blue(f98786p) - android.graphics.Color.blue(i18);
            double sqrt2 = java.lang.Math.sqrt((red2 * red2) + (green2 * green2) + (blue2 * blue2));
            if (java.lang.Double.compare(sqrt, sqrt2) > 0) {
                i17 = i18;
                sqrt = sqrt2;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
            kotlin.jvm.internal.o.f(onApplyWindowInsets, "onApplyWindowInsets(...)");
            return onApplyWindowInsets;
        }
        android.view.View view = this.f98664y;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7u) + windowInsets.getSystemWindowInsetTop();
            view.setLayoutParams(marginLayoutParams);
        }
        android.view.WindowInsets onApplyWindowInsets2 = super.onApplyWindowInsets(windowInsets);
        kotlin.jvm.internal.o.f(onApplyWindowInsets2, "onApplyWindowInsets(...)");
        return onApplyWindowInsets2;
    }

    public final void setImitateEmoji(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.A = emojiInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (kotlin.jvm.internal.o.b(r0.f416474a, r14 != null ? r14.f416474a : null) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setStickerInfo(t85.j r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration.setStickerInfo(t85.j):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureDecoration(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
