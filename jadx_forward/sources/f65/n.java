package f65;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.n f341442a = new f65.n();

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportAllImageDone >> " + z17 + ", " + aq.o.f94453a);
        if (aq.o.f94453a) {
            return;
        }
        f65.o.f341461q = z17 ? 1 : 2;
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportImageDone >> " + z17 + ", " + aq.o.f94453a);
        if (aq.o.f94453a) {
            return;
        }
        f65.o.f341453i = z17 ? 1 : 2;
    }

    public final void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportInternalReport >> " + i17 + ", " + aq.o.f94453a);
        if (aq.o.f94453a) {
            return;
        }
        f65.o.f341445a.c(i17);
    }

    public final void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchAllNum >> " + i17 + ",  " + aq.o.f94453a);
        if (aq.o.f94453a) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "setSearchImageCnt >> " + i17 + ' ' + f65.o.f341450f);
        if (f65.o.f341450f.length() == 0) {
            return;
        }
        f65.o.f341456l = i17;
    }

    public final void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchPeopleAllNum >> " + i17 + ",  " + aq.o.f94453a);
        if (aq.o.f94453a) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "setSearchPeopleImageCnt >> " + i17 + ' ' + f65.o.f341450f);
        if (f65.o.f341450f.length() == 0) {
            return;
        }
        f65.o.f341457m = i17;
    }

    public final void f(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportSubTabClick >> " + i17 + ", " + i18 + ", " + aq.o.f94453a);
        if (!aq.o.f94453a) {
            f65.o.f341459o = i17;
            f65.o.f341445a.c(i18);
            return;
        }
        int i19 = i17 - 1;
        if (aq.p.f94463b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryComposeOp", "ftsSubTabClickReport >> " + i19);
            de5.a aVar = de5.a.f310929a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "setCurrentSubType >> " + i19);
            de5.a.f310935g = i19;
            aVar.g(6);
        }
    }

    public final void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportTecSearchImageNum >> " + i17 + ", " + aq.o.f94453a);
        if (aq.o.f94453a) {
            return;
        }
        f65.p.f341485s = i17;
    }
}
