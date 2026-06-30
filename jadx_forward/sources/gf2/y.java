package gf2;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f352857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49, java.lang.String str) {
        super(2);
        this.f352857d = c14195x2dafdb49;
        this.f352858e = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.ArrayList toUserList = (java.util.ArrayList) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserList, "toUserList");
        java.lang.String g07 = kz5.n0.g0(toUserList, "#", null, null, 0, null, null, 62, null);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49.f193104t;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("milestone", this.f352858e);
        if (intValue == 0) {
            hashMap.put("share_type", "1");
            hashMap.put("share_username", g07);
        } else if (intValue == 1) {
            hashMap.put("share_type", "2");
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.t1 t1Var = ml2.t1.f409518s2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49 = this.f352857d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 = c14195x2dafdb49.f193105d;
        if (abstractC14196xf9d9d703 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controller");
            throw null;
        }
        java.lang.String str = ((mm2.c1) abstractC14196xf9d9d703.m56788xbba4bfc0(mm2.c1.class)).f410385o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d7032 = c14195x2dafdb49.f193105d;
        if (abstractC14196xf9d9d7032 != null) {
            r0Var.mk(t1Var, str, ((mm2.e1) abstractC14196xf9d9d7032.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), hashMap);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controller");
        throw null;
    }
}
