package v8;

/* loaded from: classes15.dex */
public final class c implements v8.i {

    /* renamed from: a, reason: collision with root package name */
    public final v8.h f515507a = new v8.h();

    /* renamed from: b, reason: collision with root package name */
    public final long f515508b;

    /* renamed from: c, reason: collision with root package name */
    public final long f515509c;

    /* renamed from: d, reason: collision with root package name */
    public final v8.n f515510d;

    /* renamed from: e, reason: collision with root package name */
    public int f515511e;

    /* renamed from: f, reason: collision with root package name */
    public long f515512f;

    /* renamed from: g, reason: collision with root package name */
    public long f515513g;

    /* renamed from: h, reason: collision with root package name */
    public long f515514h;

    /* renamed from: i, reason: collision with root package name */
    public long f515515i;

    /* renamed from: j, reason: collision with root package name */
    public long f515516j;

    /* renamed from: k, reason: collision with root package name */
    public long f515517k;

    /* renamed from: l, reason: collision with root package name */
    public long f515518l;

    public c(long j17, long j18, v8.n nVar, int i17, long j19) {
        t9.a.a(j17 >= 0 && j18 > j17);
        this.f515510d = nVar;
        this.f515508b = j17;
        this.f515509c = j18;
        if (i17 != j18 - j17) {
            this.f515511e = 0;
        } else {
            this.f515512f = j19;
            this.f515511e = 3;
        }
    }

    @Override // v8.i
    public q8.m a() {
        if (this.f515512f != 0) {
            return new v8.b(this, null);
        }
        return null;
    }

    @Override // v8.i
    public long b(long j17) {
        int i17 = this.f515511e;
        t9.a.a(i17 == 3 || i17 == 2);
        long j18 = j17 == 0 ? 0L : (this.f515510d.f515555i * j17) / 1000000;
        this.f515514h = j18;
        this.f515511e = 2;
        this.f515515i = this.f515508b;
        this.f515516j = this.f515509c;
        this.f515517k = 0L;
        this.f515518l = this.f515512f;
        return j18;
    }

    public boolean c(q8.f fVar, long j17) {
        q8.b bVar;
        int i17;
        long min = java.lang.Math.min(j17 + 3, this.f515509c);
        int i18 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i19 = 0;
            if (((q8.b) fVar).f442151c + i18 > min && (i18 = (int) (min - ((q8.b) fVar).f442151c)) < 4) {
                return false;
            }
            bVar = (q8.b) fVar;
            bVar.b(bArr, 0, i18, false);
            while (true) {
                i17 = i18 - 3;
                if (i19 < i17) {
                    if (bArr[i19] == 79 && bArr[i19 + 1] == 103 && bArr[i19 + 2] == 103 && bArr[i19 + 3] == 83) {
                        bVar.f(i19);
                        return true;
                    }
                    i19++;
                }
            }
            bVar.f(i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    @Override // v8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long e(q8.f r20) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.c.e(q8.f):long");
    }
}
