package zd3;

/* loaded from: classes7.dex */
public final class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.k f553148d;

    public h(zd3.k kVar) {
        this.f553148d = kVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b c16466x1a72912b = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b) obj;
        int i17 = c16466x1a72912b.f229692d;
        zd3.k kVar = this.f553148d;
        if (i17 == 0) {
            kVar.s().mo146xb9724478(kVar.k());
            return;
        }
        lc3.z zVar = lc3.x.f399469c;
        if (i17 != -1) {
            if (i17 == 0) {
                zVar = lc3.x.f399467a;
            } else if (i17 == 2) {
                zVar = lc3.w.f399466a;
            }
        }
        kVar.w(zVar, c16466x1a72912b.f229693e);
    }
}
