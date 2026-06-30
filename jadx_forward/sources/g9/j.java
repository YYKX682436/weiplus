package g9;

/* loaded from: classes15.dex */
public final class j implements d9.x, g9.n, h9.j {

    /* renamed from: d, reason: collision with root package name */
    public final h9.n f351135d;

    /* renamed from: e, reason: collision with root package name */
    public final g9.g f351136e;

    /* renamed from: f, reason: collision with root package name */
    public final int f351137f;

    /* renamed from: g, reason: collision with root package name */
    public final d9.g f351138g;

    /* renamed from: h, reason: collision with root package name */
    public final r9.b f351139h;

    /* renamed from: o, reason: collision with root package name */
    public d9.w f351143o;

    /* renamed from: p, reason: collision with root package name */
    public int f351144p;

    /* renamed from: q, reason: collision with root package name */
    public d9.l0 f351145q;

    /* renamed from: t, reason: collision with root package name */
    public d9.l f351148t;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.IdentityHashMap f351140i = new java.util.IdentityHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final g9.p f351141m = new g9.p();

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f351142n = new android.os.Handler();

    /* renamed from: r, reason: collision with root package name */
    public g9.o[] f351146r = new g9.o[0];

    /* renamed from: s, reason: collision with root package name */
    public g9.o[] f351147s = new g9.o[0];

    public j(h9.n nVar, g9.g gVar, int i17, d9.g gVar2, r9.b bVar) {
        this.f351135d = nVar;
        this.f351136e = gVar;
        this.f351137f = i17;
        this.f351138g = gVar2;
        this.f351139h = bVar;
    }

    public static boolean f(h9.a aVar, java.lang.String str) {
        java.lang.String str2 = aVar.f361124b.f125610f;
        if (android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        for (java.lang.String str3 : str2.split("(\\s*,\\s*)|(\\s*$)")) {
            if (str3.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // d9.h0
    public void b(d9.i0 i0Var) {
        if (this.f351145q == null) {
            return;
        }
        this.f351143o.b(this);
    }

    @Override // d9.x
    public long c(long j17) {
        g9.o[] oVarArr = this.f351147s;
        if (oVarArr.length > 0) {
            boolean x17 = oVarArr[0].x(j17, false);
            int i17 = 1;
            while (true) {
                g9.o[] oVarArr2 = this.f351147s;
                if (i17 >= oVarArr2.length) {
                    break;
                }
                oVarArr2[i17].x(j17, x17);
                i17++;
            }
            if (x17) {
                this.f351141m.f351179a.clear();
            }
        }
        return j17;
    }

    @Override // d9.x
    public long d() {
        return -9223372036854775807L;
    }

    public final g9.o e(int i17, h9.a[] aVarArr, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, java.util.List list, long j17) {
        return new g9.o(i17, this, new g9.f(this.f351135d, aVarArr, this.f351136e, this.f351141m, list), this.f351139h, j17, c1601x7dc4e417, this.f351137f, this.f351138g);
    }

    @Override // d9.i0
    public boolean h(long j17) {
        return this.f351148t.h(j17);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d1  */
    @Override // d9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i(q9.m[] r29, boolean[] r30, d9.g0[] r31, boolean[] r32, long r33) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.j.i(q9.m[], boolean[], d9.g0[], boolean[], long):long");
    }

    @Override // d9.x
    public d9.l0 k() {
        return this.f351145q;
    }

    @Override // d9.i0
    public long m() {
        return this.f351148t.m();
    }

    @Override // d9.i0
    public long n() {
        return this.f351148t.n();
    }

    @Override // d9.x
    public void o() {
        for (g9.o oVar : this.f351146r) {
            oVar.f351165m.b();
            g9.f fVar = oVar.f351161f;
            java.io.IOException iOException = fVar.f351110j;
            if (iOException != null) {
                throw iOException;
            }
            h9.a aVar = fVar.f351111k;
            if (aVar != null) {
                h9.i iVar = (h9.i) fVar.f351105e.f361194g.get(aVar);
                iVar.f361181e.b();
                java.io.IOException iOException2 = iVar.f361189p;
                if (iOException2 != null) {
                    throw iOException2;
                }
            }
        }
    }

    @Override // d9.x
    public void p(long j17) {
        for (g9.o oVar : this.f351147s) {
            int length = oVar.f351171s.length;
            for (int i17 = 0; i17 < length; i17++) {
                oVar.f351171s[i17].g(j17, false, oVar.C[i17]);
            }
        }
    }

    @Override // d9.x
    public void r(d9.w wVar, long j17) {
        this.f351143o = wVar;
        h9.n nVar = this.f351135d;
        ((java.util.ArrayList) nVar.f361197m).add(this);
        h9.b bVar = nVar.f361200p;
        java.util.ArrayList arrayList = new java.util.ArrayList(bVar.f361125c);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            h9.a aVar = (h9.a) arrayList.get(i17);
            if (aVar.f361124b.f125618q > 0 || f(aVar, "avc")) {
                arrayList2.add(aVar);
            } else if (f(aVar, "mp4a")) {
                arrayList3.add(aVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        java.util.List list = bVar.f361126d;
        int size = list.size() + 1;
        java.util.List list2 = bVar.f361127e;
        int size2 = size + list2.size();
        this.f351146r = new g9.o[size2];
        this.f351144p = size2;
        t9.a.a(!arrayList.isEmpty());
        h9.a[] aVarArr = new h9.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        g9.o e17 = e(0, aVarArr, bVar.f361128f, bVar.f361129g, j17);
        this.f351146r[0] = e17;
        e17.f351161f.f351108h = true;
        if (!e17.f351174v) {
            e17.h(e17.E);
        }
        int i18 = 0;
        int i19 = 1;
        while (i18 < list.size()) {
            g9.o e18 = e(1, new h9.a[]{(h9.a) list.get(i18)}, null, java.util.Collections.emptyList(), j17);
            int i27 = i19 + 1;
            this.f351146r[i19] = e18;
            if (!e18.f351174v) {
                e18.h(e18.E);
            }
            i18++;
            i19 = i27;
        }
        int i28 = 0;
        while (i28 < list2.size()) {
            h9.a aVar2 = (h9.a) list2.get(i28);
            g9.o e19 = e(3, new h9.a[]{aVar2}, null, java.util.Collections.emptyList(), j17);
            e19.l(0, -1).c(aVar2.f361124b);
            e19.f351173u = true;
            e19.v();
            this.f351146r[i19] = e19;
            i28++;
            i19++;
        }
        this.f351147s = this.f351146r;
    }
}
