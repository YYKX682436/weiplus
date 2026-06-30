package c01;

/* loaded from: classes5.dex */
public final class w0 extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f37529l;

    public w0(java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        super(map, f9Var);
        this.f37529l = map;
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f37529l;
        if (map == null) {
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f225788d, "biz_sys_msg_tips")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizSysMsgTipsNetXML", "illegal type");
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
                this.f225787c = str3;
                this.f225791g.add(str2);
                this.f225792h.addFirst(java.lang.Integer.valueOf(str3.length() - str2.length()));
                this.f225793i.add(java.lang.Integer.valueOf(str3.length()));
                return false;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BizSysMsgTipsNetXML", "illegal data");
        return false;
    }
}
