package mf2;

/* loaded from: classes3.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f407598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, int i17) {
        super(0);
        this.f407598d = c14197x319b1b9e;
        this.f407599e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> m56799x73a45721 = this.f407598d.m56799x73a45721();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m56799x73a45721) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) obj) instanceof mf2.b0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) it.next();
            mf2.b0 b0Var = obj2 instanceof mf2.b0 ? (mf2.b0) obj2 : null;
            if (b0Var != null) {
                ((if2.b) b0Var).f372633f = this.f407599e;
            }
        }
        return jz5.f0.f384359a;
    }
}
