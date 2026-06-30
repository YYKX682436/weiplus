package u1;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u1.b2 f505139a;

    public j(boolean z17) {
        jz5.h.a(jz5.i.f384364f, u1.i.f505132d);
        this.f505139a = new u1.b2(new u1.h());
    }

    public final void a(u1.w node) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(node, "node");
        if (!node.x()) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f505139a.add(node);
    }

    public final boolean b(u1.w node) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(node, "node");
        if (node.x()) {
            return this.f505139a.remove(node);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    /* renamed from: toString */
    public java.lang.String m167353x9616526c() {
        java.lang.String obj = this.f505139a.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "set.toString()");
        return obj;
    }
}
