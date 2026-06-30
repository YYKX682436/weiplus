package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class pb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.pb f267970d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.pb();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get("addrs");
        nw4.g gVar = env.f422396d;
        if (obj == null) {
            gVar.e(msg.f422546c, "sameNetVerify:fail addrs is null or empty", null);
            return true;
        }
        java.lang.String obj2 = obj.toString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            cl0.e eVar = new cl0.e(obj2);
            int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
            for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                if (eVar.mo15054x2fec8307(i17) != null) {
                    arrayList.add(eVar.mo15054x2fec8307(i17));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SameNetVerifyTAG", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SameNetVerifyTAG", "addrs:" + arrayList);
        if (arrayList.isEmpty()) {
            gVar.e(msg.f422546c, "sameNetVerify:fail addrs is null or empty", null);
            return true;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3160xc37fbad4.b.f299019b.b(arrayList, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ob(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 551;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "sameNetVerify";
    }
}
