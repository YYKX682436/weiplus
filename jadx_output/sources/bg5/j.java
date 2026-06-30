package bg5;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f20752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f20753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f20754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f20755g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20756h;

    public j(java.util.Collection collection, long j17, long j18, long j19, java.lang.String str) {
        this.f20752d = collection;
        this.f20753e = j17;
        this.f20754f = j18;
        this.f20755g = j19;
        this.f20756h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        java.util.Iterator it = this.f20752d.iterator();
        long j18 = 0;
        long j19 = 0;
        long j27 = 0;
        long j28 = 0;
        long j29 = 0;
        long j37 = 0;
        long j38 = 0;
        while (it.hasNext()) {
            java.util.Iterator it6 = it;
            com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) it.next();
            long j39 = j38;
            if (((com.tencent.mm.storage.m4) c01.d9.b().r()).J(l4Var)) {
                if (com.tencent.mm.storage.z3.R3(l4Var.h1())) {
                    j38 = 1;
                } else {
                    if (kotlin.jvm.internal.o.b(this.f20756h, l4Var.h1())) {
                        j38 = j39;
                        j37 = 1;
                    } else {
                        j38 = j39;
                    }
                }
                long j47 = j37;
                int b17 = c01.h2.b(l4Var.h1());
                if (b17 == 1 || b17 == 2) {
                    j17 = 1;
                    j18++;
                } else if (b17 == 3 || b17 == 4) {
                    j17 = 1;
                    j19++;
                } else if (b17 != 6) {
                    j17 = 1;
                } else {
                    j17 = 1;
                    j27++;
                }
                if (l4Var.d1() > 0 || l4Var.f1() > 0) {
                    j28 += j17;
                }
                j37 = j47;
            } else {
                if (l4Var.d1() > 0 || l4Var.f1() > 0) {
                    j29++;
                }
                j38 = j39;
            }
            it = it6;
        }
        com.tencent.mm.autogen.mmdata.rpt.TopSessionInfoReportStruct topSessionInfoReportStruct = new com.tencent.mm.autogen.mmdata.rpt.TopSessionInfoReportStruct();
        topSessionInfoReportStruct.f61316d = j18;
        topSessionInfoReportStruct.f61317e = j19;
        topSessionInfoReportStruct.f61318f = j27;
        topSessionInfoReportStruct.f61319g = j28;
        topSessionInfoReportStruct.f61320h = j29;
        topSessionInfoReportStruct.f61321i = this.f20753e;
        topSessionInfoReportStruct.f61322j = this.f20754f;
        topSessionInfoReportStruct.f61323k = j37;
        topSessionInfoReportStruct.f61324l = j38;
        topSessionInfoReportStruct.k();
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putLong("top_session_info_report", this.f20755g);
    }
}
