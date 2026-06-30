package if2;

/* loaded from: classes3.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f372664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e) {
        super(0);
        this.f372664d = c14197x319b1b9e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if2.l0 l0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f372664d;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 : c14197x319b1b9e.m56799x73a45721()) {
            if2.b bVar = abstractC14196xf9d9d703 instanceof if2.b ? (if2.b) abstractC14196xf9d9d703 : null;
            if (bVar != null && (l0Var = bVar.f372636i) != null) {
                l0Var.d(false);
                java.util.Iterator it = l0Var.b().iterator();
                while (it.hasNext()) {
                    ((if2.d0) it.next()).b(1);
                }
            }
        }
        if (((mm2.c1) c14197x319b1b9e.m56796xbba4bfc0(mm2.c1.class)).N1) {
            ((mm2.c1) c14197x319b1b9e.m56796xbba4bfc0(mm2.c1.class)).N1 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null) {
                qo0.b bVar2 = qo0.b.Z2;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) c14197x319b1b9e.m56796xbba4bfc0(mm2.c1.class)).N1);
                k0Var.mo46557x60d69242(bVar2, bundle);
            }
        }
        return jz5.f0.f384359a;
    }
}
