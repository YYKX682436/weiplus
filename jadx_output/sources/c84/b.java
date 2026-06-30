package c84;

/* loaded from: classes4.dex */
public class b implements l44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c84.c f39687a;

    public b(c84.c cVar) {
        this.f39687a = cVar;
    }

    @Override // l44.a
    public void a(long j17, int i17, boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget$2");
        c84.c cVar = this.f39687a;
        c84.c.a(cVar);
        if (z17) {
            if (c84.c.d(cVar) != null) {
                w64.k d17 = c84.c.d(cVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = cVar.f39704w;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
                d17.a(adClickActionInfo);
            }
            c84.c.c(cVar, c84.c.b(cVar).f402557l, true);
        } else {
            c84.c.c(cVar, c84.c.b(cVar).f402558m, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget$2");
    }
}
