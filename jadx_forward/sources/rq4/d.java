package rq4;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f480486c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f480487d;

    /* renamed from: e, reason: collision with root package name */
    public int f480488e;

    /* renamed from: f, reason: collision with root package name */
    public int f480489f;

    /* renamed from: i, reason: collision with root package name */
    public long f480492i;

    /* renamed from: j, reason: collision with root package name */
    public long f480493j;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f480484a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f480485b = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f480490g = new int[2];

    /* renamed from: h, reason: collision with root package name */
    public final long[] f480491h = new long[2];

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPEncoderReport", "timeoutEncodeNoFrame happened");
        long j17 = gq4.v.wi().f447516q;
        java.util.HashMap hashMap = this.f480485b;
        sq4.b bVar = (sq4.b) hashMap.get("EncoderSourceTimeoutNotFrame");
        if (bVar == null) {
            bVar = new sq4.b();
        }
        bVar.f492906a = "EncoderSourceTimeoutNotFrame";
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bVar.d(java.lang.System.currentTimeMillis() - j17);
        hashMap.put("EncoderSourceTimeoutNotFrame", bVar);
    }

    public final void b(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPEncoderReport", "timeoutEncodeNoFrame resume cost " + j17);
        sq4.b bVar = (sq4.b) this.f480485b.get("EncoderSourceTimeoutNotFrame");
        if (bVar == null) {
            return;
        }
        bVar.e(j17);
        bVar.f492909d = j17;
        bVar.f492907b++;
    }

    public final java.lang.String c() {
        cl0.g gVar = new cl0.g();
        int[] iArr = this.f480490g;
        if (iArr != null) {
            gVar.o("max", kz5.z.K(iArr));
            gVar.o("min", kz5.z.e0(iArr));
            gVar.o("avg", this.f480488e);
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    public final java.lang.String d() {
        cl0.g gVar = new cl0.g();
        long[] jArr = this.f480491h;
        if (jArr != null) {
            if (jArr.length == 0) {
                throw new java.util.NoSuchElementException("Array is empty.");
            }
            gVar.p("max", jArr[0]);
            if (jArr.length == 0) {
                throw new java.util.NoSuchElementException("Array is empty.");
            }
            gVar.p("min", jArr[jArr.length - 1]);
            gVar.p("avg", this.f480493j);
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return gVar2;
    }
}
