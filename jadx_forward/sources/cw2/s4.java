package cw2;

/* loaded from: classes5.dex */
public final class s4 implements rm5.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f305523a;

    /* renamed from: b, reason: collision with root package name */
    public gp.d f305524b;

    public s4(r45.mb4 media) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        this.f305523a = "MicroMsg.FinderVideoThumbFetcherFactory";
        gp.d dVar = new gp.d();
        this.f305524b = dVar;
        try {
            dVar.setDataSource(media.m75945x2fec8307(0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f305523a, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // rm5.k
    public void a(java.util.List times, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(times, "times");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        pm0.v.L("FinderNormalVideoThumbFetcher_requestFrames", true, new cw2.r4(times, this, callback));
    }

    @Override // rm5.k
    public void b(long j17) {
    }

    @Override // rm5.k
    /* renamed from: destroy */
    public void mo122875x5cd39ffa() {
        try {
            gp.d dVar = this.f305524b;
            if (dVar != null) {
                dVar.release();
            }
            this.f305524b = null;
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // rm5.k
    /* renamed from: setSize */
    public void mo122876x76500f83(int i17, int i18) {
    }
}
