package gx0;

/* loaded from: classes5.dex */
public final class o4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.x4 f358319d;

    public o4(gx0.x4 x4Var) {
        this.f358319d = x4Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ou0.g gVar = (ou0.g) obj;
        gx0.x4 x4Var = this.f358319d;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = x4Var.f358689y;
        boolean z17 = (c4129xdee64553 == null || c4129xdee64553.m34002x805f158c(gVar)) ? false : true;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
        boolean c17 = ou0.f.c(gVar, 8L);
        if (ou0.f.c(gVar, 1L) && z17 && !c17 && x4Var.q() && !ou0.f.c(gVar, 16L)) {
            x4Var.U6(false);
        }
    }
}
