package c16;

/* loaded from: classes16.dex */
public final class a extends f26.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f26.x2 f37944a;

    /* renamed from: b, reason: collision with root package name */
    public final c16.c f37945b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37946c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37947d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f37948e;

    /* renamed from: f, reason: collision with root package name */
    public final f26.z0 f37949f;

    public /* synthetic */ a(f26.x2 x2Var, c16.c cVar, boolean z17, boolean z18, java.util.Set set, f26.z0 z0Var, int i17, kotlin.jvm.internal.i iVar) {
        this(x2Var, (i17 & 2) != 0 ? c16.c.f37950d : cVar, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? false : z18, (i17 & 16) != 0 ? null : set, (i17 & 32) != 0 ? null : z0Var);
    }

    public static c16.a a(c16.a aVar, f26.x2 howThisTypeIsUsed, c16.c cVar, boolean z17, boolean z18, java.util.Set set, f26.z0 z0Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            howThisTypeIsUsed = aVar.f37944a;
        }
        if ((i17 & 2) != 0) {
            cVar = aVar.f37945b;
        }
        c16.c flexibility = cVar;
        if ((i17 & 4) != 0) {
            z17 = aVar.f37946c;
        }
        boolean z19 = z17;
        if ((i17 & 8) != 0) {
            z18 = aVar.f37947d;
        }
        boolean z27 = z18;
        if ((i17 & 16) != 0) {
            set = aVar.f37948e;
        }
        java.util.Set set2 = set;
        if ((i17 & 32) != 0) {
            z0Var = aVar.f37949f;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        kotlin.jvm.internal.o.g(flexibility, "flexibility");
        return new c16.a(howThisTypeIsUsed, flexibility, z19, z27, set2, z0Var);
    }

    public final c16.a b(c16.c flexibility) {
        kotlin.jvm.internal.o.g(flexibility, "flexibility");
        return a(this, null, flexibility, false, false, null, null, 61, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof c16.a)) {
            return false;
        }
        c16.a aVar = (c16.a) obj;
        return kotlin.jvm.internal.o.b(aVar.f37949f, this.f37949f) && aVar.f37944a == this.f37944a && aVar.f37945b == this.f37945b && aVar.f37946c == this.f37946c && aVar.f37947d == this.f37947d;
    }

    @Override // f26.c0
    public int hashCode() {
        f26.z0 z0Var = this.f37949f;
        int hashCode = z0Var != null ? z0Var.hashCode() : 0;
        int hashCode2 = hashCode + (hashCode * 31) + this.f37944a.hashCode();
        int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f37945b.hashCode();
        int i17 = hashCode3 + (hashCode3 * 31) + (this.f37946c ? 1 : 0);
        return i17 + (i17 * 31) + (this.f37947d ? 1 : 0);
    }

    public java.lang.String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f37944a + ", flexibility=" + this.f37945b + ", isRaw=" + this.f37946c + ", isForAnnotationParameter=" + this.f37947d + ", visitedTypeParameters=" + this.f37948e + ", defaultType=" + this.f37949f + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f26.x2 howThisTypeIsUsed, c16.c flexibility, boolean z17, boolean z18, java.util.Set set, f26.z0 z0Var) {
        super(howThisTypeIsUsed, set, z0Var);
        kotlin.jvm.internal.o.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        kotlin.jvm.internal.o.g(flexibility, "flexibility");
        this.f37944a = howThisTypeIsUsed;
        this.f37945b = flexibility;
        this.f37946c = z17;
        this.f37947d = z18;
        this.f37948e = set;
        this.f37949f = z0Var;
    }
}
