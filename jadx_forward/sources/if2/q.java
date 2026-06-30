package if2;

/* loaded from: classes3.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f372672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f372673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, android.view.ViewGroup viewGroup) {
        super(0);
        this.f372672d = c14197x319b1b9e;
        this.f372673e = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f372672d;
        java.util.Iterator<T> it = c14197x319b1b9e.m56799x73a45721().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            viewGroup = this.f372673e;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) it.next();
            if (viewGroup instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub) {
                if2.b bVar = abstractC14196xf9d9d703 instanceof if2.b ? (if2.b) abstractC14196xf9d9d703 : null;
                if (bVar != null) {
                    bVar.f372632e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub) viewGroup;
                }
            }
            abstractC14196xf9d9d703.mo8998x9f682d55(viewGroup);
        }
        java.util.Iterator<T> it6 = c14197x319b1b9e.m56799x73a45721().iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703) it6.next()).mo56787xb95be1f8(viewGroup);
        }
        return jz5.f0.f384359a;
    }
}
