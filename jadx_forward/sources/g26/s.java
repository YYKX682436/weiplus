package g26;

/* loaded from: classes16.dex */
public final class s implements s16.b {

    /* renamed from: a, reason: collision with root package name */
    public final f26.l2 f349540a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f349541b;

    /* renamed from: c, reason: collision with root package name */
    public final g26.s f349542c;

    /* renamed from: d, reason: collision with root package name */
    public final o06.e2 f349543d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f349544e;

    public s(f26.l2 projection, yz5.a aVar, g26.s sVar, o06.e2 e2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projection, "projection");
        this.f349540a = projection;
        this.f349541b = aVar;
        this.f349542c = sVar;
        this.f349543d = e2Var;
        this.f349544e = jz5.h.a(jz5.i.f384363e, new g26.p(this));
    }

    @Override // f26.c2
    public java.util.Collection a() {
        java.util.List list = (java.util.List) this.f349544e.mo141623x754a37bb();
        return list == null ? kz5.p0.f395529d : list;
    }

    public g26.s b(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.l2 a17 = this.f349540a.a(kotlinTypeRefiner);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "refine(...)");
        g26.r rVar = this.f349541b != null ? new g26.r(this, kotlinTypeRefiner) : null;
        g26.s sVar = this.f349542c;
        if (sVar == null) {
            sVar = this;
        }
        return new g26.s(a17, rVar, sVar, this.f349543d);
    }

    /* renamed from: equals */
    public boolean m130744xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g26.s.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        g26.s sVar = (g26.s) obj;
        g26.s sVar2 = this.f349542c;
        if (sVar2 == null) {
            sVar2 = this;
        }
        g26.s sVar3 = sVar.f349542c;
        if (sVar3 != null) {
            sVar = sVar3;
        }
        return sVar2 == sVar;
    }

    @Override // f26.c2
    /* renamed from: getParameters */
    public java.util.List mo9613x99879e0() {
        return kz5.p0.f395529d;
    }

    @Override // s16.b
    /* renamed from: getProjection */
    public f26.l2 mo130745x78d58245() {
        return this.f349540a;
    }

    @Override // f26.c2
    public l06.o h() {
        f26.o0 mo128949xfb85f7b0 = this.f349540a.mo128949xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b0, "getType(...)");
        return j26.c.e(mo128949xfb85f7b0);
    }

    /* renamed from: hashCode */
    public int m130746x8cdac1b() {
        g26.s sVar = this.f349542c;
        return sVar != null ? sVar.m130746x8cdac1b() : super.hashCode();
    }

    @Override // f26.c2
    public o06.j i() {
        return null;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m130747x9616526c() {
        return "CapturedType(" + this.f349540a + ')';
    }

    public /* synthetic */ s(f26.l2 l2Var, yz5.a aVar, g26.s sVar, o06.e2 e2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(l2Var, (i17 & 2) != 0 ? null : aVar, (i17 & 4) != 0 ? null : sVar, (i17 & 8) != 0 ? null : e2Var);
    }
}
