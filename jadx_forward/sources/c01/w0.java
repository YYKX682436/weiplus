package c01;

/* loaded from: classes5.dex */
public final class w0 extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f119062l;

    public w0(java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(map, f9Var);
        this.f119062l = map;
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f119062l;
        if (map == null) {
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f307321d, "biz_sys_msg_tips")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizSysMsgTipsNetXML", "illegal type");
            return false;
        }
        java.lang.String str = (java.lang.String) map.get(".sysmsg.biz_sys_msg_tips.text");
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.biz_sys_msg_tips.link.text");
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                java.lang.String str3 = str + str2;
                this.f307320c = str3;
                this.f307324g.add(str2);
                this.f307325h.addFirst(java.lang.Integer.valueOf(str3.length() - str2.length()));
                this.f307326i.add(java.lang.Integer.valueOf(str3.length()));
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizSysMsgTipsNetXML", "illegal data");
        return false;
    }
}
