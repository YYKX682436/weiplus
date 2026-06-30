package com.tencent.mm.feature.emoji;

/* loaded from: classes8.dex */
public final class w2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f66520b;

    public w2(android.content.Context context, int i17) {
        this.f66519a = context;
        this.f66520b = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        android.content.Context context = this.f66519a;
        if (z17) {
            n22.c.a(3);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_emoji_panel_type", 0);
            intent.putExtra("key_from_scene", 2);
            j45.l.j(context, "emoji", ".ui.EmojiCustomUI", intent, null);
        } else if (kotlin.jvm.internal.o.b(str, context.getString(com.tencent.mm.R.string.apj))) {
            n22.c.a(5);
        }
        if (this.f66520b <= 0 || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).finish();
    }
}
