package hr3;

/* loaded from: classes5.dex */
public final class be extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f364961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(hr3.pf pfVar) {
        super(0);
        this.f364961d = pfVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2621x8fb0427b.p7[] L0;
        y35.r[] g17;
        boolean z17;
        hr3.pf pfVar = this.f364961d;
        try {
            java.lang.String m133981x6c03c64c = pfVar.m133981x6c03c64c();
            int i17 = 1;
            if (m133981x6c03c64c != null && (L0 = r21.w.Ai().L0(m133981x6c03c64c, 3)) != null && (g17 = y35.r.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, L0)) != null) {
                if (!(g17.length == 0)) {
                    for (y35.r rVar : g17) {
                        if (rVar.k()) {
                            z17 = true;
                            break;
                        }
                    }
                }
            }
            z17 = false;
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.g gVar = pfVar.f365424g;
            cy1.a aVar = (cy1.a) rVar2;
            aVar.pk((android.widget.Button) ((jz5.n) gVar).mo141623x754a37bb(), "50164_finish");
            aVar.ik((android.widget.Button) ((jz5.n) gVar).mo141623x754a37bb(), 40, 33926);
            android.widget.Button button = (android.widget.Button) ((jz5.n) gVar).mo141623x754a37bb();
            jz5.l[] lVarArr = new jz5.l[1];
            if (!z17) {
                i17 = 0;
            }
            lVarArr[0] = new jz5.l("friend_request_has_img", java.lang.Integer.valueOf(i17));
            aVar.gk(button, kz5.c1.l(lVarArr));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SayHiPictureUIC", th6, "bindCommitBtnReport err", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
