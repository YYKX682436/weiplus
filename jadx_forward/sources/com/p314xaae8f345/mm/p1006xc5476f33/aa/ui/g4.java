package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class g4 implements h61.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f154191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f154193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f154194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154195e;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, android.content.Context context, java.lang.String str, boolean z17, java.util.ArrayList arrayList) {
        this.f154195e = activityC11351x975a7907;
        this.f154191a = context;
        this.f154192b = str;
        this.f154193c = z17;
        this.f154194d = arrayList;
    }

    @Override // h61.g
    public void a(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onSuccess");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.e4(this, str, str2));
    }

    @Override // h61.g
    public void d(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onError");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.f4(this));
    }
}
