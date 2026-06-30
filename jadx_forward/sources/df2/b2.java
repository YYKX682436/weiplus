package df2;

/* loaded from: classes3.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f311304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f311305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f311306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, int i17, int i18, java.lang.String str) {
        super(0);
        this.f311304d = c14197x319b1b9e;
        this.f311305e = i17;
        this.f311306f = i18;
        this.f311307g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> m56799x73a45721 = this.f311304d.m56799x73a45721();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m56799x73a45721) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) obj) instanceof tn0.x0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) it.next();
            tn0.x0 x0Var = obj2 instanceof tn0.x0 ? (tn0.x0) obj2 : null;
            if (x0Var != null) {
                x0Var.q1(this.f311305e, this.f311306f, this.f311307g);
            }
        }
        return jz5.f0.f384359a;
    }
}
