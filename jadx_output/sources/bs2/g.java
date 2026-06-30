package bs2;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final bs2.g f23841a = new bs2.g();

    public static void a(bs2.g gVar, int i17, int i18, int i19, int i27, boolean z17, int i28, boolean z18, int i29, java.lang.Object obj) {
        if ((i29 & 1) != 0) {
            i17 = 0;
        }
        if ((i29 & 2) != 0) {
            i18 = 0;
        }
        if ((i29 & 4) != 0) {
            i19 = 0;
        }
        if ((i29 & 8) != 0) {
            i27 = 0;
        }
        if ((i29 & 16) != 0) {
            z17 = false;
        }
        if ((i29 & 32) != 0) {
            i28 = 0;
        }
        if ((i29 & 64) != 0) {
            z18 = false;
        }
        gVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderPrefetchDataStruct finderPrefetchDataStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPrefetchDataStruct();
        finderPrefetchDataStruct.f57623d = i17;
        finderPrefetchDataStruct.f57624e = i18;
        finderPrefetchDataStruct.f57625f = i19;
        finderPrefetchDataStruct.f57626g = i27;
        finderPrefetchDataStruct.f57627h = z17 ? 1L : 0L;
        finderPrefetchDataStruct.f57628i = i28;
        finderPrefetchDataStruct.f57629j = z18 ? 1L : 0L;
        finderPrefetchDataStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPrefetchDataStruct);
    }
}
