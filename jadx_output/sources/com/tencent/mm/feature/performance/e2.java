package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public class e2 extends fi.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.d2 f67558a;

    public e2(com.tencent.mm.feature.performance.d2 d2Var) {
        this.f67558a = d2Var;
    }

    @Override // fi.a, fi.b
    public boolean a(java.lang.String str, java.lang.String str2) {
        if (this.f67558a.f67552m.f67536e || com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
            return false;
        }
        if (this.f67558a.f67546d && str.contains("/files/mmkv/")) {
            return true;
        }
        if (str2.contains("w")) {
            return false;
        }
        if (this.f67558a.f67547e && str2.contains("x") && str.endsWith(".so")) {
            return true;
        }
        if (this.f67558a.f67548f && str2.contains("x") && str.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.ODEX_SUFFIX)) {
            return true;
        }
        if (this.f67558a.f67549g && str.endsWith("base.apk") && !str.contains("xwalk")) {
            return true;
        }
        if (this.f67558a.f67550h && str.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.CLASS_N_APK_NAME)) {
            return true;
        }
        return this.f67558a.f67551i && str.contains("com.tencent.mm") && str.endsWith(".apk") && !str.contains("xwalk");
    }
}
