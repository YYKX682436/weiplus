package tf2;

/* loaded from: classes3.dex */
public final class n extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f500471m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(boolean z17) {
        dk2.xf P6;
        if (this.f500471m == z17) {
            return;
        }
        this.f500471m = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftPkStatusCallerController", "#refreshGift isPkMode=" + z17);
        tf2.k kVar = (tf2.k) m56789x25fe639c(tf2.k.class);
        if (kVar != null) {
            kVar.c7();
            kVar.b7();
        }
        tf2.m mVar = (tf2.m) m56789x25fe639c(tf2.m.class);
        if (mVar != null && (P6 = mVar.P6()) != null) {
            dk2.xf.g(P6, ((mm2.e1) mVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) mVar.m56788xbba4bfc0(mm2.e1.class)).f410516m, ((mm2.e1) mVar.m56788xbba4bfc0(mm2.e1.class)).f410525v, 1, null, 16, null);
        }
        tf2.o oVar = (tf2.o) m56789x25fe639c(tf2.o.class);
        if (oVar != null) {
            oVar.Z6(z17);
        }
        uf2.f fVar = (uf2.f) m56789x25fe639c(uf2.f.class);
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PkGiftForegroundPagController", "#onPkStatusChange " + z17);
            java.util.Map map = fVar.f508712n;
            if (!z17) {
                fVar.a7();
                ((java.util.LinkedHashMap) map).clear();
            } else {
                for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                    fVar.e7((java.lang.String) entry.getKey(), (java.lang.String) ((jz5.o) entry.getValue()).f384374d, ((java.lang.Number) ((jz5.o) entry.getValue()).f384375e).intValue());
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }
}
