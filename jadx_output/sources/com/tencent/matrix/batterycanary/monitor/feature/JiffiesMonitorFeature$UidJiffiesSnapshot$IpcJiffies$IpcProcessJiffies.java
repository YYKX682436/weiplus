package com.tencent.matrix.batterycanary.monitor.feature;

/* loaded from: classes12.dex */
public class JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies> CREATOR = new android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies>() { // from class: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.1
        @Override // android.os.Parcelable.Creator
        public com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies[] newArray(int i17) {
            return new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies[i17];
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public int f52585d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f52586e;

    /* renamed from: f, reason: collision with root package name */
    public long f52587f;

    /* renamed from: g, reason: collision with root package name */
    public int f52588g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f52589h;

    public JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies(android.os.Parcel parcel) {
        this.f52585d = parcel.readInt();
        this.f52586e = parcel.readString();
        this.f52587f = parcel.readLong();
        this.f52588g = parcel.readInt();
        this.f52589h = parcel.createTypedArrayList(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f52585d);
        parcel.writeString(this.f52586e);
        parcel.writeLong(this.f52587f);
        parcel.writeInt(this.f52588g);
        parcel.writeTypedList(this.f52589h);
    }

    /* loaded from: classes12.dex */
    public static class IpcThreadJiffies implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies> CREATOR = new android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies>() { // from class: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.UidJiffiesSnapshot.IpcJiffies.IpcProcessJiffies.IpcThreadJiffies.1
            @Override // android.os.Parcelable.Creator
            public com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies createFromParcel(android.os.Parcel parcel) {
                return new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies[] newArray(int i17) {
                return new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies[i17];
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public int f52590d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f52591e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f52592f;

        /* renamed from: g, reason: collision with root package name */
        public long f52593g;

        public IpcThreadJiffies(android.os.Parcel parcel) {
            this.f52590d = parcel.readInt();
            this.f52591e = parcel.readString();
            this.f52592f = parcel.readString();
            this.f52593g = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f52590d);
            parcel.writeString(this.f52591e);
            parcel.writeString(this.f52592f);
            parcel.writeLong(this.f52593g);
        }

        public IpcThreadJiffies() {
        }
    }

    public JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies() {
    }
}
