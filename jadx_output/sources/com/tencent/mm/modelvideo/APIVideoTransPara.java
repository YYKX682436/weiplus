package com.tencent.mm.modelvideo;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/modelvideo/APIVideoTransPara;", "Landroid/os/Parcelable;", "", "CREATOR", "t21/a", "video-logic-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class APIVideoTransPara implements android.os.Parcelable, java.lang.Cloneable {
    public static final t21.a CREATOR = new t21.a(null);
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
    public int f71624J;
    public int K;

    /* renamed from: d, reason: collision with root package name */
    public int f71625d;

    /* renamed from: e, reason: collision with root package name */
    public int f71626e;

    /* renamed from: f, reason: collision with root package name */
    public int f71627f;

    /* renamed from: g, reason: collision with root package name */
    public int f71628g;

    /* renamed from: h, reason: collision with root package name */
    public int f71629h;

    /* renamed from: i, reason: collision with root package name */
    public int f71630i;

    /* renamed from: m, reason: collision with root package name */
    public int f71631m;

    /* renamed from: n, reason: collision with root package name */
    public int f71632n;

    /* renamed from: o, reason: collision with root package name */
    public int f71633o;

    /* renamed from: p, reason: collision with root package name */
    public int f71634p;

    /* renamed from: q, reason: collision with root package name */
    public int f71635q;

    /* renamed from: r, reason: collision with root package name */
    public int f71636r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f71637s;

    /* renamed from: t, reason: collision with root package name */
    public int f71638t;

    /* renamed from: u, reason: collision with root package name */
    public int f71639u;

    /* renamed from: v, reason: collision with root package name */
    public int f71640v;

    /* renamed from: w, reason: collision with root package name */
    public float f71641w;

    /* renamed from: x, reason: collision with root package name */
    public float f71642x;

    /* renamed from: y, reason: collision with root package name */
    public int f71643y;

    /* renamed from: z, reason: collision with root package name */
    public int f71644z;

    public APIVideoTransPara() {
        this.f71634p = 1;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "[isDefault " + this.f71637s + " width " + this.f71625d + " height " + this.f71626e + " fps " + this.f71627f + " video bitrate " + this.f71628g + " iFrame " + this.f71631m + " audio bitrate " + this.f71632n + " audioSampleRate " + this.f71633o + "audioChannelCount " + this.f71634p + " duration " + this.f71629h + " profile index " + this.f71635q + " preset index " + this.f71636r + " thumbSize " + this.f71638t + " abaSwitch " + this.f71639u + " qpSwitch " + this.f71640v + " swHevcRatio " + this.f71641w + " hwHevcRatio " + this.f71642x + " ceilingVideoBR " + this.f71643y + " flooringVideoBR " + this.f71644z + " isEnableHEVCEncode " + this.A + " isEnable1080p " + this.B + " maxVideoSize " + this.C + " minQP " + this.D + " maxQP " + this.E + " takePhotosVideoBR " + this.F + " remuxScene " + this.G + " enableHdrTransCode " + this.H + " hdrType " + this.I + " hwEnableHevc " + this.f71624J + " swEnableHevc " + this.K + ']';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f71625d);
        dest.writeInt(this.f71626e);
        dest.writeInt(this.f71627f);
        dest.writeInt(this.f71628g);
        dest.writeInt(this.f71629h);
        dest.writeInt(this.f71631m);
        dest.writeInt(this.f71632n);
        dest.writeInt(this.f71633o);
        dest.writeInt(this.f71635q);
        dest.writeInt(this.f71636r);
        dest.writeInt(this.f71637s ? 1 : 0);
        dest.writeInt(this.f71638t);
        dest.writeInt(this.f71639u);
        dest.writeInt(this.f71640v);
        dest.writeFloat(this.f71641w);
        dest.writeFloat(this.f71642x);
        dest.writeInt(this.f71643y);
        dest.writeInt(this.f71644z);
        dest.writeInt(this.A);
        dest.writeInt(this.B);
        dest.writeInt(this.C);
        dest.writeInt(this.D);
        dest.writeInt(this.E);
        dest.writeInt(this.F);
        dest.writeInt(this.G);
        dest.writeInt(this.H ? 1 : 0);
        dest.writeInt(this.I);
        dest.writeInt(this.f71634p);
        dest.writeInt(this.f71624J);
        dest.writeInt(this.K);
        dest.writeInt(this.f71630i);
    }

    public APIVideoTransPara(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        this.f71634p = 1;
        this.f71625d = in6.readInt();
        this.f71626e = in6.readInt();
        this.f71627f = in6.readInt();
        this.f71628g = in6.readInt();
        this.f71629h = in6.readInt();
        this.f71631m = in6.readInt();
        this.f71632n = in6.readInt();
        this.f71633o = in6.readInt();
        this.f71635q = in6.readInt();
        this.f71636r = in6.readInt();
        this.f71637s = in6.readInt() > 0;
        this.f71638t = in6.readInt();
        this.f71639u = in6.readInt();
        this.f71640v = in6.readInt();
        this.f71641w = in6.readFloat();
        this.f71642x = in6.readFloat();
        this.f71643y = in6.readInt();
        this.f71644z = in6.readInt();
        this.A = in6.readInt();
        this.B = in6.readInt();
        this.C = in6.readInt();
        this.D = in6.readInt();
        this.E = in6.readInt();
        this.F = in6.readInt();
        this.G = in6.readInt();
        this.H = in6.readInt() > 0;
        this.I = in6.readInt();
        this.f71634p = in6.readInt();
        this.f71624J = in6.readInt();
        this.K = in6.readInt();
        this.f71630i = in6.readInt();
    }
}
