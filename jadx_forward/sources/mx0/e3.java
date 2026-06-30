package mx0;

/* loaded from: classes5.dex */
public final class e3 implements mx0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mx0.g3 f413476a;

    public e3(mx0.g3 g3Var) {
        this.f413476a = g3Var;
    }

    public void a() {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7665x7a44761a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onLongPressFinish");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        mx0.g3 g3Var = this.f413476a;
        g3Var.f413532p = elapsedRealtime;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) g3Var.f413524e;
        if (c10977x8e40eced.m0()) {
            return;
        }
        android.content.Context context = c10977x8e40eced.getContext();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f ? (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context : null;
        if ((activityC1102x9ee2d9f == null || (mo7595x9cdc264 = activityC1102x9ee2d9f.mo7595x9cdc264()) == null || (m7665x7a44761a = mo7595x9cdc264.m7665x7a44761a("MaterialImportPreviewFragment")) == null || !m7665x7a44761a.m7481x7a6e8df6() || m7665x7a44761a.m7489xb226ab8b()) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "recordFinish skipped, aigc import preview shown");
            return;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303 = g3Var.f413526g;
        c10973x5ab09303.m47281xbc91ffe0(false);
        c10977x8e40eced.M0(false);
        c10973x5ab09303.announceForAccessibility(i65.a.r(c10973x5ab09303.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571506h2));
    }
}
