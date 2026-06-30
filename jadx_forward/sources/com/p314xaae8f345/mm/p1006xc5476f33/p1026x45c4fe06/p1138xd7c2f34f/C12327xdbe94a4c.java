package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionStartActivity */
/* loaded from: classes7.dex */
public final class C12327xdbe94a4c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f165878g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f165879h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Intent f165880i;

    public C12327xdbe94a4c(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, android.content.Intent intent) {
        super(str, i17);
        this.f165878g = str2;
        this.f165879h = str3;
        this.f165880i = intent;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str) {
        java.lang.String name = context.getClass().getName();
        java.lang.String str2 = this.f165879h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchErrorAction", "showError(%s) startActivity %s -> %s", str, name, str2);
        boolean z17 = context instanceof android.app.Activity;
        android.content.Intent intent = this.f165880i;
        if (z17) {
            intent.setFlags(intent.getFlags() & (-268435457));
        } else {
            intent.addFlags(268435456);
        }
        j45.l.j(context, this.f165878g, str2, intent, null);
    }

    /* renamed from: toString */
    public java.lang.String m51654x9616526c() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandLaunchErrorActionStartActivity[%s.%s|%s]", this.f165878g, this.f165879h, this.f165880i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f165878g);
        parcel.writeString(this.f165879h);
        parcel.writeParcelable(this.f165880i, 0);
    }

    public C12327xdbe94a4c(android.os.Parcel parcel) {
        super(parcel);
        this.f165878g = parcel.readString();
        this.f165879h = parcel.readString();
        this.f165880i = (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader());
    }
}
