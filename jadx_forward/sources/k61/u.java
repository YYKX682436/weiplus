package k61;

/* loaded from: classes9.dex */
public class u implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.w f386050a;

    public u(k61.w wVar) {
        this.f386050a = wVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String replace;
        nm5.c cVar = (nm5.c) obj;
        k61.p pVar = this.f386050a.f386052a;
        java.lang.String str = (java.lang.String) cVar.a(0);
        boolean z17 = true;
        java.lang.String str2 = (java.lang.String) cVar.a(1);
        java.lang.String str3 = (java.lang.String) cVar.a(2);
        java.lang.String b17 = pVar.f336757n.b("chatroom");
        java.lang.String b18 = pVar.f336757n.b("bill_no");
        synchronized (h61.o.class) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                j61.a y07 = e61.e.Bi().y0(str);
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = str2;
                objArr[1] = b17;
                objArr[2] = str;
                objArr[3] = y07;
                if (y07 == null || !y07.f65822x83b3e923) {
                    z17 = false;
                }
                objArr[4] = java.lang.Boolean.valueOf(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAUtil", "insertPayMsgAfterPaySucc, launcherUsername: %s, chatroom: %s, payMsgId: %s, record: %s, insertmsg: %s", objArr);
                if (y07 == null || !y07.f65822x83b3e923) {
                    java.lang.String str4 = "weixin://weixinnewaa/opendetail?billno=" + b18 + "&launcherusername=" + str2;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAUtil", "empty msgxml, insert local msgcontent");
                        java.lang.String str5 = com.p314xaae8f345.mm.ui.bk.C() ? "#7D90A9" : "#576B95";
                        if (str2.equals(c01.z1.r())) {
                            replace = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgf, str4, str5);
                        } else {
                            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                            replace = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgg, c01.a2.f(str2, b17), str5, str4);
                        }
                    } else {
                        replace = str3.replace("\"#037AFF\"", "\"" + (com.p314xaae8f345.mm.ui.bk.C() ? "#7D90A9" : "#576B95") + "\"");
                    }
                    h61.o.n(replace, b17, y07, str, false);
                }
            }
        }
        return null;
    }
}
