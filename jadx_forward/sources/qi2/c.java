package qi2;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.n f445033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f445034e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qi2.n nVar, android.content.Context context) {
        super(1);
        this.f445033d = nVar;
        this.f445034e = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Boolean bool;
        int intValue = ((java.lang.Number) obj).intValue();
        qi2.n nVar = this.f445033d;
        dk2.m mVar = ((mm2.y2) nVar.f445110h.g().a(mm2.y2.class)).f411101u;
        zh2.c cVar = nVar.f445110h;
        if (mVar == null) {
            dk2.u4 u4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
            if (u4Var != null) {
                int i17 = u4Var.f315693g;
                int i18 = u4Var.f315694h;
                java.lang.String str = u4Var.f315695i;
                if (str == null) {
                    str = "";
                }
                mVar = new dk2.m(i17, i18, str, u4Var.f315700n, u4Var.f315699m, u4Var.f315696j, u4Var.f315701o);
            } else {
                mVar = null;
            }
        }
        if (mVar != null) {
            dk2.m mVar2 = new dk2.m(mVar.f315271a, mVar.f315272b, mVar.f315273c, mVar.f315274d, mVar.f315275e, mVar.f315276f, mVar.f315277g);
            dk2.u4 u4Var2 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
            if (!(u4Var2 != null && u4Var2.f315701o == intValue)) {
                mVar2.f315277g = intValue;
                dk2.u4 u4Var3 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                java.lang.Boolean valueOf = u4Var3 != null ? java.lang.Boolean.valueOf(u4Var3.i()) : null;
                dk2.u4 u4Var4 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                if (u4Var4 != null) {
                    bool = java.lang.Boolean.valueOf(u4Var4.f315691e == 7);
                } else {
                    bool = null;
                }
                int i19 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorPkPanelWidget", "onMicLayoutSelect isBattleFinish: " + valueOf + " isBattlePublicityFinish: " + bool, null);
                qf2.y1 y1Var = (qf2.y1) cVar.mo57008x143f1b92(qf2.y1.class);
                if (y1Var != null) {
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool2) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
                        qf2.y1 y1Var2 = (qf2.y1) cVar.mo57008x143f1b92(qf2.y1.class);
                        if (y1Var2 != null) {
                            y1Var2.e7(mVar2, new qi2.a(nVar));
                        }
                    } else {
                        qi2.b bVar = new qi2.b(this.f445034e, intValue, y1Var, nVar);
                        ((mm2.y2) y1Var.m56788xbba4bfc0(mm2.y2.class)).f411101u = mVar2;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(y1Var, null, null, new qf2.r1(1, y1Var, mVar2, bVar, null), 3, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
