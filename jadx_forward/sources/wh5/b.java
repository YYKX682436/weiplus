package wh5;

/* loaded from: classes12.dex */
public final class b implements vf3.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh5.a f527551e;

    public b(java.lang.String str, wh5.a aVar) {
        this.f527550d = str;
        this.f527551e = aVar;
    }

    @Override // vf3.g
    public void A(gg3.c videoParam, sf3.g imageParam, vf3.e state, vf3.f extraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParam, "videoParam");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageParam, "imageParam");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download state changed: ");
        sb6.append(state.name());
        sb6.append(", info: ");
        sb6.append(extraInfo.f517925d);
        sb6.append(" mediaId: ");
        java.lang.String str = this.f527550d;
        sb6.append(str);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2CLiveExporter", sb6.toString());
        vf3.e eVar = vf3.e.f517914h;
        wh5.a aVar = this.f527551e;
        if (state == eVar || state == vf3.e.f517911e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2CLiveExporter", "download finished, mediaId: " + str + ' ');
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.u2 u2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.u2) aVar;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = u2Var.f284026a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[downloadBeforeExport onFinish] MsgId:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = u2Var.f284027b;
            n3Var.f283898p--;
            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.j(n3Var.f283891f, f9Var, false)) {
                n3Var.f283900r = true;
            }
            if (n3Var.e()) {
                boolean z17 = n3Var.f283900r;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = n3Var.f283899q;
                if (z17) {
                    n3Var2.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t2(u2Var));
                } else {
                    n3Var2.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.s2(u2Var));
                }
            }
        }
        if (state == vf3.e.f517915i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2CLiveExporter", "download failed, mediaId: " + str);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.u2) aVar).a();
        }
    }
}
