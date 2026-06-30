package vq;

/* loaded from: classes4.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520765d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        f21.g K = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K();
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520765d;
        if (K == null) {
            dp.a.m125854x26a183b((android.content.Context) emojiDebugUI, (java.lang.CharSequence) "eggList null!", 0).show();
        } else {
            int Di = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Di(37, 5);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("version: " + K.f340432e + " -- " + Di + '\n');
            java.util.LinkedList eggList = K.f340431d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eggList, "eggList");
            sb6.append("list:\n ".concat(kz5.n0.g0(eggList, "\n", null, null, 0, null, vq.w.f520763d, 30, null)));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(emojiDebugUI);
            u1Var.g(sb6.toString());
            u1Var.a(true);
            u1Var.q(false);
        }
        return jz5.f0.f384359a;
    }
}
