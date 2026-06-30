package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class z9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f167007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12346x9c8f3056 f167008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u65.a f167009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12346x9c8f3056 c12346x9c8f3056, u65.a aVar) {
        super(2);
        this.f167007d = hVar;
        this.f167008e = c12346x9c8f3056;
        this.f167009f = aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ModularizingPkgBatchLoadTransaction", "waitForPkgList onError(" + intValue + ", " + str + ')');
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar = this.f167007d;
        if (hVar != null) {
            hVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12348x9f2a4bd6(2, null, null, false, intValue, str, 6, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12346x9c8f3056 c12346x9c8f3056 = this.f167008e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.i1.a(c12346x9c8f3056.f165986d, c12346x9c8f3056.f165988f, c12346x9c8f3056.f165989g, c12346x9c8f3056.f165990h, intValue);
        this.f167009f.b();
        return jz5.f0.f384359a;
    }
}
