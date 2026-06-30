package wt1;

/* loaded from: classes9.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public int f530849a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f530850b;

    /* renamed from: c, reason: collision with root package name */
    public int f530851c;

    public static wt1.o a(ot0.q qVar) {
        java.util.Map map = qVar.G2;
        wt1.o oVar = new wt1.o();
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.giftcard_info.order_id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        oVar.f530850b = str;
        oVar.f530849a = kk.v.b((java.lang.String) map.get(".msg.appmsg.giftcard_info.biz_uin"));
        oVar.f530851c = kk.v.b((java.lang.String) map.get(".msg.appmsg.giftcard_info.ver"));
        return oVar;
    }
}
