package vq;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f520706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f520708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(0);
        this.f520706d = u3Var;
        this.f520707e = emojiDebugUI;
        this.f520708f = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f520706d.setMessage(this.f520707e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0d) + ' ' + this.f520708f.f391649d);
        return jz5.f0.f384359a;
    }
}
