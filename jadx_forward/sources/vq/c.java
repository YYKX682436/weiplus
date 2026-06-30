package vq;

/* loaded from: classes.dex */
public final class c extends vq.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f520669a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f520670b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f520671c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, java.lang.String title, yz5.a valueGetter, yz5.a aVar) {
        super(emojiDebugUI);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueGetter, "valueGetter");
        this.f520672d = emojiDebugUI;
        this.f520669a = title;
        this.f520670b = valueGetter;
        this.f520671c = aVar;
    }

    @Override // vq.a
    public void a() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        yz5.a aVar = this.f520671c;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f520672d.f;
        if (c1163xf1deaba4 == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }

    @Override // vq.a
    public java.lang.String c() {
        return this.f520669a;
    }

    @Override // vq.a
    public java.lang.String d() {
        return (java.lang.String) this.f520670b.mo152xb9724478();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, java.lang.String title, java.lang.String value, yz5.a aVar) {
        this(emojiDebugUI, title, new vq.b(value), aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
    }
}
