package d21;

/* loaded from: classes5.dex */
public class k extends d21.c {
    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f307318a;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderChatSystemaNewXmlMsg", "[parseXml] values == null ");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderChatSystemaNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (map.containsKey(".sysmsg.SysMsgContent")) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.SysMsgContent");
            this.f307320c = str2 != null ? str2 : "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderChatSystemaNewXmlMsg", "appText = " + this.f307320c);
        return false;
    }
}
