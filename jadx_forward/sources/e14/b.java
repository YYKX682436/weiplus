package e14;

/* loaded from: classes12.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.j f327946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e14.k f327947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f327948f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar, e14.k kVar, java.lang.Integer num) {
        super(1);
        this.f327946d = jVar;
        this.f327947e = kVar;
        this.f327948f = num;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        e14.p pVar;
        e14.s visitor = (e14.s) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitor, "visitor");
        java.lang.Class cls = this.f327946d.f273691a.f273697e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls);
        e14.k kVar = (e14.k) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        kVar.m126740xb94e83e2(visitor);
        e14.k kVar2 = this.f327947e;
        z17 = kVar2.f69648xa789af54;
        kVar.f69648xa789af54 = z17;
        pVar = kVar2.f69651xf2aadfff;
        kVar.f69651xf2aadfff = pVar;
        kVar2.m75926xea0771b(this.f327948f.intValue(), kVar);
        return kVar;
    }
}
