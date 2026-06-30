package ef0;

/* loaded from: classes8.dex */
public final class w3 implements zy2.da {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.z3 f333884a;

    public w3(ef0.z3 z3Var) {
        this.f333884a = z3Var;
    }

    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
        int i17 = ctrInfo.f470020e;
        if (i17 < 600000 || i17 >= 699999) {
            return false;
        }
        java.util.LinkedList<r45.f03> show_infos = ctrInfo.f470022g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
        for (r45.f03 f03Var : show_infos) {
            qk.d9 d9Var = (qk.d9) i95.n0.c(qk.d9.class);
            java.lang.String str = f03Var.f455425i;
            ((ef0.z3) d9Var).getClass();
            java.util.Map map = em4.c.f336747b;
            if (str == null) {
                str = "";
            }
            ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
            this.f333884a.getClass();
            if (em4.c.f336746a.c(f03Var.f455425i)) {
                em4.c.d("red_dot_received", em4.c.b(ctrInfo, f03Var, null, 4, null));
            }
        }
        return false;
    }
}
