package mf2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f407589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f407590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f407591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        super(0);
        this.f407589d = c14197x319b1b9e;
        this.f407590e = m1Var;
        this.f407591f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> m56799x73a45721 = this.f407589d.m56799x73a45721();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m56799x73a45721) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) obj) instanceof mf2.a) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) it.next();
            mf2.a aVar = obj2 instanceof mf2.a ? (mf2.a) obj2 : null;
            if (aVar != null) {
                df2.ar arVar = (df2.ar) aVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFollowChanged isFollow:");
                boolean z17 = this.f407591f;
                sb6.append(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(arVar.f311270m, sb6.toString());
                if (z17) {
                    arVar.a7();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
