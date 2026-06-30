package kk5;

/* loaded from: classes.dex */
public final class h0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f390178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void T6(java.util.List memberList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberList, "memberList");
        if (this.f390178d) {
            return;
        }
        boolean z17 = true;
        this.f390178d = true;
        boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMDirectCreateAssociateChatRoomSwitch", 0) == 1;
        if (!z18) {
            java.util.Iterator it = memberList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) it.next())) {
                    z17 = false;
                    break;
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (z18 || z17) {
            com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a l17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@chatroom").l("", memberList);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "createRoom(...)");
            h0Var.f391656d = l17;
        } else if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f()) {
            db5.e1.t(m158354x19263085(), m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3w), "", null);
            this.f390178d = false;
            return;
        } else {
            com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a l18 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@im.chatroom").l("", memberList);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l18, "createRoom(...)");
            h0Var.f391656d = l18;
        }
        ((com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a) h0Var.f391656d).f273781d = new kk5.d0(h0Var, this);
        ((com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a) h0Var.f391656d).c(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573921gb2), true, true, new kk5.e0(this, h0Var));
    }

    public final java.util.List U6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            arrayList.add(c01.a2.e(str));
        }
        return arrayList;
    }
}
