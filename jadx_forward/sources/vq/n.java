package vq;

/* loaded from: classes5.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f520724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f520726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f520727g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f520728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f520729i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f520730m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.List list, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        super(0);
        this.f520724d = list;
        this.f520725e = emojiDebugUI;
        this.f520726f = c0Var;
        this.f520727g = c0Var2;
        this.f520728h = obj;
        this.f520729i = f0Var;
        this.f520730m = u3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int size = this.f520724d.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f520725e.d, "addEmoji: start " + i17 + ' ' + ((java.lang.String) this.f520724d.get(i17)));
            com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520725e;
            java.lang.String str = (java.lang.String) this.f520724d.get(i17);
            vq.l lVar = new vq.l(this.f520726f, this.f520725e, i17, this.f520729i, this.f520728h, this.f520730m);
            emojiDebugUI.getClass();
            new pr.b(0, 4, kz5.b0.c(str)).l().H(new vq.p(emojiDebugUI, str, lVar));
            if (this.f520726f.f391645d || this.f520727g.f391645d) {
                break;
            }
            java.lang.Object obj = this.f520728h;
            synchronized (obj) {
                obj.wait();
            }
        }
        pm0.v.X(new vq.m(this.f520725e, this.f520729i, this.f520730m));
        return jz5.f0.f384359a;
    }
}
