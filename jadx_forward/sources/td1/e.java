package td1;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12222x1751690c f499133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f499134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f499135f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12222x1751690c c12222x1751690c, yz5.l lVar, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        super(2);
        this.f499133d = c12222x1751690c;
        this.f499134e = lVar;
        this.f499135f = rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        boolean n07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.n0();
        yz5.l lVar = this.f499134e;
        if (n07 || booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 z07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.z0();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            z07.u0(java.lang.System.currentTimeMillis(), false, null, 3, 0, this.f499133d.f164441d, longValue, new td1.d(lVar, longValue, this.f499135f), null);
        } else {
            lVar.mo146xb9724478(java.lang.Long.valueOf(longValue));
        }
        return jz5.f0.f384359a;
    }
}
