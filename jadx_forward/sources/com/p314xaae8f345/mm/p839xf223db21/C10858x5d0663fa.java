package com.p314xaae8f345.mm.p839xf223db21;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/maas_api/MJMediaItem;", "Landroid/os/Parcelable;", "pp0/u0", "maas-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.maas_api.MJMediaItem */
/* loaded from: classes5.dex */
public final /* data */ class C10858x5d0663fa implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa> f29646x681a0c0c = new pp0.t0();

    /* renamed from: d, reason: collision with root package name */
    public final pp0.u0 f150171d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f150172e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f150173f;

    /* renamed from: g, reason: collision with root package name */
    public int f150174g;

    /* renamed from: h, reason: collision with root package name */
    public int f150175h;

    /* renamed from: i, reason: collision with root package name */
    public int f150176i;

    public C10858x5d0663fa(pp0.u0 mediaType, java.lang.String mediaPath, java.lang.String thumbPath, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaPath, "mediaPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        this.f150171d = mediaType;
        this.f150172e = mediaPath;
        this.f150173f = thumbPath;
        this.f150174g = i17;
        this.f150175h = i18;
        this.f150176i = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46568xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa)) {
            return false;
        }
        com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa c10858x5d0663fa = (com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa) obj;
        return this.f150171d == c10858x5d0663fa.f150171d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150172e, c10858x5d0663fa.f150172e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150173f, c10858x5d0663fa.f150173f) && this.f150174g == c10858x5d0663fa.f150174g && this.f150175h == c10858x5d0663fa.f150175h && this.f150176i == c10858x5d0663fa.f150176i;
    }

    /* renamed from: hashCode */
    public int m46569x8cdac1b() {
        return (((((((((this.f150171d.hashCode() * 31) + this.f150172e.hashCode()) * 31) + this.f150173f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f150174g)) * 31) + java.lang.Integer.hashCode(this.f150175h)) * 31) + java.lang.Integer.hashCode(this.f150176i);
    }

    /* renamed from: toString */
    public java.lang.String m46570x9616526c() {
        return "MJMediaItem(mediaType=" + this.f150171d + ", mediaPath=" + this.f150172e + ", thumbPath=" + this.f150173f + ", width=" + this.f150174g + ", height=" + this.f150175h + ", rotate=" + this.f150176i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f150171d.name());
        out.writeString(this.f150172e);
        out.writeString(this.f150173f);
        out.writeInt(this.f150174g);
        out.writeInt(this.f150175h);
        out.writeInt(this.f150176i);
    }

    public /* synthetic */ C10858x5d0663fa(pp0.u0 u0Var, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(u0Var, str, (i27 & 4) != 0 ? str : str2, (i27 & 8) != 0 ? -1 : i17, (i27 & 16) != 0 ? -1 : i18, (i27 & 32) != 0 ? 0 : i19);
    }
}
