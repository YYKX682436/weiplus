package k61;

/* loaded from: classes9.dex */
public class v implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.w f386051a;

    public v(k61.w wVar) {
        this.f386051a = wVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        k61.p pVar = this.f386051a.f386052a;
        java.lang.String b17 = pVar.f336757n.b("bill_no");
        java.lang.String b18 = pVar.f336757n.b("chatroom");
        int a17 = pVar.f336757n.a("enter_scene", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAAInteractor", "urgeAAPay");
        km5.b b19 = km5.u.b();
        b19.b();
        new i61.b(b17, b18, a17).l().q(new k61.o(pVar, b19));
        return null;
    }
}
