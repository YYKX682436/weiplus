package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class d4 implements h61.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f72604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f72605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f72607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f72609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f72610g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72611h;

    public d4(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, boolean z17, android.content.Context context, java.lang.String str, int i17, java.lang.String str2, double d17, java.util.ArrayList arrayList) {
        this.f72611h = launchAAUI;
        this.f72604a = z17;
        this.f72605b = context;
        this.f72606c = str;
        this.f72607d = i17;
        this.f72608e = str2;
        this.f72609f = d17;
        this.f72610g = arrayList;
    }

    @Override // h61.g
    public void a(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onSuccess");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.aa.ui.b4(this, str, str2));
    }

    @Override // h61.g
    public void d(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onError");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.aa.ui.c4(this));
    }
}
