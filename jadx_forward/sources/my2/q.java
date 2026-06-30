package my2;

/* loaded from: classes3.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f414292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(my2.u uVar) {
        super(0);
        this.f414292d = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        my2.u uVar = this.f414292d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f414298f, "forceUpdateBubble");
        r45.me2 me2Var = ((mm2.c1) uVar.f414296d.a(mm2.c1.class)).f410317b6;
        if (me2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f414298f, "update wording votingInfo is null");
            qo0.c.a(uVar.f414297e, qo0.b.f446972y2, null, 2, null);
        } else if (me2Var.m75939xb282bd08(3) < 0 || !(me2Var.m75939xb282bd08(4) == 1 || me2Var.m75939xb282bd08(4) == 1)) {
            my2.b bVar = uVar.f414299g;
            if (bVar != null) {
                ((my2.y) bVar).F(new my2.p(uVar));
            }
        } else {
            my2.b bVar2 = uVar.f414299g;
            if (bVar2 != null) {
                ((my2.y) bVar2).G(new my2.o(uVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
