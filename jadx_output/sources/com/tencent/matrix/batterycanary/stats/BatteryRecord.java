package com.tencent.matrix.batterycanary.stats;

/* loaded from: classes12.dex */
public abstract class BatteryRecord implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public int f52599d;

    /* renamed from: e, reason: collision with root package name */
    public long f52600e;

    /* loaded from: classes12.dex */
    public static class DevStatRecord extends com.tencent.matrix.batterycanary.stats.BatteryRecord {
        public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.stats.BatteryRecord.DevStatRecord> CREATOR = new com.tencent.matrix.batterycanary.stats.b();

        /* renamed from: f, reason: collision with root package name */
        public int f52602f;

        public DevStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f52602f = parcel.readInt();
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f52602f);
        }
    }

    public BatteryRecord() {
        this.f52599d = 0;
        this.f52600e = java.lang.System.currentTimeMillis();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f52599d);
        parcel.writeLong(this.f52600e);
    }

    /* loaded from: classes12.dex */
    public static class AppStatRecord extends com.tencent.matrix.batterycanary.stats.BatteryRecord {
        public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.stats.BatteryRecord.AppStatRecord> CREATOR = new com.tencent.matrix.batterycanary.stats.a();

        /* renamed from: f, reason: collision with root package name */
        public int f52601f;

        public AppStatRecord() {
            this.f52599d = 0;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f52601f);
        }

        public AppStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f52601f = parcel.readInt();
        }
    }

    /* loaded from: classes12.dex */
    public static class SceneStatRecord extends com.tencent.matrix.batterycanary.stats.BatteryRecord {
        public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.stats.BatteryRecord.SceneStatRecord> CREATOR = new com.tencent.matrix.batterycanary.stats.h();

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f52620f;

        public SceneStatRecord() {
            this.f52599d = 0;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f52620f);
        }

        public SceneStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f52620f = parcel.readString();
        }
    }

    /* loaded from: classes12.dex */
    public static class ProcStatRecord extends com.tencent.matrix.batterycanary.stats.BatteryRecord {
        public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.stats.BatteryRecord.ProcStatRecord> CREATOR = new com.tencent.matrix.batterycanary.stats.d();

        /* renamed from: f, reason: collision with root package name */
        public int f52606f;

        /* renamed from: g, reason: collision with root package name */
        public int f52607g;

        public ProcStatRecord() {
            this.f52606f = 1;
            this.f52599d = 0;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f52606f);
            parcel.writeInt(this.f52607g);
        }

        public ProcStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f52606f = 1;
            this.f52606f = parcel.readInt();
            this.f52607g = parcel.readInt();
        }
    }

    /* loaded from: classes12.dex */
    public static class EventStatRecord extends com.tencent.matrix.batterycanary.stats.BatteryRecord {
        public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord> CREATOR = new com.tencent.matrix.batterycanary.stats.c();

        /* renamed from: f, reason: collision with root package name */
        public long f52603f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f52604g;

        /* renamed from: h, reason: collision with root package name */
        public java.util.Map f52605h;

        public EventStatRecord() {
            this.f52605h = java.util.Collections.emptyMap();
            this.f52603f = 0L;
            this.f52599d = 1;
        }

        public boolean b(java.lang.String str, boolean z17) {
            if (this.f52605h.containsKey(str)) {
                try {
                    return java.lang.Boolean.parseBoolean(java.lang.String.valueOf(this.f52605h.get(str)));
                } catch (java.lang.Exception unused) {
                }
            }
            return z17;
        }

        public long c(java.lang.String str, long j17) {
            try {
                if (this.f52605h.containsKey(str)) {
                    return java.lang.Long.parseLong(java.lang.String.valueOf(this.f52605h.get(str)));
                }
            } catch (java.lang.Exception unused) {
            }
            return j17;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeLong(this.f52603f);
            parcel.writeString(this.f52604g);
            parcel.writeMap(this.f52605h);
        }

        public EventStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f52605h = java.util.Collections.emptyMap();
            this.f52603f = parcel.readLong();
            this.f52604g = parcel.readString();
            if (this.f52599d >= 1) {
                java.util.HashMap hashMap = new java.util.HashMap();
                this.f52605h = hashMap;
                parcel.readMap(hashMap, getClass().getClassLoader());
            }
        }
    }

    public BatteryRecord(android.os.Parcel parcel) {
        this.f52599d = parcel.readInt();
        this.f52600e = parcel.readLong();
    }

    /* loaded from: classes12.dex */
    public static class ReportRecord extends com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord {
        public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord> CREATOR = new com.tencent.matrix.batterycanary.stats.e();

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f52608i;

        /* renamed from: m, reason: collision with root package name */
        public long f52609m;

        /* renamed from: n, reason: collision with root package name */
        public java.util.List f52610n;

        /* renamed from: o, reason: collision with root package name */
        public java.util.List f52611o;

        /* loaded from: classes12.dex */
        public static class EntryInfo implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.EntryInfo> CREATOR = new com.tencent.matrix.batterycanary.stats.f();

            /* renamed from: d, reason: collision with root package name */
            public java.lang.String f52612d;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.String f52613e;

            /* renamed from: f, reason: collision with root package name */
            public java.util.Map f52614f;

            public EntryInfo(android.os.Parcel parcel) {
                this.f52614f = java.util.Collections.emptyMap();
                this.f52612d = parcel.readString();
                this.f52613e = parcel.readString();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                this.f52614f = linkedHashMap;
                parcel.readMap(linkedHashMap, getClass().getClassLoader());
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i17) {
                parcel.writeString(this.f52612d);
                parcel.writeString(this.f52613e);
                parcel.writeMap(this.f52614f);
            }
        }

        /* loaded from: classes12.dex */
        public static class ThreadInfo implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.ThreadInfo> CREATOR = new com.tencent.matrix.batterycanary.stats.g();

            /* renamed from: d, reason: collision with root package name */
            public int f52615d;

            /* renamed from: e, reason: collision with root package name */
            public java.lang.String f52616e;

            /* renamed from: f, reason: collision with root package name */
            public java.lang.String f52617f;

            /* renamed from: g, reason: collision with root package name */
            public long f52618g;

            /* renamed from: h, reason: collision with root package name */
            public java.util.Map f52619h;

            public ThreadInfo(android.os.Parcel parcel) {
                this.f52619h = java.util.Collections.emptyMap();
                this.f52615d = parcel.readInt();
                this.f52616e = parcel.readString();
                this.f52617f = parcel.readString();
                this.f52618g = parcel.readLong();
                android.util.ArrayMap arrayMap = new android.util.ArrayMap();
                this.f52619h = arrayMap;
                parcel.readMap(arrayMap, getClass().getClassLoader());
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i17) {
                parcel.writeInt(this.f52615d);
                parcel.writeString(this.f52616e);
                parcel.writeString(this.f52617f);
                parcel.writeLong(this.f52618g);
                parcel.writeMap(this.f52619h);
            }
        }

        public ReportRecord() {
            this.f52610n = java.util.Collections.emptyList();
            this.f52611o = java.util.Collections.emptyList();
            this.f52599d = 1;
            this.f52604g = "REPORT";
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord, com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord, com.tencent.matrix.batterycanary.stats.BatteryRecord, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f52608i);
            parcel.writeLong(this.f52609m);
            parcel.writeTypedList(this.f52610n);
            parcel.writeTypedList(this.f52611o);
        }

        public ReportRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f52610n = java.util.Collections.emptyList();
            this.f52611o = java.util.Collections.emptyList();
            this.f52608i = parcel.readString();
            this.f52609m = parcel.readLong();
            this.f52610n = parcel.createTypedArrayList(com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.ThreadInfo.CREATOR);
            this.f52611o = parcel.createTypedArrayList(com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.EntryInfo.CREATOR);
        }
    }
}
