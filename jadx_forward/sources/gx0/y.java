package gx0;

/* loaded from: classes5.dex */
public final class y implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.h0 f358720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.a f358721e;

    public y(gx0.h0 h0Var, uw0.a aVar) {
        this.f358720d = h0Var;
        this.f358721e = aVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 h07;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) obj;
        gx0.h0 h0Var = this.f358720d;
        gx0.kh W7 = h0Var.W7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
        ex0.c g76 = W7.g7(c4128x879fba0a);
        java.lang.Object obj2 = g76 != null ? g76.f338700a : null;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a32 = obj2 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) obj2 : null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c4181x2248e1a32, h0Var.f513122y) && c4181x2248e1a32 != null) {
            h0Var.R7();
            h0Var.G7(this.f358721e, c4181x2248e1a32);
        }
        if (h0Var.V7().m132411xc00617a4() || (c4181x2248e1a3 = h0Var.f513122y) == null || (h07 = c4181x2248e1a3.h0()) == null || (c3971x241f78 = h07.f130065a) == null) {
            return;
        }
        du0.o.o7((gx0.x4) ((jz5.n) h0Var.f513120w).mo141623x754a37bb(), c3971x241f78, false, false, 4, null);
    }
}
