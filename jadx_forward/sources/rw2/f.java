package rw2;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.j f482126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk4.h f482127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f482128f;

    public f(rw2.j jVar, kk4.h hVar, java.lang.Object obj) {
        this.f482126d = jVar;
        this.f482127e = hVar;
        this.f482128f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rw2.j jVar = this.f482126d;
        java.lang.String str = jVar.f482140c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create new TPTrackThumbFetcher, mediaInfo:");
        rw2.k kVar = jVar.f482138a;
        sb6.append(kVar.f482147n);
        sb6.append(", loader.isAllComplete:");
        kk4.h hVar = this.f482127e;
        sb6.append(hVar != null ? hVar.f390081g : false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        kk4.v vVar = new kk4.v(context);
        jVar.f482144g = vVar;
        vVar.C(true);
        if (hVar != null) {
            kk4.v vVar2 = jVar.f482144g;
            if (vVar2 != null) {
                dk4.a mediaInfo = kVar.f482147n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar2.f390109a, "setCdnResourceLoader, loader:" + hVar.hashCode() + ", mediaId:" + hVar.f390078d + ", isMoovReady:" + hVar.f390080f);
                vVar2.f390113e = hVar;
                vVar2.f390111c = mediaInfo;
                vVar2.f390115g = true;
                vVar2.S(true);
                vVar2.H = true;
            }
        } else {
            kk4.v vVar3 = jVar.f482144g;
            if (vVar3 != null) {
                vVar3.B(kVar.f482147n);
            }
        }
        jVar.f482145h = hVar != null ? hVar.f390081g : false;
        kk4.v vVar4 = jVar.f482144g;
        if (vVar4 != null) {
            vVar4.f390118j = true;
        }
        if (vVar4 != null) {
            vVar4.G = true;
        }
        kk4.h hVar2 = vVar4 != null ? vVar4.f390113e : null;
        if (hVar2 != null) {
            hVar2.f390084m = new rw2.c(jVar);
        }
        dk4.a mediaInfo2 = kVar.f482147n;
        rw2.t tVar = jVar.f482141d;
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo2, "mediaInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f482159c, "mediaInfo:" + mediaInfo2);
        tVar.f482168l = mediaInfo2;
        rw2.d dVar = new rw2.d(jVar, this.f482128f);
        tVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f482159c, "setup, output size:[" + tVar.f482157a + ',' + tVar.f482158b + ']');
        tVar.f482163g = dVar;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("TPTrackThumbRenderer@");
        sb7.append(tVar.hashCode());
        java.lang.String sb8 = sb7.toString();
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(sb8, 0);
        a17.start();
        tVar.f482162f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        tVar.f482161e = a17;
        tVar.b(new rw2.l(tVar));
        tVar.b(new rw2.o(tVar));
        tVar.b(new rw2.p(tVar));
        tVar.b(new rw2.s(tVar));
        rw2.e eVar = new rw2.e(jVar);
        tVar.getClass();
        tVar.f482171o = eVar;
    }
}
