package com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/config/LaunchWxaAppInfoParcelized;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized */
/* loaded from: classes7.dex */
public final class C3900x5df21f9b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3900x5df21f9b> f15683x681a0c0c = new ne.k();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 f128834d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Parcelable f128835e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f128836f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f128837g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f128838h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3901x1a23c13e f128839i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f128840m;

    /* renamed from: n, reason: collision with root package name */
    public int f128841n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f128842o;

    public C3900x5df21f9b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd54, android.os.Parcelable parcelable, java.lang.String str, boolean z17, boolean z18, com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3901x1a23c13e c3901x1a23c13e, boolean z19, int i17, java.lang.String str2) {
        this.f128834d = c12540xf7cdfd54;
        this.f128835e = parcelable;
        this.f128836f = str;
        this.f128837g = z17;
        this.f128838h = z18;
        this.f128839i = c3901x1a23c13e;
        this.f128840m = z19;
        this.f128841n = i17;
        this.f128842o = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f128834d, i17);
        out.writeParcelable(this.f128835e, i17);
        out.writeString(this.f128836f);
        out.writeInt(this.f128837g ? 1 : 0);
        out.writeInt(this.f128838h ? 1 : 0);
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3901x1a23c13e c3901x1a23c13e = this.f128839i;
        if (c3901x1a23c13e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c3901x1a23c13e.writeToParcel(out, i17);
        }
        out.writeInt(this.f128840m ? 1 : 0);
        out.writeInt(this.f128841n);
        out.writeString(this.f128842o);
    }

    public /* synthetic */ C3900x5df21f9b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd54, android.os.Parcelable parcelable, java.lang.String str, boolean z17, boolean z18, com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3901x1a23c13e c3901x1a23c13e, boolean z19, int i17, java.lang.String str2, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(c12540xf7cdfd54, parcelable, str, z17, (i18 & 16) != 0 ? false : z18, (i18 & 32) != 0 ? null : c3901x1a23c13e, (i18 & 64) != 0 ? false : z19, (i18 & 128) != 0 ? 0 : i17, str2);
    }
}
