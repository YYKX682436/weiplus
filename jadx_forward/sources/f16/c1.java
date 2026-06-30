package f16;

/* loaded from: classes16.dex */
public final class c1 extends f16.e {

    /* renamed from: a, reason: collision with root package name */
    public final p06.a f340241a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f340242b;

    /* renamed from: c, reason: collision with root package name */
    public final a16.l f340243c;

    /* renamed from: d, reason: collision with root package name */
    public final x06.c f340244d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f340245e;

    public /* synthetic */ c1(p06.a aVar, boolean z17, a16.l lVar, x06.c cVar, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(aVar, z17, lVar, cVar, (i17 & 16) != 0 ? false : z18);
    }

    public n16.e e(i26.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        f26.z0 z0Var = f26.z2.f340775a;
        o06.j i17 = ((f26.o0) iVar).w0().i();
        o06.g gVar = i17 instanceof o06.g ? (o06.g) i17 : null;
        if (gVar != null) {
            return r16.i.g(gVar);
        }
        return null;
    }

    public c1(p06.a aVar, boolean z17, a16.l containerContext, x06.c containerApplicabilityType, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerContext, "containerContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerApplicabilityType, "containerApplicabilityType");
        this.f340241a = aVar;
        this.f340242b = z17;
        this.f340243c = containerContext;
        this.f340244d = containerApplicabilityType;
        this.f340245e = z18;
    }
}
