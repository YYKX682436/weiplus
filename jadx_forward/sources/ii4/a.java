package ii4;

/* loaded from: classes8.dex */
public abstract class a {
    public static final void a(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var, com.p314xaae8f345.mm.p944x882e457a.m1 scene, p012xc85e97e9.p093xedfae76a.y yVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (yVar != null && u0Var != null) {
            int mo808xfb85f7b0 = scene.mo808xfb85f7b0();
            if (mo808xfb85f7b0 == -1) {
                throw new java.lang.IllegalArgumentException("BROADCAST TYPE Not support, use add addSceneEndListener");
            }
            r1Var.f152307q.a(mo808xfb85f7b0, yVar, e75.g.f69659x9393ed43, new q01.j(u0Var));
        } else if (u0Var != null) {
            r1Var.a(scene.mo808xfb85f7b0(), u0Var);
        }
        r1Var.g(scene);
    }
}
