package com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29;

/* renamed from: com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo */
/* loaded from: classes9.dex */
public class C22898xca8246e1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1> f39874x681a0c0c = new com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.b();

    /* renamed from: d, reason: collision with root package name */
    public int f295577d;

    /* renamed from: e, reason: collision with root package name */
    public int f295578e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f295579f;

    public C22898xca8246e1() {
        this.f295577d = -1;
        this.f295578e = -1;
        this.f295579f = "";
    }

    public void a(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("retry_pay_info")) == null) {
            return;
        }
        this.f295577d = optJSONObject.optInt("retry_interval", -1);
        this.f295578e = optJSONObject.optInt("max_retry_count", -1);
        this.f295579f = optJSONObject.optString("retry_fail_wording", "");
    }

    public boolean b() {
        return (this.f295577d == -1 || this.f295578e == -1) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f295577d);
        parcel.writeInt(this.f295578e);
        parcel.writeString(this.f295579f);
    }

    public C22898xca8246e1(android.os.Parcel parcel) {
        this.f295577d = parcel.readInt();
        this.f295578e = parcel.readInt();
        this.f295579f = parcel.readString();
    }
}
