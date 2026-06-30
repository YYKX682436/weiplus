package se1;

/* loaded from: classes13.dex */
public final class i0 implements se1.g {

    /* renamed from: a, reason: collision with root package name */
    public final se1.g f488313a;

    /* renamed from: b, reason: collision with root package name */
    public final se1.f f488314b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f488315c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f488316d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f488317e = "";

    public i0(se1.g gVar, se1.f fVar) {
        gVar.getClass();
        this.f488313a = gVar;
        fVar.getClass();
        this.f488314b = fVar;
    }

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        int a17 = this.f488313a.a(bArr, i17, i18);
        if (a17 <= 0 || this.f488315c) {
            return a17;
        }
        try {
            if (this.f488316d) {
                ((re1.d) this.f488314b).e(bArr, i17, a17);
            }
        } catch (re1.c e17) {
            this.f488315c = true;
            ve1.g.p(5, e(), "error write dataSink " + e17.toString(), e17);
        }
        return a17;
    }

    @Override // se1.g
    /* renamed from: available */
    public long mo162209xd4418ac9() {
        return this.f488313a.mo162209xd4418ac9();
    }

    @Override // se1.g
    public te1.b b() {
        return this.f488313a.b();
    }

    @Override // se1.g
    public long c(se1.i iVar) {
        te1.b bVar;
        long j17;
        long j18;
        long j19;
        boolean z17;
        java.util.List<java.lang.String> list;
        se1.i iVar2 = iVar;
        se1.g gVar = this.f488313a;
        long c17 = gVar.c(iVar2);
        te1.b bVar2 = te1.b.f499301c;
        boolean z18 = false;
        if (gVar instanceof se1.y) {
            long d17 = gVar.d();
            se1.n nVar = (se1.n) ((se1.y) gVar);
            java.net.HttpURLConnection httpURLConnection = nVar.f488342k;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection == null ? null : httpURLConnection.getHeaderFields();
            ve1.d dVar = nVar.f488340i;
            if (dVar != null) {
                ve1.c cVar = (ve1.c) dVar;
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = headerFields;
                if (map != null && (list = map.get("Content-Type")) != null && list.size() > 0) {
                    java.lang.String str = list.get(0);
                    if (str.equals("application/octet-stream")) {
                        java.lang.String str2 = cVar.f517605b;
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
                                if (entry.getKey() == null || !entry.getKey().equals("Content-Type")) {
                                    hashMap.put(entry.getKey(), entry.getValue());
                                } else {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(str2);
                                    hashMap.put("Content-Type", arrayList);
                                    ve1.g.p(5, cVar.f517604a, "fix Content-Type from " + str + " to " + str2, null);
                                }
                            }
                            map = java.util.Collections.unmodifiableMap(hashMap);
                        }
                    }
                }
                headerFields = map;
            }
            java.util.List<java.lang.String> list2 = headerFields.get("Content-Type");
            if (list2 == null || list2.isEmpty()) {
                z18 = false;
            } else {
                z18 = false;
                bVar2 = te1.b.a(list2.get(0));
            }
            bVar = bVar2;
            j17 = d17;
        } else {
            bVar = bVar2;
            j17 = -1;
        }
        if (iVar2.f488308d != -1 || c17 == -1) {
            j18 = j17;
            j19 = c17;
            z17 = z18;
        } else {
            j18 = j17;
            j19 = c17;
            z17 = z18;
            iVar2 = new se1.i(iVar2.f488305a, iVar2.f488306b, iVar2.f488307c, c17, iVar2.f488309e, iVar2.f488310f, iVar2.f488311g, iVar2.f488312h);
        }
        this.f488315c = z17;
        long j27 = j18;
        if (j27 != -1) {
            try {
                re1.d dVar2 = (re1.d) this.f488314b;
                dVar2.getClass();
                if (iVar2.f488308d != -1) {
                    z17 = true;
                }
                ve1.a.a(z17);
                dVar2.f475842i = j27;
                dVar2.f475843j = bVar;
                try {
                    dVar2.f475837d = iVar2;
                    dVar2.f475841h = 0L;
                    dVar2.d();
                    this.f488316d = true;
                } catch (java.io.IOException e17) {
                    throw new re1.c(e17);
                }
            } catch (re1.c e18) {
                this.f488315c = true;
                ve1.g.p(5, e(), "error open dataSink " + e18.toString(), e18);
            }
        } else {
            this.f488315c = true;
        }
        return j19;
    }

    @Override // se1.g
    /* renamed from: close */
    public void mo162210x5a5ddf8() {
        se1.f fVar = this.f488314b;
        try {
            this.f488313a.mo162210x5a5ddf8();
            try {
                if (this.f488316d) {
                    ((re1.d) fVar).a();
                }
            } catch (re1.c e17) {
                ve1.g.p(5, e(), "error close dataSink " + e17.toString(), e17);
            }
        } catch (java.lang.Throwable th6) {
            try {
                if (this.f488316d) {
                    ((re1.d) fVar).a();
                }
            } catch (re1.c e18) {
                ve1.g.p(5, e(), "error close dataSink " + e18.toString(), e18);
            }
            throw th6;
        }
    }

    @Override // se1.g
    public long d() {
        return this.f488313a.d();
    }

    public java.lang.String e() {
        return this.f488317e + "TeeDataSource";
    }
}
