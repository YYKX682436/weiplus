package com.tencent.mm.feature.setting.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/setting/api/AskParam;", "Landroid/os/Parcelable;", "setting-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class AskParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.setting.api.AskParam> CREATOR = new wd0.c();

    /* renamed from: d, reason: collision with root package name */
    public int f67806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f67807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f67808f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f67809g;

    public AskParam(int i17, java.lang.String ask, java.lang.String ask_signature, java.lang.String cert) {
        kotlin.jvm.internal.o.g(ask, "ask");
        kotlin.jvm.internal.o.g(ask_signature, "ask_signature");
        kotlin.jvm.internal.o.g(cert, "cert");
        this.f67806d = i17;
        this.f67807e = ask;
        this.f67808f = ask_signature;
        this.f67809g = cert;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.setting.api.AskParam)) {
            return false;
        }
        com.tencent.mm.feature.setting.api.AskParam askParam = (com.tencent.mm.feature.setting.api.AskParam) obj;
        return this.f67806d == askParam.f67806d && kotlin.jvm.internal.o.b(this.f67807e, askParam.f67807e) && kotlin.jvm.internal.o.b(this.f67808f, askParam.f67808f) && kotlin.jvm.internal.o.b(this.f67809g, askParam.f67809g);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f67806d) * 31) + this.f67807e.hashCode()) * 31) + this.f67808f.hashCode()) * 31) + this.f67809g.hashCode();
    }

    public java.lang.String toString() {
        return "AskParam(errCode=" + this.f67806d + ", ask=" + this.f67807e + ", ask_signature=" + this.f67808f + ", cert=" + this.f67809g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f67806d);
        out.writeString(this.f67807e);
        out.writeString(this.f67808f);
        out.writeString(this.f67809g);
    }

    public /* synthetic */ AskParam(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? "" : str, (i18 & 4) != 0 ? "" : str2, (i18 & 8) != 0 ? "" : str3);
    }
}
