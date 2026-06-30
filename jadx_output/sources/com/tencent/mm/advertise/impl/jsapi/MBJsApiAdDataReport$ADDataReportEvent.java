package com.tencent.mm.advertise.impl.jsapi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/advertise/impl/jsapi/MBJsApiAdDataReport$ADDataReportEvent", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/advertise/impl/jsapi/e", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MBJsApiAdDataReport$ADDataReportEvent implements android.os.Parcelable {
    public static final com.tencent.mm.advertise.impl.jsapi.e CREATOR = new com.tencent.mm.advertise.impl.jsapi.e(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f53160d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53161e;

    public MBJsApiAdDataReport$ADDataReportEvent(java.lang.String str, int i17) {
        this.f53160d = str;
        this.f53161e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent)) {
            return false;
        }
        com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent mBJsApiAdDataReport$ADDataReportEvent = (com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent) obj;
        return kotlin.jvm.internal.o.b(this.f53160d, mBJsApiAdDataReport$ADDataReportEvent.f53160d) && this.f53161e == mBJsApiAdDataReport$ADDataReportEvent.f53161e;
    }

    public int hashCode() {
        java.lang.String str = this.f53160d;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f53161e);
    }

    public java.lang.String toString() {
        return "ADDataReportEvent(reportStr=" + this.f53160d + ", logId=" + this.f53161e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f53160d);
        parcel.writeInt(this.f53161e);
    }
}
