package gt;

/* loaded from: classes7.dex */
public class o4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17259x62269d70 event = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17259x62269d70) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0.class);
        u0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String str = event.f240148g;
        if (str != null && u0Var.Ai(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1342, 3);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode username:" + str + ", timestamp:" + currentTimeMillis);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1.f157392a.a(kz5.b0.c(str), k91.h1.QRCODE, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.t0(str, currentTimeMillis));
        }
        return true;
    }
}
