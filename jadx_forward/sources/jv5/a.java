package jv5;

/* loaded from: classes16.dex */
public final class a {
    public static final byte[] A = {68, 88, 68, 73, 70, 70};

    /* renamed from: a, reason: collision with root package name */
    public final bv5.b f383798a;

    /* renamed from: b, reason: collision with root package name */
    public short f383799b;

    /* renamed from: c, reason: collision with root package name */
    public int f383800c;

    /* renamed from: d, reason: collision with root package name */
    public int f383801d;

    /* renamed from: e, reason: collision with root package name */
    public int f383802e;

    /* renamed from: f, reason: collision with root package name */
    public int f383803f;

    /* renamed from: g, reason: collision with root package name */
    public int f383804g;

    /* renamed from: h, reason: collision with root package name */
    public int f383805h;

    /* renamed from: i, reason: collision with root package name */
    public int f383806i;

    /* renamed from: j, reason: collision with root package name */
    public int f383807j;

    /* renamed from: k, reason: collision with root package name */
    public int f383808k;

    /* renamed from: l, reason: collision with root package name */
    public int f383809l;

    /* renamed from: m, reason: collision with root package name */
    public int f383810m;

    /* renamed from: n, reason: collision with root package name */
    public int f383811n;

    /* renamed from: o, reason: collision with root package name */
    public int f383812o;

    /* renamed from: p, reason: collision with root package name */
    public int f383813p;

    /* renamed from: q, reason: collision with root package name */
    public int f383814q;

    /* renamed from: r, reason: collision with root package name */
    public int f383815r;

    /* renamed from: s, reason: collision with root package name */
    public int f383816s;

    /* renamed from: t, reason: collision with root package name */
    public int f383817t;

    /* renamed from: u, reason: collision with root package name */
    public int f383818u;

    /* renamed from: v, reason: collision with root package name */
    public int f383819v;

    /* renamed from: w, reason: collision with root package name */
    public int f383820w;

    /* renamed from: x, reason: collision with root package name */
    public int f383821x;

    /* renamed from: y, reason: collision with root package name */
    public int f383822y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f383823z;

    public a(java.io.InputStream inputStream) {
        bv5.b bVar = new bv5.b(java.nio.ByteBuffer.wrap(cv5.d.a(inputStream, 32768)));
        this.f383798a = bVar;
        byte[] bArr = new byte[6];
        bVar.f106295a.get(bArr);
        if (cv5.c.d(bArr, A) != 0) {
            throw new java.lang.IllegalStateException("bad dex patch file magic: " + java.util.Arrays.toString(bArr));
        }
        short s17 = bVar.f106295a.getShort();
        this.f383799b = s17;
        if (s17 != 2 && s17 != 3) {
            throw new java.lang.IllegalStateException("bad dex patch file version: " + ((int) this.f383799b));
        }
        if (s17 > 2) {
            this.f383800c = bVar.m();
            this.f383801d = bVar.m();
        }
        this.f383802e = bVar.m();
        this.f383803f = bVar.m();
        this.f383804g = bVar.m();
        this.f383805h = bVar.m();
        this.f383806i = bVar.m();
        this.f383807j = bVar.m();
        this.f383808k = bVar.m();
        if (this.f383799b > 2) {
            this.f383809l = bVar.m();
            this.f383810m = bVar.m();
        }
        this.f383811n = bVar.m();
        this.f383812o = bVar.m();
        this.f383813p = bVar.m();
        this.f383814q = bVar.m();
        this.f383815r = bVar.m();
        this.f383816s = bVar.m();
        this.f383817t = bVar.m();
        this.f383818u = bVar.m();
        this.f383819v = bVar.m();
        this.f383820w = bVar.m();
        this.f383821x = bVar.m();
        this.f383822y = bVar.m();
        byte[] bArr2 = new byte[20];
        bVar.f106295a.get(bArr2);
        this.f383823z = bArr2;
        bVar.f106295a.position(this.f383803f);
    }
}
