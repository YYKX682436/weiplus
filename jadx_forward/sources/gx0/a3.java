package gx0;

/* loaded from: classes5.dex */
public final class a3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f357716d;

    public a3(gx0.y3 y3Var) {
        this.f357716d = y3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
        gx0.y3 y3Var = this.f357716d;
        if (y3Var.z7().f357788v.mo3195x754a37bb() == gx0.fd.f357965h) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(y3Var.o7(), c4128x879fba0a, false, 2, null);
        }
        ex0.f fVar = y3Var.f383721q;
        if (fVar == null) {
            return;
        }
        gx0.x4 y76 = y3Var.y7();
        y76.getClass();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID = fVar.f338701b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        if (y76.e7(mjID) && !y76.f7(mjID)) {
            y76.n7(mjID, false, false);
        }
    }
}
