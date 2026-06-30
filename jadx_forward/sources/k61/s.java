package k61;

/* loaded from: classes9.dex */
public class s implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.w f386048a;

    public s(k61.w wVar) {
        this.f386048a = wVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        k61.p pVar = this.f386048a.f386052a;
        long longValue = ((java.lang.Long) cVar.a(0)).longValue();
        java.lang.String str = (java.lang.String) cVar.a(1);
        java.lang.String str2 = (java.lang.String) cVar.a(2);
        pVar.getClass();
        km5.b b17 = km5.u.b();
        java.lang.String b18 = pVar.f336757n.b("bill_no");
        int a17 = pVar.f336757n.a("enter_scene", 0);
        java.lang.String b19 = pVar.f336757n.b("chatroom");
        b17.b();
        new i61.a(b18, longValue, a17, b19, str, str2).l().q(new k61.n(pVar, b17));
        return null;
    }
}
