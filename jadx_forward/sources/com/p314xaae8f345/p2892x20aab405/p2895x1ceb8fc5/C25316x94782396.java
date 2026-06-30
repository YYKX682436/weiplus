package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.AudioInformation */
/* loaded from: classes13.dex */
public class C25316x94782396 implements android.os.Parcelable {
    public static final int CBR = 1;

    /* renamed from: CORRECT */
    public static final int f45469x63ba344a = 1;

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396> f45470x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396>() { // from class: com.tencent.qqmusic.mediaplayer.AudioInformation.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396[] newArray(int i17) {
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396[i17];
        }
    };

    /* renamed from: INCORRECT */
    public static final int f45471x51d98785 = 2;

    /* renamed from: VBR_VBRI */
    public static final int f45472x1a508f5c = 3;

    /* renamed from: VBR_XING */
    public static final int f45473x1a5191e3 = 2;

    /* renamed from: bitrate */
    private int f45475xf9e77b6d;

    /* renamed from: channels */
    private int f45476x556423d0;

    /* renamed from: mAudioTypeValue */
    private int f45480x328804ee;

    /* renamed from: sampleRate */
    private long f45482x88751aa;

    /* renamed from: duration */
    private long f45477x89444d94 = 0;

    /* renamed from: bitDept */
    private int f45474xf9d2a0f2 = 0;

    /* renamed from: mPlaySample */
    private long f45481x3982ae4b = 0;

    /* renamed from: isCbr */
    private int f45479x5fcf269 = 0;

    /* renamed from: durationIsCorrect */
    private int f45478x8289c8ac = 2;

    public C25316x94782396() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: durationIsCorrect */
    public boolean m93535x8289c8ac() {
        return this.f45478x8289c8ac == 1;
    }

    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m93536xaa5357a() {
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.m93526xaa5357a(this.f45480x328804ee);
    }

    /* renamed from: getBitDepth */
    public int m93537xbc5bbb2c() {
        return this.f45474xf9d2a0f2;
    }

    /* renamed from: getBitrate */
    public int m93538x37b4b737() {
        return this.f45475xf9e77b6d;
    }

    /* renamed from: getChannels */
    public int m93539xd13e6146() {
        return this.f45476x556423d0;
    }

    /* renamed from: getDuration */
    public long m93540x51e8b0a() {
        return this.f45477x89444d94;
    }

    /* renamed from: getPlaySample */
    public long m93541x4b916df4() {
        if (this.f45481x3982ae4b == 0) {
            this.f45481x3982ae4b = this.f45482x88751aa;
        }
        return this.f45481x3982ae4b;
    }

    /* renamed from: getSampleRate */
    public long m93542xf6c809a0() {
        return this.f45482x88751aa;
    }

    /* renamed from: getVbrType */
    public int m93543x4d95f36a() {
        return this.f45479x5fcf269;
    }

    /* renamed from: isCbr */
    public boolean m93544x5fcf269() {
        return this.f45479x5fcf269 == 1;
    }

    /* renamed from: isVbr */
    public boolean m93545x5fd39bc() {
        int i17 = this.f45479x5fcf269;
        return i17 == 2 || i17 == 3;
    }

    /* renamed from: readFromParcel */
    public void m93546xb362ce89(android.os.Parcel parcel) {
        this.f45482x88751aa = parcel.readLong();
        this.f45476x556423d0 = parcel.readInt();
        this.f45477x89444d94 = parcel.readLong();
        this.f45475xf9e77b6d = parcel.readInt();
        this.f45474xf9d2a0f2 = parcel.readInt();
        this.f45480x328804ee = parcel.readInt();
        this.f45481x3982ae4b = parcel.readLong();
        this.f45479x5fcf269 = parcel.readInt();
        this.f45478x8289c8ac = parcel.readInt();
    }

    /* renamed from: setAudioType */
    public void m93547x66f8f5ee(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType) {
        this.f45480x328804ee = audioType.m93533x754a37bb();
    }

    /* renamed from: setBitDept */
    public void m93548xab112a30(int i17) {
        this.f45474xf9d2a0f2 = i17;
        if (i17 >= 3) {
            this.f45474xf9d2a0f2 = 3;
        }
    }

    /* renamed from: setBitrate */
    public void m93549xab2604ab(int i17) {
        this.f45475xf9e77b6d = i17;
    }

    /* renamed from: setCbr */
    public void m93550xca025831(int i17) {
        this.f45479x5fcf269 = i17;
    }

    /* renamed from: setChannels */
    public void m93551xcbf6c252(int i17) {
        this.f45476x556423d0 = i17;
    }

    /* renamed from: setDuration */
    public void m93552xffd6ec16(long j17) {
        this.f45477x89444d94 = j17;
    }

    /* renamed from: setPlaySample */
    public void m93553x79b5bc00(long j17) {
        this.f45481x3982ae4b = j17;
    }

    /* renamed from: setSampleRate */
    public void m93554x24ec57ac(long j17) {
        this.f45482x88751aa = j17;
    }

    /* renamed from: toString */
    public java.lang.String m93555x9616526c() {
        return "[ sampleRate = " + this.f45482x88751aa + ",channels = " + this.f45476x556423d0 + ",bitrate = " + this.f45475xf9e77b6d + ",bitDept = " + this.f45474xf9d2a0f2 + ",isCbr = " + this.f45479x5fcf269 + ",durationIsCorrect = " + this.f45478x8289c8ac + ",duration = " + this.f45477x89444d94 + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f45482x88751aa);
        parcel.writeInt(this.f45476x556423d0);
        parcel.writeLong(this.f45477x89444d94);
        parcel.writeInt(this.f45475xf9e77b6d);
        parcel.writeInt(this.f45474xf9d2a0f2);
        parcel.writeInt(this.f45480x328804ee);
        parcel.writeLong(this.f45481x3982ae4b);
        parcel.writeInt(this.f45479x5fcf269);
        parcel.writeInt(this.f45478x8289c8ac);
    }

    public C25316x94782396(android.os.Parcel parcel) {
        m93546xb362ce89(parcel);
    }
}
