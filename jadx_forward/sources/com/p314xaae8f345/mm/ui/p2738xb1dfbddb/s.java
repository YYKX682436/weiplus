package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes5.dex */
public abstract class s {
    public static final java.util.Map a(yb5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qVar, "<this>");
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = qVar.f542275a;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z07 != null ? z07.f69107x5be1edb3 : null, en1.a.a());
        boolean G0 = z07 != null ? z07.G0(en1.a.a()) : false;
        int i17 = 3;
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("group_chat_room_uv", java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str)));
        lVarArr[1] = new jz5.l("group_chat_name", str);
        if (b17) {
            i17 = 1;
        } else if (G0) {
            i17 = 2;
        }
        lVarArr[2] = new jz5.l("group_user_role", java.lang.Integer.valueOf(i17));
        return kz5.c1.k(lVarArr);
    }
}
