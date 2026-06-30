package ab5;

@j95.b
/* loaded from: classes9.dex */
public class a extends i95.w implements com.tencent.mm.plugin.appbrand.service.b5 {
    public void Ai(com.tencent.mm.storage.l4 l4Var, com.tencent.mm.storage.l4 l4Var2) {
        com.tencent.mm.storage.l4 l4Var3;
        com.tencent.mm.storage.f9 f9Var;
        java.util.Map d17;
        java.lang.String str = null;
        android.database.Cursor s17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(4, null, "appbrandcustomerservicemsg", -1);
        if (s17 != null) {
            if (s17.getCount() <= 0 || !s17.moveToFirst()) {
                l4Var3 = null;
            } else {
                l4Var3 = new com.tencent.mm.storage.l4();
                l4Var3.convertFrom(s17);
            }
            s17.close();
        } else {
            l4Var3 = null;
        }
        if (l4Var3 != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandConversationService", "The lastest app brand conversation username is %s", l4Var3.h1());
            f9Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(l4Var3.h1());
        } else if (l4Var != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandConversationService", "The lastest app brand conversation is null");
            f9Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(l4Var.h1());
        } else {
            f9Var = null;
        }
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandConversationService", "the last of msg is null'");
            l4Var2.f2();
            return;
        }
        l4Var2.h2(f9Var);
        l4Var2.l1(f9Var.Q0() + ":" + f9Var.j());
        l4Var2.S1(java.lang.Integer.toString(f9Var.getType()));
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().w() != null) {
            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            if (l4Var3 != null) {
                f9Var.u1(l4Var3.W0());
            } else if (l4Var != null) {
                f9Var.u1(l4Var.W0());
            }
            f9Var.d1(l4Var2.j());
            qm.a0.d(f9Var, pString, pString2, pInt, true);
            int type = f9Var.getType();
            java.lang.String j17 = f9Var.j();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(j17) && type == 49 && (d17 = com.tencent.mm.sdk.platformtools.aa.d(j17, "msg", null)) != null) {
                str = (java.lang.String) d17.get(".msg.appmsg.title");
            }
            java.lang.String str2 = pString.value;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (str == null) {
                    str = "";
                }
                str3 = " ".concat(str);
            }
            l4Var2.o1(str2.concat(str3));
            l4Var2.p1(pString2.value);
            l4Var2.K1(pInt.value);
        }
    }

    public void wi(com.tencent.mm.storage.l4 l4Var) {
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("appbrandcustomerservicemsg");
        if (p17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandConversationService", "appBrandSuperConv is created");
            p17.T1(null);
            Ai(l4Var, p17);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "appbrandcustomerservicemsg");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandConversationService", "create parentConv");
        com.tencent.mm.storage.l4 l4Var2 = new com.tencent.mm.storage.l4("appbrandcustomerservicemsg");
        l4Var2.f2();
        Ai(l4Var, l4Var2);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var2);
    }
}
