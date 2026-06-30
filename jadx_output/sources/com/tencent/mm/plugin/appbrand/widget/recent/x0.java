package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class x0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f92086e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f92087f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f92088g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer f92089h;

    public x0(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer, boolean z17) {
        this.f92089h = appBrandTaskContainer;
        this.f92088g = true;
        this.f92088g = z17;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.AppBrandTask.AppBrandTaskContainer";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer;
        java.util.ArrayList<com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo> arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "run UpdateAppBrandTaskDataTask");
        synchronized (this.f92089h.f91893p) {
            appBrandTaskContainer = this.f92089h;
            appBrandTaskContainer.f91894q = true;
        }
        int recentLoadCount = appBrandTaskContainer.getRecentLoadCount();
        appBrandTaskContainer.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "query");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("count", recentLoadCount);
        bundle.putInt("versionType", Integer.MAX_VALUE);
        android.os.Parcel parcel = (android.os.Parcel) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer.a.class);
        if (parcel == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(recentLoadCount);
            parcel.readTypedList(arrayList, com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo.CREATOR);
        }
        ((java.util.ArrayList) this.f92086e).clear();
        ((java.util.ArrayList) this.f92087f).clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "[UpdateAppBrandTaskDataTask] getRecentShowCount: %d", java.lang.Integer.valueOf(this.f92089h.getRecentShowCount()));
        if (arrayList != null) {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo scene = this.f92089h.getSceneFactory() != null ? this.f92089h.getSceneFactory().getScene() : null;
            for (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo : arrayList) {
                if (scene == null || !localUsageInfo.f76361d.equals(scene.f76361d) || localUsageInfo.f76363f != scene.f76363f) {
                    if (((java.util.ArrayList) this.f92086e).size() < this.f92089h.getRecentShowCount()) {
                        ((java.util.ArrayList) this.f92086e).add(new com.tencent.mm.plugin.appbrand.widget.recent.z0(localUsageInfo, 1));
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "recent info %s, %s, %s, %s, %s, %d", localUsageInfo.f76361d, localUsageInfo.f76365h, localUsageInfo.f76367m, localUsageInfo.f76368n, localUsageInfo.f76362e, java.lang.Integer.valueOf(localUsageInfo.f76363f));
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "[UpdateAppBrandTaskDataTask] data size: %d, ", java.lang.Integer.valueOf(((java.util.ArrayList) this.f92086e).size()));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.widget.recent.w0(this));
    }
}
