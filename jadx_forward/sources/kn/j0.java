package kn;

/* loaded from: classes13.dex */
public abstract class j0 {
    public static android.util.Pair a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar) {
        java.lang.String str;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "msginfo is null");
            return new android.util.Pair(java.lang.Boolean.FALSE, "");
        }
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "content is null");
            return new android.util.Pair(java.lang.Boolean.FALSE, "");
        }
        long mo78012x3fdd41df = f9Var.mo78012x3fdd41df();
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f429897t)) {
            str = "related_msgid_" + f9Var.I0();
        } else {
            str = aVar.f429897t;
        }
        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(f9Var.Q0(), str);
        if (z07 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "addTodoAppBrandImpl %s(%s) exist", str, java.lang.Integer.valueOf(z07.f66262x29d3a50c));
            if (z07.f66262x29d3a50c != 2) {
                return new android.util.Pair(java.lang.Boolean.TRUE, z07.f66264x1210aac6);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "addTodoAppBrandImpl delete %s", java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Bi().y0(z07)));
        }
        rn.c cVar = new rn.c();
        cVar.f66264x1210aac6 = str;
        cVar.f66259x137a1f8b = f9Var.Q0();
        cVar.f66266xdec927b = qVar.f430206j2;
        cVar.f66257x2260084a = qVar.f430202i2;
        cVar.f66251xad24a2e = mo78012x3fdd41df;
        cVar.f66265xa792337b = mo78012x3fdd41df;
        cVar.f66253x5aea0404 = "";
        java.lang.String n17 = qVar.n();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(qVar.f430206j2);
            if (Bi != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Bi.f68913x21f9b213)) {
                n17 = Bi.f68913x21f9b213;
            }
        }
        cVar.f66263x29dd02d3 = n17;
        cVar.f66252xb1e12de7 = bm5.d1.c(f9Var);
        cVar.f66254xa65bbd68 = c01.z1.r();
        cVar.f66256x7fe5621 = 0;
        cVar.f66258x2e3d1810 = f9Var.I0() + "";
        cVar.f66260xf16ddfa5 = qVar.f430226o2;
        cVar.f66261x3c4f6205 = f9Var.Q0();
        boolean mo880xb970c2b9 = ((nn.j) i95.n0.c(nn.j.class)).Bi().mo880xb970c2b9(cVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "addTodoBySendSuccess todoId:%s result:%s", cVar.f66264x1210aac6, java.lang.Boolean.valueOf(mo880xb970c2b9));
        if (mo880xb970c2b9) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(f9Var.Q0(), f9Var.I0());
            o27.s3(cVar.f66264x1210aac6);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.m124847x74d37ac6(), o27, true);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe();
            am.ql qlVar = c5759x7ac701fe.f136078g;
            qlVar.f89248a = 0;
            qlVar.f89250c = cVar.f66264x1210aac6;
            qlVar.f89249b = f9Var.Q0();
            c5759x7ac701fe.b(android.os.Looper.getMainLooper());
        }
        return new android.util.Pair(java.lang.Boolean.valueOf(mo880xb970c2b9), cVar.f66264x1210aac6);
    }

    public static r45.vt5 b(rn.c cVar) {
        r45.vt5 vt5Var = new r45.vt5();
        vt5Var.f470056d = cVar.f66264x1210aac6;
        vt5Var.f470057e = cVar.f66266xdec927b;
        vt5Var.f470058f = cVar.f66257x2260084a;
        vt5Var.f470059g = (int) (cVar.f66251xad24a2e / 1000);
        vt5Var.f470061i = cVar.f66263x29dd02d3;
        vt5Var.f470062m = cVar.f66252xb1e12de7;
        vt5Var.f470063n = cVar.u0();
        vt5Var.f470064o = cVar.f66254xa65bbd68;
        vt5Var.f470060h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(cVar.f66253x5aea0404);
        vt5Var.f470065p = cVar.f66260xf16ddfa5;
        vt5Var.f470066q = cVar.f66261x3c4f6205;
        return vt5Var;
    }

    public static java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        if (f9Var.y2()) {
            return "roomannouncement@app.origin";
        }
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "getAppUsernameFromMsginfo content is null");
            return "";
        }
        if (((ot0.a) v17.y(ot0.a.class)) != null) {
            return v17.f430206j2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "getAppUsernameFromMsginfo appContentAppBrandPiece is null");
        return "";
    }

    public static void d(android.content.Context context, java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "gotoRoomCard roomname is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("RoomInfo_Id", str);
        intent.putExtra("room_notice", c01.v1.d(str));
        intent.putExtra("room_notice_xml", c01.v1.g(str));
        intent.putExtra("room_notice_publish_time", c01.v1.f(str));
        intent.putExtra("room_notice_editor", c01.v1.e(str));
        intent.putExtra("from_scene", z17 ? 4 : 3);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 != null) {
            intent.putExtra("Is_RoomOwner", z07.f69107x5be1edb3.equals(c01.z1.r()));
            intent.putExtra("Is_RoomManager", z07.G0(c01.z1.r()));
        }
        intent.putExtra("room_member_count", z07.f69098xbcb1bed0);
        if (z17) {
            intent.setFlags(268435456);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.x) ((d81.e) i95.n0.c(d81.e.class))).Di(context, intent);
    }

    public static boolean e(rn.c cVar) {
        return (cVar == null || cVar.f66262x29d3a50c == 2) ? false : true;
    }

    public static java.lang.String f(r45.vt5 vt5Var) {
        if (vt5Var == null) {
            return "";
        }
        return "RoomToolsTodo{TodoId='" + vt5Var.f470056d + "', Username='" + vt5Var.f470057e + "', Path='" + vt5Var.f470058f + "', Time=" + vt5Var.f470059g + ", CustomInfo=" + vt5Var.f470060h + ", Title='" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(vt5Var.f470061i) + "', Creator='" + vt5Var.f470062m + "', RelatedMsgId=" + vt5Var.f470063n + ", Manager='" + vt5Var.f470064o + "'}";
    }

    public static android.util.Pair g(long j17, java.lang.String str) {
        boolean mo11261xce0038c9;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Li.X1())) {
            return new android.util.Pair(java.lang.Boolean.FALSE, "");
        }
        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(Li.Q0(), Li.X1());
        if (z07 == null) {
            return new android.util.Pair(java.lang.Boolean.FALSE, Li.X1());
        }
        long I0 = Li.I0();
        java.util.ArrayList arrayList = (java.util.ArrayList) z07.S;
        if (arrayList.contains(java.lang.Long.valueOf(I0))) {
            arrayList.remove(java.lang.Long.valueOf(I0));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb6.append(((java.lang.Long) it.next()).longValue());
                sb6.append(",");
            }
            if (sb6.length() - 1 >= 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            z07.f66258x2e3d1810 = sb6.toString();
        }
        if (arrayList.size() == 0) {
            mo11261xce0038c9 = ((nn.j) i95.n0.c(nn.j.class)).Bi().y0(z07);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe();
            am.ql qlVar = c5759x7ac701fe.f136078g;
            qlVar.f89248a = 1;
            qlVar.f89249b = z07.f66259x137a1f8b;
            qlVar.f89250c = z07.f66264x1210aac6;
            if (mo11261xce0038c9) {
                c5759x7ac701fe.b(android.os.Looper.getMainLooper());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByRevokeMsg delete result:%s", java.lang.Boolean.valueOf(mo11261xce0038c9));
        } else {
            rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
            Bi.getClass();
            mo11261xce0038c9 = Bi.mo11261xce0038c9(z07.f72763xa3c65b86, z07);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByRevokeMsg updateGroupTodo result:%s", java.lang.Boolean.valueOf(mo11261xce0038c9));
        }
        if (mo11261xce0038c9) {
            Li.s3("");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
        }
        return new android.util.Pair(java.lang.Boolean.TRUE, Li.X1());
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, int i18, int i19, kn.i0 i0Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        if (z17) {
            k0Var.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aym), 17, i65.a.b(context, 14), null);
        } else {
            k0Var.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayl), 17, i65.a.b(context, 14), null);
        }
        k0Var.Z1 = true;
        k0Var.f293405n = new kn.f0(z17, context);
        k0Var.f293414s = new kn.g0(i0Var, z17, i17, str, i18, i19, str2, str3);
        k0Var.f293387d = new kn.h0(i17, str, i18, z17, i19, str2, str3);
        k0Var.v();
    }

    public static boolean i(rn.c cVar) {
        cVar.f66262x29d3a50c = 2;
        cVar.f66265xa792337b = c01.id.c();
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        Bi.getClass();
        return Bi.mo11261xce0038c9(cVar.f72763xa3c65b86, cVar);
    }

    public static boolean j(rn.c cVar) {
        cVar.f66262x29d3a50c = 1;
        cVar.f66265xa792337b = c01.id.c();
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        Bi.getClass();
        return Bi.mo11261xce0038c9(cVar.f72763xa3c65b86, cVar);
    }
}
