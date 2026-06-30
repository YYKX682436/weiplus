package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class g4 implements h61.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f72658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f72660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f72661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72662e;

    public g4(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, android.content.Context context, java.lang.String str, boolean z17, java.util.ArrayList arrayList) {
        this.f72662e = launchAAUI;
        this.f72658a = context;
        this.f72659b = str;
        this.f72660c = z17;
        this.f72661d = arrayList;
    }

    @Override // h61.g
    public void a(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onSuccess");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.aa.ui.e4(this, str, str2));
    }

    @Override // h61.g
    public void d(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onError");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.aa.ui.f4(this));
    }
}
