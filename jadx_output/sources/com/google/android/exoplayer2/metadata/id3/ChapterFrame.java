package com.google.android.exoplayer2.metadata.id3;

/* loaded from: classes13.dex */
public final class ChapterFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.ChapterFrame> CREATOR = new b9.c();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f44116e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44117f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44118g;

    /* renamed from: h, reason: collision with root package name */
    public final long f44119h;

    /* renamed from: i, reason: collision with root package name */
    public final long f44120i;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.android.exoplayer2.metadata.id3.Id3Frame[] f44121m;

    public ChapterFrame(java.lang.String str, int i17, int i18, long j17, long j18, com.google.android.exoplayer2.metadata.id3.Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f44116e = str;
        this.f44117f = i17;
        this.f44118g = i18;
        this.f44119h = j17;
        this.f44120i = j18;
        this.f44121m = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.id3.ChapterFrame.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.id3.ChapterFrame chapterFrame = (com.google.android.exoplayer2.metadata.id3.ChapterFrame) obj;
        return this.f44117f == chapterFrame.f44117f && this.f44118g == chapterFrame.f44118g && this.f44119h == chapterFrame.f44119h && this.f44120i == chapterFrame.f44120i && t9.d0.a(this.f44116e, chapterFrame.f44116e) && java.util.Arrays.equals(this.f44121m, chapterFrame.f44121m);
    }

    public int hashCode() {
        int i17 = (((((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f44117f) * 31) + this.f44118g) * 31) + ((int) this.f44119h)) * 31) + ((int) this.f44120i)) * 31;
        java.lang.String str = this.f44116e;
        return i17 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44116e);
        parcel.writeInt(this.f44117f);
        parcel.writeInt(this.f44118g);
        parcel.writeLong(this.f44119h);
        parcel.writeLong(this.f44120i);
        com.google.android.exoplayer2.metadata.id3.Id3Frame[] id3FrameArr = this.f44121m;
        parcel.writeInt(id3FrameArr.length);
        for (com.google.android.exoplayer2.metadata.id3.Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(android.os.Parcel parcel) {
        super("CHAP");
        this.f44116e = parcel.readString();
        this.f44117f = parcel.readInt();
        this.f44118g = parcel.readInt();
        this.f44119h = parcel.readLong();
        this.f44120i = parcel.readLong();
        int readInt = parcel.readInt();
        this.f44121m = new com.google.android.exoplayer2.metadata.id3.Id3Frame[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f44121m[i17] = (com.google.android.exoplayer2.metadata.id3.Id3Frame) parcel.readParcelable(com.google.android.exoplayer2.metadata.id3.Id3Frame.class.getClassLoader());
        }
    }
}
