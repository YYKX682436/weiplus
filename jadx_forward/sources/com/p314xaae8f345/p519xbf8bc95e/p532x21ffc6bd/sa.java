package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sa implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f132843a = "d8ab2f7b7a7536a71894084e1c812fd0";

    /* renamed from: b, reason: collision with root package name */
    public static final javax.crypto.spec.IvParameterSpec f132844b = new javax.crypto.spec.IvParameterSpec("c0ab1f54he78k36d".getBytes());

    /* renamed from: c, reason: collision with root package name */
    public static int f132845c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f132846d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static int f132847e = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f132848m = 130817;

    /* renamed from: n, reason: collision with root package name */
    private static final int f132849n = 130818;

    /* renamed from: o, reason: collision with root package name */
    private static final int f132850o = 130819;

    /* renamed from: q, reason: collision with root package name */
    private static final int f132851q = 5000;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f132852f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f132853g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f132854h;

    /* renamed from: j, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132856j;

    /* renamed from: k, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rz f132857k;

    /* renamed from: l, reason: collision with root package name */
    private final java.lang.String f132858l;

    /* renamed from: p, reason: collision with root package name */
    private final android.util.SparseArray<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx> f132859p = new android.util.SparseArray<>(32);

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f132855i = new android.os.Handler(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a("gesture")) { // from class: com.tencent.mapsdk.internal.sa.1
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.f132848m /* 130817 */:
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.this);
                    return;
                case com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.f132849n /* 130818 */:
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.this.a();
                    return;
                case com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.f132850o /* 130819 */:
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.this);
                    return;
                default:
                    return;
            }
        }
    };

    public sa(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
        this.f132856j = neVar;
        neVar.a(this);
        this.f132857k = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rz(neVar.f132043j);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(neVar.mo36630x76847179(), (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(a17.f132006d);
        this.f132858l = a17.f132006d;
    }

    private void a(boolean z17) {
        this.f132852f = z17;
        if (z17) {
            this.f132855i.sendEmptyMessage(f132848m);
        } else {
            this.f132855i.sendEmptyMessage(f132850o);
        }
    }

    private void b() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "performInit");
        this.f132854h = false;
        this.f132853g = false;
        a();
    }

    private boolean c() {
        return this.f132853g;
    }

    private boolean d() {
        return !this.f132854h && this.f132852f;
    }

    private void e() {
        this.f132853g = false;
        this.f132855i.sendEmptyMessage(f132849n);
    }

    private void f() {
        this.f132853g = true;
    }

    private void g() {
        this.f132854h = true;
        this.f132852f = false;
        this.f132855i.sendEmptyMessage(f132850o);
    }

    private void h() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "performDestroy");
        this.f132857k.a();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz
    public final void j() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz
    public final void k() {
        this.f132855i.sendEmptyMessage(f132849n);
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx a(int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263) {
        byte[] bArr;
        java.lang.String encode = java.net.URLEncoder.encode(com.p314xaae8f345.map.p511x696c9db.C4311x6696ea87.m35815x21b61898("lblat=" + c26041x873d1d26.f49501xaa2bac6c + "&lblon=" + c26041x873d1d26.f49502x83009af + "&rtlat=" + c26041x873d1d262.f49501xaa2bac6c + "&rtlon=" + c26041x873d1d262.f49502x83009af + "&zoom=" + i17 + "&suid=" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d() + "&version=" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.n() + "&nt=" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.g() + "&location=" + c26041x873d1d263.f49501xaa2bac6c + "," + c26041x873d1d263.f49502x83009af, f132843a, f132844b));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dy dyVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dy) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dy.class);
        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36701x6b1be619 = dyVar != null ? ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dj) dyVar.i()).m36701x6b1be619(encode) : null;
        if (m36701x6b1be619 != null && (bArr = m36701x6b1be619.f16977x2eefaa) != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m(bArr);
            mVar.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4376xef917861 c4376xef917861 = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4376xef917861();
            try {
                c4376xef917861.mo36074xcc442a60(mVar);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "traffic event read field exception:" + e17.fillInStackTrace());
            }
            if (c4376xef917861.f17308x5c4d208 != 0 || c4376xef917861.f17307xb06a1851 == null) {
                return null;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx rxVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder().m99564x73c954a8(c26041x873d1d26).m99564x73c954a8(c26041x873d1d262).m99563x59bc66e(), c4376xef917861.f17307xb06a1851);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "traffic event data detail:".concat(java.lang.String.valueOf(rxVar)));
            return rxVar;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rsp = ");
        sb6.append(m36701x6b1be619 != null ? java.lang.Integer.valueOf(m36701x6b1be619.f16986xec0a8ff) : "null");
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, sb6.toString());
        return null;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx b(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132856j;
        if (neVar == null) {
            return null;
        }
        if (neVar.O() != null && this.f132856j.O().f130534d) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "traffic event tobe fetch data from net!");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2 = this.f132856j;
        android.graphics.Rect rect = neVar2.f132048o;
        return a(i17, neVar2.f132046m.a(new android.graphics.PointF(rect.width() * (-2), rect.height() * 3)), this.f132856j.f132046m.a(new android.graphics.PointF(rect.width() * 3, rect.height() * (-2))), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(this.f132856j.f132053t.f133953m));
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx rxVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx rxVar2) {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> list;
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> list2;
        boolean z17;
        if (rxVar2 == null || (list = rxVar2.f132834c) == null) {
            return;
        }
        if (list.isEmpty()) {
            this.f132857k.a();
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (rxVar == null || (list2 = rxVar.f132834c) == null || list2.isEmpty()) {
            return;
        }
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> list3 = rxVar.f132834c;
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> list4 = rxVar2.f132834c;
        for (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471 c4375x79cf0471 : list3) {
            java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> it = list4.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f17305x592d42e.f17293xadf44135.equals(c4375x79cf0471.f17305x592d42e.f17293xadf44135)) {
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (!z17) {
                linkedList.add(c4375x79cf0471);
            }
        }
        this.f132857k.b(linkedList);
    }

    public static /* synthetic */ void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa saVar) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "performDestroy");
        saVar.f132857k.a();
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx rxVar) {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> list;
        int i17;
        byte[] c17;
        byte[] bArr;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
        if (rxVar == null || (list = rxVar.f132834c) == null || list.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132856j;
        if (neVar != null && (hgVar = neVar.f130533c) != null) {
            hgVar.f().f131272a++;
        }
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> it = rxVar.f132834c.iterator();
        while (it.hasNext()) {
            java.lang.String str = it.next().f17305x592d42e.f17295xda18336d;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i17 = lastIndexOf + 1) <= str.length()) {
                java.lang.String substring = str.substring(i17);
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.a(substring) == null) {
                    java.io.File file = new java.io.File(this.f132858l, substring);
                    if (!file.exists()) {
                        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35995x5b4bacb = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(str).m35995x5b4bacb();
                        if (m35995x5b4bacb != null && (bArr = m35995x5b4bacb.f16977x2eefaa) != null) {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, bArr);
                            c17 = m35995x5b4bacb.f16977x2eefaa;
                        }
                    } else {
                        c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(file);
                    }
                    if (c17 != null && c17.length > 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.a(substring, android.graphics.BitmapFactory.decodeByteArray(c17, 0, c17.length));
                    }
                }
            }
        }
        this.f132857k.a(rxVar.f132834c);
    }

    private void a(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> list) {
        int i17;
        byte[] c17;
        byte[] bArr;
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = it.next().f17305x592d42e.f17295xda18336d;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i17 = lastIndexOf + 1) <= str.length()) {
                java.lang.String substring = str.substring(i17);
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.a(substring) == null) {
                    java.io.File file = new java.io.File(this.f132858l, substring);
                    if (!file.exists()) {
                        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35995x5b4bacb = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(str).m35995x5b4bacb();
                        if (m35995x5b4bacb != null && (bArr = m35995x5b4bacb.f16977x2eefaa) != null) {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, bArr);
                            c17 = m35995x5b4bacb.f16977x2eefaa;
                        }
                    } else {
                        c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(file);
                    }
                    if (c17 != null && c17.length > 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.a(substring, android.graphics.BitmapFactory.decodeByteArray(c17, 0, c17.length));
                    }
                }
            }
        }
    }

    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd a(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rz rzVar = this.f132857k;
        if (rzVar == null) {
            return null;
        }
        java.util.Iterator<java.lang.String> it = rzVar.f132839a.keySet().iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.rz.a aVar = this.f132857k.f132839a.get(it.next());
            if (aVar != null && aVar.f132841a.a() == i17) {
                return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ry(aVar.f132842b);
            }
        }
        return null;
    }

    public final void a() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "performRefresh");
        if (d()) {
            if (!this.f132853g) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132856j;
                int a17 = (int) neVar.f132053t.a();
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] a18 = neVar.f132046m.a();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx rxVar = this.f132859p.get(a17);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rx b17 = (rxVar != null && rxVar.f132834c != null && android.os.SystemClock.elapsedRealtime() - rxVar.f132832a <= 5000 && rxVar.f132833b.m99538xde2d761f(a18[0]) && rxVar.f132833b.m99538xde2d761f(a18[1]) && rxVar.f132833b.m99538xde2d761f(a18[2]) && rxVar.f132833b.m99538xde2d761f(a18[3])) ? null : b(a17);
                if (b17 == null || b17.f132834c == null) {
                    b17 = rxVar;
                }
                this.f132859p.put(a17, b17);
                a(rxVar, b17);
                a(b17);
                this.f132855i.removeMessages(f132849n);
                this.f132855i.sendEmptyMessageDelayed(f132849n, 5000L);
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "traffic event tobe paused!");
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "traffic event tobe destroyed!");
        this.f132859p.clear();
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa saVar) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131746n, "performInit");
        saVar.f132854h = false;
        saVar.f132853g = false;
        saVar.a();
    }
}
