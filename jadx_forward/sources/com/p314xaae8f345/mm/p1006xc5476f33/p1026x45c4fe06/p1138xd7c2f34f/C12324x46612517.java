package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionAlert */
/* loaded from: classes7.dex */
public final class C12324x46612517 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f165875g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f165876h;

    public C12324x46612517(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        super(str, i17);
        this.f165875g = str2;
        this.f165876h = str3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str) {
        java.lang.String str2 = this.f165876h;
        java.lang.String str3 = this.f165875g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchErrorAction", "showError(%s) alert title:%s, message:%s", str, str3, str2);
        if (context instanceof android.app.Activity) {
            db5.e1.G(context, str2, str3, false, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.a(null, str2, str3, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), "", null, null, null);
        }
    }

    /* renamed from: toString */
    public java.lang.String m51652x9616526c() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandLaunchErrorActionAlert[%s %s]", this.f165875g, this.f165876h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f165875g);
        parcel.writeString(this.f165876h);
    }

    public C12324x46612517(android.os.Parcel parcel) {
        super(parcel);
        this.f165875g = parcel.readString();
        this.f165876h = parcel.readString();
    }
}
