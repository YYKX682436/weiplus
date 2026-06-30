package lr;

/* loaded from: classes.dex */
public final class k implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402082a;

    public k(android.content.Context context) {
        this.f402082a = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_emoji_panel_type", 1);
            j45.l.j(this.f402082a, "emoji", ".ui.EmojiCustomUI", intent, null);
        }
    }
}
