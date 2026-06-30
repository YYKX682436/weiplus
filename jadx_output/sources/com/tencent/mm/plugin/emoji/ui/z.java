package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class z implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98568d;

    public z(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI) {
        this.f98568d = emojiCustomUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f98568d;
        emojiCustomUI.f97700f.I();
        emojiCustomUI.V6(true);
        emojiCustomUI.f97717y.setVisibility(0);
        com.tencent.mm.plugin.emoji.ui.widget.EmojiDragStackView emojiDragStackView = emojiCustomUI.f97717y;
        androidx.recyclerview.widget.GridLayoutManager layoutManager = emojiCustomUI.f97701g;
        java.util.ArrayList emojis = emojiCustomUI.f97711s;
        m22.x dragGesture = emojiCustomUI.U;
        emojiDragStackView.getClass();
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(emojis, "emojis");
        kotlin.jvm.internal.o.g(dragGesture, "dragGesture");
        emojiDragStackView.setVisibility(0);
        emojiDragStackView.removeAllViews();
        android.view.View findViewByPosition = layoutManager.findViewByPosition(layoutManager.w());
        if (findViewByPosition == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        android.view.ViewGroup.LayoutParams layoutParams = emojiDragStackView.getLayoutParams();
        layoutParams.width = findViewByPosition.getWidth();
        layoutParams.height = findViewByPosition.getHeight();
        if (emojis.size() >= 3) {
            android.view.View a17 = emojiDragStackView.a((com.tencent.mm.storage.emotion.EmojiInfo) emojis.get(emojis.size() - 3), findViewByPosition.getWidth(), findViewByPosition.getHeight(), null);
            a17.setTranslationX(ym5.x.a(emojiDragStackView.getContext(), -6.0f));
            a17.setTranslationY(ym5.x.a(emojiDragStackView.getContext(), -4.0f));
            a17.setRotation(3.0f);
            a17.setElevation(ym5.x.a(emojiDragStackView.getContext(), 4.0f));
            emojiDragStackView.addView(a17);
        }
        if (emojis.size() >= 2) {
            android.view.View a18 = emojiDragStackView.a((com.tencent.mm.storage.emotion.EmojiInfo) emojis.get(emojis.size() - 2), findViewByPosition.getWidth(), findViewByPosition.getHeight(), null);
            a18.setTranslationX(ym5.x.a(emojiDragStackView.getContext(), -4.0f));
            a18.setTranslationY(ym5.x.a(emojiDragStackView.getContext(), -4.0f));
            a18.setRotation(-3.0f);
            a18.setElevation(ym5.x.a(emojiDragStackView.getContext(), 8.0f));
            emojiDragStackView.addView(a18);
        }
        android.view.View a19 = emojiDragStackView.a((com.tencent.mm.storage.emotion.EmojiInfo) emojis.get(emojis.size() - 1), findViewByPosition.getWidth(), findViewByPosition.getHeight(), java.lang.Integer.valueOf(emojis.size()));
        a19.setElevation(ym5.x.a(emojiDragStackView.getContext(), 16.0f));
        emojiDragStackView.addView(a19);
        android.view.ViewGroup.LayoutParams layoutParams2 = emojiDragStackView.getLayoutParams();
        layoutParams2.width = findViewByPosition.getWidth() + ym5.x.a(emojiDragStackView.getContext(), 14.0f);
        layoutParams2.height = findViewByPosition.getHeight() + ym5.x.a(emojiDragStackView.getContext(), 12.0f);
        emojiDragStackView.setLayoutParams(layoutParams2);
        dragGesture.f323080p.set(0, 0, findViewByPosition.getWidth(), findViewByPosition.getHeight());
        emojiCustomUI.f97699e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        emojiCustomUI.f97699e.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.z$$a
            @Override // java.lang.Runnable
            public final void run() {
                m22.e eVar = com.tencent.mm.plugin.emoji.ui.z.this.f98568d.f97716x;
                eVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFreeSortingItemDec", "switchToDragMode: ");
                eVar.f323041i = true;
                eVar.f323036d.D0();
            }
        });
        emojiCustomUI.f97700f.notifyItemRangeChanged(emojiCustomUI.f97701g.w(), emojiCustomUI.f97701g.getChildCount());
    }
}
