package gk5;

/* loaded from: classes9.dex */
public final class m1 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void T6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wwAppType) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wwAppType, "wwAppType");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (f9Var != null) {
            linkedList.add(f9Var);
            str = f9Var.Q0();
        } else {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SendToWeWorkUIC", "doForwardToWeWorkInChattingScene: selectItems is empty");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).q(str);
        if (q17 == null) {
            q17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).q(en1.a.a());
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.t(m80379x76847179(), q17, linkedList, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str), wwAppType, 1);
    }

    public final void U6(java.lang.String str, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wwAppType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wwAppType, "wwAppType");
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SendToWeWorkUIC", "doForwardToWeWork: msgContent is Null");
            return;
        }
        r45.w43 w43Var = new r45.w43();
        w43Var.f470405d = java.lang.String.valueOf(c01.id.c());
        w43Var.f470406e = 49;
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
        byte[] bytes = str.getBytes(forName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        w43Var.f470407f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(w43Var);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((cj5.o) pf5.z.f435481a.a(activity).a(cj5.o.class)).T6();
        ((dk5.s5) tg3.t1.a()).wi(m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.c(wwAppType), arrayList, new gk5.l1(this));
    }

    public final void V6(java.util.List list, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wwAppType, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wwAppType, "wwAppType");
        if (list == null || list.isEmpty()) {
            return;
        }
        java.lang.String Q0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(0)).Q0();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(Q0);
        if (q17 == null) {
            q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(en1.a.a());
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.t(m80379x76847179(), q17, list, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0), wwAppType, i17);
    }

    public final void W6(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.r(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ifb), com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b));
    }
}
