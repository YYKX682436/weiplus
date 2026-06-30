package com.tencent.mm.modelcontrol;

/* loaded from: classes10.dex */
public class VideoTransPara implements android.os.Parcelable, java.lang.Cloneable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.modelcontrol.VideoTransPara> CREATOR = new d11.x();
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
    public int f71190J;
    public int K;
    public boolean L;
    public float M;
    public int N;
    public int P;
    public int Q;

    /* renamed from: d, reason: collision with root package name */
    public int f71191d;

    /* renamed from: e, reason: collision with root package name */
    public int f71192e;

    /* renamed from: f, reason: collision with root package name */
    public int f71193f;

    /* renamed from: g, reason: collision with root package name */
    public int f71194g;

    /* renamed from: h, reason: collision with root package name */
    public int f71195h;

    /* renamed from: i, reason: collision with root package name */
    public int f71196i;

    /* renamed from: m, reason: collision with root package name */
    public int f71197m;

    /* renamed from: n, reason: collision with root package name */
    public int f71198n;

    /* renamed from: o, reason: collision with root package name */
    public int f71199o;

    /* renamed from: p, reason: collision with root package name */
    public int f71200p;

    /* renamed from: q, reason: collision with root package name */
    public int f71201q;

    /* renamed from: r, reason: collision with root package name */
    public int f71202r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f71203s;

    /* renamed from: t, reason: collision with root package name */
    public int f71204t;

    /* renamed from: u, reason: collision with root package name */
    public int f71205u;

    /* renamed from: v, reason: collision with root package name */
    public int f71206v;

    /* renamed from: w, reason: collision with root package name */
    public float f71207w;

    /* renamed from: x, reason: collision with root package name */
    public float f71208x;

    /* renamed from: y, reason: collision with root package name */
    public int f71209y;

    /* renamed from: z, reason: collision with root package name */
    public int f71210z;

    public VideoTransPara() {
        this.f71200p = 1;
        this.f71204t = 0;
        this.H = false;
        this.f71190J = 0;
        this.K = 0;
        this.L = false;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "[isDefault " + this.f71203s + " width " + this.f71191d + " height " + this.f71192e + " fps " + this.f71193f + " video bitrate " + this.f71194g + " iFrame " + this.f71197m + " audio bitrate " + this.f71198n + " audioSampleRate " + this.f71199o + "audioChannelCount " + this.f71200p + " duration " + this.f71195h + " profile index " + this.f71201q + " preset index " + this.f71202r + " thumbSize " + this.f71204t + " abaSwitch " + this.f71205u + " qpSwitch " + this.f71206v + " swHevcRatio " + this.f71207w + " hwHevcRatio " + this.f71208x + " ceilingVideoBR " + this.f71209y + " flooringVideoBR " + this.f71210z + " isEnableHEVCEncode " + this.A + " isEnable1080p " + this.B + " maxVideoSize " + this.C + " minQP " + this.D + " maxQP " + this.E + " takePhotosVideoBR " + this.F + " remuxScene " + this.G + " enableHdrTransCode " + this.H + " hdrType " + this.I + " hwEnableHevc " + this.f71190J + " swEnableHevc " + this.K + " crf " + this.M + " vbvBufferSize " + this.N + " vcodec2Preset " + this.P + " roiSwitch " + this.Q + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f71191d);
        parcel.writeInt(this.f71192e);
        parcel.writeInt(this.f71193f);
        parcel.writeInt(this.f71194g);
        parcel.writeInt(this.f71195h);
        parcel.writeInt(this.f71197m);
        parcel.writeInt(this.f71198n);
        parcel.writeInt(this.f71199o);
        parcel.writeInt(this.f71201q);
        parcel.writeInt(this.f71202r);
        parcel.writeInt(this.f71203s ? 1 : 0);
        parcel.writeInt(this.f71204t);
        parcel.writeInt(this.f71205u);
        parcel.writeInt(this.f71206v);
        parcel.writeFloat(this.f71207w);
        parcel.writeFloat(this.f71208x);
        parcel.writeInt(this.f71209y);
        parcel.writeInt(this.f71210z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I);
        parcel.writeInt(this.f71200p);
        parcel.writeInt(this.f71190J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.f71196i);
        parcel.writeFloat(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
    }

    public VideoTransPara(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        this.f71200p = 1;
        this.f71204t = 0;
        this.H = false;
        this.f71190J = 0;
        this.K = 0;
        this.L = false;
        this.f71191d = videoTransPara.f71191d;
        this.f71192e = videoTransPara.f71192e;
        this.f71193f = videoTransPara.f71193f;
        this.f71194g = videoTransPara.f71194g;
        this.f71195h = videoTransPara.f71195h;
        this.f71197m = videoTransPara.f71197m;
        this.f71198n = videoTransPara.f71198n;
        this.f71199o = videoTransPara.f71199o;
        this.f71201q = videoTransPara.f71201q;
        this.f71202r = videoTransPara.f71202r;
        this.f71203s = videoTransPara.f71203s;
        this.f71204t = videoTransPara.f71204t;
        this.f71205u = videoTransPara.f71205u;
        this.f71206v = videoTransPara.f71206v;
        this.f71207w = videoTransPara.f71207w;
        this.f71208x = videoTransPara.f71208x;
        this.f71209y = videoTransPara.f71209y;
        this.f71210z = videoTransPara.f71210z;
        this.A = videoTransPara.A;
        this.B = videoTransPara.B;
        this.C = videoTransPara.C;
        this.D = videoTransPara.D;
        this.E = videoTransPara.E;
        this.F = videoTransPara.F;
        this.G = videoTransPara.G;
        this.H = videoTransPara.H;
        this.I = videoTransPara.I;
        this.f71200p = videoTransPara.f71200p;
        this.f71190J = videoTransPara.f71190J;
        this.K = videoTransPara.K;
        this.f71196i = videoTransPara.f71196i;
        this.M = videoTransPara.M;
        this.N = videoTransPara.N;
        this.P = videoTransPara.P;
        this.Q = videoTransPara.Q;
    }

    public VideoTransPara(android.os.Parcel parcel) {
        this.f71200p = 1;
        this.f71204t = 0;
        this.H = false;
        this.f71190J = 0;
        this.K = 0;
        this.L = false;
        this.f71191d = parcel.readInt();
        this.f71192e = parcel.readInt();
        this.f71193f = parcel.readInt();
        this.f71194g = parcel.readInt();
        this.f71195h = parcel.readInt();
        this.f71197m = parcel.readInt();
        this.f71198n = parcel.readInt();
        this.f71199o = parcel.readInt();
        this.f71201q = parcel.readInt();
        this.f71202r = parcel.readInt();
        this.f71203s = parcel.readInt() > 0;
        this.f71204t = parcel.readInt();
        this.f71205u = parcel.readInt();
        this.f71206v = parcel.readInt();
        this.f71207w = parcel.readFloat();
        this.f71208x = parcel.readFloat();
        this.f71209y = parcel.readInt();
        this.f71210z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt() > 0;
        this.I = parcel.readInt();
        this.f71200p = parcel.readInt();
        this.f71190J = parcel.readInt();
        this.K = parcel.readInt();
        this.f71196i = parcel.readInt();
        this.M = parcel.readFloat();
        this.N = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
    }
}
