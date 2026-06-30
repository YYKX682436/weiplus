package gf5;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.n f352965a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f352966b;

    public p(gf5.n definition, java.util.List aliases) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(definition, "definition");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aliases, "aliases");
        this.f352965a = definition;
        this.f352966b = aliases;
    }

    public final java.util.List a() {
        return this.f352966b;
    }

    public final gf5.n b() {
        return this.f352965a;
    }

    /* renamed from: equals */
    public boolean m131481xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.p)) {
            return false;
        }
        gf5.p pVar = (gf5.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352965a, pVar.f352965a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352966b, pVar.f352966b);
    }

    /* renamed from: hashCode */
    public int m131482x8cdac1b() {
        return (this.f352965a.m131476x8cdac1b() * 31) + this.f352966b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131483x9616526c() {
        return "LanguagePackageEntry(definition=" + this.f352965a + ", aliases=" + this.f352966b + ')';
    }

    public /* synthetic */ p(gf5.n nVar, java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(nVar, (i17 & 2) != 0 ? kz5.p0.f395529d : list);
    }
}
