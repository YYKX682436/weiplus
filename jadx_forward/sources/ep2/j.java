package ep2;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ep2.k f337255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337256e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ep2.k kVar, java.lang.String str) {
        super(1);
        this.f337255d = kVar;
        this.f337256e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        ep2.k kVar = this.f337255d;
        if (booleanValue) {
            java.lang.String valueOf = java.lang.String.valueOf(kVar.f337257m);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f409573e;
            a4Var.a(valueOf, "", b17, "square_card_friend_like_avatar_half", this.f337256e);
        } else {
            java.lang.String valueOf2 = java.lang.String.valueOf(kVar.f337257m);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b18 = b52.b.b();
            ml2.t1 t1Var = ml2.t1.f409475e;
            a4Var.b(valueOf2, b18, "square_card_friend_like_avatar_half", this.f337256e);
        }
        return jz5.f0.f384359a;
    }
}
