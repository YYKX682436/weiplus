package er3;

/* loaded from: classes5.dex */
public class g extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f337565l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f337566m;

    /* renamed from: n, reason: collision with root package name */
    public int f337567n;

    public g(java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(map, f9Var);
        this.f337565l = null;
        this.f337566m = null;
        this.f337567n = 0;
    }

    @Override // d21.c
    public boolean b() {
        java.lang.String str;
        cl0.g gVar;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        cl0.g gVar2;
        java.lang.String str4;
        java.lang.String str5;
        boolean z18;
        java.util.Map map = this.f307318a;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "[parseXml] values == null ");
            return false;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str6 = this.f307321d;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        str = "";
        if (str6 == null) {
            str6 = "";
        }
        objArr[0] = str6;
        objArr[1] = java.lang.Integer.valueOf(map.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f307321d) || !this.f307321d.equalsIgnoreCase("NewXmlOpenIMFriReqAcceptedInWxWork")) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.String str7 = this.f307321d;
            objArr2[0] = str7 != null ? str7 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "[parseXml] type err :%s", objArr2);
            return false;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.username")) {
            java.lang.String str8 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.username");
            if (str8 == null) {
                str8 = "";
            }
            this.f337565l = str8;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.climsgid")) {
            java.lang.String str9 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.climsgid");
            if (str9 == null) {
                str9 = "";
            }
            this.f337566m = str9;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.climsgid")) {
            this.f337567n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.NewXmlOpenIMFriReqAcceptedInWxWork.status"), 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "username:%s climsgid:%s status:%s", this.f337565l, this.f337566m, java.lang.Integer.valueOf(this.f337567n));
        java.lang.String str10 = this.f337566m;
        int i17 = this.f337567n;
        gm0.j1.i();
        java.lang.String str11 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADD_CONTACT_BY_WEWORK_STRING_SYNC, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactByWework() climsgid:%s state:%s ", str10, java.lang.Integer.valueOf(i17));
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11)) {
                gVar2 = new cl0.g();
                str4 = "" + i17;
                str5 = str10;
            } else {
                cl0.g gVar3 = new cl0.g(str11);
                str5 = gVar3.mo15082x48bce8a4("svrids");
                java.lang.String mo15082x48bce8a4 = gVar3.mo15082x48bce8a4("states");
                java.lang.String[] split = str5.split(",");
                java.lang.String[] split2 = mo15082x48bce8a4.split(",");
                if (split != null && split2 != null) {
                    for (int i18 = 0; i18 < split.length; i18++) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str10, split[i18])) {
                            split2[i18] = "" + i17;
                            z18 = true;
                            break;
                        }
                    }
                }
                z18 = false;
                gVar2 = new cl0.g();
                if (z18) {
                    java.lang.String str12 = "";
                    for (java.lang.String str13 : split2) {
                        str12 = str12 + str13 + ",";
                    }
                    str4 = str12.substring(0, str12.length() - 1);
                } else {
                    str5 = str5 + "," + str10;
                    str4 = mo15082x48bce8a4 + "," + i17;
                }
            }
            gVar2.h("svrids", str5);
            gVar2.h("states", str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactByWework() result:%s", str10, java.lang.Integer.valueOf(i17), gVar2.toString());
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADD_CONTACT_BY_WEWORK_STRING_SYNC, gVar2.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactByWework() Exception:%s", e17.getMessage());
        }
        java.lang.String str14 = this.f337565l;
        int i19 = this.f337567n;
        gm0.j1.i();
        java.lang.String str15 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADD_CONTACT_BY_WEWORK_USERNAME_STRING_SYNC, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactUsernameByWework() username:%s state:%s ", str14, java.lang.Integer.valueOf(i19));
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str15)) {
                gVar = new cl0.g();
                str2 = "" + i19;
                str3 = str14;
            } else {
                cl0.g gVar4 = new cl0.g(str15);
                str3 = gVar4.mo15082x48bce8a4("usernames");
                java.lang.String mo15082x48bce8a42 = gVar4.mo15082x48bce8a4("states");
                java.lang.String[] split3 = str3.split(",");
                java.lang.String[] split4 = mo15082x48bce8a42.split(",");
                if (split3 != null && split4 != null) {
                    for (int i27 = 0; i27 < split3.length; i27++) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str14, split3[i27])) {
                            split4[i27] = "" + i19;
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                gVar = new cl0.g();
                if (z17) {
                    for (java.lang.String str16 : split4) {
                        str = str + str16 + ",";
                    }
                    str2 = str.substring(0, str.length() - 1);
                } else {
                    str3 = str3 + "," + str14;
                    str2 = mo15082x48bce8a42 + "," + i19;
                }
            }
            gVar.h("usernames", str3);
            gVar.h("states", str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactUsernameByWework() result:%s", str14, java.lang.Integer.valueOf(i19), gVar.toString());
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADD_CONTACT_BY_WEWORK_USERNAME_STRING_SYNC, gVar.toString());
            if (!(i19 == 2)) {
                if (!(i19 == 3)) {
                    return true;
                }
            }
            r21.w.wi().k1(str14, 1);
            return true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "dealAddContactUsernameByWework() Exception:%s", e18.getMessage());
            return true;
        }
    }

    public g(java.util.Map map) {
        super(map);
        this.f337565l = null;
        this.f337566m = null;
        this.f337567n = 0;
    }
}
