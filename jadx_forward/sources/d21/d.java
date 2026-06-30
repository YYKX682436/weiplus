package d21;

/* loaded from: classes5.dex */
public class d extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f307327l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f307328m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f307329n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f307330o;

    public d(java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(map, f9Var);
        this.f307327l = new java.util.LinkedList();
        this.f307328m = null;
        this.f307329n = null;
        this.f307330o = null;
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f307318a;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] values == null ");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f307321d) || !this.f307321d.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval")) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.String str2 = this.f307321d;
            objArr2[0] = str2 != null ? str2 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type err :%s", objArr2);
            return false;
        }
        if (map.containsKey(d21.c.f307316j)) {
            java.lang.String str3 = (java.lang.String) map.get(d21.c.f307316j);
            if (str3 == null) {
                str3 = "";
            }
            this.f307328m = str3;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text")) {
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text");
            if (str4 == null) {
                str4 = "";
            }
            this.f307329n = str4;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket")) {
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket");
            this.f307330o = str5 != null ? str5 : "";
        }
        this.f307320c = this.f307328m;
        if (this.f307319b.I2()) {
            this.f307320c += " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw7);
        } else {
            this.f307324g.add(this.f307329n);
            this.f307325h.add(java.lang.Integer.valueOf(this.f307320c.length()));
            java.lang.String str6 = this.f307320c + this.f307329n;
            this.f307320c = str6;
            this.f307326i.add(java.lang.Integer.valueOf(str6.length()));
        }
        for (java.lang.String str7 : map.keySet()) {
            if (str7.startsWith(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.memberlist.username")) {
                this.f307327l.add((java.lang.String) map.get(str7));
            }
        }
        return true;
    }
}
