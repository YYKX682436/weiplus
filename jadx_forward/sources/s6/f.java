package s6;

/* loaded from: classes13.dex */
public class f implements s6.b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f484826a;

    /* renamed from: c, reason: collision with root package name */
    public final s6.a f484828c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f484829d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f484830e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f484831f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f484832g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f484833h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f484834i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f484835j;

    /* renamed from: k, reason: collision with root package name */
    public int f484836k;

    /* renamed from: l, reason: collision with root package name */
    public s6.d f484837l;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f484838m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f484839n;

    /* renamed from: o, reason: collision with root package name */
    public int f484840o;

    /* renamed from: p, reason: collision with root package name */
    public int f484841p;

    /* renamed from: q, reason: collision with root package name */
    public int f484842q;

    /* renamed from: r, reason: collision with root package name */
    public int f484843r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Boolean f484844s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f484827b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap.Config f484845t = android.graphics.Bitmap.Config.ARGB_8888;

    public f(s6.a aVar, s6.d dVar, java.nio.ByteBuffer byteBuffer, int i17) {
        this.f484828c = aVar;
        this.f484837l = new s6.d();
        synchronized (this) {
            if (i17 <= 0) {
                throw new java.lang.IllegalArgumentException("Sample size must be >=0, not: " + i17);
            }
            int highestOneBit = java.lang.Integer.highestOneBit(i17);
            this.f484840o = 0;
            this.f484837l = dVar;
            this.f484836k = -1;
            java.nio.ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f484829d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f484829d.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.f484839n = false;
            java.util.Iterator it = ((java.util.ArrayList) dVar.f484815e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((s6.c) it.next()).f484806g == 3) {
                    this.f484839n = true;
                    break;
                }
            }
            this.f484841p = highestOneBit;
            int i18 = dVar.f484816f;
            this.f484843r = i18 / highestOneBit;
            int i19 = dVar.f484817g;
            this.f484842q = i19 / highestOneBit;
            this.f484834i = ((h7.d) this.f484828c).a(i18 * i19);
            s6.a aVar2 = this.f484828c;
            int i27 = this.f484843r * this.f484842q;
            x6.b bVar = ((h7.d) aVar2).f360864b;
            this.f484835j = bVar == null ? new int[i27] : (int[]) ((x6.l) bVar).c(i27, int[].class);
        }
    }

    public final android.graphics.Bitmap a() {
        java.lang.Boolean bool = this.f484844s;
        android.graphics.Bitmap c17 = ((h7.d) this.f484828c).f360863a.c(this.f484843r, this.f484842q, (bool == null || bool.booleanValue()) ? android.graphics.Bitmap.Config.ARGB_8888 : this.f484845t);
        c17.setHasAlpha(true);
        return c17;
    }

    public synchronized android.graphics.Bitmap b() {
        if (this.f484837l.f484813c <= 0 || this.f484836k < 0) {
            if (android.util.Log.isLoggable("f", 3)) {
                int i17 = this.f484837l.f484813c;
            }
            this.f484840o = 1;
        }
        int i18 = this.f484840o;
        if (i18 != 1 && i18 != 2) {
            this.f484840o = 0;
            if (this.f484830e == null) {
                this.f484830e = ((h7.d) this.f484828c).a(255);
            }
            s6.c cVar = (s6.c) ((java.util.ArrayList) this.f484837l.f484815e).get(this.f484836k);
            int i19 = this.f484836k - 1;
            s6.c cVar2 = i19 >= 0 ? (s6.c) ((java.util.ArrayList) this.f484837l.f484815e).get(i19) : null;
            int[] iArr = cVar.f484810k;
            if (iArr == null) {
                iArr = this.f484837l.f484811a;
            }
            this.f484826a = iArr;
            if (iArr == null) {
                android.util.Log.isLoggable("f", 3);
                this.f484840o = 1;
                return null;
            }
            if (cVar.f484805f) {
                java.lang.System.arraycopy(iArr, 0, this.f484827b, 0, iArr.length);
                int[] iArr2 = this.f484827b;
                this.f484826a = iArr2;
                iArr2[cVar.f484807h] = 0;
                if (cVar.f484806g == 2 && this.f484836k == 0) {
                    this.f484844s = java.lang.Boolean.TRUE;
                }
            }
            return d(cVar, cVar2);
        }
        android.util.Log.isLoggable("f", 3);
        return null;
    }

    public void c(android.graphics.Bitmap.Config config) {
        if (config == android.graphics.Bitmap.Config.ARGB_8888 || config == android.graphics.Bitmap.Config.RGB_565) {
            this.f484845t = config;
            return;
        }
        throw new java.lang.IllegalArgumentException("Unsupported format: " + config + ", must be one of " + android.graphics.Bitmap.Config.ARGB_8888 + " or " + android.graphics.Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r3.f484820j == r36.f484807h) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap d(s6.c r36, s6.c r37) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.f.d(s6.c, s6.c):android.graphics.Bitmap");
    }
}
