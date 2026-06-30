package a32;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb f82575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb) {
        super(0);
        this.f82575d = c13392x8bacb7fb;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f82575d;
        c13392x8bacb7fb.f180177g.e();
        r22.a presenter = c13392x8bacb7fb.getPresenter();
        if (presenter != null) {
            w22.g gVar = (w22.g) presenter;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CapturePresenter", "stop record " + gVar.f524067e);
            w22.b bVar = gVar.f524067e;
            w22.b bVar2 = w22.b.f524057g;
            if (bVar != bVar2) {
                gVar.f524067e = bVar2;
                long j17 = gVar.f524068f;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                x22.f fVar = gVar.f524074l;
                if (elapsedRealtime < 600) {
                    if (fVar != null) {
                        z21.w wVar = x22.f.f533097b;
                        if (wVar != null) {
                            wVar.mo48299x360802(true);
                        }
                        x22.f.f533097b = null;
                    }
                    gVar.f524067e = w22.b.f524055e;
                } else {
                    android.content.Context context = gVar.f524063a;
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    ((y22.m) gVar.f524065c).f(context, string, true, 0, new w22.d(gVar));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13393xb0efbc76 f180183p = gVar.f524064b.getF180183p();
                    f180183p.f180194v.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.p1382x36452d.C13404xce5cc0b2 c13404xce5cc0b2 = f180183p.f180195w;
                    c13404xce5cc0b2.removeCallbacks(c13404xce5cc0b2.f180313g);
                    if (gVar.f524069g) {
                        if (fVar != null) {
                            z21.w wVar2 = x22.f.f533097b;
                            if (wVar2 != null) {
                                wVar2.mo48299x360802(true);
                            }
                            x22.f.f533097b = null;
                        }
                        gVar.f524075m.d();
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d8141 = gVar.f524066d;
                    c13384x547d8141.f180118f = currentTimeMillis;
                    long j18 = currentTimeMillis - c13384x547d8141.f180117e;
                    c13384x547d8141.f180123n = j18;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.b(4, c13384x547d8141.f180116d, 0L, j18, 0L, 0L, 0L, 0, 0, c13384x547d8141.G);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
