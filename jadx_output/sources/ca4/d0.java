package ca4;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f39866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f39867g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39868h;

    public d0(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        this.f39864d = str;
        this.f39865e = str2;
        this.f39866f = i17;
        this.f39867g = i18;
        this.f39868h = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil$1");
        ca4.e0.a(this.f39864d, this.f39865e, this.f39866f, this.f39867g, this.f39868h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdTecReportUtil$1");
    }
}
