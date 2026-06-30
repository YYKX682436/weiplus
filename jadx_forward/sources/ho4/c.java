package ho4;

/* loaded from: classes.dex */
public final class c implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final e14.s f364413d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f364414e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f364415f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f364416g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f364417h;

    public c(e14.s sVar, java.lang.String itemName, yz5.l onWrite, yz5.a onExit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemName, "itemName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onWrite, "onWrite");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onExit, "onExit");
        this.f364413d = sVar;
        this.f364414e = itemName;
        this.f364415f = onWrite;
        this.f364416g = onExit;
    }

    @Override // e14.s
    /* renamed from: enterParent */
    public e14.s mo126724xfd3879a2(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (!this.f364417h) {
            java.lang.String str = this.f364414e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, str) || (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "item") && r26.n0.N(str))) {
                this.f364417h = true;
                return this;
            }
        }
        return new ho4.g(this);
    }

    @Override // e14.s
    /* renamed from: exitParent */
    public e14.s mo126726x2cbdf68() {
        if (this.f364417h) {
            this.f364417h = false;
            return this;
        }
        this.f364416g.mo152xb9724478();
        return this.f364413d;
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
        if (this.f364417h) {
            this.f364415f.mo146xb9724478(text);
        }
    }
}
