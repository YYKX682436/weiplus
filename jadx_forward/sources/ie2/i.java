package ie2;

/* loaded from: classes13.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a f372521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 f372522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 c14180x477b7cf1) {
        super(0);
        this.f372521d = c14179xd6e3454a;
        this.f372522e = c14180x477b7cf1;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestBubbleHide curContent: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372521d;
        sb6.append(c14179xd6e3454a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LinearBubbleAnimateContainer", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 c14180x477b7cf1 = this.f372522e;
        c14180x477b7cf1.f193048d.remove(c14179xd6e3454a);
        c14180x477b7cf1.f193049e.remove(c14179xd6e3454a);
        if (c14179xd6e3454a.getVisibility() != 8) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.c(c14179xd6e3454a) && c14180x477b7cf1.f193052h) {
                c14180x477b7cf1.f(c14179xd6e3454a, 8);
            } else {
                c14179xd6e3454a.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
