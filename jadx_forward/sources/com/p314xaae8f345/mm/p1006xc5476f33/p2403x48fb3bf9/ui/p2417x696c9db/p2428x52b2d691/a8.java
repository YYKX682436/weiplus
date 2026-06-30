package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class a8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.a8 f267479d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.a8();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderTemplateSetView", "openFinderTemplateSetView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19449x6546e031 c19449x6546e031 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19449x6546e031();
        java.lang.Object obj2 = msg.f422323a.get("templateTopicId");
        java.lang.String str3 = "0";
        if (obj2 == null || (str = obj2.toString()) == null) {
            str = "0";
        }
        c19449x6546e031.f267434d = pm0.v.Z(str);
        java.lang.Object obj3 = msg.f422323a.get("finderEntryScene");
        if (obj3 == null || (str2 = obj3.toString()) == null) {
            str2 = "0";
        }
        c19449x6546e031.f267436f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, 0);
        java.lang.Object obj4 = msg.f422323a.get("templateEnterScene");
        if (obj4 != null && (obj = obj4.toString()) != null) {
            str3 = obj;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0);
        c19449x6546e031.f267435e = P;
        if (P != 0) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c19449x6546e031, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x7.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z7(env, msg));
            return true;
        }
        env.f422396d.e(msg.f422546c, msg.f422552i + ":no templateEnterScene", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.l.f34861x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderTemplateSetView";
    }
}
