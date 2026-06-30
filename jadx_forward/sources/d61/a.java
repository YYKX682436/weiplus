package d61;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f308222e = d61.c.d("ftyp");

    /* renamed from: f, reason: collision with root package name */
    public static final int f308223f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f308224g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f308225h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f308226i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f308227j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f308228k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f308229l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f308230m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f308231n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f308232o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f308233p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f308234q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f308235r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f308236s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f308237t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f308238u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f308239v;

    /* renamed from: a, reason: collision with root package name */
    public final int f308240a;

    /* renamed from: b, reason: collision with root package name */
    public final long f308241b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308242c;

    /* renamed from: d, reason: collision with root package name */
    public final long f308243d;

    static {
        d61.c.d("avc1");
        d61.c.d("avc3");
        d61.c.d("hvc1");
        d61.c.d("hev1");
        d61.c.d("s263");
        d61.c.d("d263");
        d61.c.d("mdat");
        d61.c.d("mp4a");
        d61.c.d("wave");
        d61.c.d("ac-3");
        d61.c.d("dac3");
        d61.c.d("ec-3");
        d61.c.d("dec3");
        d61.c.d("dtsc");
        d61.c.d("dtsh");
        d61.c.d("dtsl");
        d61.c.d("dtse");
        d61.c.d("ddts");
        d61.c.d("tfdt");
        d61.c.d("tfhd");
        d61.c.d("trex");
        d61.c.d("trun");
        d61.c.d("sidx");
        f308223f = d61.c.d("moov");
        f308224g = d61.c.d("mvhd");
        f308225h = d61.c.d("trak");
        f308226i = d61.c.d("mdia");
        f308227j = d61.c.d("minf");
        f308228k = d61.c.d("stbl");
        d61.c.d("avcC");
        d61.c.d("hvcC");
        d61.c.d("esds");
        d61.c.d("moof");
        d61.c.d("traf");
        d61.c.d("mvex");
        d61.c.d("tkhd");
        f308229l = d61.c.d("edts");
        f308230m = d61.c.d("elst");
        f308231n = d61.c.d("mdhd");
        f308232o = d61.c.d("hdlr");
        d61.c.d("stsd");
        d61.c.d("pssh");
        d61.c.d("sinf");
        d61.c.d("schm");
        d61.c.d("schi");
        d61.c.d("tenc");
        d61.c.d("encv");
        d61.c.d("enca");
        d61.c.d("frma");
        d61.c.d("saiz");
        d61.c.d("saio");
        d61.c.d("uuid");
        d61.c.d("senc");
        d61.c.d("pasp");
        d61.c.d("TTML");
        d61.c.d("vmhd");
        d61.c.d("mp4v");
        f308233p = d61.c.d("stts");
        f308234q = d61.c.d("stss");
        d61.c.d("ctts");
        f308235r = d61.c.d("stsc");
        f308236s = d61.c.d("stsz");
        f308237t = d61.c.d("stco");
        f308238u = d61.c.d("co64");
        d61.c.d("tx3g");
        d61.c.d("wvtt");
        d61.c.d("stpp");
        d61.c.d("samr");
        d61.c.d("sawb");
        f308239v = d61.c.d("udta");
        d61.c.d("meta");
        d61.c.d("ilst");
        d61.c.d("mean");
        d61.c.d(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        d61.c.d(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        d61.c.d("----");
    }

    public a(int i17, long j17, int i18, long j18) {
        this.f308240a = i17;
        this.f308243d = j17;
        this.f308242c = i18;
        this.f308241b = j18;
    }

    public long a() {
        long j17 = this.f308241b;
        return j17 > 0 ? j17 : this.f308240a;
    }

    /* renamed from: toString */
    public java.lang.String m123588x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Atom{atomSize=");
        sb6.append(this.f308240a);
        sb6.append(", atomLargeSize=");
        sb6.append(this.f308241b);
        sb6.append(", type=");
        int i17 = this.f308242c;
        sb6.append(new java.lang.String(new byte[]{(byte) ((i17 >> 24) & 255), (byte) ((i17 >> 16) & 255), (byte) ((i17 >> 8) & 255), (byte) (i17 & 255)}));
        sb6.append(", beginPos=");
        sb6.append(this.f308243d);
        sb6.append('}');
        return sb6.toString();
    }
}
