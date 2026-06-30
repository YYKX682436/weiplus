package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies */
/* loaded from: classes12.dex */
public class C4639x13061b85 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85> f19906x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85>() { // from class: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.1
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85[] newArray(int i17) {
            return new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85[i17];
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public int f134118d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f134119e;

    /* renamed from: f, reason: collision with root package name */
    public long f134120f;

    /* renamed from: g, reason: collision with root package name */
    public int f134121g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f134122h;

    public C4639x13061b85(android.os.Parcel parcel) {
        this.f134118d = parcel.readInt();
        this.f134119e = parcel.readString();
        this.f134120f = parcel.readLong();
        this.f134121g = parcel.readInt();
        this.f134122h = parcel.createTypedArrayList(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies.f19907x681a0c0c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f134118d);
        parcel.writeString(this.f134119e);
        parcel.writeLong(this.f134120f);
        parcel.writeInt(this.f134121g);
        parcel.writeTypedList(this.f134122h);
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies$IpcThreadJiffies */
    /* loaded from: classes12.dex */
    public static class IpcThreadJiffies implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies> f19907x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies>() { // from class: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.UidJiffiesSnapshot.IpcJiffies.IpcProcessJiffies.IpcThreadJiffies.1
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies createFromParcel(android.os.Parcel parcel) {
                return new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies[] newArray(int i17) {
                return new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies[i17];
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public int f134123d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f134124e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f134125f;

        /* renamed from: g, reason: collision with root package name */
        public long f134126g;

        public IpcThreadJiffies(android.os.Parcel parcel) {
            this.f134123d = parcel.readInt();
            this.f134124e = parcel.readString();
            this.f134125f = parcel.readString();
            this.f134126g = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f134123d);
            parcel.writeString(this.f134124e);
            parcel.writeString(this.f134125f);
            parcel.writeLong(this.f134126g);
        }

        public IpcThreadJiffies() {
        }
    }

    public C4639x13061b85() {
    }
}
