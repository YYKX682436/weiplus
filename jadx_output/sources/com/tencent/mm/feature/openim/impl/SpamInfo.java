package com.tencent.mm.feature.openim.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/openim/impl/SpamInfo;", "Landroid/os/Parcelable;", "CREATOR", "cb0/f", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class SpamInfo implements android.os.Parcelable {
    public static final cb0.f CREATOR = new cb0.f(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f67318d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67319e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f67320f;

    public SpamInfo(int i17, java.lang.String str, byte[] bArr) {
        this.f67318d = i17;
        this.f67319e = str;
        this.f67320f = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f67318d);
        parcel.writeString(this.f67319e);
        parcel.writeByteArray(this.f67320f);
    }
}
