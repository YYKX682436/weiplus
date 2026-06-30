package o41;

/* loaded from: classes5.dex */
public class b extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f424349l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f424350m;

    /* renamed from: n, reason: collision with root package name */
    public int f424351n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f424352o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f424353p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f424354q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f424355r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f424356s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f424357t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f424358u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f424359v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f424360w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f424361x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f424362y;

    public b(java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(map, f9Var);
        this.f424352o = new java.util.LinkedList();
        this.f424353p = new java.util.LinkedList();
        this.f424354q = new java.util.LinkedList();
        this.f424355r = new java.util.LinkedList();
        this.f424356s = new java.util.LinkedList();
        this.f424357t = null;
        this.f424358u = null;
        this.f424359v = null;
        this.f424360w = null;
        this.f424361x = null;
        this.f424362y = null;
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f307318a;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f307321d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(map.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f307321d) || !this.f307321d.equalsIgnoreCase("NewXmlOpenIMChatRoomAddChatRoomMemberApplication")) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.String str2 = this.f307321d;
            objArr2[0] = str2 != null ? str2 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] type err :%s", objArr2);
            return false;
        }
        this.f424349l = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.RoomName");
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.text")) {
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.text");
            if (str3 == null) {
                str3 = "";
            }
            this.f424361x = str3;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.username")) {
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.username");
            if (str4 == null) {
                str4 = "";
            }
            this.f424357t = str4;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.appid")) {
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.appid");
            if (str5 == null) {
                str5 = "";
            }
            this.f424358u = str5;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.descid")) {
            java.lang.String str6 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.descid");
            if (str6 == null) {
                str6 = "";
            }
            this.f424359v = str6;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.invitationreason")) {
            java.lang.String str7 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.invitationreason");
            if (str7 == null) {
                str7 = "";
            }
            this.f424360w = str7;
        }
        if (map.containsKey(d21.c.f307316j)) {
            java.lang.String str8 = (java.lang.String) map.get(d21.c.f307316j);
            if (str8 == null) {
                str8 = "";
            }
            this.f424362y = str8;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.ticket")) {
            this.f424350m = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.ticket");
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.memberlistsize")) {
            this.f424351n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.memberlistsize"), 0);
        }
        boolean I2 = this.f307319b.I2();
        java.util.LinkedList linkedList = this.f307326i;
        java.util.LinkedList linkedList2 = this.f307325h;
        java.util.LinkedList linkedList3 = this.f307324g;
        if (I2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            java.lang.String str9 = this.f424362y + " ";
            this.f307320c = str9;
            linkedList2.add(java.lang.Integer.valueOf(str9.length()));
            linkedList3.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573806fw3));
            java.lang.String str10 = this.f307320c + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573806fw3);
            this.f307320c = str10;
            linkedList.add(java.lang.Integer.valueOf(str10.length()));
        } else {
            linkedList2.add(java.lang.Integer.valueOf(this.f424362y.length()));
            linkedList3.add(this.f424361x);
            java.lang.String str11 = this.f424362y + this.f424361x;
            this.f307320c = str11;
            linkedList.add(java.lang.Integer.valueOf(str11.length()));
        }
        for (int i17 = 0; i17 < this.f424351n; i17++) {
            java.util.LinkedList linkedList4 = this.f424356s;
            java.util.LinkedList linkedList5 = this.f424354q;
            java.util.LinkedList linkedList6 = this.f424355r;
            java.util.LinkedList linkedList7 = this.f424353p;
            java.util.LinkedList linkedList8 = this.f424352o;
            if (i17 == 0) {
                java.lang.String str12 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.username");
                if (str12 == null) {
                    str12 = "";
                }
                linkedList8.add(str12);
                java.lang.String str13 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.nickname");
                if (str13 == null) {
                    str13 = "";
                }
                linkedList7.add(str13);
                java.lang.String str14 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.descid");
                if (str14 == null) {
                    str14 = "";
                }
                linkedList5.add(str14);
                java.lang.String str15 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.appid");
                if (str15 == null) {
                    str15 = "";
                }
                linkedList6.add(str15);
                java.lang.String str16 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.headimgurl");
                if (str16 == null) {
                    str16 = "";
                }
                linkedList4.add(str16);
            } else {
                java.lang.String str17 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".username");
                if (str17 == null) {
                    str17 = "";
                }
                linkedList8.add(str17);
                java.lang.String str18 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".nickname");
                if (str18 == null) {
                    str18 = "";
                }
                linkedList7.add(str18);
                java.lang.String str19 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".appid");
                if (str19 == null) {
                    str19 = "";
                }
                linkedList6.add(str19);
                java.lang.String str20 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".descid");
                if (str20 == null) {
                    str20 = "";
                }
                linkedList5.add(str20);
                java.lang.String str21 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".headimgurl");
                if (str21 == null) {
                    str21 = "";
                }
                linkedList4.add(str21);
            }
        }
        return true;
    }
}
