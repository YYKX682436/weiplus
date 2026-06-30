package t41;

/* loaded from: classes11.dex */
public abstract class c {
    public static java.lang.CharSequence a(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.CharSequence charSequence) {
        java.lang.String a17 = t41.g.a(z3Var);
        if (a17 == null) {
            return charSequence;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) a17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0j)), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static java.lang.CharSequence b(java.lang.String str, java.lang.CharSequence charSequence) {
        if (str == null) {
            return charSequence;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0j)), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static void c(r45.uz4 uz4Var, int i17, int i18) {
        if (!uz4Var.f469289d.toLowerCase().endsWith("@im.chatroom")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenIMChatRoomContactLogic", "updateChatroom: bad room:[" + uz4Var.f469289d + "]");
            return;
        }
        java.lang.String str = uz4Var.f469289d;
        mo.a aVar = new mo.a();
        aVar.f411776h = uz4Var.f469291f.f470262q;
        int i19 = uz4Var.f469292g;
        aVar.f411779n = i19;
        if (i19 != 0) {
            aVar.f411778m = i19;
        }
        am.vk vkVar = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5732x9b42e3d5().f136057g;
        vkVar.f89732a = str;
        vkVar.f89733b = aVar.f411778m;
        r45.vy vyVar = new r45.vy();
        r45.wz4 wz4Var = uz4Var.f469293h;
        vyVar.f470190d = wz4Var == null ? 0 : wz4Var.f471134d.size();
        vyVar.f470193g = x51.j1.i(uz4Var.f469289d);
        r45.wz4 wz4Var2 = uz4Var.f469293h;
        vyVar.f470192f = wz4Var2.f471135e;
        vyVar.f470191e = t41.f.a(wz4Var2.f471134d);
        rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
        java.lang.String str2 = uz4Var.f469291f.f470252d;
        java.lang.String r17 = c01.z1.r();
        ((c01.w1) eVar).getClass();
        c01.v1.N(str, str2, vyVar, 0, -1, -1, r17, aVar, false, true, 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(uz4Var.f469289d);
        if (z07 == null) {
            z07 = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
            z07.f69088x37548063 = uz4Var.f469289d;
        }
        if (i17 != -1) {
            z07.f69101xc0ad1363 = i17;
        }
        if (i18 != -1) {
            z07.f69085xe414bfe0 = i18;
        }
        z07.F0().f411774f = uz4Var.f469291f.f470263r;
        try {
            z07.f69105x137594aa = z07.F0().mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomMember", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        java.lang.String str3 = uz4Var.f469289d;
        r45.vz4 vz4Var = uz4Var.f469291f;
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vz4Var.f470254f)) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = Ni.n0(str3);
            if (n07 == null) {
                n07 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                n07.f152062a = str3;
            }
            java.lang.String str4 = vz4Var.f470253e;
            n07.f152066e = str4;
            n07.f152065d = vz4Var.f470254f;
            n07.f152063b = 3;
            n07.f152067f = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) ? 1 : 0;
            Ni.y0(n07);
            if (vz4Var.f470255g == 2 && !c01.z1.r().equals(str3)) {
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(str3, false);
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(str3, true);
                com.p314xaae8f345.mm.p943x351df9c2.d1.wi().i(str3);
            }
        }
        z07.f69107x5be1edb3 = vz4Var.f470252d;
        if (z07.f69092x65ba57ac <= vz4Var.f470261p) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vz4Var.f470259n)) {
                z07.f69083xf6ef0cb0 = 0;
            }
            z07.f69090xb4fe86b0 = vz4Var.f470259n;
            z07.f69091xdb3bd03d = vz4Var.f470260o;
            z07.f69092x65ba57ac = vz4Var.f470261p;
        }
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(z07);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(uz4Var.f469289d, true);
        int m124896xfb85f7b0 = n17.m124896xfb85f7b0();
        n17.P1(uz4Var.f469297o);
        if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5.f470256h)) & (uz4Var.f469291f != null)) {
            n17.M1(uz4Var.f469291f.f470256h);
        }
        n17.X1(uz4Var.f469289d);
        n17.M2(uz4Var.f469298p);
        n17.mo43621x7650bebc(uz4Var.f469296n & uz4Var.f469295m);
        n17.M2(uz4Var.f469298p);
        n17.J2(uz4Var.f469294i);
        n17.F2(uz4Var.f469291f.f470264s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMChatRoomContactLogic", "updateChatroom done %s, chatroom_business_type:%s ", n17.d1(), java.lang.Long.valueOf(uz4Var.f469291f.f470264s));
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
        if ((n17.m124896xfb85f7b0() & 2048) != 0) {
            if ((m124896xfb85f7b0 & 2048) != (n17.m124896xfb85f7b0() & 2048)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(n17.d1());
            }
        } else if ((m124896xfb85f7b0 & 2048) != (n17.m124896xfb85f7b0() & 2048)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(n17.d1());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uz4Var.f469297o)) {
            return;
        }
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).wi(uz4Var.f469297o, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), "", 0);
    }
}
