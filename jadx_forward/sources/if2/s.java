package if2;

/* loaded from: classes3.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f372675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f372676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e) {
        super(0);
        this.f372675d = bundle;
        this.f372676e = c14197x319b1b9e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.Bundle bundle = this.f372675d;
        if (bundle != null) {
            bundle.getInt("EVT_PARAM1");
        }
        if (bundle != null) {
            bundle.getInt("EVT_PARAM2");
        }
        java.util.HashSet<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703> m56799x73a45721 = this.f372676e.m56799x73a45721();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m56799x73a45721) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) obj) instanceof if2.d) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) it.next();
            if (obj2 instanceof if2.d) {
            }
        }
        return jz5.f0.f384359a;
    }
}
