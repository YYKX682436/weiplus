package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f178103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f178104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd f178105g;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd, int i17, long j17, long j18) {
        this.f178105g = activityC13154xb3ef6cfd;
        this.f178102d = i17;
        this.f178103e = j17;
        this.f178104f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd = this.f178105g;
        activityC13154xb3ef6cfd.f177997m.setProgress(this.f178102d);
        activityC13154xb3ef6cfd.f177998n.setText(activityC13154xb3ef6cfd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572726ca2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T((float) this.f178103e), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T((float) this.f178104f)));
    }
}
