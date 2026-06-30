package q26;

/* loaded from: classes7.dex */
public final class b extends kz5.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Iterator f441359f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f441360g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f441361h;

    public b(java.util.Iterator source, yz5.l keySelector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keySelector, "keySelector");
        this.f441359f = source;
        this.f441360g = keySelector;
        this.f441361h = new java.util.HashSet();
    }

    @Override // kz5.c
    public void b() {
        java.lang.Object next;
        do {
            java.util.Iterator it = this.f441359f;
            if (!it.hasNext()) {
                this.f395495d = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f441361h.add(this.f441360g.mo146xb9724478(next)));
        this.f395496e = next;
        this.f395495d = 1;
    }
}
