package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class z implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f67305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f67306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData f67307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67310g;

    public z(com.tencent.mm.feature.lite.i iVar, android.content.Context context, android.os.Bundle bundle, boolean z17, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, q80.f0 f0Var) {
        this.f67310g = iVar;
        this.f67304a = context;
        this.f67305b = bundle;
        this.f67306c = z17;
        this.f67307d = openExtraData;
        this.f67308e = wxaLiteAppStartReport;
        this.f67309f = f0Var;
    }

    @Override // wd0.p1
    public void a() {
        this.f67309f.fail();
    }

    @Override // wd0.p1
    public void onSuccess() {
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(c01.z1.j() & (-8388609)));
        this.f67310g.ik(this.f67304a, this.f67305b, this.f67306c, this.f67307d, this.f67308e, this.f67309f);
    }
}
