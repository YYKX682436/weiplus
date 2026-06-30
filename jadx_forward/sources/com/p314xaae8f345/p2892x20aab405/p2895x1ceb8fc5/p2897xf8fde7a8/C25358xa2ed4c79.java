package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo */
/* loaded from: classes13.dex */
public class C25358xa2ed4c79 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.AbstractC25357x47859e49 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79> f45744x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79>() { // from class: com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 createFromParcel(android.os.Parcel parcel) {
            int readInt = parcel.readInt();
            java.lang.String readString = parcel.readString();
            java.lang.String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            java.lang.String readString3 = parcel.readString();
            java.lang.String readString4 = parcel.readString();
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c79 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79(readInt);
            c25358xa2ed4c79.m93900x4ab94e43(readString);
            c25358xa2ed4c79.m93903x53bfe316(readString2);
            c25358xa2ed4c79.m93902x845c6269(readLong);
            c25358xa2ed4c79.m93899x12a3340f(readLong2);
            c25358xa2ed4c79.m93901x786ed18c(readString3);
            c25358xa2ed4c79.m93898x52b53f2d(readString4);
            return c25358xa2ed4c79;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79[] newArray(int i17) {
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79[i17];
        }
    };

    /* renamed from: mEndPostion */
    private long f45746xd270265a;

    /* renamed from: mStartPosition */
    private long f45748x8f34483e;

    /* renamed from: mTitle */
    private java.lang.String f45749xbed16deb = "";

    /* renamed from: mPerformer */
    private java.lang.String f45747x9764e9e1 = "";

    /* renamed from: mAlbum */
    private java.lang.String f45745xbdc6ca02 = "";

    public C25358xa2ed4c79(int i17) {
        this.f45742x6280547 = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: getAlbum */
    public java.lang.String m93893x742724b9() {
        return this.f45745xbdc6ca02;
    }

    /* renamed from: getPerformer */
    public java.lang.String m93894x1c1b1118() {
        return this.f45747x9764e9e1;
    }

    /* renamed from: getRange */
    public android.util.Pair<java.lang.Long, java.lang.Long> m93895x7511df87() {
        return new android.util.Pair<>(java.lang.Long.valueOf(this.f45748x8f34483e), java.lang.Long.valueOf(this.f45746xd270265a));
    }

    /* renamed from: getTitle */
    public java.lang.String m93896x7531c8a2() {
        return this.f45749xbed16deb;
    }

    /* renamed from: getUri */
    public java.lang.String m93897xb5887636() {
        return this.f45743x32d9bf;
    }

    /* renamed from: setAlbum */
    public void m93898x52b53f2d(java.lang.String str) {
        this.f45745xbdc6ca02 = str;
    }

    /* renamed from: setEndPostion */
    public void m93899x12a3340f(long j17) {
        this.f45746xd270265a = j17;
    }

    /* renamed from: setFilePath */
    public void m93900x4ab94e43(java.lang.String str) {
        this.f45743x32d9bf = str;
    }

    /* renamed from: setPerformer */
    public void m93901x786ed18c(java.lang.String str) {
        this.f45747x9764e9e1 = str;
    }

    /* renamed from: setStartPosition */
    public void m93902x845c6269(long j17) {
        this.f45748x8f34483e = j17;
    }

    /* renamed from: setTitle */
    public void m93903x53bfe316(java.lang.String str) {
        this.f45749xbed16deb = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f45742x6280547);
        parcel.writeString(this.f45743x32d9bf);
        parcel.writeString(this.f45749xbed16deb);
        parcel.writeLong(this.f45748x8f34483e);
        parcel.writeLong(this.f45746xd270265a);
        parcel.writeString(this.f45747x9764e9e1);
        parcel.writeString(this.f45745xbdc6ca02);
    }
}
