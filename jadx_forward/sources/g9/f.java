package g9;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final r9.k f351101a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k f351102b;

    /* renamed from: c, reason: collision with root package name */
    public final g9.p f351103c;

    /* renamed from: d, reason: collision with root package name */
    public final h9.a[] f351104d;

    /* renamed from: e, reason: collision with root package name */
    public final h9.n f351105e;

    /* renamed from: f, reason: collision with root package name */
    public final d9.k0 f351106f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f351107g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f351108h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f351109i;

    /* renamed from: j, reason: collision with root package name */
    public java.io.IOException f351110j;

    /* renamed from: k, reason: collision with root package name */
    public h9.a f351111k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f351112l;

    /* renamed from: m, reason: collision with root package name */
    public android.net.Uri f351113m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f351114n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f351115o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f351116p;

    /* renamed from: q, reason: collision with root package name */
    public q9.m f351117q;

    public f(h9.n nVar, h9.a[] aVarArr, g9.g gVar, g9.p pVar, java.util.List list) {
        this.f351105e = nVar;
        this.f351104d = aVarArr;
        this.f351103c = pVar;
        this.f351107g = list;
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] c1601x7dc4e417Arr = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i17 = 0; i17 < aVarArr.length; i17++) {
            c1601x7dc4e417Arr[i17] = aVarArr[i17].f361124b;
            iArr[i17] = i17;
        }
        g9.b bVar = (g9.b) gVar;
        this.f351101a = bVar.f351094a.mo10288xb8a7ce81();
        this.f351102b = bVar.f351094a.mo10288xb8a7ce81();
        d9.k0 k0Var = new d9.k0(c1601x7dc4e417Arr);
        this.f351106f = k0Var;
        this.f351117q = new g9.e(k0Var, iArr);
    }

    public final void a(android.net.Uri uri, java.lang.String str, byte[] bArr) {
        byte[] byteArray = new java.math.BigInteger(t9.d0.j(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        java.lang.System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f351113m = uri;
        this.f351114n = bArr;
        this.f351115o = str;
        this.f351116p = bArr2;
    }
}
