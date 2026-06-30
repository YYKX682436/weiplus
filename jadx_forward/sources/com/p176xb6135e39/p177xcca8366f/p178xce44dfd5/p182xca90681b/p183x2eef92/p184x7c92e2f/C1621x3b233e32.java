package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p182xca90681b.p183x2eef92.p184x7c92e2f;

/* renamed from: com.google.android.exoplayer2.source.dash.manifest.RepresentationKey */
/* loaded from: classes.dex */
public final class C1621x3b233e32 implements android.os.Parcelable, java.lang.Comparable<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p182xca90681b.p183x2eef92.p184x7c92e2f.C1621x3b233e32> {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p182xca90681b.p183x2eef92.p184x7c92e2f.C1621x3b233e32> f5323x681a0c0c = new f9.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f125693d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125694e;

    /* renamed from: f, reason: collision with root package name */
    public final int f125695f;

    public C1621x3b233e32(int i17, int i18, int i19) {
        this.f125693d = i17;
        this.f125694e = i18;
        this.f125695f = i19;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p182xca90681b.p183x2eef92.p184x7c92e2f.C1621x3b233e32 c1621x3b233e32) {
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p182xca90681b.p183x2eef92.p184x7c92e2f.C1621x3b233e32 c1621x3b233e322 = c1621x3b233e32;
        int i17 = this.f125693d - c1621x3b233e322.f125693d;
        if (i17 != 0) {
            return i17;
        }
        int i18 = this.f125694e - c1621x3b233e322.f125694e;
        return i18 == 0 ? this.f125695f - c1621x3b233e322.f125695f : i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m17197x9616526c() {
        return this.f125693d + "." + this.f125694e + "." + this.f125695f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f125693d);
        parcel.writeInt(this.f125694e);
        parcel.writeInt(this.f125695f);
    }
}
