package vq;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f520689e;

    public f(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, int i17) {
        this.f520688d = emojiDebugUI;
        this.f520689e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/debug/EmojiDebugUI$DebugAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((vq.a) this.f520688d.e.get(this.f520689e)).a();
        yj0.a.h(this, "com/tencent/mm/emoji/debug/EmojiDebugUI$DebugAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
