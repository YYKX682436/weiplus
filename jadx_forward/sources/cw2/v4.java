package cw2;

/* loaded from: classes10.dex */
public final class v4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.w4 f305595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(cw2.w4 w4Var, yz5.l lVar) {
        super(3);
        this.f305595d = w4Var;
        this.f305596e = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        kk4.b player = this.f305595d.f305617a.getPlayer();
        if (player != null) {
            kk4.b.i(player, false, false, 2, null);
        }
        this.f305596e.mo146xb9724478(0L);
        return jz5.f0.f384359a;
    }
}
