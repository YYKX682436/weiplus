package jm4;

/* loaded from: classes11.dex */
public class k4 extends b66.y implements jm4.i4 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f381927d = 0;

    static {
        new jm4.j4(null);
    }

    public void d(bw5.yq0 action, bw5.ar0 scene, bw5.lp0 lp0Var, bw5.o50 o50Var, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int i17 = action.f117159d;
        int i18 = scene.f106955d;
        jm4.x1 x1Var = null;
        byte[] mo14344x5f01b1f6 = lp0Var != null ? lp0Var.mo14344x5f01b1f6() : null;
        byte[] mo14344x5f01b1f62 = o50Var != null ? o50Var.mo14344x5f01b1f6() : null;
        if (lVar != null) {
            x1Var = new jm4.x1();
            x1Var.f381974d = lVar;
        }
        p3380x6a61f93.p3381xf512d0a5.C30432x21b2b547.m168826x21b35fc3(m105978x2737f10(), i17, i18, mo14344x5f01b1f6, mo14344x5f01b1f62, x1Var);
    }

    public void e(bw5.lp0 tingItem, bw5.ar0 scene, int i17, yz5.l lVar) {
        jm4.x1 x1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItem, "tingItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        byte[] mo14344x5f01b1f6 = tingItem.mo14344x5f01b1f6();
        int i18 = scene.f106955d;
        if (lVar == null) {
            x1Var = null;
        } else {
            x1Var = new jm4.x1();
            x1Var.f381974d = lVar;
        }
        long m105978x2737f10 = m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3381xf512d0a5.C30432x21b2b547.m168803x21b05a65(m105978x2737f10, mo14344x5f01b1f6, i18, i17, x1Var);
    }
}
