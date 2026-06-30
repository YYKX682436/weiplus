package w8;

/* loaded from: classes15.dex */
public final class v implements q8.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f525318d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f525319e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f525320f;

    /* renamed from: g, reason: collision with root package name */
    public q8.g f525321g;

    /* renamed from: a, reason: collision with root package name */
    public final t9.a0 f525315a = new t9.a0(0);

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f525317c = new t9.p(4096);

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f525316b = new android.util.SparseArray();

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    @Override // q8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(q8.f r17, q8.k r18) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.v.a(q8.f, q8.k):int");
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f525321g = gVar;
        gVar.b(new q8.l(-9223372036854775807L));
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        byte[] bArr = new byte[14];
        ((q8.b) fVar).b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        q8.b bVar = (q8.b) fVar;
        bVar.a(bArr[13] & 7, false);
        bVar.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // q8.e
    /* renamed from: release */
    public void mo131096x41012807() {
    }

    @Override // q8.e
    /* renamed from: seek */
    public void mo131097x35ce78(long j17, long j18) {
        this.f525315a.f498024c = -9223372036854775807L;
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f525316b;
            if (i17 >= sparseArray.size()) {
                return;
            }
            w8.u uVar = (w8.u) sparseArray.valueAt(i17);
            uVar.f525313f = false;
            uVar.f525308a.b();
            i17++;
        }
    }
}
