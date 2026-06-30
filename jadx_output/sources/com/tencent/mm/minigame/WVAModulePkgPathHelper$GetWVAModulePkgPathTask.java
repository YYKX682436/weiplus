package com.tencent.mm.minigame;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0016"}, d2 = {"com/tencent/mm/minigame/WVAModulePkgPathHelper$GetWVAModulePkgPathTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "parcel", org.chromium.base.BaseSwitches.V, "", "flags", "writeToParcel", "", "mFromMainProcess", "Lcom/tencent/mm/plugin/appbrand/service/c0;", "mService", "", "mModuleName", "Lcom/tencent/mm/minigame/f1;", "mCallback", "<init>", "(ZLcom/tencent/mm/plugin/appbrand/service/c0;Ljava/lang/String;Lcom/tencent/mm/minigame/f1;)V", "(Landroid/os/Parcel;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class WVAModulePkgPathHelper$GetWVAModulePkgPathTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask> CREATOR = new com.tencent.mm.minigame.b1();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.c0 f68987f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f68988g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.minigame.f1 f68989h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f68990i;

    /* renamed from: m, reason: collision with root package name */
    public int f68991m;

    /* renamed from: n, reason: collision with root package name */
    public int f68992n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f68993o;

    /* renamed from: p, reason: collision with root package name */
    public long f68994p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.minigame.e1 f68995q;

    public /* synthetic */ WVAModulePkgPathHelper$GetWVAModulePkgPathTask(android.os.Parcel parcel, kotlin.jvm.internal.i iVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.f68988g = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this.f68990i = readString2;
        this.f68991m = parcel.readInt();
        this.f68992n = parcel.readInt();
        android.os.Parcelable readParcelable = parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable);
        this.f68993o = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo) readParcelable;
        this.f68994p = parcel.readLong();
        boolean z17 = parcel.readInt() == 1;
        java.lang.String readString3 = parcel.readString();
        this.f68995q = new com.tencent.mm.minigame.e1(z17, readString3 == null ? "" : readString3, parcel.readInt(), parcel.readLong(), parcel.readInt() == 1);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f68988g);
        parcel.writeString(this.f68990i);
        parcel.writeInt(this.f68991m);
        parcel.writeInt(this.f68992n);
        parcel.writeParcelable(this.f68993o, 0);
        parcel.writeLong(this.f68994p);
        parcel.writeInt(this.f68995q.f69062a ? 1 : 0);
        parcel.writeString(this.f68995q.f69063b);
        parcel.writeInt(this.f68995q.f69064c);
        parcel.writeLong(this.f68995q.f69065d);
        parcel.writeInt(this.f68995q.f69066e ? 1 : 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "runInClientProcess: result=" + this.f68995q);
        x();
        if (this.f68995q.f69062a) {
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f68987f;
            kotlin.jvm.internal.o.d(c0Var);
            com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
            kotlin.jvm.internal.o.f(t37, "getRuntime(...)");
            com.tencent.mm.plugin.appbrand.appcache.a4 o17 = com.tencent.mm.plugin.appbrand.appcache.la.o(t37, false);
            com.tencent.mm.plugin.appbrand.appcache.la laVar = o17 instanceof com.tencent.mm.plugin.appbrand.appcache.la ? (com.tencent.mm.plugin.appbrand.appcache.la) o17 : null;
            com.tencent.mm.plugin.appbrand.appcache.y3 y3Var = laVar != null ? laVar.f75655a : null;
            com.tencent.mm.plugin.appbrand.appcache.ac acVar = y3Var instanceof com.tencent.mm.plugin.appbrand.appcache.ac ? (com.tencent.mm.plugin.appbrand.appcache.ac) y3Var : null;
            if (acVar != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = new com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo();
                modulePkgInfo.name = this.f68988g;
                modulePkgInfo.pkgPath = this.f68995q.f69063b;
                modulePkgInfo.pkgVersion = this.f68995q.f69064c;
                arrayList.add(modulePkgInfo);
                acVar.o(arrayList);
                com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "runInClientProcess: merged module " + this.f68988g + ", pkgPath=" + this.f68995q.f69063b + ", pkgVersion=" + this.f68995q.f69064c);
            } else {
                com.tencent.mars.xlog.Log.e("WVAModulePkgPathHelper", "runInClientProcess: mergeDirReader is null");
            }
        }
        com.tencent.mm.minigame.f1 f1Var = this.f68989h;
        if (f1Var != null) {
            f1Var.a(this.f68995q);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "runInMainProcess: start checking module=" + this.f68988g);
        com.tencent.mm.minigame.e1 a17 = com.tencent.mm.minigame.g1.f69071a.a(this.f68990i, this.f68988g, this.f68991m, this.f68992n, null);
        if (a17.f69062a) {
            com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "runInMainProcess: module already downloaded, pkgPath=" + a17.f69063b);
            this.f68995q = a17;
            c();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runInMainProcess: module not downloaded, pkgVersion=");
        int i17 = a17.f69064c;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", sb6.toString());
        if (this.f68994p > 0) {
            com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "runInMainProcess: using moduleSize from child process: " + this.f68994p);
            java.lang.String str2 = this.f68990i;
            java.lang.String a18 = com.tencent.mm.plugin.appbrand.appcache.a6.a(this.f68988g);
            java.lang.String str3 = null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a18)) {
                    str = "";
                } else {
                    str = "$" + a18;
                }
                sb7.append(str);
                str3 = sb7.toString();
            }
            kotlin.jvm.internal.o.f(str3, "toString(...)");
            int i18 = this.f68991m;
            boolean z17 = false;
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo b17 = com.tencent.mm.plugin.appbrand.launching.v3.b(str3, 0);
            if (b17 != null && b17.pkgVersion() < i18) {
                com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "checkOldVersionExists: found available older version=" + b17.pkgVersion() + " for queryKey=" + str3 + ", currentVersion=" + i18);
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "runInMainProcess: hasOldVersion=" + z17 + " for queryKey=" + str3 + ", currentVersion=" + this.f68991m);
            if (z17) {
                java.lang.String str4 = this.f68990i;
                java.lang.String str5 = this.f68988g;
                int i19 = this.f68992n;
                long j17 = this.f68994p;
                com.tencent.mm.plugin.appbrand.launching.qc qcVar = com.tencent.mm.plugin.appbrand.launching.qc.f85087a;
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = this.f68993o;
                kotlin.jvm.internal.o.d(wxaAttributes$WxaVersionInfo);
                qcVar.a(str4, str5, wxaAttributes$WxaVersionInfo, i19, null, new r45.y50(), new com.tencent.mm.minigame.c1(j17, this, i17), new com.tencent.mm.minigame.d1(j17, this, i17));
                return;
            }
            this.f68995q = new com.tencent.mm.minigame.e1(false, null, a17.f69064c, this.f68994p, false, 2, null);
        } else {
            this.f68995q = new com.tencent.mm.minigame.e1(false, null, a17.f69064c, 0L, false, 26, null);
        }
        com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "runInMainProcess: result exists=" + this.f68995q.f69062a + ", pkgPath=" + this.f68995q.f69063b + ", pkgVersion=" + this.f68995q.f69064c + ", pkgSize=" + this.f68995q.f69065d + ", hasOldVersion=" + this.f68995q.f69066e);
        c();
    }

    public WVAModulePkgPathHelper$GetWVAModulePkgPathTask(boolean z17, com.tencent.mm.plugin.appbrand.service.c0 c0Var, java.lang.String mModuleName, com.tencent.mm.minigame.f1 f1Var) {
        kotlin.jvm.internal.o.g(mModuleName, "mModuleName");
        this.f68987f = c0Var;
        this.f68988g = mModuleName;
        this.f68989h = f1Var;
        this.f68990i = "";
        this.f68995q = new com.tencent.mm.minigame.e1(false, null, 0, 0L, false, 30, null);
        if (z17) {
            return;
        }
        kotlin.jvm.internal.o.d(c0Var);
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        java.lang.String str = t37.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        this.f68990i = str;
        this.f68991m = t37.u0().L;
        this.f68993o = t37.u0().N;
        this.f68992n = t37.f74805p.f77281g;
        this.f68994p = com.tencent.mm.minigame.g1.f69071a.b(this.f68988g, t37.u0().N);
        com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "GetWVAModulePkgPathTask init: appId=" + this.f68990i + ", moduleName=" + this.f68988g + ", appVersion=" + this.f68991m + ", versionType=" + this.f68992n + ", moduleSize=" + this.f68994p);
    }

    private WVAModulePkgPathHelper$GetWVAModulePkgPathTask(android.os.Parcel parcel) {
        this(true, null, "", null);
        v(parcel);
        com.tencent.mars.xlog.Log.i("WVAModulePkgPathHelper", "GetWVAModulePkgPathTask from Parcel: mModuleName=" + this.f68988g + ", mAppId=" + this.f68990i);
    }
}
