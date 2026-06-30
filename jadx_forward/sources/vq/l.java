package vq;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f520711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f520713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f520714g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f520715h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f520716i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.Object obj, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        super(1);
        this.f520711d = c0Var;
        this.f520712e = emojiDebugUI;
        this.f520713f = i17;
        this.f520714g = f0Var;
        this.f520715h = obj;
        this.f520716i = u3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f520711d.f391645d = !((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f520712e.d, "addEmoji: " + this.f520713f + ", " + this.f520711d.f391645d);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f520714g;
        f0Var.f391649d = f0Var.f391649d + 1;
        pm0.v.X(new vq.k(this.f520716i, this.f520712e, f0Var));
        java.lang.Object obj2 = this.f520715h;
        synchronized (obj2) {
            obj2.notifyAll();
        }
        return jz5.f0.f384359a;
    }
}
