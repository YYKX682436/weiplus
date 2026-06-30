package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.mall.MallNews */
/* loaded from: classes9.dex */
public class C19101x8593f27 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27> f38693x681a0c0c = new bt4.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f261364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261365e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f261366f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261367g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261368h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261369i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261370m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f261371n;

    /* renamed from: o, reason: collision with root package name */
    public int f261372o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f261373p;

    /* renamed from: q, reason: collision with root package name */
    public int f261374q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f261375r;

    /* renamed from: s, reason: collision with root package name */
    public int f261376s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f261377t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f261378u;

    /* renamed from: v, reason: collision with root package name */
    public int f261379v;

    /* renamed from: w, reason: collision with root package name */
    public int f261380w;

    public C19101x8593f27(java.lang.String str) {
        this.f261364d = "0";
        this.f261365e = "0";
        this.f261366f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m73894xb2c87fbf(java.lang.Object obj) {
        java.lang.String str;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27) obj;
            java.lang.String str2 = this.f261366f;
            if (str2 != null && str2.equals(c19101x8593f27.f261366f) && (str = this.f261367g) != null && str.equals(c19101x8593f27.f261367g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m73895x9616526c() {
        return java.lang.String.format("functionId : %s, activityId : %s, ticket : %s, activityMsg : %s, activityLink : %s, activityIconLink : %s, showFlag : %s, orgStr : %s, activityTips: %s, activityType: %d, activityUrl: %s, walletRegion: %d", this.f261366f, this.f261367g, this.f261368h, this.f261369i, this.f261370m, this.f261371n, this.f261364d, this.f261375r, this.f261373p, java.lang.Integer.valueOf(this.f261376s), this.f261377t, java.lang.Integer.valueOf(this.f261380w));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f261366f);
        parcel.writeString(this.f261367g);
        parcel.writeString(this.f261368h);
        parcel.writeString(this.f261369i);
        parcel.writeString(this.f261370m);
        parcel.writeString(this.f261371n);
        parcel.writeInt(this.f261372o);
        parcel.writeString(this.f261373p);
        parcel.writeString(this.f261364d);
        parcel.writeString(this.f261365e);
        parcel.writeInt(this.f261379v);
        parcel.writeString(this.f261375r);
        parcel.writeInt(this.f261376s);
        parcel.writeString(this.f261377t);
        parcel.writeInt(this.f261380w);
    }

    public C19101x8593f27(android.os.Parcel parcel) {
        this.f261364d = "0";
        this.f261365e = "0";
        this.f261366f = parcel.readString();
        this.f261367g = parcel.readString();
        this.f261368h = parcel.readString();
        this.f261369i = parcel.readString();
        this.f261370m = parcel.readString();
        this.f261371n = parcel.readString();
        this.f261372o = parcel.readInt();
        this.f261373p = parcel.readString();
        this.f261364d = parcel.readString();
        this.f261365e = parcel.readString();
        this.f261379v = parcel.readInt();
        this.f261375r = parcel.readString();
        this.f261376s = parcel.readInt();
        this.f261377t = parcel.readString();
        this.f261380w = parcel.readInt();
    }
}
