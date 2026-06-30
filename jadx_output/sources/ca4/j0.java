package ca4;

/* loaded from: classes4.dex */
public class j0 implements k44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f39957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f39958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39959c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f39960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo f39961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f39963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i64.p0 f39964h;

    public j0(android.content.Context context, android.content.Intent intent, java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, java.lang.String str2, int i17, i64.p0 p0Var) {
        this.f39957a = context;
        this.f39958b = intent;
        this.f39959c = str;
        this.f39960d = snsInfo;
        this.f39961e = aDInfo;
        this.f39962f = str2;
        this.f39963g = i17;
        this.f39964h = p0Var;
    }

    @Override // k44.a
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppMarketClick", "com.tencent.mm.plugin.sns.data.SnsAdUtil$3");
        android.content.Context context = this.f39957a;
        android.content.Intent intent = this.f39958b;
        java.lang.String str = this.f39959c;
        java.lang.String valueOf = java.lang.String.valueOf(this.f39960d.field_snsId);
        java.lang.String str2 = this.f39961e.uxInfo;
        java.lang.String str3 = this.f39962f;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f39960d;
        int i17 = this.f39963g;
        i64.p0 p0Var = this.f39964h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        ca4.m0.z0(context, intent, str, valueOf, str2, str3, 2, snsInfo, i17, p0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppMarketClick", "com.tencent.mm.plugin.sns.data.SnsAdUtil$3");
    }
}
