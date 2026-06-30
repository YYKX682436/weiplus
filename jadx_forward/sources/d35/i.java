package d35;

/* loaded from: classes12.dex */
public final class i implements sm0.e {

    /* renamed from: a, reason: collision with root package name */
    public static final d35.i f307880a = new d35.i();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f307881b = false;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f307882c = "";

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10>(a0Var) { // from class: com.tencent.mm.pluginsdk.model.file.FileSmartServerMgr$logoutListener$1
            {
                this.f39173x3fe91575 = 276997888;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 event = c5691xc916fb10;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSmartServerMgr", "LogoutEvent " + event.f136017g.f88369a);
                d35.i iVar = d35.i.f307880a;
                com.p314xaae8f345.mm.p814xbdd5bcd6.C10815xe2d7656b.m46376xc3f1610a();
                jz5.f0 f0Var = jz5.f0.f384359a;
                d35.i.f307881b = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSmartServerMgr", "stop result:" + f0Var);
                return false;
            }
        }.mo48813x58998cd();
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        if (!f307881b) {
            return "";
        }
        return "/lan_" + msgInfo.Q0() + '_' + gm0.m.g() + '_' + msgInfo.m124847x74d37ac6() + '_' + msgInfo.mo78012x3fdd41df();
    }

    public final long b() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_file_lan_send_idle_timeout_ms, 60000L);
    }

    public final java.lang.String c(java.lang.String cgi, java.lang.String aesKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        return f307882c + cgi + ';' + aesKey;
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        jz5.f0 f0Var;
        if (f9Var != null) {
            java.lang.String a17 = f307880a.a(f9Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSmartServerMgr", "removeFileInfo cgi:" + a17 + ' ' + com.p314xaae8f345.mm.p814xbdd5bcd6.C10815xe2d7656b.m46374x751a48ee(a17));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSmartServerMgr", "removeFileInfo msgInfo is null");
        }
    }

    public final void e() {
        java.lang.Object[] m46375x992d28aa;
        java.lang.String string;
        if (f307881b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSmartServerMgr", "start no");
            return;
        }
        f307881b = false;
        sm0.f.f490846a = this;
        m46375x992d28aa = com.p314xaae8f345.mm.p814xbdd5bcd6.C10815xe2d7656b.m46375x992d28aa();
        jz5.f0 f0Var = null;
        if (m46375x992d28aa != null) {
            java.lang.Object obj = m46375x992d28aa[0];
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            boolean z17 = num != null && num.intValue() > 0;
            f307881b = z17;
            if (z17) {
                try {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cf_, m46375x992d28aa[1].toString(), m46375x992d28aa[2].toString());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSmartServerMgr", "start " + e17.getClass().getSimpleName() + ' ' + e17.getMessage());
                }
            } else {
                string = "";
            }
            f307882c = string;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSmartServerMgr", "start startServer:" + f307881b + " serverUrl:" + f307882c);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSmartServerMgr", "start result is null");
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1680L, f307881b ? 0L : 1L, 1L, false);
    }
}
