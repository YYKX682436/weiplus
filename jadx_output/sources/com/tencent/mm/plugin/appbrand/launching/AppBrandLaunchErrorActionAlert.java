package com.tencent.mm.plugin.appbrand.launching;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class AppBrandLaunchErrorActionAlert extends com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f84342g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f84343h;

    public AppBrandLaunchErrorActionAlert(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        super(str, i17);
        this.f84342g = str2;
        this.f84343h = str3;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str) {
        java.lang.String str2 = this.f84343h;
        java.lang.String str3 = this.f84342g;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchErrorAction", "showError(%s) alert title:%s, message:%s", str, str3, str2);
        if (context instanceof android.app.Activity) {
            db5.e1.G(context, str2, str3, false, null);
        } else {
            com.tencent.mm.plugin.appbrand.ipc.d.a(null, str2, str3, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490507x1), "", null, null, null);
        }
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandLaunchErrorActionAlert[%s %s]", this.f84342g, this.f84343h);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f84342g);
        parcel.writeString(this.f84343h);
    }

    public AppBrandLaunchErrorActionAlert(android.os.Parcel parcel) {
        super(parcel);
        this.f84342g = parcel.readString();
        this.f84343h = parcel.readString();
    }
}
