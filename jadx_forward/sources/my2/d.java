package my2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.e f414255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(my2.e eVar) {
        super(0);
        this.f414255d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        my2.e eVar = this.f414255d;
        if (((mm2.c1) eVar.P0(mm2.c1.class)).a8()) {
            if (((mm2.c1) eVar.P0(mm2.c1.class)).f410327d6) {
                my2.a aVar = eVar.f414258r;
                if (aVar != null) {
                    pm0.v.X(new my2.t((my2.u) aVar));
                }
                ((mm2.c1) eVar.P0(mm2.c1.class)).f410327d6 = false;
            } else {
                my2.a aVar2 = eVar.f414258r;
                if (aVar2 != null) {
                    my2.u uVar = (my2.u) aVar2;
                    if (uVar.f414302m && ((mm2.c1) uVar.f414296d.a(mm2.c1.class)).f410317b6 != null) {
                        uVar.f414302m = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f414298f, "updateHelpShowBubble");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 c17 = uVar.c();
                        if (c17 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(c17, null, null, new my2.s(uVar, null), 3, null);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
