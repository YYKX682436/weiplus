package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b;

/* renamed from: com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo */
/* loaded from: classes10.dex */
public class C16992x127e9e90 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90> f37757x681a0c0c = new ut3.g();

    /* renamed from: cropSizeCnt */
    public int f37758xfa0d78f8;

    /* renamed from: editList */
    public java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem> f37759x5f797dc8 = new java.util.ArrayList<>();

    /* renamed from: seekBarDragCnt */
    public int f37760x155a449a;

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem */
    /* loaded from: classes10.dex */
    public static class EditItem implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem> f37761x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.a();

        /* renamed from: clickEditCount */
        public int f37762xd5b83c7d;

        /* renamed from: dragCount */
        public int f37763xebe5543b;

        /* renamed from: durationCutCount */
        public int f37764x7935d5a1;

        /* renamed from: durationScrollCount */
        public int f37765x82a6880e;

        /* renamed from: isBeauty */
        public boolean f37766xd5250246;

        /* renamed from: originDuration */
        public long f37767xaa09dada;

        /* renamed from: scaleCount */
        public int f37768x712595e5;

        /* renamed from: targetDuration */
        public long f37769x2a5f0245;

        /* renamed from: type */
        public int f37770x368f3a;

        public EditItem() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f37770x368f3a);
            parcel.writeInt(this.f37766xd5250246 ? 1 : 0);
            parcel.writeLong(this.f37767xaa09dada);
            parcel.writeLong(this.f37769x2a5f0245);
            parcel.writeInt(this.f37762xd5b83c7d);
            parcel.writeInt(this.f37764x7935d5a1);
            parcel.writeInt(this.f37765x82a6880e);
            parcel.writeInt(this.f37763xebe5543b);
            parcel.writeInt(this.f37768x712595e5);
        }

        public EditItem(android.os.Parcel parcel) {
            this.f37770x368f3a = parcel.readInt();
            this.f37766xd5250246 = parcel.readInt() != 0;
            this.f37767xaa09dada = parcel.readLong();
            this.f37769x2a5f0245 = parcel.readLong();
            this.f37762xd5b83c7d = parcel.readInt();
            this.f37764x7935d5a1 = parcel.readInt();
            this.f37765x82a6880e = parcel.readInt();
            this.f37763xebe5543b = parcel.readInt();
            this.f37768x712595e5 = parcel.readInt();
        }
    }

    public C16992x127e9e90() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f37760x155a449a);
        parcel.writeInt(this.f37758xfa0d78f8);
        parcel.writeList(this.f37759x5f797dc8);
    }

    public C16992x127e9e90(android.os.Parcel parcel) {
        this.f37760x155a449a = parcel.readInt();
        this.f37758xfa0d78f8 = parcel.readInt();
        parcel.readList(this.f37759x5f797dc8, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem.class.getClassLoader());
    }
}
