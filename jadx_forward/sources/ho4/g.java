package ho4;

/* loaded from: classes.dex */
public final class g implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final e14.s f364426d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f364427e = new java.util.ArrayList();

    public g(e14.s sVar) {
        this.f364426d = sVar;
    }

    @Override // e14.s
    /* renamed from: enterParent */
    public e14.s mo126724xfd3879a2(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        ((java.util.ArrayList) this.f364427e).add(name);
        return this;
    }

    @Override // e14.s
    /* renamed from: exitParent */
    public e14.s mo126726x2cbdf68() {
        java.util.List list = this.f364427e;
        if (!(!list.isEmpty())) {
            return this.f364426d;
        }
        kz5.h0.E(list);
        return this;
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
