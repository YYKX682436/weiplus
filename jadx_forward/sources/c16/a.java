package c16;

/* loaded from: classes16.dex */
public final class a extends f26.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f26.x2 f119477a;

    /* renamed from: b, reason: collision with root package name */
    public final c16.c f119478b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f119479c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119480d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f119481e;

    /* renamed from: f, reason: collision with root package name */
    public final f26.z0 f119482f;

    public /* synthetic */ a(f26.x2 x2Var, c16.c cVar, boolean z17, boolean z18, java.util.Set set, f26.z0 z0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(x2Var, (i17 & 2) != 0 ? c16.c.f119483d : cVar, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? false : z18, (i17 & 16) != 0 ? null : set, (i17 & 32) != 0 ? null : z0Var);
    }

    public static c16.a a(c16.a aVar, f26.x2 howThisTypeIsUsed, c16.c cVar, boolean z17, boolean z18, java.util.Set set, f26.z0 z0Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            howThisTypeIsUsed = aVar.f119477a;
        }
        if ((i17 & 2) != 0) {
            cVar = aVar.f119478b;
        }
        c16.c flexibility = cVar;
        if ((i17 & 4) != 0) {
            z17 = aVar.f119479c;
        }
        boolean z19 = z17;
        if ((i17 & 8) != 0) {
            z18 = aVar.f119480d;
        }
        boolean z27 = z18;
        if ((i17 & 16) != 0) {
            set = aVar.f119481e;
        }
        java.util.Set set2 = set;
        if ((i17 & 32) != 0) {
            z0Var = aVar.f119482f;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flexibility, "flexibility");
        return new c16.a(howThisTypeIsUsed, flexibility, z19, z27, set2, z0Var);
    }

    public final c16.a b(c16.c flexibility) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flexibility, "flexibility");
        return a(this, null, flexibility, false, false, null, null, 61, null);
    }

    /* renamed from: equals */
    public boolean m14034xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof c16.a)) {
            return false;
        }
        c16.a aVar = (c16.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f119482f, this.f119482f) && aVar.f119477a == this.f119477a && aVar.f119478b == this.f119478b && aVar.f119479c == this.f119479c && aVar.f119480d == this.f119480d;
    }

    @Override // f26.c0
    /* renamed from: hashCode */
    public int mo14035x8cdac1b() {
        f26.z0 z0Var = this.f119482f;
        int m128970x8cdac1b = z0Var != null ? z0Var.m128970x8cdac1b() : 0;
        int hashCode = m128970x8cdac1b + (m128970x8cdac1b * 31) + this.f119477a.hashCode();
        int hashCode2 = hashCode + (hashCode * 31) + this.f119478b.hashCode();
        int i17 = hashCode2 + (hashCode2 * 31) + (this.f119479c ? 1 : 0);
        return i17 + (i17 * 31) + (this.f119480d ? 1 : 0);
    }

    /* renamed from: toString */
    public java.lang.String m14036x9616526c() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f119477a + ", flexibility=" + this.f119478b + ", isRaw=" + this.f119479c + ", isForAnnotationParameter=" + this.f119480d + ", visitedTypeParameters=" + this.f119481e + ", defaultType=" + this.f119482f + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f26.x2 howThisTypeIsUsed, c16.c flexibility, boolean z17, boolean z18, java.util.Set set, f26.z0 z0Var) {
        super(howThisTypeIsUsed, set, z0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flexibility, "flexibility");
        this.f119477a = howThisTypeIsUsed;
        this.f119478b = flexibility;
        this.f119479c = z17;
        this.f119480d = z18;
        this.f119481e = set;
        this.f119482f = z0Var;
    }
}
