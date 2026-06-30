package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes8.dex */
public class u2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiPaidUI f98208d;

    public u2(com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI) {
        this.f98208d = emojiPaidUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiPaidUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        float rawX = motionEvent.getRawX();
        com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI = this.f98208d;
        emojiPaidUI.I = rawX;
        emojiPaidUI.f97812J = motionEvent.getRawY();
        yj0.a.i(false, this, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
