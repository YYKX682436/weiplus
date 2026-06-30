package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask */
/* loaded from: classes11.dex */
class C11976x8944bc6e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11976x8944bc6e> f33760x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d0();

    /* renamed from: h, reason: collision with root package name */
    public double f160520h;

    /* renamed from: i, reason: collision with root package name */
    public int f160521i;

    /* renamed from: m, reason: collision with root package name */
    public double f160522m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160523n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160524o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160525p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160526q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160527r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160528s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f160529t;

    /* renamed from: u, reason: collision with root package name */
    public int f160530u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f160531v;

    /* renamed from: w, reason: collision with root package name */
    public double f160532w;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f160535z;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160518f = "";

    /* renamed from: g, reason: collision with root package name */
    public double f160519g = 0.0d;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f160533x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f160534y = false;

    public C11976x8944bc6e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160518f = parcel.readString();
        this.f160519g = parcel.readDouble();
        this.f160520h = parcel.readDouble();
        this.f160521i = parcel.readInt();
        this.f160522m = parcel.readDouble();
        this.f160523n = parcel.readString();
        this.f160524o = parcel.readString();
        this.f160525p = parcel.readString();
        this.f160526q = parcel.readString();
        this.f160527r = parcel.readString();
        this.f160528s = parcel.readString();
        this.f160529t = parcel.readString();
        this.f160531v = parcel.readString();
        this.f160530u = parcel.readInt();
        this.f160532w = parcel.readDouble();
        this.f160533x = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160518f);
        parcel.writeDouble(this.f160519g);
        parcel.writeDouble(this.f160520h);
        parcel.writeInt(this.f160521i);
        parcel.writeDouble(this.f160522m);
        parcel.writeString(this.f160523n);
        parcel.writeString(this.f160524o);
        parcel.writeString(this.f160525p);
        parcel.writeString(this.f160526q);
        parcel.writeString(this.f160527r);
        parcel.writeString(this.f160528s);
        parcel.writeString(this.f160529t);
        parcel.writeString(this.f160531v);
        parcel.writeInt(this.f160530u);
        parcel.writeDouble(this.f160532w);
        parcel.writeString(this.f160533x);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        int i17;
        int i18;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a.f167294a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.equals(this.f160518f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBackgroundAudioState", "appid not match cannot get background audio state, preAppId:%s, appId:%s", str, this.f160518f);
            this.f160534y = true;
            this.f160535z = "appid not match cannot get background audio state";
            c();
            return;
        }
        b21.r b17 = b21.m.b();
        if (b17 != null) {
            b21.o a17 = b21.m.a();
            if (a17 != null) {
                i17 = a17.f98870a;
                i18 = a17.f98871b;
            } else {
                i17 = -1;
                i18 = -1;
            }
            if (a17 == null || i17 < 0 || i18 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBackgroundAudioState", "return parameter is invalid, duration_t:%d, position:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                this.f160534y = true;
                this.f160535z = "return parameter is invalid";
                c();
                return;
            }
            double d17 = i17 / 1000.0d;
            this.f160519g = d17;
            this.f160520h = i18 / 1000.0d;
            int i19 = a17.f98872c;
            this.f160522m = d17 > 0.0d ? (a17.f98873d * d17) / 100.0d : 0.0d;
            this.f160521i = i19 == 1 ? 0 : 1;
            this.f160523n = b17.f98885n;
            this.f160524o = b17.f98881g;
            this.f160525p = b17.f98883i;
            this.f160526q = b17.f98882h;
            this.f160527r = b17.f98884m;
            this.f160528s = b17.f98887p;
            this.f160529t = b17.F;
            this.f160530u = b17.D;
            this.f160531v = b17.f98888q;
            this.f160532w = b17.K;
            this.f160533x = b17.R;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBackgroundAudioState", "currentWrapper is null");
            this.f160534y = true;
            this.f160535z = "currentWrapper is null";
        }
        c();
    }

    public C11976x8944bc6e(android.os.Parcel parcel) {
        v(parcel);
    }
}
