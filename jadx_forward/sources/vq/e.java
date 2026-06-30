package vq;

/* loaded from: classes.dex */
public final class e extends vq.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f520681a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f520682b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f520683c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f520684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, java.lang.String title, com.p314xaae8f345.mm.p2621x8fb0427b.u3 configKey, java.util.List contentArray, java.util.List valueArray) {
        super(emojiDebugUI);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configKey, "configKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentArray, "contentArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueArray, "valueArray");
        this.f520685e = emojiDebugUI;
        this.f520681a = title;
        this.f520682b = configKey;
        this.f520683c = contentArray;
        this.f520684d = valueArray;
    }

    @Override // vq.a
    public void a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int size = this.f520683c.size();
        for (int i17 = 0; i17 < size; i17++) {
            linkedList.add(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520685e;
        java.util.List list = this.f520683c;
        db5.e1.b(emojiDebugUI, "", list, kz5.n0.S0(kz5.c0.g(list)), "", new vq.d(this.f520685e, this));
    }

    @Override // vq.a
    public java.lang.String c() {
        return this.f520681a;
    }

    @Override // vq.a
    public java.lang.String d() {
        java.util.List list = this.f520684d;
        java.lang.Object obj = list.get(0);
        boolean z17 = com.tencent.mm.emoji.debug.EmojiDebugUI.g;
        this.f520685e.getClass();
        int indexOf = list.indexOf(gm0.j1.u().c().m(this.f520682b, obj));
        java.util.List list2 = this.f520683c;
        return (indexOf < 0 || indexOf >= list2.size()) ? (java.lang.String) list2.get(0) : (java.lang.String) list2.get(indexOf);
    }
}
