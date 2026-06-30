package nv2;

/* loaded from: classes2.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nv2.v f422120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(nv2.v vVar) {
        super(1);
        this.f422120d = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ya2.b2 contact;
        so2.j5 it = (so2.j5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = it instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it : null;
        java.lang.String D0 = (abstractC14490x69736cb5 == null || (contact = abstractC14490x69736cb5.getContact()) == null) ? "" : contact.D0();
        nv2.x xVar = this.f422120d.f422128f;
        if (xVar != null) {
            return java.lang.Boolean.valueOf(xVar.f422156a.contains(D0));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noSeeAuthorRecorder");
        throw null;
    }
}
