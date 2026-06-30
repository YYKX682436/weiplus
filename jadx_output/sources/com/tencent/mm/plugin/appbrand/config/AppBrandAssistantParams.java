package com.tencent.mm.plugin.appbrand.config;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/AppBrandAssistantParams;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandAssistantParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams> CREATOR = new k91.t();

    /* renamed from: d, reason: collision with root package name */
    public boolean f77199d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77200e;

    /* renamed from: f, reason: collision with root package name */
    public final double f77201f;

    /* renamed from: g, reason: collision with root package name */
    public final double f77202g;

    public AppBrandAssistantParams(boolean z17, java.lang.String wxAssistSessionId, double d17, double d18) {
        kotlin.jvm.internal.o.g(wxAssistSessionId, "wxAssistSessionId");
        this.f77199d = z17;
        this.f77200e = wxAssistSessionId;
        this.f77201f = d17;
        this.f77202g = d18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams appBrandAssistantParams = (com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams) obj;
        return this.f77199d == appBrandAssistantParams.f77199d && kotlin.jvm.internal.o.b(this.f77200e, appBrandAssistantParams.f77200e) && java.lang.Double.compare(this.f77201f, appBrandAssistantParams.f77201f) == 0 && java.lang.Double.compare(this.f77202g, appBrandAssistantParams.f77202g) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f77199d) * 31) + this.f77200e.hashCode()) * 31) + java.lang.Double.hashCode(this.f77201f)) * 31) + java.lang.Double.hashCode(this.f77202g);
    }

    public java.lang.String toString() {
        return "AppBrandAssistantParams(isWxAssistEnable=" + this.f77199d + ", wxAssistSessionId=" + this.f77200e + ", hookLatitude=" + this.f77201f + ", hookLongitude=" + this.f77202g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f77199d ? 1 : 0);
        out.writeString(this.f77200e);
        out.writeDouble(this.f77201f);
        out.writeDouble(this.f77202g);
    }

    public /* synthetic */ AppBrandAssistantParams(boolean z17, java.lang.String str, double d17, double d18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? 0.0d : d17, (i17 & 8) == 0 ? d18 : 0.0d);
    }
}
