package ho4;

/* loaded from: classes.dex */
public final class b implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364409d;

    /* renamed from: e, reason: collision with root package name */
    public final e14.s f364410e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f364411f;

    /* renamed from: g, reason: collision with root package name */
    public int f364412g;

    public b(java.lang.String prefixTag, java.lang.String tag, e14.s childVisitor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefixTag, "prefixTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(childVisitor, "childVisitor");
        this.f364409d = tag;
        this.f364410e = childVisitor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f364411f = arrayList;
        java.util.List f07 = r26.n0.f0(prefixTag, new java.lang.String[]{"."}, false, 0, 6, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : f07) {
            if (!r26.n0.N((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
    }

    @Override // e14.s
    /* renamed from: enterParent */
    public e14.s mo126724xfd3879a2(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        int i17 = this.f364412g;
        java.util.List list = this.f364411f;
        if (i17 > ((java.util.ArrayList) list).size()) {
            zn4.f.f556032a.a(new ho4.a(name));
            return new ho4.g(this);
        }
        if (this.f364412g == ((java.util.ArrayList) list).size()) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, this.f364409d) ? this.f364410e : new ho4.g(this);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, (java.lang.String) ((java.util.ArrayList) list).get(this.f364412g))) {
            return new ho4.g(this);
        }
        this.f364412g++;
        return this;
    }

    @Override // e14.s
    /* renamed from: exitParent */
    public e14.s mo126726x2cbdf68() {
        int i17 = this.f364412g;
        if (i17 > 0) {
            this.f364412g = i17 - 1;
        }
        if (this.f364412g > 0) {
            return this;
        }
        return null;
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
