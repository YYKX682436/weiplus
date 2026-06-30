package com.tencent.mm.feature.setting.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/setting/api/BindFingerprintCallback;", "Landroid/os/Parcelable;", "setting-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class BindFingerprintCallback implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.setting.api.BindFingerprintCallback> CREATOR = new wd0.e();

    /* renamed from: d, reason: collision with root package name */
    public int f67813d;

    /* renamed from: e, reason: collision with root package name */
    public int f67814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f67815f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f67816g;

    public BindFingerprintCallback(int i17, int i18, java.lang.String errMsg, java.lang.String result) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(result, "result");
        this.f67813d = i17;
        this.f67814e = i18;
        this.f67815f = errMsg;
        this.f67816g = result;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.setting.api.BindFingerprintCallback)) {
            return false;
        }
        com.tencent.mm.feature.setting.api.BindFingerprintCallback bindFingerprintCallback = (com.tencent.mm.feature.setting.api.BindFingerprintCallback) obj;
        return this.f67813d == bindFingerprintCallback.f67813d && this.f67814e == bindFingerprintCallback.f67814e && kotlin.jvm.internal.o.b(this.f67815f, bindFingerprintCallback.f67815f) && kotlin.jvm.internal.o.b(this.f67816g, bindFingerprintCallback.f67816g);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f67813d) * 31) + java.lang.Integer.hashCode(this.f67814e)) * 31) + this.f67815f.hashCode()) * 31) + this.f67816g.hashCode();
    }

    public java.lang.String toString() {
        return "BindFingerprintCallback(errType=" + this.f67813d + ", errCode=" + this.f67814e + ", errMsg=" + this.f67815f + ", result=" + this.f67816g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f67813d);
        out.writeInt(this.f67814e);
        out.writeString(this.f67815f);
        out.writeString(this.f67816g);
    }
}
