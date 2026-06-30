package gx0;

/* loaded from: classes5.dex */
public final class b2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.g f357751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f357752e;

    public b2(ow0.g gVar, gx0.u2 u2Var) {
        this.f357751d = gVar;
        this.f357752e = u2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) obj;
        ow0.g gVar = this.f357751d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p f150738e = gVar.getF150738e();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p pVar = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150779h;
        gx0.u2 u2Var = this.f357752e;
        if (f150738e == pVar) {
            int ordinal = gVar.m157271xfdaa7672().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
                    u2Var.U7(c4128x879fba0a);
                }
            } else if (!u2Var.R7().m132411xc00617a4()) {
                u2Var.Y7();
            }
        }
        if (u2Var.R7().m132411xc00617a4()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
            ow0.q0.e(u2Var, c4128x879fba0a);
        }
    }
}
