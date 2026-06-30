package if2;

/* loaded from: classes3.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f372643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e) {
        super(0);
        this.f372643d = c14197x319b1b9e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if2.l0 l0Var;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 : this.f372643d.m56799x73a45721()) {
            if2.b bVar = abstractC14196xf9d9d703 instanceof if2.b ? (if2.b) abstractC14196xf9d9d703 : null;
            if (bVar != null && (l0Var = bVar.f372636i) != null) {
                l0Var.d(true);
                java.util.Iterator it = l0Var.a().iterator();
                while (it.hasNext()) {
                    ((if2.d0) it.next()).c(8, 1);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
