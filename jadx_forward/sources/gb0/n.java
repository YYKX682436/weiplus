package gb0;

@j95.b
/* loaded from: classes8.dex */
public final class n extends i95.w implements fb0.k {

    /* renamed from: e, reason: collision with root package name */
    public fb0.j f351503e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f351502d = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f351504f = new java.util.concurrent.ConcurrentHashMap();

    public boolean Ai(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (!m131177xdac2174d() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.r4(msg.Q0())) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 b17 = db0.g.f309361a.b(msg);
        if (b17 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 Ri = ((zh1.p) k5Var).Ri(b17);
        if (Ri == null) {
            int i17 = ai1.a.f86613a;
            ai1.p.f86635b.b(b17, null);
        } else {
            java.util.List list = Ri.f167785g;
            java.util.Objects.toString(list);
            if (list.size() > 0) {
                return true;
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
        long m124847x74d37ac6 = msg.m124847x74d37ac6();
        am.b6 b6Var = c5348xb8e1a564.f135674g;
        b6Var.f87752a = m124847x74d37ac6;
        b6Var.f87753b = msg.Q0();
        b6Var.f87755d = -1;
        c5348xb8e1a564.e();
        return c5348xb8e1a564.f135675h.f87869a;
    }

    /* renamed from: isEnable */
    public boolean m131177xdac2174d() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.Boolean bool = db0.f.f309359a;
        if (bool != null) {
            return bool.booleanValue();
        }
        db0.f.f309359a = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_wxa_material_open_msg, 0) == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgABTest", "enableOpenABTest:" + db0.f.f309359a);
        java.lang.Boolean bool2 = db0.f.f309359a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool2);
        return bool2.booleanValue();
    }

    public void wi(android.content.Context context, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        ib0.e.f371562a.a(context, block);
    }
}
