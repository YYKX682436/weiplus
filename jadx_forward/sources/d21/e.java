package d21;

/* loaded from: classes5.dex */
public class e extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f307331l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f307332m;

    /* renamed from: n, reason: collision with root package name */
    public int f307333n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f307334o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f307335p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f307336q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f307337r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f307338s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f307339t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f307340u;

    public e(java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(map, f9Var);
        this.f307334o = new java.util.LinkedList();
        this.f307335p = new java.util.LinkedList();
        this.f307336q = new java.util.LinkedList();
        this.f307337r = null;
        this.f307338s = null;
        this.f307339t = null;
        this.f307340u = null;
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f307318a;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] values == null ");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f307321d) || !this.f307321d.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.String str2 = this.f307321d;
            objArr2[0] = str2 != null ? str2 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type err :%s", objArr2);
            return false;
        }
        this.f307331l = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.RoomName");
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text")) {
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text");
            if (str3 == null) {
                str3 = "";
            }
            this.f307339t = str3;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername")) {
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername");
            if (str4 == null) {
                str4 = "";
            }
            this.f307337r = str4;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason")) {
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason");
            if (str5 == null) {
                str5 = "";
            }
            this.f307338s = str5;
        }
        if (map.containsKey(d21.c.f307316j)) {
            java.lang.String str6 = (java.lang.String) map.get(d21.c.f307316j);
            if (str6 == null) {
                str6 = "";
            }
            this.f307340u = str6;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket")) {
            this.f307332m = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket");
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize")) {
            this.f307333n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize"), 0);
        }
        boolean I2 = this.f307319b.I2();
        java.util.LinkedList linkedList = this.f307326i;
        java.util.LinkedList linkedList2 = this.f307325h;
        java.util.LinkedList linkedList3 = this.f307324g;
        if (I2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            java.lang.String str7 = this.f307340u + " ";
            this.f307320c = str7;
            linkedList2.add(java.lang.Integer.valueOf(str7.length()));
            linkedList3.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573806fw3));
            java.lang.String str8 = this.f307320c + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573806fw3);
            this.f307320c = str8;
            linkedList.add(java.lang.Integer.valueOf(str8.length()));
        } else {
            linkedList2.add(java.lang.Integer.valueOf(this.f307340u.length()));
            linkedList3.add(this.f307339t);
            java.lang.String str9 = this.f307340u + this.f307339t;
            this.f307320c = str9;
            linkedList.add(java.lang.Integer.valueOf(str9.length()));
        }
        for (int i17 = 0; i17 < this.f307333n; i17++) {
            java.util.LinkedList linkedList4 = this.f307336q;
            java.util.LinkedList linkedList5 = this.f307335p;
            java.util.LinkedList linkedList6 = this.f307334o;
            if (i17 == 0) {
                java.lang.String str10 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.username");
                if (str10 == null) {
                    str10 = "";
                }
                linkedList6.add(str10);
                java.lang.String str11 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.nickname");
                if (str11 == null) {
                    str11 = "";
                }
                linkedList5.add(str11);
                java.lang.String str12 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.headimgurl");
                if (str12 == null) {
                    str12 = "";
                }
                linkedList4.add(str12);
            } else {
                java.lang.String str13 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i17 + ".username");
                if (str13 == null) {
                    str13 = "";
                }
                linkedList6.add(str13);
                java.lang.String str14 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i17 + ".nickname");
                if (str14 == null) {
                    str14 = "";
                }
                linkedList5.add(str14);
                java.lang.String str15 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i17 + ".headimgurl");
                if (str15 == null) {
                    str15 = "";
                }
                linkedList4.add(str15);
            }
        }
        return true;
    }
}
