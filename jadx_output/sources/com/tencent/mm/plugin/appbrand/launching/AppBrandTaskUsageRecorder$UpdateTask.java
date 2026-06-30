package com.tencent.mm.plugin.appbrand.launching;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class AppBrandTaskUsageRecorder$UpdateTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$UpdateTask> CREATOR = new com.tencent.mm.plugin.appbrand.launching.m2();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams f84402f;

    public AppBrandTaskUsageRecorder$UpdateTask(com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams appBrandTaskUsageRecorder$LaunchCheckParams) {
        this.f84402f = appBrandTaskUsageRecorder$LaunchCheckParams;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f84402f = (com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams.class.getClassLoader());
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f84402f, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.lang.String str;
        bi1.e a17;
        if (!gm0.j1.b().f273254q || gm0.m.r()) {
            return;
        }
        java.util.Objects.requireNonNull(this.f84402f);
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = this.f84402f.f84393d.D;
        r45.ag7 b17 = qg1.n.b(appBrandLaunchReferrer);
        r45.de7 a18 = qg1.n.a(appBrandLaunchReferrer);
        r45.ac7 ac7Var = new r45.ac7();
        com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams appBrandTaskUsageRecorder$LaunchCheckParams = this.f84402f;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = appBrandTaskUsageRecorder$LaunchCheckParams.f84393d;
        ac7Var.f369926d = appBrandInitConfigWC.f77281g;
        ac7Var.f369927e = appBrandTaskUsageRecorder$LaunchCheckParams.f84395f;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = appBrandTaskUsageRecorder$LaunchCheckParams.f84394e;
        int i17 = appBrandStatObject.f87790f;
        ac7Var.f369928f = i17;
        ac7Var.f369929g = appBrandInitConfigWC.f77283i;
        ac7Var.f369930h = 1;
        ac7Var.f369931i = appBrandStatObject.f87788d;
        java.lang.String str2 = null;
        if (1173 == i17 && (str = appBrandInitConfigWC.S) != null && (a17 = bi1.e.f20977h.a(str)) != null) {
            str2 = a17.f20978d;
        }
        java.lang.String str3 = str2;
        r45.y50 y50Var = new r45.y50();
        com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams appBrandTaskUsageRecorder$LaunchCheckParams2 = this.f84402f;
        y50Var.f390797d = appBrandTaskUsageRecorder$LaunchCheckParams2.f84394e.f87790f;
        appBrandTaskUsageRecorder$LaunchCheckParams2.f84393d.W1.a(y50Var);
        if (this.f84402f.f84401o) {
            y50Var.f390799f = 1;
        } else {
            y50Var.f390799f = 102;
        }
        com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams appBrandTaskUsageRecorder$LaunchCheckParams3 = this.f84402f;
        java.lang.String str4 = appBrandTaskUsageRecorder$LaunchCheckParams3.f84393d.f77278d;
        java.lang.String str5 = appBrandTaskUsageRecorder$LaunchCheckParams3.f84396g;
        int i18 = appBrandTaskUsageRecorder$LaunchCheckParams3.f84398i.i();
        com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams appBrandTaskUsageRecorder$LaunchCheckParams4 = this.f84402f;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = appBrandTaskUsageRecorder$LaunchCheckParams4.f84397h;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = appBrandTaskUsageRecorder$LaunchCheckParams4.f84393d;
        lm5.d.f319601b.a(new qg1.e(new qg1.d(str4, false, ac7Var, b17, a18, str5, i18, qualitySession, "", appBrandInitConfigWC2.f77303p2, str3, y50Var, appBrandInitConfigWC2.K1, appBrandTaskUsageRecorder$LaunchCheckParams4.f84400n, appBrandTaskUsageRecorder$LaunchCheckParams4.f84394e.f87791g, n91.t.c(appBrandInitConfigWC2), false)));
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f84402f.f84393d.f77281g)) {
            com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams appBrandTaskUsageRecorder$LaunchCheckParams5 = this.f84402f;
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC3 = appBrandTaskUsageRecorder$LaunchCheckParams5.f84393d;
            new com.tencent.mm.plugin.appbrand.launching.x4(appBrandInitConfigWC3, appBrandTaskUsageRecorder$LaunchCheckParams5.f84394e.f87790f, new com.tencent.mm.plugin.appbrand.launching.p7(appBrandTaskUsageRecorder$LaunchCheckParams5.f84399m, appBrandInitConfigWC3.f77278d)).a();
        }
    }

    public AppBrandTaskUsageRecorder$UpdateTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
