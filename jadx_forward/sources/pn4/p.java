package pn4;

/* loaded from: classes12.dex */
public final class p extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final y21.h f438698d = new y21.h(false, true, 1, null);

    static {
        new pn4.m(null);
    }

    public final java.lang.String N6() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null || context.getCacheDir() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextToSpeechHelper", "path is empty, MMApplicationContext.getContext() == null");
            return "";
        }
        java.lang.String str = gm0.j1.u().h() + "imSpeech";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechHelper", "path is not exists, mkdir path: %s", str);
        }
        return str;
    }

    public final void O6(java.lang.CharSequence text, long j17, pn4.n nVar, boolean z17, r45.jy3 scene, r45.iy3 language) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(language, "language");
        y21.h hVar = this.f438698d;
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f540589b, "setNeedRequestAudioFocus: " + z17);
        x21.c cVar = hVar.f540593f;
        if (!z17) {
            f25.m0 m0Var = cVar.f533055k;
            if (m0Var != null) {
                i95.m c17 = i95.n0.c(f25.n0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((f25.n0) c17).yg(m0Var);
            }
            cVar.f533055k = null;
        }
        cVar.f533046b = z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        pn4.q0 q0Var = new pn4.q0(j17, text.toString(), N6(), gm0.j1.b().f354778h.f354678e);
        q0Var.l(scene, language);
        hVar.b(q0Var);
        hVar.f(!c01.d9.b().p().n(26, false));
        hVar.c(new pn4.o(text, f0Var, j17, nVar));
        hVar.d();
    }

    public final void P6() {
        y21.h hVar = this.f438698d;
        if (hVar != null) {
            if (hVar.a()) {
                y21.h.e(hVar, false, false, 3, null);
            }
            hVar.c(null);
        }
    }
}
