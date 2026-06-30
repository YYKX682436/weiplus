package p3380x6a61f93.p3387xf51c6630;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0007¨\u0006\u0011"}, d2 = {"Lurgen/ur_E2DE/URS_F92D;", "", "", "userName", "Lcom/tencent/unit_rc/BaseObjectDef;", "callback", "Ljz5/f0;", "UR_FA8B", "UR_48C6", "roomName", "UR_6BEF", "", "logId", "logString", "UR_34FC", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: urgen.ur_E2DE.URS_F92D */
/* loaded from: classes.dex */
public final class C30610x280838e {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3387xf51c6630.C30610x280838e f77207x4fbc8495 = new p3380x6a61f93.p3387xf51c6630.C30610x280838e();

    private C30610x280838e() {
    }

    /* renamed from: UR_34FC */
    public static final void m170239x21b1c340(int i17, java.lang.String logString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logString, "logString");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, logString);
    }

    /* renamed from: UR_48C6 */
    public static final java.lang.String m170240x21b24639(java.lang.String userName) {
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (y02.j.f540141a == null) {
            y02.j.f540141a = new b30.n();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 == null) {
            c17 = null;
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            c17 = c01.a2.c(n17, userName);
        }
        return c17 == null ? "" : c17;
    }

    /* renamed from: UR_6BEF */
    public static final java.lang.String m170241x21b354cf(java.lang.String userName, java.lang.String roomName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomName, "roomName");
        if (y02.j.f540141a == null) {
            y02.j.f540141a = new b30.n();
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String f17 = c01.a2.f(userName, roomName);
        return f17 == null ? "" : f17;
    }

    /* renamed from: UR_FA8B */
    public static final void m170242x21ba9567(java.lang.String userName, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055) {
        y02.j1 j1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        int i17 = y02.o1.f540150n;
        y02.h1 h1Var = (y02.h1) interfaceC26826xca759055;
        if (h1Var == null) {
            j1Var = null;
        } else {
            if (h1Var instanceof y02.o1) {
            }
            j1Var = new y02.j1(h1Var);
        }
        b30.n nVar = y02.j.f540141a;
        if (nVar == null) {
            nVar = new b30.n();
            y02.j.f540141a = nVar;
        }
        y02.i iVar = new y02.i(j1Var);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true) != null) {
            iVar.mo146xb9724478(java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Integer num = (java.lang.Integer) b30.n.f99104a.get(userName);
        if (num == null) {
            num = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        if (num.intValue() < 3) {
            b30.n.f99105b.put(userName, iVar);
            ((c01.k7) ((j11.q) ((ct.z2) i95.n0.c(ct.z2.class))).wi()).b(userName, 13, nVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsGetContactHelper", "Skip getContact of " + userName + ", because 3 attempts to get contact failed.");
        iVar.mo146xb9724478(java.lang.Boolean.FALSE);
    }
}
