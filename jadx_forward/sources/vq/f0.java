package vq;

/* loaded from: classes.dex */
public final class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520690d;

    public f0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        this.f520690d = emojiDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f520690d.finish();
        return true;
    }
}
