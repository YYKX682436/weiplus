package k61;

/* loaded from: classes9.dex */
public class t implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.w f386049a;

    public t(k61.w wVar) {
        this.f386049a = wVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        k61.p pVar = this.f386049a.f386052a;
        java.lang.String b17 = pVar.f336757n.b("bill_no");
        int a17 = pVar.f336757n.a("enter_scene", 0);
        java.lang.String b18 = pVar.f336757n.b("chatroom");
        java.lang.String b19 = pVar.f336757n.b("key_sign");
        int a18 = pVar.f336757n.a("key_ver", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAAInteractor", "getPayListDetail, billNo: %s, scene: %s, chatRoom: %s", b17, java.lang.Integer.valueOf(a17), b18);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(a18);
        km5.q qVar = new km5.q();
        qVar.y(b17, valueOf, b18, b19, valueOf2);
        qVar.n(pVar.f386043o.f360676b);
        km5.u.a(qVar);
        return null;
    }
}
