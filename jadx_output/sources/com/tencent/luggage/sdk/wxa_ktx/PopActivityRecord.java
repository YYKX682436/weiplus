package com.tencent.luggage.sdk.wxa_ktx;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/wxa_ktx/PopActivityRecord;", "Landroid/os/Parcelable;", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class PopActivityRecord implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.wxa_ktx.PopActivityRecord> CREATOR = new cf.g();

    /* renamed from: d, reason: collision with root package name */
    public final int f47702d;

    /* renamed from: e, reason: collision with root package name */
    public final long f47703e;

    public PopActivityRecord(int i17, long j17) {
        this.f47702d = i17;
        this.f47703e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.luggage.sdk.wxa_ktx.PopActivityRecord)) {
            return false;
        }
        com.tencent.luggage.sdk.wxa_ktx.PopActivityRecord popActivityRecord = (com.tencent.luggage.sdk.wxa_ktx.PopActivityRecord) obj;
        return this.f47702d == popActivityRecord.f47702d && this.f47703e == popActivityRecord.f47703e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f47702d) * 31) + java.lang.Long.hashCode(this.f47703e);
    }

    public java.lang.String toString() {
        return "PopActivityRecord(taskId=" + this.f47702d + ", createTime=" + this.f47703e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f47702d);
        out.writeLong(this.f47703e);
    }
}
