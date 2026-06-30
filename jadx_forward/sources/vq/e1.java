package vq;

/* loaded from: classes5.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520687d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        java.util.LinkedList NewConfigList = p05.p3.f432175d.f469526d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList, "NewConfigList");
        java.lang.String g07 = kz5.n0.g0(NewConfigList, "\n\n", null, null, 0, null, p05.i3.f432084d, 30, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("----------cgiInfo----------\n");
        sb6.append(g07);
        sb6.append("\n\n\n----------localInfo----------\n");
        java.util.LinkedList NewConfigList2 = p05.p3.f432174c.f469526d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NewConfigList2, "NewConfigList");
        sb6.append(kz5.n0.g0(NewConfigList2, "\n\n", null, null, 0, null, p05.h3.f432070d, 30, null));
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f520687d);
        u1Var.g(sb7);
        u1Var.a(true);
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
