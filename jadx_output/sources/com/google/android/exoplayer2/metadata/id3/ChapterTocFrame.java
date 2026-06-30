package com.google.android.exoplayer2.metadata.id3;

/* loaded from: classes13.dex */
public final class ChapterTocFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.ChapterTocFrame> CREATOR = new b9.d();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f44122e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44123f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f44124g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String[] f44125h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.metadata.id3.Id3Frame[] f44126i;

    public ChapterTocFrame(java.lang.String str, boolean z17, boolean z18, java.lang.String[] strArr, com.google.android.exoplayer2.metadata.id3.Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f44122e = str;
        this.f44123f = z17;
        this.f44124g = z18;
        this.f44125h = strArr;
        this.f44126i = id3FrameArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.metadata.id3.ChapterTocFrame chapterTocFrame = (com.google.android.exoplayer2.metadata.id3.ChapterTocFrame) obj;
        return this.f44123f == chapterTocFrame.f44123f && this.f44124g == chapterTocFrame.f44124g && t9.d0.a(this.f44122e, chapterTocFrame.f44122e) && java.util.Arrays.equals(this.f44125h, chapterTocFrame.f44125h) && java.util.Arrays.equals(this.f44126i, chapterTocFrame.f44126i);
    }

    public int hashCode() {
        int i17 = (((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + (this.f44123f ? 1 : 0)) * 31) + (this.f44124g ? 1 : 0)) * 31;
        java.lang.String str = this.f44122e;
        return i17 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44122e);
        parcel.writeByte(this.f44123f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44124g ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f44125h);
        com.google.android.exoplayer2.metadata.id3.Id3Frame[] id3FrameArr = this.f44126i;
        parcel.writeInt(id3FrameArr.length);
        for (com.google.android.exoplayer2.metadata.id3.Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(android.os.Parcel parcel) {
        super("CTOC");
        this.f44122e = parcel.readString();
        this.f44123f = parcel.readByte() != 0;
        this.f44124g = parcel.readByte() != 0;
        this.f44125h = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f44126i = new com.google.android.exoplayer2.metadata.id3.Id3Frame[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f44126i[i17] = (com.google.android.exoplayer2.metadata.id3.Id3Frame) parcel.readParcelable(com.google.android.exoplayer2.metadata.id3.Id3Frame.class.getClassLoader());
        }
    }
}
