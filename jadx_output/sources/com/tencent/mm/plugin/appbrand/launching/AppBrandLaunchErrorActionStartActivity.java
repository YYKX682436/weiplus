package com.tencent.mm.plugin.appbrand.launching;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class AppBrandLaunchErrorActionStartActivity extends com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f84345g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f84346h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Intent f84347i;

    public AppBrandLaunchErrorActionStartActivity(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, android.content.Intent intent) {
        super(str, i17);
        this.f84345g = str2;
        this.f84346h = str3;
        this.f84347i = intent;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str) {
        java.lang.String name = context.getClass().getName();
        java.lang.String str2 = this.f84346h;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchErrorAction", "showError(%s) startActivity %s -> %s", str, name, str2);
        boolean z17 = context instanceof android.app.Activity;
        android.content.Intent intent = this.f84347i;
        if (z17) {
            intent.setFlags(intent.getFlags() & (-268435457));
        } else {
            intent.addFlags(268435456);
        }
        j45.l.j(context, this.f84345g, str2, intent, null);
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandLaunchErrorActionStartActivity[%s.%s|%s]", this.f84345g, this.f84346h, this.f84347i);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f84345g);
        parcel.writeString(this.f84346h);
        parcel.writeParcelable(this.f84347i, 0);
    }

    public AppBrandLaunchErrorActionStartActivity(android.os.Parcel parcel) {
        super(parcel);
        this.f84345g = parcel.readString();
        this.f84346h = parcel.readString();
        this.f84347i = (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader());
    }
}
