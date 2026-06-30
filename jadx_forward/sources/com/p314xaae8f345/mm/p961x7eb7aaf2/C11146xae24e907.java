package com.p314xaae8f345.mm.p961x7eb7aaf2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/modelvideo/APIVideoTransPara;", "Landroid/os/Parcelable;", "", "CREATOR", "t21/a", "video-logic-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.modelvideo.APIVideoTransPara */
/* loaded from: classes10.dex */
public final class C11146xae24e907 implements android.os.Parcelable, java.lang.Cloneable {

    /* renamed from: CREATOR */
    public static final t21.a f32574x681a0c0c = new t21.a(null);
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f153157J;
    public int K;

    /* renamed from: d, reason: collision with root package name */
    public int f153158d;

    /* renamed from: e, reason: collision with root package name */
    public int f153159e;

    /* renamed from: f, reason: collision with root package name */
    public int f153160f;

    /* renamed from: g, reason: collision with root package name */
    public int f153161g;

    /* renamed from: h, reason: collision with root package name */
    public int f153162h;

    /* renamed from: i, reason: collision with root package name */
    public int f153163i;

    /* renamed from: m, reason: collision with root package name */
    public int f153164m;

    /* renamed from: n, reason: collision with root package name */
    public int f153165n;

    /* renamed from: o, reason: collision with root package name */
    public int f153166o;

    /* renamed from: p, reason: collision with root package name */
    public int f153167p;

    /* renamed from: q, reason: collision with root package name */
    public int f153168q;

    /* renamed from: r, reason: collision with root package name */
    public int f153169r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f153170s;

    /* renamed from: t, reason: collision with root package name */
    public int f153171t;

    /* renamed from: u, reason: collision with root package name */
    public int f153172u;

    /* renamed from: v, reason: collision with root package name */
    public int f153173v;

    /* renamed from: w, reason: collision with root package name */
    public float f153174w;

    /* renamed from: x, reason: collision with root package name */
    public float f153175x;

    /* renamed from: y, reason: collision with root package name */
    public int f153176y;

    /* renamed from: z, reason: collision with root package name */
    public int f153177z;

    public C11146xae24e907() {
        this.f153167p = 1;
    }

    /* renamed from: clone */
    public java.lang.Object m48218x5a5dd5d() {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48219x9616526c() {
        return "[isDefault " + this.f153170s + " width " + this.f153158d + " height " + this.f153159e + " fps " + this.f153160f + " video bitrate " + this.f153161g + " iFrame " + this.f153164m + " audio bitrate " + this.f153165n + " audioSampleRate " + this.f153166o + "audioChannelCount " + this.f153167p + " duration " + this.f153162h + " profile index " + this.f153168q + " preset index " + this.f153169r + " thumbSize " + this.f153171t + " abaSwitch " + this.f153172u + " qpSwitch " + this.f153173v + " swHevcRatio " + this.f153174w + " hwHevcRatio " + this.f153175x + " ceilingVideoBR " + this.f153176y + " flooringVideoBR " + this.f153177z + " isEnableHEVCEncode " + this.A + " isEnable1080p " + this.B + " maxVideoSize " + this.C + " minQP " + this.D + " maxQP " + this.E + " takePhotosVideoBR " + this.F + " remuxScene " + this.G + " enableHdrTransCode " + this.H + " hdrType " + this.I + " hwEnableHevc " + this.f153157J + " swEnableHevc " + this.K + ']';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f153158d);
        dest.writeInt(this.f153159e);
        dest.writeInt(this.f153160f);
        dest.writeInt(this.f153161g);
        dest.writeInt(this.f153162h);
        dest.writeInt(this.f153164m);
        dest.writeInt(this.f153165n);
        dest.writeInt(this.f153166o);
        dest.writeInt(this.f153168q);
        dest.writeInt(this.f153169r);
        dest.writeInt(this.f153170s ? 1 : 0);
        dest.writeInt(this.f153171t);
        dest.writeInt(this.f153172u);
        dest.writeInt(this.f153173v);
        dest.writeFloat(this.f153174w);
        dest.writeFloat(this.f153175x);
        dest.writeInt(this.f153176y);
        dest.writeInt(this.f153177z);
        dest.writeInt(this.A);
        dest.writeInt(this.B);
        dest.writeInt(this.C);
        dest.writeInt(this.D);
        dest.writeInt(this.E);
        dest.writeInt(this.F);
        dest.writeInt(this.G);
        dest.writeInt(this.H ? 1 : 0);
        dest.writeInt(this.I);
        dest.writeInt(this.f153167p);
        dest.writeInt(this.f153157J);
        dest.writeInt(this.K);
        dest.writeInt(this.f153163i);
    }

    public C11146xae24e907(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        this.f153167p = 1;
        this.f153158d = in6.readInt();
        this.f153159e = in6.readInt();
        this.f153160f = in6.readInt();
        this.f153161g = in6.readInt();
        this.f153162h = in6.readInt();
        this.f153164m = in6.readInt();
        this.f153165n = in6.readInt();
        this.f153166o = in6.readInt();
        this.f153168q = in6.readInt();
        this.f153169r = in6.readInt();
        this.f153170s = in6.readInt() > 0;
        this.f153171t = in6.readInt();
        this.f153172u = in6.readInt();
        this.f153173v = in6.readInt();
        this.f153174w = in6.readFloat();
        this.f153175x = in6.readFloat();
        this.f153176y = in6.readInt();
        this.f153177z = in6.readInt();
        this.A = in6.readInt();
        this.B = in6.readInt();
        this.C = in6.readInt();
        this.D = in6.readInt();
        this.E = in6.readInt();
        this.F = in6.readInt();
        this.G = in6.readInt();
        this.H = in6.readInt() > 0;
        this.I = in6.readInt();
        this.f153167p = in6.readInt();
        this.f153157J = in6.readInt();
        this.K = in6.readInt();
        this.f153163i = in6.readInt();
    }
}
