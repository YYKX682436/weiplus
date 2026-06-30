package g26;

/* loaded from: classes16.dex */
public final class v implements g26.u {

    /* renamed from: c, reason: collision with root package name */
    public final g26.l f349548c;

    /* renamed from: d, reason: collision with root package name */
    public final g26.j f349549d;

    /* renamed from: e, reason: collision with root package name */
    public final r16.x f349550e;

    public v(g26.l kotlinTypeRefiner, g26.j kotlinTypePreparator, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i18 = i17 & 2;
        g26.h hVar = g26.h.f349526a;
        kotlinTypePreparator = i18 != 0 ? hVar : kotlinTypePreparator;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f349548c = kotlinTypeRefiner;
        this.f349549d = kotlinTypePreparator;
        this.f349550e = new r16.x(r16.x.f450213e, kotlinTypeRefiner, hVar, null);
    }

    public boolean a(f26.o0 a17, f26.o0 b17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "b");
        f26.b2 a18 = g26.a.a(false, false, null, this.f349549d, this.f349548c, 6, null);
        f26.c3 a19 = a17.z0();
        f26.c3 b18 = b17.z0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a19, "a");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b18, "b");
        return f26.g.f340695a.e(a18, a19, b18);
    }

    public boolean b(f26.o0 subtype, f26.o0 supertype) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subtype, "subtype");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(supertype, "supertype");
        f26.b2 a17 = g26.a.a(true, false, null, this.f349549d, this.f349548c, 6, null);
        f26.c3 subType = subtype.z0();
        f26.c3 superType = supertype.z0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subType, "subType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(superType, "superType");
        return f26.g.i(f26.g.f340695a, a17, subType, superType, false, 8, null);
    }
}
