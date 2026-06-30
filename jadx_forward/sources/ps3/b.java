package ps3;

/* loaded from: classes11.dex */
public final class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final ps3.d f439604d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f439605e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f439606f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f439607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ps3.m f439608h;

    public b(ps3.m mVar, ps3.d dVar) {
        this.f439608h = mVar;
        this.f439604d = dVar;
    }

    public final void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        gm0.j1.d().q(30, this);
        ps3.d dVar = this.f439604d;
        if (dVar != null) {
            dVar.a(z17, z18, str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (scene.mo808xfb85f7b0() != 30) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RadarAddContact", "not expected scene,  type = " + scene.mo808xfb85f7b0());
            return;
        }
        ps3.m mVar = this.f439608h;
        if (((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) scene)).f270913g == 2) {
            if (i17 == 0 && i18 == 0) {
                a(false, true, this.f439607g, "");
                return;
            }
            if (i17 == 4 && i18 == -34) {
                str = mVar.f439636e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbm);
            } else if (i17 == 4 && i18 == -94) {
                str = mVar.f439636e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbp);
            } else if (i17 != 4 || ((i18 != -24 && i18 != -101) || str == null)) {
                str = mVar.f439636e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iil);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            a(false, false, this.f439607g, str);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            a(true, false, this.f439607g, "");
            return;
        }
        if (i18 == -44) {
            ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
            android.content.Context context = mVar.f439636e;
            ((ms.a) kVar).getClass();
            new r35.e4(context, null).g(this.f439605e, this.f439606f);
            return;
        }
        if (i18 == -87) {
            a(false, false, this.f439607g, mVar.f439636e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572486bc5));
            return;
        }
        if (i18 != -24 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            a(false, false, this.f439607g, (i17 == 4 && i18 == -22) ? mVar.f439636e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571386dl) : mVar.f439636e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571385dk));
            return;
        }
        java.lang.String str2 = this.f439607g;
        if (str == null) {
            str = "";
        }
        a(false, false, str2, str);
    }
}
