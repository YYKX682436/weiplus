package gx0;

/* loaded from: classes5.dex */
public final class f2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.g f357920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f357921e;

    public f2(ow0.g gVar, gx0.u2 u2Var) {
        this.f357920d = gVar;
        this.f357921e = u2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ex0.r rVar = (ex0.r) obj;
        if (this.f357920d.m157271xfdaa7672() == sw0.f.f494965g) {
            ug.m mVar = rVar != null ? rVar.f338702c : null;
            ug.m mVar2 = ug.m.Caption;
            gx0.u2 u2Var = this.f357921e;
            if (mVar == mVar2) {
                ow0.q0.g(u2Var, rVar);
                if (u2Var.R7().m7()) {
                    com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = rVar.f338700a.f130065a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
                    u2Var.W7(c3971x241f78);
                }
            } else {
                ((du0.o) ((jz5.n) u2Var.f430814o).mo141623x754a37bb()).U6(false);
            }
            ow0.q0.h(u2Var);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c n76 = u2Var.n7();
            if (n76 != null) {
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(n76, false, 1, null);
            }
        }
    }
}
