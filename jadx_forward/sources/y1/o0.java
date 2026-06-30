package y1;

/* loaded from: classes14.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f540316a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f540317b;

    public o0(java.lang.String name, yz5.p mergePolicy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mergePolicy, "mergePolicy");
        this.f540316a = name;
        this.f540317b = mergePolicy;
    }

    public final void a(y1.p0 thisRef, f06.v property, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisRef, "thisRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        ((y1.l) thisRef).g(this, obj);
    }

    /* renamed from: toString */
    public java.lang.String m176347x9616526c() {
        return "SemanticsPropertyKey: " + this.f540316a;
    }

    public /* synthetic */ o0(java.lang.String str, yz5.p pVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? y1.n0.f540315d : pVar);
    }
}
