package com.tencent.mm.plugin.emoji.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/widget/EmojiDragStackView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class EmojiDragStackView extends android.widget.FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiDragStackView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final android.view.View a(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, int i17, int i18, java.lang.Integer num) {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a6l, (android.view.ViewGroup) this, false);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18);
        layoutParams.gravity = 81;
        inflate.setLayoutParams(layoutParams);
        if (num != null) {
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486852mn1);
            textView.setText(num.toString());
            textView.setVisibility(0);
        }
        zq.h hVar = zq.h.f474972a;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.h88);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        hVar.d(emojiInfo, (android.widget.ImageView) findViewById, null);
        return inflate;
    }
}
