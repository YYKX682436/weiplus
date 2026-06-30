package d21;

/* loaded from: classes5.dex */
public class f extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f307341l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f307342m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f307343n;

    public f(java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(map, f9Var);
        this.f307341l = new java.util.LinkedList();
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f307318a;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] values == null ");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f307321d) || !this.f307321d.equalsIgnoreCase("delchatroommember")) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.String str2 = this.f307321d;
            objArr2[0] = str2 != null ? str2 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type err :%s", objArr2);
            return false;
        }
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.delchatroommember.url");
        if (str3 == null) {
            str3 = "";
        }
        this.f307343n = str3;
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.delchatroommember.link.qrcode");
        this.f307342m = str4 != null ? str4 : "";
        java.util.LinkedList linkedList = this.f307341l;
        linkedList.add((java.lang.String) map.get(".sysmsg.delchatroommember.link.memberlist.username"));
        for (java.lang.String str5 : map.keySet()) {
            if (str5.startsWith(".sysmsg.delchatroommember.link.memberlist.username#")) {
                linkedList.add((java.lang.String) map.get(str5));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.String str6 : map.keySet()) {
            if (str6.startsWith(d21.c.f307316j)) {
                if (sb6.length() > 0) {
                    sb6.insert(0, (java.lang.String) map.get(str6));
                } else {
                    sb6.append((java.lang.String) map.get(str6));
                }
            } else if (str6.startsWith(".sysmsg.delchatroommember.link.text")) {
                sb6.append((java.lang.String) map.get(str6));
                this.f307324g.add((java.lang.String) map.get(str6));
                i17 = ((java.lang.String) map.get(str6)).length();
            }
        }
        this.f307325h.addFirst(java.lang.Integer.valueOf(sb6.length() - i17));
        this.f307326i.add(java.lang.Integer.valueOf(sb6.length()));
        this.f307320c = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] url:%s, qrcode:%s, members size :%s", this.f307343n, this.f307342m, java.lang.Integer.valueOf(linkedList.size()));
        return true;
    }
}
