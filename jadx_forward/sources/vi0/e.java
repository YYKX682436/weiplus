package vi0;

/* loaded from: classes2.dex */
public final class e implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f518784a;

    public e(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f518784a = qVar;
    }

    @Override // ep0.c
    public void a(ip0.a url, cp0.n nVar, hp0.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(((mn2.h3) url.f375106a).mo148083xfb83cc9b(), false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderDataSource", "onImageLoadFinish: url=" + url + ", path=" + i17);
        this.f518784a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(i17));
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderDataSource", "onImageLoadStart: " + aVar);
    }
}
