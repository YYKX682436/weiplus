package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes11.dex */
class JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.d0();

    /* renamed from: h, reason: collision with root package name */
    public double f78987h;

    /* renamed from: i, reason: collision with root package name */
    public int f78988i;

    /* renamed from: m, reason: collision with root package name */
    public double f78989m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78990n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78991o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f78992p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f78993q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78994r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f78995s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f78996t;

    /* renamed from: u, reason: collision with root package name */
    public int f78997u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f78998v;

    /* renamed from: w, reason: collision with root package name */
    public double f78999w;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f79002z;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f78985f = "";

    /* renamed from: g, reason: collision with root package name */
    public double f78986g = 0.0d;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f79000x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f79001y = false;

    public JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78985f = parcel.readString();
        this.f78986g = parcel.readDouble();
        this.f78987h = parcel.readDouble();
        this.f78988i = parcel.readInt();
        this.f78989m = parcel.readDouble();
        this.f78990n = parcel.readString();
        this.f78991o = parcel.readString();
        this.f78992p = parcel.readString();
        this.f78993q = parcel.readString();
        this.f78994r = parcel.readString();
        this.f78995s = parcel.readString();
        this.f78996t = parcel.readString();
        this.f78998v = parcel.readString();
        this.f78997u = parcel.readInt();
        this.f78999w = parcel.readDouble();
        this.f79000x = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78985f);
        parcel.writeDouble(this.f78986g);
        parcel.writeDouble(this.f78987h);
        parcel.writeInt(this.f78988i);
        parcel.writeDouble(this.f78989m);
        parcel.writeString(this.f78990n);
        parcel.writeString(this.f78991o);
        parcel.writeString(this.f78992p);
        parcel.writeString(this.f78993q);
        parcel.writeString(this.f78994r);
        parcel.writeString(this.f78995s);
        parcel.writeString(this.f78996t);
        parcel.writeString(this.f78998v);
        parcel.writeInt(this.f78997u);
        parcel.writeDouble(this.f78999w);
        parcel.writeString(this.f79000x);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        int i17;
        int i18;
        java.lang.String str = com.tencent.mm.plugin.appbrand.media.music.f.f85760a.f85761a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.equals(this.f78985f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBackgroundAudioState", "appid not match cannot get background audio state, preAppId:%s, appId:%s", str, this.f78985f);
            this.f79001y = true;
            this.f79002z = "appid not match cannot get background audio state";
            c();
            return;
        }
        b21.r b17 = b21.m.b();
        if (b17 != null) {
            b21.o a17 = b21.m.a();
            if (a17 != null) {
                i17 = a17.f17337a;
                i18 = a17.f17338b;
            } else {
                i17 = -1;
                i18 = -1;
            }
            if (a17 == null || i17 < 0 || i18 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBackgroundAudioState", "return parameter is invalid, duration_t:%d, position:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                this.f79001y = true;
                this.f79002z = "return parameter is invalid";
                c();
                return;
            }
            double d17 = i17 / 1000.0d;
            this.f78986g = d17;
            this.f78987h = i18 / 1000.0d;
            int i19 = a17.f17339c;
            this.f78989m = d17 > 0.0d ? (a17.f17340d * d17) / 100.0d : 0.0d;
            this.f78988i = i19 == 1 ? 0 : 1;
            this.f78990n = b17.f17352n;
            this.f78991o = b17.f17348g;
            this.f78992p = b17.f17350i;
            this.f78993q = b17.f17349h;
            this.f78994r = b17.f17351m;
            this.f78995s = b17.f17354p;
            this.f78996t = b17.F;
            this.f78997u = b17.D;
            this.f78998v = b17.f17355q;
            this.f78999w = b17.K;
            this.f79000x = b17.R;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBackgroundAudioState", "currentWrapper is null");
            this.f79001y = true;
            this.f79002z = "currentWrapper is null";
        }
        c();
    }

    public JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
