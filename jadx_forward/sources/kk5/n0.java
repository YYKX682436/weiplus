package kk5;

/* loaded from: classes.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.o0 f390205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(kk5.o0 o0Var) {
        super(1);
        this.f390205d = o0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.f m67437x4bd5310;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (((wi5.c) state.a(wi5.c.class)) != null) {
            java.util.HashSet hashSet = new java.util.HashSet(wi5.p0.f527866a.b(state.f527852o, state.f527851n, false));
            int size = hashSet.size();
            boolean z17 = true;
            kk5.o0 o0Var = this.f390205d;
            if (size > 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) it.next());
                }
                o0Var.getClass();
                if (!o0Var.f390207d) {
                    o0Var.f390207d = true;
                    boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMDirectCreateAssociateChatRoomSwitch", 0) == 1;
                    if (!z18) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) it6.next())) {
                                z17 = false;
                                break;
                            }
                        }
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                    if (z18 || z17) {
                        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a l17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@chatroom").l("", arrayList);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "createRoom(...)");
                        h0Var.f391656d = l17;
                    } else if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f()) {
                        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a l18 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@im.chatroom").l("", arrayList);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l18, "createRoom(...)");
                        h0Var.f391656d = l18;
                    } else {
                        db5.e1.t(o0Var.m158354x19263085(), o0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3w), "", null);
                        o0Var.f390207d = false;
                    }
                    ((com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a) h0Var.f391656d).f273781d = new kk5.i0(h0Var, o0Var);
                    ((com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a) h0Var.f391656d).c(o0Var.m158354x19263085(), o0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), o0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573921gb2), true, true, new kk5.j0(o0Var, h0Var));
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = o0Var.P6();
                if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
                    java.util.Iterator it7 = hashSet.iterator();
                    while (it7.hasNext()) {
                        arrayList2.add((java.lang.String) it7.next());
                    }
                    m67437x4bd5310.B3(new wi5.c0(arrayList2, -1));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
