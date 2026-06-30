package te2;

/* loaded from: classes3.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f499927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.m f499928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(te2.p1 p1Var, bm2.m mVar) {
        super(3);
        this.f499927d = p1Var;
        this.f499928e = mVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam;
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        dk2.vg musicItem = (dk2.vg) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        te2.p1 p1Var = this.f499927d;
        int i17 = ((mm2.c1) p1Var.f499820e.a(mm2.c1.class)).Z6().f315408d;
        tn0.w0 f17 = dk2.ef.f314905a.f();
        java.lang.Integer num = null;
        if (f17 != null && (audioMusicParam = f17.L) != null) {
            num = java.lang.Integer.valueOf(audioMusicParam.f127778id);
        }
        java.lang.String m75945x2fec8307 = musicItem.f315787a.m75945x2fec8307(7);
        bm2.m mVar = this.f499928e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mVar.f103608i, "itemClickListener curPlayPos:" + i17 + " newPos:" + intValue + " bgMusicId:" + num + " songPlayId:" + m75945x2fec8307);
        te2.d4 d4Var = te2.d4.f499481a;
        gk2.e eVar = p1Var.f499820e;
        if (intValue != i17) {
            te2.j0.M3(this.f499927d, musicItem, intValue, false, 4, null);
            boolean a86 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
            ml2.u2[] u2VarArr = ml2.u2.f409642d;
            d4Var.a(a86, 8, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().e(), p1Var.f499830r);
            d4Var.c(p1Var.h(), 1, musicItem, true, false);
        } else {
            int i18 = musicItem.f315788b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPresenter", "changeState " + musicItem + " pos:" + intValue);
            if (i18 == 1) {
                d4Var.c(p1Var.h(), 3, musicItem, false, true);
                p1Var.i(musicItem, intValue);
            } else if (i18 != 2) {
                d4Var.c(p1Var.h(), 1, musicItem, true, false);
                te2.j0.M3(p1Var, musicItem, intValue, false, 4, null);
                boolean a87 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr2 = ml2.u2.f409642d;
                d4Var.a(a87, 8, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().e(), p1Var.f499830r);
            } else {
                d4Var.c(p1Var.h(), 1, musicItem, true, false);
                p1Var.p(musicItem, intValue);
                boolean a88 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr3 = ml2.u2.f409642d;
                d4Var.a(a88, 8, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().e(), p1Var.f499830r);
            }
        }
        int size = mVar.f103610n.size();
        mVar.m8147xed6e4d18(i17 + size);
        mVar.m8147xed6e4d18(size + intValue);
        te2.k0 k0Var = p1Var.f499823h;
        if (k0Var != null && (d7Var = ((te2.q1) k0Var).f499883i) != null) {
            d7Var.e0(true);
        }
        return jz5.f0.f384359a;
    }
}
