package ze5;

/* loaded from: classes5.dex */
public final class d8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ze5.d8 f553417d = new ze5.d8();

    public d8() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yb5.d chattingContext = (yb5.d) obj;
        rd5.d msgData = (rd5.d) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        java.lang.String Q0 = f9Var.Q0();
        if (Q0 == null) {
            Q0 = "";
        }
        dh0.j jVar = (dh0.j) i95.n0.c(dh0.j.class);
        return java.lang.Boolean.valueOf((jVar != null ? ((eh0.o) jVar).Vi(Q0, f9Var.I0()) : false) || (jVar != null ? ((eh0.o) jVar).Ri(Q0, f9Var.I0()) : false));
    }
}
