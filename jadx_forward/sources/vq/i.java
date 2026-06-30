package vq;

/* loaded from: classes.dex */
public final class i extends vq.a {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f520698a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f520699b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f520700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, yz5.a title, yz5.a value, yz5.a aVar) {
        super(emojiDebugUI);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f520698a = title;
        this.f520699b = value;
        this.f520700c = aVar;
    }

    @Override // vq.a
    public void a() {
        yz5.a aVar = this.f520700c;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // vq.a
    public java.lang.String c() {
        return (java.lang.String) this.f520698a.mo152xb9724478();
    }

    @Override // vq.a
    public java.lang.String d() {
        return (java.lang.String) this.f520699b.mo152xb9724478();
    }
}
