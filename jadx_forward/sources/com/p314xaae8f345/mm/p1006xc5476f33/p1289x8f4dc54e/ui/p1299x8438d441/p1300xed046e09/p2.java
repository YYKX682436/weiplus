package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o83 f175940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(r45.o83 o83Var) {
        super(0);
        this.f175940d = o83Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList<r45.n83> ReqInfo = this.f175940d.f463560n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ReqInfo, "ReqInfo");
        for (r45.n83 n83Var : ReqInfo) {
            r45.p97 p97Var = new r45.p97();
            p97Var.f464433d = n83Var.f462686e;
            p97Var.f464435f = n83Var.f462692n;
            zw4.n nVar = zw4.n.f558467a;
            p97Var.f464434e = ((java.lang.Number) ((jz5.n) zw4.n.f558470d).mo141623x754a37bb()).intValue();
            p97Var.f464440n = n83Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y) n83Var).f176010v : "";
            byte[] mo14344x5f01b1f6 = p97Var.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = zw4.n.f558468b;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()).H(p97Var.f464433d, mo14344x5f01b1f6);
            java.lang.String str = p97Var.f464440n;
            if (!(str == null || str.length() == 0)) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()).H(p97Var.f464440n, mo14344x5f01b1f6);
            }
        }
        return jz5.f0.f384359a;
    }
}
