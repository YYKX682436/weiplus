package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch */
/* loaded from: classes9.dex */
public class C16337xbe204522 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522> f37469x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f1();

    /* renamed from: d, reason: collision with root package name */
    public int f226686d;

    /* renamed from: e, reason: collision with root package name */
    public int f226687e;

    /* renamed from: f, reason: collision with root package name */
    public int f226688f;

    /* renamed from: g, reason: collision with root package name */
    public int f226689g;

    public C16337xbe204522() {
        this.f226686d = 0;
        this.f226687e = 0;
        this.f226688f = 0;
        this.f226689g = 0;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522 a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522 c16337xbe204522 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522();
        c16337xbe204522.f226686d = jSONObject.optInt("showOpenNormalExpression", 0);
        c16337xbe204522.f226687e = jSONObject.optInt("showDetailNormalExpression", 0);
        c16337xbe204522.f226688f = jSONObject.optInt("enableAnswerByExpression", 0);
        c16337xbe204522.f226689g = jSONObject.optInt("enableAnswerBySelfie", 0);
        return c16337xbe204522;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m66071x9616526c() {
        return "LuckyMoneyEmojiSwitch{showOpenNormalExpression=" + this.f226686d + ", showDetailNormalExpression=" + this.f226687e + ", enalbeAnswerByExpression=" + this.f226688f + ", enableAnswerBySelfie=" + this.f226689g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f226686d);
        parcel.writeInt(this.f226687e);
        parcel.writeInt(this.f226688f);
        parcel.writeInt(this.f226689g);
    }

    public C16337xbe204522(android.os.Parcel parcel) {
        this.f226686d = 0;
        this.f226687e = 0;
        this.f226688f = 0;
        this.f226689g = 0;
        this.f226686d = parcel.readInt();
        this.f226687e = parcel.readInt();
        this.f226688f = parcel.readInt();
        this.f226689g = parcel.readInt();
    }
}
