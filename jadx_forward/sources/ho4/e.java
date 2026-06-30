package ho4;

/* loaded from: classes.dex */
public final class e implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final e14.s f364420d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f364421e;

    public e(e14.s sVar, yz5.l onWrite) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onWrite, "onWrite");
        this.f364420d = sVar;
        this.f364421e = onWrite;
    }

    @Override // e14.s
    /* renamed from: enterParent */
    public e14.s mo126724xfd3879a2(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return new ho4.g(this);
    }

    @Override // e14.s
    /* renamed from: exitParent */
    public e14.s mo126726x2cbdf68() {
        return this.f364420d;
    }

    @Override // e14.s
    /* renamed from: writeAttr */
    public void mo126751xac249e70(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        zn4.f.f556033b.mo146xb9724478(new ho4.d(key, value));
    }

    @Override // e14.s
    /* renamed from: writeText */
    public void mo126752xac2d09ac(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (!r26.n0.N(text)) {
            this.f364421e.mo146xb9724478(text);
        }
    }
}
