package ho4;

/* loaded from: classes.dex */
public final class f implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final e14.s f364422d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f364423e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f364424f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f364425g;

    public f(e14.s parent, java.lang.String itemTagName, yz5.l onCreate, yz5.a onExit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCreate, "onCreate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onExit, "onExit");
        this.f364422d = parent;
        this.f364423e = itemTagName;
        this.f364424f = onCreate;
        this.f364425g = onExit;
    }

    @Override // e14.s
    /* renamed from: enterParent */
    public e14.s mo126724xfd3879a2(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.String str = this.f364423e;
        return (!(r26.n0.N(str) ^ true) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, str)) ? (e14.s) this.f364424f.mo146xb9724478(this) : this;
    }

    @Override // e14.s
    /* renamed from: exitParent */
    public e14.s mo126726x2cbdf68() {
        this.f364425g.mo152xb9724478();
        return this.f364422d;
    }

    @Override // e14.s
    /* renamed from: writeAttr */
    public void mo126751xac249e70(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
    }

    @Override // e14.s
    /* renamed from: writeText */
    public void mo126752xac2d09ac(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
    }
}
