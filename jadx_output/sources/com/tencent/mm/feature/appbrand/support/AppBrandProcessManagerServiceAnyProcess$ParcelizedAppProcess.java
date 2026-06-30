package com.tencent.mm.feature.appbrand.support;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess", "Lft/b;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess implements ft.b, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess> CREATOR = new com.tencent.mm.feature.appbrand.support.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65038d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f65039e;

    /* renamed from: f, reason: collision with root package name */
    public final ft.d f65040f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f65041g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65042h;

    public AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess(java.lang.String str, java.util.List appList, ft.d preferUsedAsType, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(appList, "appList");
        kotlin.jvm.internal.o.g(preferUsedAsType, "preferUsedAsType");
        this.f65038d = str;
        this.f65039e = appList;
        this.f65040f = preferUsedAsType;
        this.f65041g = z17;
        this.f65042h = i17;
    }

    @Override // ft.b
    public boolean a() {
        return com.tencent.mm.sdk.platformtools.x2.o(this.f65038d);
    }

    @Override // ft.b
    public void b() {
        java.lang.String str = this.f65038d;
        int i17 = this.f65042h;
        if (i17 == 0) {
            i17 = m45.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessManagerServiceAnyProcess", "killProcess name:" + str + ", pid:" + i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }

    @Override // ft.b
    /* renamed from: d, reason: from getter */
    public ft.d getF65040f() {
        return this.f65040f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // ft.b
    public void e() {
        if (this.f65039e.isEmpty()) {
            if (this.f65041g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessManagerServiceAnyProcess", "releasePreloadedAndSparedEnvironment skip appbrand1 for mb2.0");
                return;
            } else {
                b();
                return;
            }
        }
        java.lang.String str = this.f65038d;
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.ipcinvoker.extension.l.a(str, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.task.u1.class, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess)) {
            return false;
        }
        com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess = (com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess) obj;
        return kotlin.jvm.internal.o.b(this.f65038d, appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess.f65038d) && kotlin.jvm.internal.o.b(this.f65039e, appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess.f65039e) && this.f65040f == appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess.f65040f && this.f65041g == appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess.f65041g && this.f65042h == appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess.f65042h;
    }

    @Override // ft.b
    /* renamed from: f, reason: from getter */
    public java.lang.String getF65038d() {
        return this.f65038d;
    }

    @Override // ft.b
    /* renamed from: g, reason: from getter */
    public java.util.List getF65039e() {
        return this.f65039e;
    }

    @Override // ft.b
    public boolean h() {
        throw new java.lang.UnsupportedOperationException("Not supported");
    }

    public int hashCode() {
        java.lang.String str = this.f65038d;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.f65039e.hashCode()) * 31) + this.f65040f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f65041g)) * 31) + java.lang.Integer.hashCode(this.f65042h);
    }

    public java.lang.String toString() {
        return "ParcelizedAppProcess(processName=" + this.f65038d + ", appList=" + u46.a.c(this.f65039e.toArray(new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord[0]), "{}") + ", preferUsedAsType=" + this.f65040f + ", isMBRunning=" + this.f65041g + ", pid=" + this.f65042h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f65038d);
        java.util.List list = this.f65039e;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord) it.next()).writeToParcel(out, i17);
        }
        ft.d dVar = this.f65040f;
        kotlin.jvm.internal.o.g(dVar, "<this>");
        out.writeInt(dVar.ordinal());
        out.writeInt(this.f65041g ? 1 : 0);
        out.writeInt(this.f65042h);
    }

    public /* synthetic */ AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess(java.lang.String str, java.util.List list, ft.d dVar, boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, list, dVar, z17, (i18 & 16) != 0 ? 0 : i17);
    }
}
