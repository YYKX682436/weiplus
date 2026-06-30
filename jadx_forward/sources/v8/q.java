package v8;

/* loaded from: classes15.dex */
public final class q extends v8.n {

    /* renamed from: n, reason: collision with root package name */
    public v8.p f515568n;

    /* renamed from: o, reason: collision with root package name */
    public int f515569o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f515570p;

    /* renamed from: q, reason: collision with root package name */
    public v8.t f515571q;

    /* renamed from: r, reason: collision with root package name */
    public v8.r f515572r;

    @Override // v8.n
    public void a(long j17) {
        this.f515553g = j17;
        this.f515570p = j17 != 0;
        v8.t tVar = this.f515571q;
        this.f515569o = tVar != null ? tVar.f515577d : 0;
    }

    @Override // v8.n
    public long b(t9.p pVar) {
        byte b17 = pVar.f498073a[0];
        if ((b17 & 1) == 1) {
            return -1L;
        }
        v8.p pVar2 = this.f515568n;
        boolean z17 = pVar2.f515566c[(b17 >> 1) & (255 >>> (8 - pVar2.f515567d))].f515573a;
        v8.t tVar = pVar2.f515564a;
        int i17 = !z17 ? tVar.f515577d : tVar.f515578e;
        long j17 = this.f515570p ? (this.f515569o + i17) / 4 : 0;
        pVar.v(pVar.f498075c + 4);
        byte[] bArr = pVar.f498073a;
        int i18 = pVar.f498075c;
        bArr[i18 - 4] = (byte) (j17 & 255);
        bArr[i18 - 3] = (byte) ((j17 >>> 8) & 255);
        bArr[i18 - 2] = (byte) ((j17 >>> 16) & 255);
        bArr[i18 - 1] = (byte) ((j17 >>> 24) & 255);
        this.f515570p = true;
        this.f515569o = i17;
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x03e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03e3  */
    @Override // v8.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(t9.p r21, long r22, v8.l r24) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.q.c(t9.p, long, v8.l):boolean");
    }

    @Override // v8.n
    public void d(boolean z17) {
        super.d(z17);
        if (z17) {
            this.f515568n = null;
            this.f515571q = null;
            this.f515572r = null;
        }
        this.f515569o = 0;
        this.f515570p = false;
    }
}
