package dw3;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.j0 f325751a = new dw3.j0();

    public final java.lang.String a() {
        java.lang.String mo15082x48bce8a4;
        java.lang.String str = "";
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_second_cut_simple_style_wording, "", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "SecondCutSimpleStyleLeftWording: " + Zi);
        if (!android.text.TextUtils.isEmpty(Zi)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            try {
                cl0.g gVar = new cl0.g(Zi);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
                    mo15082x48bce8a4 = gVar.mo15082x48bce8a4(com.p314xaae8f345.p3121x37984a.fts.C26978x81e6d654.f58363x939d1dd2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()) {
                    mo15082x48bce8a4 = gVar.mo15082x48bce8a4("tradition");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                } else {
                    mo15082x48bce8a4 = gVar.mo15082x48bce8a4("english");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                }
                str = mo15082x48bce8a4;
            } catch (cl0.f unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecondCutConfig", "parse wording JSON error");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "PopupSecondCutSimpleStyleLeftWording: ".concat(str));
            Zi = str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
        return Zi;
    }

    public final int b() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.c0 c0Var = e42.c0.clicfg_phoneix_sns_video_duration;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_phoneix_video_duration, 30);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Ni);
        int Ni2 = ((h62.d) e0Var).Ni(c0Var, Ni);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "SnsVideoDuration: " + Ni2);
        return Ni2;
    }
}
