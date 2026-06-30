package rw2;

/* loaded from: classes10.dex */
public final class j implements rm5.k {

    /* renamed from: j, reason: collision with root package name */
    public static final android.util.LruCache f482137j = new android.util.LruCache(200);

    /* renamed from: a, reason: collision with root package name */
    public final rw2.k f482138a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482139b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482140c;

    /* renamed from: d, reason: collision with root package name */
    public final rw2.t f482141d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f482142e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f482143f;

    /* renamed from: g, reason: collision with root package name */
    public kk4.v f482144g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f482145h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f482146i;

    public j(rw2.k trackInfo, kk4.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackInfo, "trackInfo");
        this.f482138a = trackInfo;
        this.f482139b = trackInfo.f482147n.f316017u;
        java.lang.String str = "MicroMsg.TPTrackThumbFetcher@" + hashCode();
        this.f482140c = str;
        this.f482141d = new rw2.t(trackInfo.f392604a, trackInfo.f392605b);
        this.f482142e = new java.util.LinkedList();
        if (com.p314xaae8f345.mm.vfs.w6.j(trackInfo.f482147n.f316006j)) {
            d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init check first thumb exist");
        } else {
            java.lang.String thumbPath = trackInfo.f482147n.f316006j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbPath, "thumbPath");
            if (thumbPath.length() > 0) {
                java.lang.String thumbUrl = trackInfo.f482147n.f316004h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbUrl, "thumbUrl");
                if (thumbUrl.length() > 0) {
                    o11.f fVar = new o11.f();
                    fVar.f423615f = trackInfo.f482147n.f316006j;
                    fVar.f423611b = true;
                    fVar.f423610a = true;
                    n11.a.b().d(trackInfo.f482147n.f316004h, fVar.a(), new rw2.b(this));
                }
            }
        }
        java.lang.Object obj = new java.lang.Object();
        ((ku5.t0) ku5.t0.f394148d).B(new rw2.f(this, hVar, obj));
        synchronized (obj) {
            try {
                obj.wait();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f482140c, e17, "wait init thumb fetcher error", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482140c, "init thumb fetcher finished");
    }

    @Override // rm5.k
    public void a(java.util.List times, yz5.p callback) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(times, "times");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : times) {
            long longValue = ((java.lang.Number) obj).longValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482140c, "requestFrames: " + longValue);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f482137j.get(this.f482139b + '-' + longValue);
            if (bitmap != null) {
                callback.mo149xb9724478(java.lang.Long.valueOf(longValue), bitmap);
                z17 = false;
            } else {
                if (this.f482146i != null && longValue == 0) {
                    callback.mo149xb9724478(java.lang.Long.valueOf(longValue), this.f482146i);
                }
                z17 = true;
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        java.util.List Q = kz5.n0.Q(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(Q, 10));
        java.util.Iterator it = Q.iterator();
        while (it.hasNext()) {
            arrayList2.add(new rw2.g(((java.lang.Number) it.next()).longValue(), callback, null, 4, null));
        }
        if (arrayList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482140c, "requestFrames: no new request");
            return;
        }
        synchronized (this.f482142e) {
            this.f482142e.addAll(arrayList2);
        }
        c();
    }

    @Override // rm5.k
    public void b(long j17) {
        synchronized (this.f482142e) {
            kz5.h0.B(this.f482142e, new rw2.h(j17));
        }
    }

    public final void c() {
        kk4.v vVar;
        synchronized (this.f482142e) {
            if (this.f482143f) {
                return;
            }
            if (!this.f482142e.isEmpty()) {
                java.lang.Object obj = this.f482142e.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                long j17 = ((rw2.g) obj).f482129a;
                this.f482141d.f482172p = j17;
                if (this.f482145h && (vVar = this.f482144g) != null) {
                    kk4.b.f(vVar, (int) j17, true, null, 4, null);
                }
                this.f482143f = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482140c, "finished request all frames");
                mo122875x5cd39ffa();
            }
        }
    }

    public final void d() {
        android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p786x600aa8b.e.c(this.f482138a.f482147n.f316006j);
        if (c17 != null) {
            this.f482146i = android.graphics.Bitmap.createScaledBitmap(c17, (int) (120 * (c17.getWidth() / c17.getHeight())), 120, true);
            c17.recycle();
        }
    }

    @Override // rm5.k
    /* renamed from: destroy */
    public void mo122875x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482140c, "destroy");
        kk4.v vVar = this.f482144g;
        kk4.h hVar = vVar != null ? vVar.f390113e : null;
        if (hVar != null) {
            hVar.f390084m = null;
        }
        if (vVar != null) {
            vVar.P();
            vVar.mo143590x408b7293();
        }
        this.f482144g = null;
        rw2.t tVar = this.f482141d;
        tVar.getClass();
        tVar.b(new rw2.q(tVar));
    }

    @Override // rm5.k
    /* renamed from: setSize */
    public void mo122876x76500f83(int i17, int i18) {
        rw2.t tVar = this.f482141d;
        if (tVar.f482157a != i17 || tVar.f482158b != i18) {
            tVar.f482170n = true;
        }
        tVar.f482157a = i17;
        tVar.f482158b = i18;
    }
}
