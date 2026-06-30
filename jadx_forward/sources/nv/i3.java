package nv;

/* loaded from: classes9.dex */
public class i3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String url = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5843x5ccab65e) abstractC20979x809547d1).f136152g.f88889a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.StaticPomGetA8keyRedirectEventListener", "receive PomGetA8keyRedirectEvent. url=%s", url);
        final yn1.h4 h4Var = (yn1.h4) ((mv.w) i95.n0.c(mv.w.class));
        h4Var.Ui();
        h4Var.Zi();
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: nv.i3$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                final mv.w wVar = mv.w.this;
                sn1.j jVar = (sn1.j) obj;
                final bw5.ud0 ud0Var = (bw5.ud0) jVar.f491564a;
                if (jVar.f491565b != 0 || jVar.f491566c != 0 || ud0Var == null) {
                    yn1.k4.d(false);
                    return;
                }
                yn1.k4.d(true);
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: nv.i3$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
                        if (m78443x9cf0d20b == null) {
                            m78443x9cf0d20b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        }
                        ((yn1.h4) mv.w.this).bj(m78443x9cf0d20b, ud0Var, mv.a.f413006i);
                    }
                });
            }
        };
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, null, null, new sn1.y(url, consumer, null), 3, null);
        } else {
            yn1.k4.d(false);
        }
        return false;
    }
}
