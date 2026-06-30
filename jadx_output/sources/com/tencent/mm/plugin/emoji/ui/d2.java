package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f97928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity, android.view.View view) {
        super(0);
        this.f97927d = emojiEditorActivity;
        this.f97928e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f97927d.f97761i;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        androidx.transition.Fade fade = new androidx.transition.Fade(1);
        fade.f12383f = 100L;
        u4.g1.a(viewGroup, fade);
        android.view.View view = this.f97928e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupViews$3$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupViews$3$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
