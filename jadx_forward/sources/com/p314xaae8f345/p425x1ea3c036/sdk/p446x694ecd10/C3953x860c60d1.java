package com.p314xaae8f345.p425x1ea3c036.sdk.p446x694ecd10;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/wxa_ktx/PopActivityRecord;", "Landroid/os/Parcelable;", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.wxa_ktx.PopActivityRecord */
/* loaded from: classes.dex */
public final /* data */ class C3953x860c60d1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p446x694ecd10.C3953x860c60d1> f15719x681a0c0c = new cf.g();

    /* renamed from: d, reason: collision with root package name */
    public final int f129235d;

    /* renamed from: e, reason: collision with root package name */
    public final long f129236e;

    public C3953x860c60d1(int i17, long j17) {
        this.f129235d = i17;
        this.f129236e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m32251xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p446x694ecd10.C3953x860c60d1)) {
            return false;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p446x694ecd10.C3953x860c60d1 c3953x860c60d1 = (com.p314xaae8f345.p425x1ea3c036.sdk.p446x694ecd10.C3953x860c60d1) obj;
        return this.f129235d == c3953x860c60d1.f129235d && this.f129236e == c3953x860c60d1.f129236e;
    }

    /* renamed from: hashCode */
    public int m32252x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f129235d) * 31) + java.lang.Long.hashCode(this.f129236e);
    }

    /* renamed from: toString */
    public java.lang.String m32253x9616526c() {
        return "PopActivityRecord(taskId=" + this.f129235d + ", createTime=" + this.f129236e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f129235d);
        out.writeLong(this.f129236e);
    }
}
