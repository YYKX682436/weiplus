package mf2;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f407614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.r4 f407615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f407616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f407617g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f407618h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, mm2.r4 r4Var, boolean z17, boolean z18, boolean z19) {
        super(0);
        this.f407614d = c14197x319b1b9e;
        this.f407615e = r4Var;
        this.f407616f = z17;
        this.f407617g = z18;
        this.f407618h = z19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> m56799x73a45721 = this.f407614d.m56799x73a45721();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m56799x73a45721) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) obj) instanceof mf2.n) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) it.next();
            mf2.n nVar = obj2 instanceof mf2.n ? (mf2.n) obj2 : null;
            if (nVar != null) {
                nVar.S0(this.f407615e, this.f407616f, this.f407617g, this.f407618h);
            }
        }
        return jz5.f0.f384359a;
    }
}
