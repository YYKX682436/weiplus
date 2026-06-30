package ak5;

/* loaded from: classes9.dex */
public final class q {
    public q(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(com.tencent.mm.storage.f9 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
        com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        ((com.tencent.mm.app.u7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().w()).getClass();
        qm.a0.d(msg, pString, pString2, pInt, false);
        java.lang.String str2 = pString.value;
        if (msg.A0() == 0 && com.tencent.mm.storage.z3.R4(msg.Q0())) {
            try {
                int t17 = c01.w9.t(str2);
                if (t17 != -1) {
                    kotlin.jvm.internal.o.d(str2);
                    java.lang.String substring = str2.substring(t17 + 1);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    str2 = r26.n0.u0(substring).toString();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("TopMsg.NetSceneChatRoomTopMsg", th6, "getDigest err", new java.lang.Object[0]);
                str2 = qm.a0.l(msg.A0(), msg.y0(), msg.j(), msg.getType(), com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
        }
        if (msg.getType() == 48) {
            java.lang.String str3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).H6(msg.j()).f193780f;
            if (str3 == null) {
                str3 = "";
            }
            if (!r26.n0.N(str3)) {
                str2 = str2 + ' ' + str3;
            }
        } else if (msg.getType() == 47 || msg.getType() == 1048625) {
            kotlin.jvm.internal.o.d(str2);
            java.lang.String substring2 = str2.substring(r26.n0.L(str2, ":", 0, false, 6, null) + 1);
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            java.lang.String c17 = gg5.b.f271788a.c(substring2);
            if (c17 == null || r26.n0.N(c17)) {
                str2 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490382tf);
            } else {
                str2 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490382tf) + ' ' + c17;
            }
        }
        if (msg.getType() == 42 || msg.getType() == 66) {
            com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(msg.j());
            java.lang.String str4 = D3.f196358a;
            java.lang.String str5 = D3.f196359b;
            int i17 = D3.f196374q;
            java.util.Set set = c01.e2.f37117a;
            com.tencent.mm.storage.z3.D3(i17);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str4);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                str5 = e17;
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(com.tencent.mm.ui.transmit.SelectConversationUI.J7(com.tencent.mm.sdk.platformtools.x2.f193071a, str4, msg.j()));
            stringBuffer.append(str5);
            str2 = stringBuffer.toString();
            kotlin.jvm.internal.o.d(str2);
        } else if (msg.getType() == 939524145) {
            kotlin.jvm.internal.o.d(str2);
            java.lang.String j17 = msg.j();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            c53.a aVar = (c53.a) ot0.q.v(j17).y(c53.a.class);
            if (aVar != null) {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490449vd) + aVar.f38645c;
                str2 = str;
            }
        } else if (msg.getType() == 771751985) {
            kotlin.jvm.internal.o.d(str2);
            java.lang.String j18 = msg.j();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            zy2.h hVar = (zy2.h) ot0.q.v(j18).y(zy2.h.class);
            if (hVar != null) {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490438v1) + hVar.f477394e;
                str2 = str;
            }
        }
        return str2 == null ? "" : str2;
    }
}
