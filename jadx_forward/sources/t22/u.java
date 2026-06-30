package t22;

/* loaded from: classes.dex */
public final class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f496642d;

    public u(android.content.Context context) {
        this.f496642d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_emoji_panel_type", 1);
        j45.l.j(this.f496642d, "emoji", ".ui.EmojiCustomUI", intent, null);
    }
}
