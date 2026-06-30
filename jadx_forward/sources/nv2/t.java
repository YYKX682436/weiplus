package nv2;

/* loaded from: classes2.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nv2.v f422117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(nv2.v vVar) {
        super(1);
        this.f422117d = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        ya2.b2 contact;
        so2.j5 it = (so2.j5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = it instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it : null;
        java.lang.String D0 = (abstractC14490x69736cb5 == null || (contact = abstractC14490x69736cb5.getContact()) == null) ? "" : contact.D0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCleaner", "cleanFeed username:".concat(D0));
        nv2.v vVar = this.f422117d;
        nv2.x xVar = vVar.f422127e;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("followRecorder");
            throw null;
        }
        if (!xVar.f422156a.contains(D0)) {
            nv2.x xVar2 = vVar.f422128f;
            if (xVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noSeeAuthorRecorder");
                throw null;
            }
            if (!xVar2.f422156a.contains(D0)) {
                z17 = false;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(z17);
    }
}
