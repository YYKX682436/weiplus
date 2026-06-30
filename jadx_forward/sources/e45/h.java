package e45;

/* loaded from: classes10.dex */
public final class h implements t23.m1 {
    public static long C;
    public final e45.g A;
    public final d45.d B;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f330915d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f330916e;

    /* renamed from: f, reason: collision with root package name */
    public final int f330917f;

    /* renamed from: g, reason: collision with root package name */
    public final int f330918g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f330919h;

    /* renamed from: i, reason: collision with root package name */
    public int f330920i;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f330921m;

    /* renamed from: n, reason: collision with root package name */
    public final int f330922n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.pin.C19702x122ad0c9 f330923o;

    /* renamed from: p, reason: collision with root package name */
    public d45.q f330924p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f330925q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f330926r;

    /* renamed from: s, reason: collision with root package name */
    public long f330927s;

    /* renamed from: t, reason: collision with root package name */
    public t23.p1 f330928t;

    /* renamed from: u, reason: collision with root package name */
    public int f330929u;

    /* renamed from: v, reason: collision with root package name */
    public int f330930v;

    /* renamed from: w, reason: collision with root package name */
    public int f330931w;

    /* renamed from: x, reason: collision with root package name */
    public volatile e45.a f330932x;

    /* renamed from: y, reason: collision with root package name */
    public d45.d f330933y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f330934z;

    public h(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f330915d = activity;
        this.f330917f = 26;
        this.f330918g = 3;
        this.f330920i = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20010xbd4db7c2());
        this.f330921m = -1L;
        this.f330922n = 3;
        this.f330928t = t23.p1.f496780d;
        this.f330929u = -1;
        this.f330930v = -1;
        this.A = new e45.g(this);
        this.B = new e45.e(this);
    }

    public final void a(java.util.List list) {
        java.lang.System.currentTimeMillis();
        list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            if (!com.p314xaae8f345.mm.vfs.w6.j(abstractC15633xee433078.f219963e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FS.AlbumFileUIC", "filter non exist media: %s.", abstractC15633xee433078.f219963e);
                linkedList.add(abstractC15633xee433078);
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            list.remove((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it6.next());
        }
        java.lang.System.currentTimeMillis();
    }

    public final void b(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        long j17;
        d45.q qVar = this.f330924p;
        if (qVar != null) {
            java.lang.Object obj = qVar.f307990g.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj;
        } else {
            abstractC15633xee433078 = null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f330925q) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("medianote", this.f330926r)) {
            if (android.os.SystemClock.elapsedRealtime() - this.f330927s < 1000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FS.AlbumFileUIC", "sendImg btn event frequency limit");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FS.AlbumFileUIC", "notifyMM switch to SendImgProxyUI");
            boolean z18 = false;
            if (abstractC15633xee433078 != null && abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
                z18 = true;
            }
            if (!z18) {
                if (abstractC15633xee433078 != null) {
                    try {
                        j17 = abstractC15633xee433078.f219967i;
                    } catch (java.lang.Exception unused) {
                    }
                } else {
                    j17 = 0;
                }
                j33.d0.k(j17, abstractC15633xee433078 != null ? abstractC15633xee433078.f219963e : null, this.f330926r, false, 0, z17, abstractC15633xee433078);
            }
        }
        j33.d0.p(this.f330915d, abstractC15633xee433078 != null ? abstractC15633xee433078.f219967i : 0L, abstractC15633xee433078 != null ? abstractC15633xee433078.f219963e : null, this.f330926r, false, 0, z17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0182, code lost:
    
        if (zo.e.b(r2) != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e45.h.c():void");
    }

    public final void d(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f330915d;
        int b76 = i17 + activityC19730xa7b9756f.b7();
        activityC19730xa7b9756f.o7();
        if (b76 == 0) {
            activityC19730xa7b9756f.m78501x43e00957(false);
            activityC19730xa7b9756f.mo60878xf6b21fea(1, activityC19730xa7b9756f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya));
            return;
        }
        activityC19730xa7b9756f.m78501x43e00957(true);
        activityC19730xa7b9756f.mo60878xf6b21fea(1, activityC19730xa7b9756f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya) + '(' + b76 + "/9)");
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        if (j17 != this.f330921m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FS.AlbumFileUIC", "%s %s, not my query, ignore.", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f330921m));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FS.AlbumFileUIC", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
            return;
        }
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FS.AlbumFileUIC", "onQueryMediaFinished, null == mediaItems");
            return;
        }
        d45.q qVar = this.f330924p;
        if (qVar != null) {
            qVar.B();
        }
        linkedList.size();
        d45.q qVar2 = this.f330924p;
        if (qVar2 != null) {
            if (z17 || qVar2.B() > linkedList.size()) {
                a(linkedList);
            } else {
                java.util.List subList = linkedList.subList(qVar2.B(), linkedList.size());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
                a(subList);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(this.f330924p == null);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FS.AlbumFileUIC", "[onQueryMediaFinished] adapter is null?:%s %s", objArr);
            if (this.f330924p != null) {
                e45.b bVar = new e45.b();
                bVar.f330904d = new java.lang.ref.WeakReference(this.f330924p);
                bVar.f330905e = new java.lang.ref.WeakReference(this.f330919h);
                bVar.f330906f = new java.lang.ref.WeakReference(this.f330923o);
                bVar.f330907g = linkedList2;
                bVar.f330908h = z17;
                if (e45.a.f330901d == this.f330932x) {
                    this.f330932x = e45.a.f330902e;
                }
                t23.p0.n().c(bVar);
            }
        }
    }
}
