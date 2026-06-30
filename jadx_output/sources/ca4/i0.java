package ca4;

/* loaded from: classes4.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f39943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f39945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39948i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39949m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39950n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39951o;

    public i0(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6) {
        this.f39943d = context;
        this.f39944e = str;
        this.f39945f = i17;
        this.f39946g = str2;
        this.f39947h = str3;
        this.f39948i = str4;
        this.f39949m = str5;
        this.f39950n = i18;
        this.f39951o = str6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2");
        android.content.Intent launchIntentForPackage = this.f39943d.getPackageManager().getLaunchIntentForPackage(this.f39944e);
        if (this.f39945f != 2) {
            ca4.c0.e(this.f39946g, this.f39947h, 0, 2, this.f39948i, this.f39949m, this.f39950n);
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(this.f39943d, launchIntentForPackage, this.f39951o, this.f39945f, new ca4.h0(this), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2");
    }
}
