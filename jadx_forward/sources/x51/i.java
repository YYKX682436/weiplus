package x51;

/* loaded from: classes12.dex */
public abstract class i {
    public static com.p314xaae8f345.mm.p957x53236a1b.u0 a(com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var) {
        r45.w56 w56Var;
        java.util.LinkedList linkedList;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("kscene_type", 73);
        if (v0Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var2 = v0Var.f152960e;
        o45.vg vgVar = ((c01.f9) v0Var2).f118717c;
        if (((o45.tg) vgVar).f424548a.f467485e == null || (w56Var = ((o45.tg) vgVar).f424548a.f467485e.f471467t) == null || (linkedList = w56Var.f470438e) == null || linkedList.size() <= 0) {
            return null;
        }
        com.p314xaae8f345.mm.p957x53236a1b.u0 u0Var = new com.p314xaae8f345.mm.p957x53236a1b.u0();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            int i17 = gg6Var.f456770d;
            if (i17 == 19) {
                u0Var.f152951b = gg6Var.f456771e;
            } else if (i17 == 20) {
                u0Var.f152952c = gg6Var.f456771e;
            } else if (i17 == 21) {
                u0Var.f152953d = gg6Var.f456771e;
            }
        }
        u0Var.f152955f = bundle;
        u0Var.f152950a = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u0Var.f152951b)) {
            return null;
        }
        u0Var.f152954e = ((o45.sg) v0Var2.mo47979x2d63726f()).f424539b.f459371d.f460251f;
        return u0Var;
    }
}
