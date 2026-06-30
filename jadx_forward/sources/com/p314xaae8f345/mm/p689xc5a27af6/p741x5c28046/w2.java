package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes8.dex */
public final class w2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f148053b;

    public w2(android.content.Context context, int i17) {
        this.f148052a = context;
        this.f148053b = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        android.content.Context context = this.f148052a;
        if (z17) {
            n22.c.a(3);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_emoji_panel_type", 0);
            intent.putExtra("key_from_scene", 2);
            j45.l.j(context, "emoji", ".ui.EmojiCustomUI", intent, null);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj))) {
            n22.c.a(5);
        }
        if (this.f148053b <= 0 || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).finish();
    }
}
