package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderParcelTopicInfo */
/* loaded from: classes5.dex */
public class C13878x16d00f4e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13878x16d00f4e> f35603x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f5();

    /* renamed from: d, reason: collision with root package name */
    public final r45.r03 f189064d;

    public C13878x16d00f4e(r45.r03 r03Var) {
        this.f189064d = r03Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            byte[] mo14344x5f01b1f6 = this.f189064d.mo14344x5f01b1f6();
            parcel.writeInt(mo14344x5f01b1f6.length);
            parcel.writeByteArray(mo14344x5f01b1f6);
        } catch (java.io.IOException unused) {
        }
    }

    public C13878x16d00f4e(android.os.Parcel parcel) {
        r45.r03 r03Var = new r45.r03();
        this.f189064d = r03Var;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            r03Var.mo11468x92b714fd(bArr);
        } catch (java.io.IOException unused) {
        }
    }
}
