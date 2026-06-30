package ca4;

/* loaded from: classes4.dex */
public class k0 implements k44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f39970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f39971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f39975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i64.p0 f39976g;

    public k0(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, i64.p0 p0Var) {
        this.f39970a = context;
        this.f39971b = intent;
        this.f39972c = str;
        this.f39973d = str2;
        this.f39974e = str3;
        this.f39975f = i17;
        this.f39976g = p0Var;
    }

    @Override // k44.a
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppMarketClick", "com.tencent.mm.plugin.sns.data.SnsAdUtil$4");
        android.content.Context context = this.f39970a;
        android.content.Intent intent = this.f39971b;
        java.lang.String str = this.f39972c;
        java.lang.String str2 = this.f39973d;
        java.lang.String str3 = this.f39974e;
        int i17 = this.f39975f;
        i64.p0 p0Var = this.f39976g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        ca4.m0.z0(context, intent, str, "", str2, str3, 2, null, i17, p0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppMarketClick", "com.tencent.mm.plugin.sns.data.SnsAdUtil$4");
    }
}
