package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* renamed from: com.tencent.mm.plugin.voip.model.VoipScoreState */
/* loaded from: classes14.dex */
public class C18872x6bcd52ff implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18872x6bcd52ff> f38604x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g2();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f257844d;

    /* renamed from: e, reason: collision with root package name */
    public int f257845e;

    /* renamed from: f, reason: collision with root package name */
    public int f257846f;

    /* renamed from: g, reason: collision with root package name */
    public long f257847g;

    /* renamed from: h, reason: collision with root package name */
    public long f257848h;

    /* renamed from: i, reason: collision with root package name */
    public long f257849i;

    public C18872x6bcd52ff() {
        this.f257844d = "";
        this.f257845e = -1;
        this.f257846f = -1;
        this.f257847g = -1L;
        this.f257848h = -1L;
        this.f257849i = 0L;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoipScoreState", "create VoipScoreState", new java.lang.Object[0]);
    }

    public void a() {
        long p17 = c01.w9.p();
        this.f257848h = p17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipScoreState", "markStartTalk, startTalkTime:%s", java.lang.Long.valueOf(p17));
    }

    public void b(java.lang.String str, int i17, int i18, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipScoreState", "setScoreState, roomId:%s, roomKey:%s, title:%s, interval:%s", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(i17));
        this.f257846f = i18;
        this.f257847g = j17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            java.lang.String str2 = new java.lang.String(android.util.Base64.decode(str.getBytes(), 0));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoipScoreState", "setScoreState, title:%s, interval:%s", str2, java.lang.Integer.valueOf(i17));
            this.f257845e = i17;
            this.f257844d = str2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipScoreState", e17, "setScoreState error: %s", e17.getMessage());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m72742x9616526c() {
        return "VoipScoreState{scoreTitle='" + this.f257844d + "', scoreIntervalDay=" + this.f257845e + ", roomId=" + this.f257846f + ", roomKey=" + this.f257847g + ", startTalkTime=" + this.f257848h + ", lastShowScoreTime=" + this.f257849i + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f257844d);
        parcel.writeInt(this.f257845e);
        parcel.writeInt(this.f257846f);
        parcel.writeLong(this.f257847g);
        parcel.writeLong(this.f257848h);
        parcel.writeLong(this.f257849i);
    }

    public C18872x6bcd52ff(android.os.Parcel parcel) {
        this.f257844d = "";
        this.f257845e = -1;
        this.f257846f = -1;
        this.f257847g = -1L;
        this.f257848h = -1L;
        this.f257849i = 0L;
        this.f257844d = parcel.readString();
        this.f257845e = parcel.readInt();
        this.f257846f = parcel.readInt();
        this.f257847g = parcel.readLong();
        this.f257848h = parcel.readLong();
        this.f257849i = parcel.readLong();
    }
}
