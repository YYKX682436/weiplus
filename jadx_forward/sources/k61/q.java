package k61;

/* loaded from: classes9.dex */
public class q implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.w f386046a;

    public q(k61.w wVar) {
        this.f386046a = wVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        k61.p pVar = this.f386046a.f386052a;
        long longValue = ((java.lang.Long) cVar.a(0)).longValue();
        java.lang.String str = (java.lang.String) cVar.a(1);
        java.lang.String str2 = (java.lang.String) cVar.a(2);
        java.lang.String b17 = pVar.f336757n.b("bill_no");
        java.lang.String b18 = pVar.f336757n.b("chatroom");
        int i17 = pVar.f336757n.a("enter_scene", 0) != 1 ? 2 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAAInteractor", "aaPay, payAmount: %s, billNo: %s, chatroom: %s，desc:%s", java.lang.Long.valueOf(longValue), b17, b18, str);
        java.lang.Long valueOf = java.lang.Long.valueOf(longValue);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        km5.q qVar = new km5.q();
        qVar.y(b17, valueOf, valueOf2, b18, str, str2);
        qVar.n(pVar.f386044p.f360694b);
        km5.u.a(qVar);
        return null;
    }
}
