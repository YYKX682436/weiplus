package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverContract$IPCCallResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class ModularizingPkgRetrieverContract$IPCCallResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult> CREATOR = new com.tencent.mm.plugin.appbrand.launching.ha();

    /* renamed from: d, reason: collision with root package name */
    public int f84447d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress f84448e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f84449f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84450g;

    /* renamed from: h, reason: collision with root package name */
    public int f84451h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f84452i;

    public ModularizingPkgRetrieverContract$IPCCallResult(int i17, com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wxaPkgLoadProgress, java.util.List list, boolean z17, int i18, java.lang.String str, int i19, kotlin.jvm.internal.i iVar) {
        wxaPkgLoadProgress = (i19 & 2) != 0 ? null : wxaPkgLoadProgress;
        list = (i19 & 4) != 0 ? null : list;
        z17 = (i19 & 8) != 0 ? false : z17;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        str = (i19 & 32) != 0 ? null : str;
        this.f84447d = i17;
        this.f84448e = wxaPkgLoadProgress;
        this.f84449f = list;
        this.f84450g = z17;
        this.f84451h = i18;
        this.f84452i = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f84447d);
        int i18 = this.f84447d;
        if (i18 == 1) {
            dest.writeParcelable(this.f84448e, 0);
            return;
        }
        if (i18 != 2) {
            return;
        }
        java.lang.Iterable iterable = this.f84449f;
        if (iterable == null) {
            iterable = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            android.os.Parcelable parcelable = (android.os.Parcelable) obj;
            if (((parcelable instanceof com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) || (parcelable instanceof com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo)) != false) {
                arrayList.add(obj);
            }
        }
        dest.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.os.Parcelable parcelable2 = (android.os.Parcelable) it.next();
            dest.writeString(parcelable2.getClass().getName());
            dest.writeParcelable(parcelable2, 0);
        }
        dest.writeByte(this.f84450g ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f84451h);
        dest.writeString(this.f84452i);
    }
}
