package l26;

/* loaded from: classes16.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final n16.g f396797a;

    /* renamed from: b, reason: collision with root package name */
    public final r26.t f396798b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Collection f396799c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f396800d;

    /* renamed from: e, reason: collision with root package name */
    public final l26.i[] f396801e;

    public q(n16.g gVar, r26.t tVar, java.util.Collection collection, yz5.l lVar, l26.i... iVarArr) {
        this.f396797a = gVar;
        this.f396798b = tVar;
        this.f396799c = collection;
        this.f396800d = lVar;
        this.f396801e = iVarArr;
    }

    public /* synthetic */ q(n16.g gVar, l26.i[] iVarArr, yz5.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(gVar, iVarArr, (i17 & 4) != 0 ? l26.n.f396790d : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(n16.g name, l26.i[] checks, yz5.l additionalChecks) {
        this(name, (r26.t) null, (java.util.Collection) null, additionalChecks, (l26.i[]) java.util.Arrays.copyOf(checks, checks.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checks, "checks");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ q(java.util.Collection collection, l26.i[] iVarArr, yz5.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(collection, iVarArr, (i17 & 4) != 0 ? l26.p.f396795d : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(java.util.Collection nameList, l26.i[] checks, yz5.l additionalChecks) {
        this((n16.g) null, (r26.t) null, nameList, additionalChecks, (l26.i[]) java.util.Arrays.copyOf(checks, checks.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameList, "nameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checks, "checks");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(additionalChecks, "additionalChecks");
    }
}
