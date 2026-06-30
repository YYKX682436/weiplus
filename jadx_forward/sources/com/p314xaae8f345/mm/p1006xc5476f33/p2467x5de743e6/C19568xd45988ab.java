package com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/xlabeffect/XEffectConfig;", "Landroid/os/Parcelable;", "xeffect-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.xlabeffect.XEffectConfig */
/* loaded from: classes5.dex */
public final class C19568xd45988ab implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab> f38801x681a0c0c = new p05.n4();
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public java.lang.String I;

    /* renamed from: d, reason: collision with root package name */
    public int f270129d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f270130e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f270131f;

    /* renamed from: g, reason: collision with root package name */
    public int f270132g;

    /* renamed from: h, reason: collision with root package name */
    public int f270133h;

    /* renamed from: i, reason: collision with root package name */
    public int f270134i;

    /* renamed from: m, reason: collision with root package name */
    public int f270135m;

    /* renamed from: n, reason: collision with root package name */
    public int f270136n;

    /* renamed from: o, reason: collision with root package name */
    public int f270137o;

    /* renamed from: p, reason: collision with root package name */
    public int f270138p;

    /* renamed from: q, reason: collision with root package name */
    public int f270139q;

    /* renamed from: r, reason: collision with root package name */
    public int f270140r;

    /* renamed from: s, reason: collision with root package name */
    public int f270141s;

    /* renamed from: t, reason: collision with root package name */
    public int f270142t;

    /* renamed from: u, reason: collision with root package name */
    public int f270143u;

    /* renamed from: v, reason: collision with root package name */
    public int f270144v;

    /* renamed from: w, reason: collision with root package name */
    public int f270145w;

    /* renamed from: x, reason: collision with root package name */
    public int f270146x;

    /* renamed from: y, reason: collision with root package name */
    public int f270147y;

    /* renamed from: z, reason: collision with root package name */
    public int f270148z;

    public C19568xd45988ab(org.json.JSONObject json) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        this.f270132g = json.optInt("skinSmooth");
        this.f270133h = json.optInt("eyeMorph");
        this.f270134i = json.optInt("faceMorph");
        this.f270135m = json.optInt("skinBright");
        this.f270136n = json.optInt("eyeBright");
        this.f270137o = json.optInt("rosy");
        this.f270138p = json.optInt("eyePouch");
        this.f270139q = json.optInt("smileFolds");
        this.f270140r = json.optInt("sharpen");
        this.f270141s = json.optInt("teethBright");
        this.f270142t = json.optInt("smallHead");
        this.f270143u = json.optInt("cheekBone");
        this.f270144v = json.optInt("lowerJawbone");
        this.f270145w = json.optInt("wingOfNose");
        this.f270146x = json.optInt("chinShort");
        this.f270147y = json.optInt("chinLong");
        this.f270148z = json.optInt("hairLineHigh");
        this.A = json.optInt("hairLineLow");
        this.B = json.optInt("bigEye");
        this.C = json.optInt("boySlim");
        this.D = json.optInt("girlSlim");
        this.E = json.optInt("mouthMorph");
        this.F = json.optInt("zhaiLian");
        this.G = json.optInt("contour");
        this.H = json.optInt("filterRate");
    }

    public final java.lang.String a() {
        return r26.b0.b("\n               enableBeautify:" + this.f270130e + "\n               enableFilter:" + this.f270131f + "\n               skinSmooth:" + this.f270132g + "\n               eyeMorph:" + this.f270133h + "\n               faceMorph:" + this.f270134i + "\n               skinBright:" + this.f270135m + "\n               eyeBright:" + this.f270136n + "\n               rosy:" + this.f270137o + "\n               eyePouch:" + this.f270138p + "\n               smileFolds:" + this.f270139q + "\n               sharpen" + this.f270140r + "\n               teethBright" + this.f270141s + "\n               smallHead:" + this.f270142t + "\n               cheekBone:" + this.f270143u + "\n               lowerJawbone:" + this.f270144v + "\n               wingOfNose:" + this.f270145w + "\n               chinShort:" + this.f270146x + "\n               hairLineHigh:" + this.f270148z + "\n               hairLineLow:" + this.A + "\n               bigEye:" + this.B + "\n               boySlim:" + this.C + "\n               girlSlim:" + this.D + "\n               mouthMorph:" + this.E + "\n               zhaiLian:" + this.F + "\n               contour:" + this.G + "\n               filterRate:" + this.H + "\n               ");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f270129d);
        dest.writeByte(this.f270130e ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f270131f ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f270132g);
        dest.writeInt(this.f270133h);
        dest.writeInt(this.f270134i);
        dest.writeInt(this.f270135m);
        dest.writeInt(this.f270136n);
        dest.writeInt(this.f270137o);
        dest.writeInt(this.f270138p);
        dest.writeInt(this.f270139q);
        dest.writeInt(this.f270140r);
        dest.writeInt(this.f270141s);
        dest.writeInt(this.f270142t);
        dest.writeInt(this.f270143u);
        dest.writeInt(this.f270144v);
        dest.writeInt(this.f270145w);
        dest.writeInt(this.f270146x);
        dest.writeInt(this.f270147y);
        dest.writeInt(this.f270148z);
        dest.writeInt(this.A);
        dest.writeInt(this.B);
        dest.writeInt(this.C);
        dest.writeInt(this.D);
        dest.writeInt(this.E);
        dest.writeInt(this.H);
        dest.writeString(this.I);
    }

    public C19568xd45988ab(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        this.f270129d = in6.readInt();
        this.f270130e = in6.readByte() != 0;
        this.f270131f = in6.readByte() != 0;
        this.f270132g = in6.readInt();
        this.f270133h = in6.readInt();
        this.f270134i = in6.readInt();
        this.f270135m = in6.readInt();
        this.f270136n = in6.readInt();
        this.f270137o = in6.readInt();
        this.f270138p = in6.readInt();
        this.f270139q = in6.readInt();
        this.f270140r = in6.readInt();
        this.f270141s = in6.readInt();
        this.f270142t = in6.readInt();
        this.f270143u = in6.readInt();
        this.f270144v = in6.readInt();
        this.f270145w = in6.readInt();
        this.f270146x = in6.readInt();
        this.f270147y = in6.readInt();
        this.f270148z = in6.readInt();
        this.A = in6.readInt();
        this.B = in6.readInt();
        this.C = in6.readInt();
        this.D = in6.readInt();
        this.E = in6.readInt();
        this.H = in6.readInt();
        this.I = in6.readString();
    }
}
