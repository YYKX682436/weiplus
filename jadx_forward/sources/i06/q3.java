package i06;

/* loaded from: classes16.dex */
public abstract class q3 extends i06.k0 implements f06.v {

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.Object f368263s = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public final i06.u1 f368264m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f368265n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f368266o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f368267p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f368268q;

    /* renamed from: r, reason: collision with root package name */
    public final i06.c4 f368269r;

    public q3(i06.u1 u1Var, java.lang.String str, java.lang.String str2, o06.o1 o1Var, java.lang.Object obj) {
        this.f368264m = u1Var;
        this.f368265n = str;
        this.f368266o = str2;
        this.f368267p = obj;
        this.f368268q = jz5.h.a(jz5.i.f384363e, new i06.p3(this));
        this.f368269r = new i06.c4(o1Var, new i06.o3(this));
    }

    /* renamed from: equals */
    public boolean m134397xb2c87fbf(java.lang.Object obj) {
        i06.q3 c17 = i06.o4.c(obj);
        return c17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368264m, c17.f368264m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368265n, c17.f368265n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368266o, c17.f368266o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368267p, c17.f368267p);
    }

    @Override // f06.c
    /* renamed from: getName */
    public java.lang.String mo9624xfb82e301() {
        return this.f368265n;
    }

    /* renamed from: hashCode */
    public int m134398x8cdac1b() {
        return (((this.f368264m.hashCode() * 31) + this.f368265n.hashCode()) * 31) + this.f368266o.hashCode();
    }

    @Override // i06.k0
    public j06.k i() {
        return r().i();
    }

    @Override // f06.c
    /* renamed from: isSuspend */
    public boolean mo128642x6f0de7b2() {
        return false;
    }

    @Override // i06.k0
    public i06.u1 j() {
        return this.f368264m;
    }

    @Override // i06.k0
    public j06.k k() {
        r().getClass();
        return null;
    }

    @Override // i06.k0
    public boolean o() {
        return !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368267p, p3321xbce91901.jvm.p3324x21ffc6bd.e.f72681xc42f6aad);
    }

    public final java.lang.reflect.Member p() {
        if (!l().U()) {
            return null;
        }
        i06.y b17 = i06.k4.f368219a.b(l());
        if (b17 instanceof i06.w) {
            i06.w wVar = (i06.w) b17;
            l16.j jVar = wVar.f368305c;
            if ((jVar.f396580e & 16) == 16) {
                l16.g gVar = jVar.f396585m;
                int i17 = gVar.f396566e;
                if ((i17 & 1) == 1) {
                    if ((i17 & 2) == 2) {
                        int i18 = gVar.f396567f;
                        k16.g gVar2 = wVar.f368306d;
                        return this.f368264m.j(gVar2.mo141776x2fec8307(i18), gVar2.mo141776x2fec8307(gVar.f396568g));
                    }
                }
                return null;
            }
        }
        return (java.lang.reflect.Field) this.f368268q.mo141623x754a37bb();
    }

    @Override // i06.k0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public o06.o1 l() {
        java.lang.Object mo152xb9724478 = this.f368269r.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "invoke(...)");
        return (o06.o1) mo152xb9724478;
    }

    public abstract i06.k3 r();

    /* renamed from: toString */
    public java.lang.String m134399x9616526c() {
        return i06.j4.f368203a.c(l());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q3(i06.u1 container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        this(container, name, signature, null, obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q3(i06.u1 r8, o06.o1 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "descriptor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            n16.g r0 = r9.mo132800xfb82e301()
            java.lang.String r3 = r0.h()
            java.lang.String r0 = "asString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r0)
            i06.k4 r0 = i06.k4.f368219a
            i06.y r0 = r0.b(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = p3321xbce91901.jvm.p3324x21ffc6bd.e.f72681xc42f6aad
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i06.q3.<init>(i06.u1, o06.o1):void");
    }
}
