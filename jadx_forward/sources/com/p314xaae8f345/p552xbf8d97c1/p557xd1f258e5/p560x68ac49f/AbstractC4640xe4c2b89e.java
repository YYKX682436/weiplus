package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f;

/* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord */
/* loaded from: classes12.dex */
public abstract class AbstractC4640xe4c2b89e implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public int f134132d;

    /* renamed from: e, reason: collision with root package name */
    public long f134133e;

    /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$DevStatRecord */
    /* loaded from: classes12.dex */
    public static class DevStatRecord extends com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.DevStatRecord> f19909x681a0c0c = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.b();

        /* renamed from: f, reason: collision with root package name */
        public int f134135f;

        public DevStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f134135f = parcel.readInt();
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f134135f);
        }
    }

    public AbstractC4640xe4c2b89e() {
        this.f134132d = 0;
        this.f134133e = java.lang.System.currentTimeMillis();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f134132d);
        parcel.writeLong(this.f134133e);
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$AppStatRecord */
    /* loaded from: classes12.dex */
    public static class AppStatRecord extends com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.AppStatRecord> f19908x681a0c0c = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.a();

        /* renamed from: f, reason: collision with root package name */
        public int f134134f;

        public AppStatRecord() {
            this.f134132d = 0;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f134134f);
        }

        public AppStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f134134f = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$SceneStatRecord */
    /* loaded from: classes12.dex */
    public static class SceneStatRecord extends com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.SceneStatRecord> f19915x681a0c0c = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.h();

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f134153f;

        public SceneStatRecord() {
            this.f134132d = 0;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f134153f);
        }

        public SceneStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f134153f = parcel.readString();
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$ProcStatRecord */
    /* loaded from: classes12.dex */
    public static class ProcStatRecord extends com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ProcStatRecord> f19911x681a0c0c = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.d();

        /* renamed from: f, reason: collision with root package name */
        public int f134139f;

        /* renamed from: g, reason: collision with root package name */
        public int f134140g;

        public ProcStatRecord() {
            this.f134139f = 1;
            this.f134132d = 0;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f134139f);
            parcel.writeInt(this.f134140g);
        }

        public ProcStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f134139f = 1;
            this.f134139f = parcel.readInt();
            this.f134140g = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$EventStatRecord */
    /* loaded from: classes12.dex */
    public static class EventStatRecord extends com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord> f19910x681a0c0c = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.c();

        /* renamed from: f, reason: collision with root package name */
        public long f134136f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f134137g;

        /* renamed from: h, reason: collision with root package name */
        public java.util.Map f134138h;

        public EventStatRecord() {
            this.f134138h = java.util.Collections.emptyMap();
            this.f134136f = 0L;
            this.f134132d = 1;
        }

        public boolean b(java.lang.String str, boolean z17) {
            if (this.f134138h.containsKey(str)) {
                try {
                    return java.lang.Boolean.parseBoolean(java.lang.String.valueOf(this.f134138h.get(str)));
                } catch (java.lang.Exception unused) {
                }
            }
            return z17;
        }

        public long c(java.lang.String str, long j17) {
            try {
                if (this.f134138h.containsKey(str)) {
                    return java.lang.Long.parseLong(java.lang.String.valueOf(this.f134138h.get(str)));
                }
            } catch (java.lang.Exception unused) {
            }
            return j17;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeLong(this.f134136f);
            parcel.writeString(this.f134137g);
            parcel.writeMap(this.f134138h);
        }

        public EventStatRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f134138h = java.util.Collections.emptyMap();
            this.f134136f = parcel.readLong();
            this.f134137g = parcel.readString();
            if (this.f134132d >= 1) {
                java.util.HashMap hashMap = new java.util.HashMap();
                this.f134138h = hashMap;
                parcel.readMap(hashMap, getClass().getClassLoader());
            }
        }
    }

    public AbstractC4640xe4c2b89e(android.os.Parcel parcel) {
        this.f134132d = parcel.readInt();
        this.f134133e = parcel.readLong();
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord */
    /* loaded from: classes12.dex */
    public static class ReportRecord extends com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord> f19912x681a0c0c = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.e();

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f134141i;

        /* renamed from: m, reason: collision with root package name */
        public long f134142m;

        /* renamed from: n, reason: collision with root package name */
        public java.util.List f134143n;

        /* renamed from: o, reason: collision with root package name */
        public java.util.List f134144o;

        /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo */
        /* loaded from: classes12.dex */
        public static class EntryInfo implements android.os.Parcelable {

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord.EntryInfo> f19913x681a0c0c = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.f();

            /* renamed from: d, reason: collision with root package name */
            public java.lang.String f134145d;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.String f134146e;

            /* renamed from: f, reason: collision with root package name */
            public java.util.Map f134147f;

            public EntryInfo(android.os.Parcel parcel) {
                this.f134147f = java.util.Collections.emptyMap();
                this.f134145d = parcel.readString();
                this.f134146e = parcel.readString();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                this.f134147f = linkedHashMap;
                parcel.readMap(linkedHashMap, getClass().getClassLoader());
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i17) {
                parcel.writeString(this.f134145d);
                parcel.writeString(this.f134146e);
                parcel.writeMap(this.f134147f);
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo */
        /* loaded from: classes12.dex */
        public static class ThreadInfo implements android.os.Parcelable {

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord.ThreadInfo> f19914x681a0c0c = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.g();

            /* renamed from: d, reason: collision with root package name */
            public int f134148d;

            /* renamed from: e, reason: collision with root package name */
            public java.lang.String f134149e;

            /* renamed from: f, reason: collision with root package name */
            public java.lang.String f134150f;

            /* renamed from: g, reason: collision with root package name */
            public long f134151g;

            /* renamed from: h, reason: collision with root package name */
            public java.util.Map f134152h;

            public ThreadInfo(android.os.Parcel parcel) {
                this.f134152h = java.util.Collections.emptyMap();
                this.f134148d = parcel.readInt();
                this.f134149e = parcel.readString();
                this.f134150f = parcel.readString();
                this.f134151g = parcel.readLong();
                android.util.ArrayMap arrayMap = new android.util.ArrayMap();
                this.f134152h = arrayMap;
                parcel.readMap(arrayMap, getClass().getClassLoader());
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i17) {
                parcel.writeInt(this.f134148d);
                parcel.writeString(this.f134149e);
                parcel.writeString(this.f134150f);
                parcel.writeLong(this.f134151g);
                parcel.writeMap(this.f134152h);
            }
        }

        public ReportRecord() {
            this.f134143n = java.util.Collections.emptyList();
            this.f134144o = java.util.Collections.emptyList();
            this.f134132d = 1;
            this.f134137g = "REPORT";
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f134141i);
            parcel.writeLong(this.f134142m);
            parcel.writeTypedList(this.f134143n);
            parcel.writeTypedList(this.f134144o);
        }

        public ReportRecord(android.os.Parcel parcel) {
            super(parcel);
            this.f134143n = java.util.Collections.emptyList();
            this.f134144o = java.util.Collections.emptyList();
            this.f134141i = parcel.readString();
            this.f134142m = parcel.readLong();
            this.f134143n = parcel.createTypedArrayList(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord.ThreadInfo.f19914x681a0c0c);
            this.f134144o = parcel.createTypedArrayList(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord.EntryInfo.f19913x681a0c0c);
        }
    }
}
