package com.tencent.luggage.sdk.launching;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/launching/OnWXAppResultEventBinder;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class OnWXAppResultEventBinder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder> CREATOR = new com.tencent.luggage.sdk.launching.b();

    /* renamed from: d, reason: collision with root package name */
    public final int f47593d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f47594e;

    public OnWXAppResultEventBinder(int i17, java.lang.String str) {
        this.f47593d = i17;
        this.f47594e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder)) {
            return false;
        }
        com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder onWXAppResultEventBinder = (com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder) obj;
        return this.f47593d == onWXAppResultEventBinder.f47593d && kotlin.jvm.internal.o.b(this.f47594e, onWXAppResultEventBinder.f47594e);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f47593d) * 31;
        java.lang.String str = this.f47594e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "OnWXAppResultEventBinder(instance=" + this.f47593d + ", processName=" + this.f47594e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f47593d);
        out.writeString(this.f47594e);
    }
}
