package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

/* loaded from: classes8.dex */
public final class m0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.m0 f267727d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.m0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.d dVar2;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = ((java.util.HashMap) msg.f422323a).get("functionType");
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.d.f267704e.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.d[] m74639xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.d.m74639xcee59d22();
        int length = m74639xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                dVar = null;
                break;
            }
            dVar = m74639xcee59d22[i17];
            if (dVar.f267706d == D1) {
                break;
            }
            i17++;
        }
        java.util.Objects.toString(dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.d[] m74639xcee59d222 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.d.m74639xcee59d22();
        int length2 = m74639xcee59d222.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length2) {
                dVar2 = null;
                break;
            }
            dVar2 = m74639xcee59d222[i18];
            if (dVar2.f267706d == D1) {
                break;
            }
            i18++;
        }
        int i19 = dVar2 == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.d0.f267707a[dVar2.ordinal()];
        nw4.g gVar = env.f422396d;
        switch (i19) {
            case 1:
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.u.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.h0(env, msg));
                return true;
            case 2:
                java.util.HashMap hashMap = (java.util.HashMap) msg.f422323a;
                java.lang.Object obj2 = hashMap.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (e(str2, env, msg)) {
                    java.lang.Object obj3 = hashMap.get("selfUsername");
                    java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                    java.lang.Object obj4 = hashMap.get("talker");
                    str = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    if (f(str3, env, msg) && f(str, env, msg)) {
                        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str4, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19463xcf89124a(str2, str3, str), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.p.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.e0(env, msg));
                    }
                }
                return true;
            case 3:
                java.lang.Object obj5 = ((java.util.HashMap) msg.f422323a).get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
                str = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                if (e(str, env, msg)) {
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str5, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.q.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.f0(env, msg));
                }
                return true;
            case 4:
                java.util.HashMap hashMap2 = (java.util.HashMap) msg.f422323a;
                java.lang.Object obj6 = hashMap2.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
                java.lang.String str6 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                java.lang.Object obj7 = hashMap2.get("messageId");
                long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null);
                if (E1 < 0) {
                    gVar.e(msg.f422546c, "gamelifeManager fail: messageid < 0", null);
                }
                java.lang.Object obj8 = hashMap2.get("limit");
                int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null, 0);
                java.lang.Object obj9 = hashMap2.get("isNeedFromLast");
                boolean y17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null, true);
                if (e(str6, env, msg)) {
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str7, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19472xab34edd1(str6, E1, D12, y17), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.y.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.j0(env, msg));
                }
                return true;
            case 5:
                java.util.HashMap hashMap3 = (java.util.HashMap) msg.f422323a;
                java.lang.Object obj10 = hashMap3.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
                java.lang.String str8 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                java.lang.Object obj11 = hashMap3.get("content");
                java.lang.String str9 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                java.lang.Object obj12 = hashMap3.get("selfUsername");
                java.lang.String str10 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                java.lang.Object obj13 = hashMap3.get("talker");
                java.lang.String str11 = obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null;
                java.lang.Object obj14 = hashMap3.get("messageType");
                int D13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj14 instanceof java.lang.String ? (java.lang.String) obj14 : null, 0);
                if (e(str8, env, msg)) {
                    if (str9 != null) {
                        if (str9.length() == 0) {
                            gVar.e(msg.f422546c, "gamelifeManager: fail content empty", null);
                        }
                    }
                    if (f(str10, env, msg) && f(str11, env, msg)) {
                        java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str8);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str9);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str10);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str11);
                        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str12, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19474xddf4a19f(str8, str9, str10, str11, D13), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.c0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.l0(env, msg));
                    }
                }
                return true;
            case 6:
                java.util.HashMap hashMap4 = (java.util.HashMap) msg.f422323a;
                java.lang.Object obj15 = hashMap4.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
                java.lang.String str13 = obj15 instanceof java.lang.String ? (java.lang.String) obj15 : null;
                if (e(str13, env, msg)) {
                    java.lang.Object obj16 = hashMap4.get("messageList");
                    java.lang.String str14 = obj16 instanceof java.lang.String ? (java.lang.String) obj16 : null;
                    if (str14 != null) {
                        if (str14.length() == 0) {
                            gVar.e(msg.f422546c, "gamelifeManager fail :empty messageList", null);
                        }
                    }
                    java.lang.Object obj17 = hashMap4.get("deleteAll");
                    boolean y18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(obj17 instanceof java.lang.String ? (java.lang.String) obj17 : null, false);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str13);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str14);
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str15, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19464x952eaadc(str13, str14, y18), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.s.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.g0(env, msg));
                    gVar.e(msg.f422546c, "gamelifeManager: ok", null);
                }
                return true;
            case 7:
                java.lang.Object obj18 = ((java.util.HashMap) msg.f422323a).get("userNameList");
                java.lang.String str16 = obj18 instanceof java.lang.String ? (java.lang.String) obj18 : null;
                if (str16 == null || str16.length() == 0) {
                    gVar.e(msg.f422546c, "gamelifeManager: fail: empty username", null);
                }
                java.lang.String str17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str16);
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str17, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str16), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.x.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.i0(env, msg));
                return true;
            case 8:
                java.util.HashMap hashMap5 = (java.util.HashMap) msg.f422323a;
                java.lang.Object obj19 = hashMap5.get("selfUsername");
                java.lang.String str18 = obj19 instanceof java.lang.String ? (java.lang.String) obj19 : null;
                java.lang.Object obj20 = hashMap5.get("talker");
                java.lang.String str19 = obj20 instanceof java.lang.String ? (java.lang.String) obj20 : null;
                java.lang.Object obj21 = hashMap5.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                int D14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj21 instanceof java.lang.String ? (java.lang.String) obj21 : null, 0);
                if (f(str18, env, msg) && f(str19, env, msg)) {
                    java.lang.String str20 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str19);
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str20, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19473xf021f121(str18, str19, D14), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.a0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.k0(env, msg));
                } else {
                    gVar.e(msg.f422546c, "gamelifeManager:fail getSessionId ,wrong username", null);
                }
                return true;
            default:
                gVar.e(msg.f422546c, " gamelifeManagerfail:wrongmsgType", null);
                return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 452;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u5.f34899x24728b;
    }

    public final boolean e(java.lang.String str, nw4.k env, nw4.y2 msg) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        nw4.g gVar = env.f422396d;
        if (str == null) {
            gVar.e(msg.f422546c, "gamelifeManager fail: null sessionId", null);
            return false;
        }
        if (str.length() == 0) {
            gVar.e(msg.f422546c, "gamelifeManager fail: empty sessionId", null);
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(str)) {
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", "check sessionId failed");
            z17 = false;
        }
        if (z17) {
            return true;
        }
        gVar.e(msg.f422546c, "gamelifeManager fail: invaild sessionId", null);
        return false;
    }

    public final boolean f(java.lang.String str, nw4.k env, nw4.y2 msg) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        nw4.g gVar = env.f422396d;
        if (str == null) {
            gVar.e(msg.f422546c, "gamelifeManager fail: null username", null);
            return false;
        }
        if (str.length() == 0) {
            gVar.e(msg.f422546c, "gamelifeManager fail: empty username ", null);
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.Z3(str)) {
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", "check username failed");
            z17 = false;
        }
        if (z17) {
            return true;
        }
        gVar.e(msg.f422546c, "gamelifeManager fail: wrong username", null);
        return false;
    }
}
