package com.p314xaae8f345.mm.p948xcd333a14;

/* renamed from: com.tencent.mm.modelcontrol.VideoTransPara */
/* loaded from: classes10.dex */
public class C11120x15dce88d implements android.os.Parcelable, java.lang.Cloneable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d> f32562x681a0c0c = new d11.x();
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
    public int f152723J;
    public int K;
    public boolean L;
    public float M;
    public int N;
    public int P;
    public int Q;

    /* renamed from: d, reason: collision with root package name */
    public int f152724d;

    /* renamed from: e, reason: collision with root package name */
    public int f152725e;

    /* renamed from: f, reason: collision with root package name */
    public int f152726f;

    /* renamed from: g, reason: collision with root package name */
    public int f152727g;

    /* renamed from: h, reason: collision with root package name */
    public int f152728h;

    /* renamed from: i, reason: collision with root package name */
    public int f152729i;

    /* renamed from: m, reason: collision with root package name */
    public int f152730m;

    /* renamed from: n, reason: collision with root package name */
    public int f152731n;

    /* renamed from: o, reason: collision with root package name */
    public int f152732o;

    /* renamed from: p, reason: collision with root package name */
    public int f152733p;

    /* renamed from: q, reason: collision with root package name */
    public int f152734q;

    /* renamed from: r, reason: collision with root package name */
    public int f152735r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f152736s;

    /* renamed from: t, reason: collision with root package name */
    public int f152737t;

    /* renamed from: u, reason: collision with root package name */
    public int f152738u;

    /* renamed from: v, reason: collision with root package name */
    public int f152739v;

    /* renamed from: w, reason: collision with root package name */
    public float f152740w;

    /* renamed from: x, reason: collision with root package name */
    public float f152741x;

    /* renamed from: y, reason: collision with root package name */
    public int f152742y;

    /* renamed from: z, reason: collision with root package name */
    public int f152743z;

    public C11120x15dce88d() {
        this.f152733p = 1;
        this.f152737t = 0;
        this.H = false;
        this.f152723J = 0;
        this.K = 0;
        this.L = false;
    }

    /* renamed from: clone */
    public java.lang.Object m48123x5a5dd5d() {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48124x9616526c() {
        return "[isDefault " + this.f152736s + " width " + this.f152724d + " height " + this.f152725e + " fps " + this.f152726f + " video bitrate " + this.f152727g + " iFrame " + this.f152730m + " audio bitrate " + this.f152731n + " audioSampleRate " + this.f152732o + "audioChannelCount " + this.f152733p + " duration " + this.f152728h + " profile index " + this.f152734q + " preset index " + this.f152735r + " thumbSize " + this.f152737t + " abaSwitch " + this.f152738u + " qpSwitch " + this.f152739v + " swHevcRatio " + this.f152740w + " hwHevcRatio " + this.f152741x + " ceilingVideoBR " + this.f152742y + " flooringVideoBR " + this.f152743z + " isEnableHEVCEncode " + this.A + " isEnable1080p " + this.B + " maxVideoSize " + this.C + " minQP " + this.D + " maxQP " + this.E + " takePhotosVideoBR " + this.F + " remuxScene " + this.G + " enableHdrTransCode " + this.H + " hdrType " + this.I + " hwEnableHevc " + this.f152723J + " swEnableHevc " + this.K + " crf " + this.M + " vbvBufferSize " + this.N + " vcodec2Preset " + this.P + " roiSwitch " + this.Q + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f152724d);
        parcel.writeInt(this.f152725e);
        parcel.writeInt(this.f152726f);
        parcel.writeInt(this.f152727g);
        parcel.writeInt(this.f152728h);
        parcel.writeInt(this.f152730m);
        parcel.writeInt(this.f152731n);
        parcel.writeInt(this.f152732o);
        parcel.writeInt(this.f152734q);
        parcel.writeInt(this.f152735r);
        parcel.writeInt(this.f152736s ? 1 : 0);
        parcel.writeInt(this.f152737t);
        parcel.writeInt(this.f152738u);
        parcel.writeInt(this.f152739v);
        parcel.writeFloat(this.f152740w);
        parcel.writeFloat(this.f152741x);
        parcel.writeInt(this.f152742y);
        parcel.writeInt(this.f152743z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I);
        parcel.writeInt(this.f152733p);
        parcel.writeInt(this.f152723J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.f152729i);
        parcel.writeFloat(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
    }

    public C11120x15dce88d(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        this.f152733p = 1;
        this.f152737t = 0;
        this.H = false;
        this.f152723J = 0;
        this.K = 0;
        this.L = false;
        this.f152724d = c11120x15dce88d.f152724d;
        this.f152725e = c11120x15dce88d.f152725e;
        this.f152726f = c11120x15dce88d.f152726f;
        this.f152727g = c11120x15dce88d.f152727g;
        this.f152728h = c11120x15dce88d.f152728h;
        this.f152730m = c11120x15dce88d.f152730m;
        this.f152731n = c11120x15dce88d.f152731n;
        this.f152732o = c11120x15dce88d.f152732o;
        this.f152734q = c11120x15dce88d.f152734q;
        this.f152735r = c11120x15dce88d.f152735r;
        this.f152736s = c11120x15dce88d.f152736s;
        this.f152737t = c11120x15dce88d.f152737t;
        this.f152738u = c11120x15dce88d.f152738u;
        this.f152739v = c11120x15dce88d.f152739v;
        this.f152740w = c11120x15dce88d.f152740w;
        this.f152741x = c11120x15dce88d.f152741x;
        this.f152742y = c11120x15dce88d.f152742y;
        this.f152743z = c11120x15dce88d.f152743z;
        this.A = c11120x15dce88d.A;
        this.B = c11120x15dce88d.B;
        this.C = c11120x15dce88d.C;
        this.D = c11120x15dce88d.D;
        this.E = c11120x15dce88d.E;
        this.F = c11120x15dce88d.F;
        this.G = c11120x15dce88d.G;
        this.H = c11120x15dce88d.H;
        this.I = c11120x15dce88d.I;
        this.f152733p = c11120x15dce88d.f152733p;
        this.f152723J = c11120x15dce88d.f152723J;
        this.K = c11120x15dce88d.K;
        this.f152729i = c11120x15dce88d.f152729i;
        this.M = c11120x15dce88d.M;
        this.N = c11120x15dce88d.N;
        this.P = c11120x15dce88d.P;
        this.Q = c11120x15dce88d.Q;
    }

    public C11120x15dce88d(android.os.Parcel parcel) {
        this.f152733p = 1;
        this.f152737t = 0;
        this.H = false;
        this.f152723J = 0;
        this.K = 0;
        this.L = false;
        this.f152724d = parcel.readInt();
        this.f152725e = parcel.readInt();
        this.f152726f = parcel.readInt();
        this.f152727g = parcel.readInt();
        this.f152728h = parcel.readInt();
        this.f152730m = parcel.readInt();
        this.f152731n = parcel.readInt();
        this.f152732o = parcel.readInt();
        this.f152734q = parcel.readInt();
        this.f152735r = parcel.readInt();
        this.f152736s = parcel.readInt() > 0;
        this.f152737t = parcel.readInt();
        this.f152738u = parcel.readInt();
        this.f152739v = parcel.readInt();
        this.f152740w = parcel.readFloat();
        this.f152741x = parcel.readFloat();
        this.f152742y = parcel.readInt();
        this.f152743z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt() > 0;
        this.I = parcel.readInt();
        this.f152733p = parcel.readInt();
        this.f152723J = parcel.readInt();
        this.K = parcel.readInt();
        this.f152729i = parcel.readInt();
        this.M = parcel.readFloat();
        this.N = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
    }
}
