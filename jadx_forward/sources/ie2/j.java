package ie2;

/* loaded from: classes13.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a f372523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 f372524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 c14180x477b7cf1) {
        super(0);
        this.f372523d = c14179xd6e3454a;
        this.f372524e = c14180x477b7cf1;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestBubbleShow curContent: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372523d;
        sb6.append(c14179xd6e3454a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LinearBubbleAnimateContainer", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 c14180x477b7cf1 = this.f372524e;
        if (c14180x477b7cf1.f193049e.contains(c14179xd6e3454a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LinearBubbleAnimateContainer", "requestBubbleShow is doing job return, curContent: " + c14179xd6e3454a);
        } else {
            if (c14179xd6e3454a.f193043i == 2) {
                c14179xd6e3454a.setVisibility(0);
            } else {
                java.util.LinkedList linkedList = c14180x477b7cf1.f193048d;
                if (!linkedList.contains(c14179xd6e3454a)) {
                    linkedList.offer(c14179xd6e3454a);
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = c14180x477b7cf1.f193051g;
                    if (r2Var != null ? r2Var.A() : true) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1.c(c14180x477b7cf1);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
