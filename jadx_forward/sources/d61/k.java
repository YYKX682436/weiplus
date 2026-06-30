package d61;

/* loaded from: classes14.dex */
public class k implements d61.f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f308275a;

    /* renamed from: b, reason: collision with root package name */
    public long f308276b;

    /* renamed from: c, reason: collision with root package name */
    public long f308277c;

    /* renamed from: d, reason: collision with root package name */
    public long f308278d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f308279e;

    /* renamed from: f, reason: collision with root package name */
    public int f308280f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f308281g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f308282h;

    /* renamed from: i, reason: collision with root package name */
    public int f308283i = 0;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mp4Parser", "mdia atom parser fail.");
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x009f, Exception -> 0x00c1, TryCatch #7 {Exception -> 0x00c1, all -> 0x009f, blocks: (B:17:0x0051, B:24:0x0065, B:26:0x006f, B:28:0x0075, B:32:0x0083, B:34:0x0096, B:38:0x00a1, B:42:0x00af, B:50:0x005a), top: B:16:0x0051 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0095 -> B:20:0x00b4). Please report as a decompilation issue!!! */
    @Override // d61.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r11, long r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d61.k.a(java.lang.String, long):boolean");
    }

    @Override // d61.f
    public boolean b(int i17, int i18, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        long[] jArr = this.f308279e;
        if (jArr == null) {
            return false;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        int length = jArr.length;
        if (i17 >= length || i18 >= length) {
            i17 = length - 2;
            i18 = length - 1;
        }
        long j17 = jArr[i17];
        long j18 = jArr[i18];
        if (i17 == 0) {
            c19767x257d7f.f38864x6ac9171 = 0;
            c19767x257d7f2.f38864x6ac9171 = (int) j18;
        } else {
            int i19 = (int) j17;
            c19767x257d7f.f38864x6ac9171 = i19;
            c19767x257d7f2.f38864x6ac9171 = ((int) j18) - i19;
        }
        return true;
    }

    @Override // d61.f
    public int c() {
        return this.f308280f;
    }

    @Override // d61.f
    public int d(int i17, int i18) {
        int i19 = 0;
        if (this.f308279e == null) {
            return 0;
        }
        long j17 = i17 + i18;
        int i27 = 0;
        while (true) {
            long[] jArr = this.f308279e;
            if (i19 >= jArr.length) {
                break;
            }
            long j18 = jArr[i19];
            if (j18 == j17) {
                return i19;
            }
            if (j18 < j17) {
                i27 = i19;
            } else if (j18 > j17) {
                break;
            }
            i19++;
        }
        return i27;
    }

    @Override // d61.f
    public boolean e(int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        boolean z17;
        java.util.List list;
        boolean z18 = false;
        try {
            list = this.f308282h;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mp4Parser", e17, "seekVFrame seekTime[%d]", java.lang.Integer.valueOf(i17));
        }
        if (list == null) {
            return false;
        }
        int size = ((java.util.ArrayList) list).size();
        long j17 = i17 * 1000 * 1000;
        c19767x257d7f2.f38864x6ac9171 = 0;
        c19767x257d7f.f38864x6ac9171 = 0;
        int i18 = 0;
        while (true) {
            z17 = true;
            if (i18 >= size) {
                break;
            }
            android.util.Pair pair = (android.util.Pair) ((java.util.ArrayList) this.f308282h).get(i18);
            if (((java.lang.Long) pair.second).longValue() > j17) {
                c19767x257d7f2.f38864x6ac9171 = (int) ((((java.lang.Long) pair.second).longValue() / 1000) / 1000);
                z18 = true;
                break;
            }
            c19767x257d7f.f38864x6ac9171 = (int) ((((java.lang.Long) pair.second).longValue() / 1000) / 1000);
            i18++;
        }
        if (!z18) {
            c19767x257d7f.f38864x6ac9171 = (int) ((((java.lang.Long) ((android.util.Pair) ((java.util.ArrayList) this.f308282h).get(size - 1)).second).longValue() / 1000) / 1000);
            c19767x257d7f2.f38864x6ac9171 = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mp4Parser", "seek key Frame seekTime[%d] pre[%d] next[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171));
            return z17;
        }
        z17 = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mp4Parser", "seek key Frame seekTime[%d] pre[%d] next[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171));
        return z17;
    }

    @Override // d61.f
    public int f() {
        try {
            java.util.List list = this.f308282h;
            if (list == null) {
                return 0;
            }
            if (this.f308283i == 0) {
                this.f308283i = (int) ((((java.lang.Long) ((android.util.Pair) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).second).longValue() / 1000) / 1000);
            }
            return this.f308283i;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mp4Parser", e17, "get last key frame error.", new java.lang.Object[0]);
            return 0;
        }
    }

    public final void g(java.io.RandomAccessFile randomAccessFile, long j17, byte[] bArr) {
        randomAccessFile.seek(j17);
        d61.o oVar = (d61.o) d61.c.b(randomAccessFile, bArr, d61.a.f308228k);
        if (oVar != null) {
            oVar.f308293x = this.f308278d;
            oVar.f308292w = this.f308277c;
            oVar.m(randomAccessFile);
            this.f308279e = oVar.D;
            this.f308280f = r1.length - 2;
            this.f308281g = oVar.A;
            this.f308282h = oVar.B;
        }
    }

    public void h() {
        this.f308275a = null;
        this.f308279e = null;
        this.f308280f = 0;
        long j17 = 0;
        this.f308278d = j17;
        this.f308277c = j17;
        this.f308276b = j17;
        java.util.List list = this.f308281g;
        if (list != null) {
            ((java.util.ArrayList) list).clear();
        }
        java.util.List list2 = this.f308282h;
        if (list2 != null) {
            ((java.util.ArrayList) list2).clear();
        }
        this.f308283i = 0;
    }

    @Override // d61.f
    /* renamed from: release */
    public void mo123590x41012807() {
        h();
    }
}
