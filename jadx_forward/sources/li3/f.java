package li3;

/* loaded from: classes9.dex */
public class f extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.l0 f400311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ li3.g f400312e;

    public f(li3.g gVar, xg3.l0 l0Var) {
        this.f400312e = gVar;
        this.f400311d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.util.Map d17;
        xg3.l0 l0Var = this.f400311d;
        if ("gh_f0a92aa7146c".equals(l0Var.f535943a) && l0Var.f535945c.size() != 0) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_revert_payplugin_topmsg, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "revert payplugin topmsg abtest is open, return");
                return;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = l0Var.f535945c.iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (f9Var.A0() != 1 && f9Var.k2() && f9Var.a3() && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null)) != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.is_top_msg"), 0) == 1) {
                    java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.top_msg_content");
                    str = str2 != null ? str2 : "";
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        r45.i67 i67Var = new r45.i67();
                        i67Var.f458302d = java.lang.Long.toString(f9Var.I0());
                        i67Var.f458303e = str;
                        i67Var.f458304f = c01.id.a();
                        i67Var.f458305g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.top_msg_expiration_period_sec"), 0L) * 1000;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "get pay plugin topmsg, svrid is %s, content is %s", i67Var.f458302d, i67Var.f458303e);
                        linkedList.add(i67Var);
                    }
                }
            }
            if (linkedList.size() > 0) {
                this.f400312e.getClass();
                gm0.j1.i();
                java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, "");
                r45.j67 j67Var = new r45.j67();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        linkedList2.addFirst((r45.i67) it6.next());
                        if (linkedList2.size() > 5) {
                            linkedList2.removeLast();
                        }
                    }
                    j67Var.f459148d = "gh_f0a92aa7146c";
                    j67Var.f459149e = linkedList2;
                } else {
                    try {
                        j67Var.mo11468x92b714fd(str3.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxPaySevice", "parse cacheString exp, " + e17.getLocalizedMessage());
                    }
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        j67Var.f459149e.addFirst((r45.i67) it7.next());
                        if (j67Var.f459149e.size() > 5) {
                            j67Var.f459149e.removeLast();
                        }
                    }
                }
                try {
                    str = new java.lang.String(j67Var.mo14344x5f01b1f6(), com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPaySevice", "save dataString exp, " + e18.getLocalizedMessage());
                }
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, str);
            }
        }
    }
}
