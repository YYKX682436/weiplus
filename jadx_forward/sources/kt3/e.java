package kt3;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt3.l f393515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kt3.l lVar) {
        super(1);
        this.f393515d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kt3.l lVar = this.f393515d;
        if (booleanValue) {
            lVar.z();
            com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab = lVar.B;
            if ((c11508x646260ab != null ? c11508x646260ab.m48789x65b1be3b() : null) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar = lVar.f393537x;
                if (mVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab2 = lVar.B;
                    mVar.b(c11508x646260ab2 != null ? c11508x646260ab2.m48789x65b1be3b() : null);
                    com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab3 = lVar.B;
                    if (c11508x646260ab3 != null) {
                        c11508x646260ab3.setVisibility(0);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab4 = lVar.B;
                    if (c11508x646260ab4 != null) {
                        c11508x646260ab4.setVisibility(8);
                    }
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab5 = lVar.B;
                if (c11508x646260ab5 != null) {
                    c11508x646260ab5.m48793xdb10fe20(new kt3.c(lVar));
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new kt3.d(lVar), 100L);
        } else {
            bi3.f fVar = lVar.f393534u;
            if (fVar != null) {
                fVar.a();
            }
        }
        return jz5.f0.f384359a;
    }
}
