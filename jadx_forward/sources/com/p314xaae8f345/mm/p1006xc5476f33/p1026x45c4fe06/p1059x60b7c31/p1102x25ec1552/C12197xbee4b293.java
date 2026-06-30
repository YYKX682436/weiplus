package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1102x25ec1552;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent */
/* loaded from: classes7.dex */
public final class C12197xbee4b293 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1102x25ec1552.C12197xbee4b293> f34579x681a0c0c = new ld1.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f164006d;

    public C12197xbee4b293(android.os.Parcel parcel) {
        this.f164006d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f164006d);
    }
}
