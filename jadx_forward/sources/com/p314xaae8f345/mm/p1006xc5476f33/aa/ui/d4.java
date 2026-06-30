package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class d4 implements h61.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f154137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f154138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154139c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f154140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f154142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f154143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154144h;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, boolean z17, android.content.Context context, java.lang.String str, int i17, java.lang.String str2, double d17, java.util.ArrayList arrayList) {
        this.f154144h = activityC11351x975a7907;
        this.f154137a = z17;
        this.f154138b = context;
        this.f154139c = str;
        this.f154140d = i17;
        this.f154141e = str2;
        this.f154142f = d17;
        this.f154143g = arrayList;
    }

    @Override // h61.g
    public void a(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onSuccess");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.b4(this, str, str2));
    }

    @Override // h61.g
    public void d(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "IImgUploadCallback onError");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c4(this));
    }
}
