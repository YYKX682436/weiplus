package l4;

/* loaded from: classes13.dex */
public class u implements p4.h, p4.g {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.TreeMap f397293o = new java.util.TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f397294d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f397295e;

    /* renamed from: f, reason: collision with root package name */
    public final double[] f397296f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f397297g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[][] f397298h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f397299i;

    /* renamed from: m, reason: collision with root package name */
    public final int f397300m;

    /* renamed from: n, reason: collision with root package name */
    public int f397301n;

    public u(int i17) {
        this.f397300m = i17;
        int i18 = i17 + 1;
        this.f397299i = new int[i18];
        this.f397295e = new long[i18];
        this.f397296f = new double[i18];
        this.f397297g = new java.lang.String[i18];
        this.f397298h = new byte[i18];
    }

    public static l4.u c(java.lang.String str, int i17) {
        java.util.TreeMap treeMap = f397293o;
        synchronized (treeMap) {
            java.util.Map.Entry ceilingEntry = treeMap.ceilingEntry(java.lang.Integer.valueOf(i17));
            if (ceilingEntry == null) {
                l4.u uVar = new l4.u(i17);
                uVar.f397294d = str;
                uVar.f397301n = i17;
                return uVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            l4.u uVar2 = (l4.u) ceilingEntry.getValue();
            uVar2.f397294d = str;
            uVar2.f397301n = i17;
            return uVar2;
        }
    }

    @Override // p4.h
    public java.lang.String a() {
        return this.f397294d;
    }

    @Override // p4.h
    public void b(p4.g gVar) {
        for (int i17 = 1; i17 <= this.f397301n; i17++) {
            int i18 = this.f397299i[i17];
            if (i18 == 1) {
                gVar.mo145066x37fcf764(i17);
            } else if (i18 == 2) {
                gVar.mo145065x37fbf859(i17, this.f397295e[i17]);
            } else if (i18 == 3) {
                gVar.mo145064x1b3baa6e(i17, this.f397296f[i17]);
            } else if (i18 == 4) {
                gVar.mo145067x35198eae(i17, this.f397297g[i17]);
            } else if (i18 == 5) {
                gVar.mo145063x37f7617a(i17, this.f397298h[i17]);
            }
        }
    }

    @Override // p4.g
    /* renamed from: bindBlob */
    public void mo145063x37f7617a(int i17, byte[] bArr) {
        this.f397299i[i17] = 5;
        this.f397298h[i17] = bArr;
    }

    @Override // p4.g
    /* renamed from: bindDouble */
    public void mo145064x1b3baa6e(int i17, double d17) {
        this.f397299i[i17] = 3;
        this.f397296f[i17] = d17;
    }

    @Override // p4.g
    /* renamed from: bindLong */
    public void mo145065x37fbf859(int i17, long j17) {
        this.f397299i[i17] = 2;
        this.f397295e[i17] = j17;
    }

    @Override // p4.g
    /* renamed from: bindNull */
    public void mo145066x37fcf764(int i17) {
        this.f397299i[i17] = 1;
    }

    @Override // p4.g
    /* renamed from: bindString */
    public void mo145067x35198eae(int i17, java.lang.String str) {
        this.f397299i[i17] = 4;
        this.f397297g[i17] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: release */
    public void m145068x41012807() {
        java.util.TreeMap treeMap = f397293o;
        synchronized (treeMap) {
            treeMap.put(java.lang.Integer.valueOf(this.f397300m), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                java.util.Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i17 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i17;
                }
            }
        }
    }
}
