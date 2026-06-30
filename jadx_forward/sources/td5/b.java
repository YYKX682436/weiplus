package td5;

/* loaded from: classes5.dex */
public class b extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public int f499293l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f499294m;

    /* renamed from: n, reason: collision with root package name */
    public long f499295n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f499296o;

    public b(java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(map, f9Var);
        this.f499295n = 0L;
    }

    @Override // d21.c
    public boolean b() {
        int i17 = 0;
        if (this.f307318a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InvokeMessageNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f307319b;
        if (f9Var == null || !f9Var.P2()) {
            if (this.f307318a.containsKey(".sysmsg.invokeMessage.preContent")) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f307319b;
                if (f9Var2 == null || f9Var2.mo78013xfb85f7b0() == 10002) {
                    this.f499294m = (java.lang.String) this.f307318a.get(".sysmsg.invokeMessage.preContent");
                } else {
                    this.f499294m = this.f307319b.j();
                }
            }
            if (this.f307318a.containsKey(".sysmsg.invokeMessage.msgSource")) {
                this.f499296o = (java.lang.String) this.f307318a.get(".sysmsg.invokeMessage.msgSource");
            }
            if (this.f307318a.containsKey(".sysmsg.invokeMessage.timestamp")) {
                this.f499295n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) this.f307318a.get(".sysmsg.invokeMessage.timestamp"));
            }
            if (this.f307318a.containsKey(".sysmsg.invokeMessage.type")) {
                this.f499293l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) this.f307318a.get(".sysmsg.invokeMessage.type"), 0);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i18 = 0;
            for (java.lang.String str : this.f307318a.keySet()) {
                if (str.startsWith(".sysmsg.invokeMessage.text")) {
                    if (sb6.length() > 0) {
                        sb6.insert(0, (java.lang.String) this.f307318a.get(str));
                    } else {
                        sb6.append((java.lang.String) this.f307318a.get(str));
                    }
                } else if (str.startsWith(".sysmsg.invokeMessage.link.text") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) this.f307318a.get(str))) {
                    java.lang.String str2 = (java.lang.String) this.f307318a.get(str);
                    sb6.append(str2);
                    this.f307324g.add(str2);
                    i18 = str2.length();
                }
            }
            this.f307325h.addFirst(java.lang.Integer.valueOf(sb6.length() - i18));
            this.f307326i.add(java.lang.Integer.valueOf(sb6.length()));
            this.f307320c = sb6.toString();
            c();
            return true;
        }
        w15.h hVar = new w15.h();
        hVar.m126728xdc93280d(this.f307319b.f2());
        w15.e k17 = hVar.k();
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InvokeMessageNewXmlMsg", "[parseXml] revokeMsg == null ");
            return false;
        }
        this.f307322e = k17.m173117xfb85ada3();
        this.f307321d = "revokemsg";
        w15.d j17 = k17.j();
        if (j17 != null) {
            this.f307323f = j17.m173116x7520bed6();
            this.f499294m = this.f307319b.j();
            this.f499293l = (int) j17.n();
            this.f499295n = j17.l() * 1000;
            if (j17.k() != null && !j17.k().isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InvokeMessageNewXmlMsg", "[getAtSomebodyUsernames]  atList size:%s", java.lang.Integer.valueOf(j17.k().length()));
                java.util.HashMap hashMap = new java.util.HashMap(1);
                hashMap.put("atuserlist", "<![CDATA[" + j17.k() + "]]>");
                java.lang.String wi6 = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).wi(this.f307319b);
                this.f499296o = wi6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InvokeMessageNewXmlMsg", "[mergeMsgSource] rawSource:%s args is null:%s flag:%s", wi6, false, 1);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6) || wi6.startsWith("<msgsource>")) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
                        stringBuffer.append("<msgsource>");
                    }
                    for (java.util.Map.Entry entry : hashMap.entrySet()) {
                        java.lang.String str3 = (java.lang.String) entry.getValue();
                        java.lang.String str4 = (java.lang.String) entry.getKey();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InvokeMessageNewXmlMsg", "%s %s", str4, str3);
                        } else if (!"similar_paste_seq".equalsIgnoreCase(str4)) {
                            stringBuffer.append("<");
                            stringBuffer.append(str4);
                            stringBuffer.append(">");
                            stringBuffer.append(str3);
                            stringBuffer.append("</");
                            stringBuffer.append(str4);
                            stringBuffer.append(">");
                        }
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
                        stringBuffer.append("</msgsource>");
                        wi6 = stringBuffer.toString();
                    } else {
                        wi6 = wi6.replace("<msgsource>", "<msgsource>" + stringBuffer.toString());
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InvokeMessageNewXmlMsg", "[mergeMsgSource] the msgsource is right? %s", wi6);
                }
                this.f499296o = wi6;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (!j17.o().isEmpty()) {
                if (sb7.length() > 0) {
                    sb7.insert(0, j17.o());
                } else {
                    sb7.append(j17.o());
                }
            }
            if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ni()) {
                boolean z17 = c01.id.c() - this.f499295n >= 300000;
                if (j17.j() == 1 && !z17) {
                    java.lang.String str5 = "  " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3_);
                    sb7.append(str5);
                    this.f307324g.add(str5);
                    i17 = str5.length();
                }
                this.f307325h.addFirst(java.lang.Integer.valueOf(sb7.length() - i17));
                this.f307326i.add(java.lang.Integer.valueOf(sb7.length()));
                this.f307320c = sb7.toString();
            } else {
                if (j17.j() == 1) {
                    java.lang.String str6 = "  " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3_);
                    sb7.append(str6);
                    this.f307324g.add(str6);
                    i17 = str6.length();
                }
                this.f307325h.addFirst(java.lang.Integer.valueOf(sb7.length() - i17));
                this.f307326i.add(java.lang.Integer.valueOf(sb7.length()));
                this.f307320c = sb7.toString();
                if (this.f307319b.A0() == 1) {
                    c();
                }
            }
        }
        return true;
    }

    public final void c() {
        if (c01.id.c() - this.f499295n < 300000 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f499294m)) {
            return;
        }
        s75.d.b(new td5.a(this), "[checkExpired]");
    }
}
