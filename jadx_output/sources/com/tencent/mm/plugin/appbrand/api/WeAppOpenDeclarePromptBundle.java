package com.tencent.mm.plugin.appbrand.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/api/WeAppOpenDeclarePromptBundle;", "Landroid/os/Parcelable;", "protocol-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WeAppOpenDeclarePromptBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle> CREATOR = new l81.c1();

    /* renamed from: d, reason: collision with root package name */
    public int f74986d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f74987e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f74988f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f74989g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f74990h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f74991i;

    public WeAppOpenDeclarePromptBundle() {
        this(0, null, null, null, null, false, 63, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = (com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle) obj;
        return this.f74986d == weAppOpenDeclarePromptBundle.f74986d && kotlin.jvm.internal.o.b(this.f74987e, weAppOpenDeclarePromptBundle.f74987e) && kotlin.jvm.internal.o.b(this.f74988f, weAppOpenDeclarePromptBundle.f74988f) && kotlin.jvm.internal.o.b(this.f74989g, weAppOpenDeclarePromptBundle.f74989g) && kotlin.jvm.internal.o.b(this.f74990h, weAppOpenDeclarePromptBundle.f74990h) && this.f74991i == weAppOpenDeclarePromptBundle.f74991i;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f74986d) * 31;
        java.lang.String str = this.f74987e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f74988f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f74989g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f74990h;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f74991i);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeAppOpenDeclarePromptBundle(bizType=");
        sb6.append(this.f74986d);
        sb6.append(", funcI=");
        sb6.append(this.f74987e);
        sb6.append(", promptTitle=");
        java.lang.String str = this.f74988f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", promptMessage=");
        java.lang.String str2 = this.f74989g;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(", promptOkBtnText=");
        java.lang.String str3 = this.f74990h;
        sb6.append(str3 != null ? str3 : "");
        sb6.append(", cancelabl=");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.m1(java.lang.Boolean.valueOf(this.f74991i), false));
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f74986d);
        out.writeString(this.f74987e);
        out.writeString(this.f74988f);
        out.writeString(this.f74989g);
        out.writeString(this.f74990h);
        out.writeInt(this.f74991i ? 1 : 0);
    }

    public WeAppOpenDeclarePromptBundle(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        this.f74986d = i17;
        this.f74987e = str;
        this.f74988f = str2;
        this.f74989g = str3;
        this.f74990h = str4;
        this.f74991i = z17;
    }

    public /* synthetic */ WeAppOpenDeclarePromptBundle(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? null : str, (i18 & 4) != 0 ? null : str2, (i18 & 8) != 0 ? null : str3, (i18 & 16) == 0 ? str4 : null, (i18 & 32) != 0 ? false : z17);
    }
}
