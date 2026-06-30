package jn2;

/* loaded from: classes10.dex */
public final class k1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f382171d;

    public k1(jn2.r1 r1Var) {
        this.f382171d = r1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mm2.j6 newState = (mm2.j6) obj;
        jn2.r1 r1Var = this.f382171d;
        jn2.z1 z1Var = r1Var.f382219x0;
        if (z1Var != null) {
            mm2.j6 j6Var = r1Var.A1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
            java.lang.String str = j6Var instanceof mm2.h6 ? ((mm2.h6) j6Var).f410646a.f473162f : j6Var instanceof mm2.i6 ? ((mm2.i6) j6Var).f410674a.f473162f : null;
            java.lang.String str2 = newState instanceof mm2.h6 ? ((mm2.h6) newState).f410646a.f473162f : newState instanceof mm2.i6 ? ((mm2.i6) newState).f410674a.f473162f : null;
            java.lang.String str3 = z1Var.f382308q;
            java.util.LinkedHashSet<java.lang.String> linkedHashSet = new java.util.LinkedHashSet();
            if (str != null) {
                linkedHashSet.add(str);
            }
            if (str2 != null) {
                linkedHashSet.add(str2);
            }
            if (str3 != null) {
                linkedHashSet.add(str3);
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str2) || !(newState instanceof mm2.g6)) {
                z1Var.f382308q = null;
            }
            for (java.lang.String str4 : linkedHashSet) {
                java.util.Iterator it = z1Var.f382302h.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.z22) it.next()).f473162f, str4)) {
                        break;
                    }
                    i17++;
                }
                if (i17 >= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z1Var.f382301g, "onSingStateChanged: refresh cell, pos=" + i17 + ", id=" + str4);
                    z1Var.m8148xed6e4d18(i17, "payload_sing_state");
                }
            }
        }
        r1Var.A1 = newState;
        return jz5.f0.f384359a;
    }
}
