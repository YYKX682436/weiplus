package ap1;

/* loaded from: classes5.dex */
public final class h implements fo1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ap1.w f94204a;

    public h(ap1.w wVar) {
        this.f94204a = wVar;
    }

    @Override // fo1.o
    public final void a(fo1.n it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(pf5.o.TAG, "Permission reauthorize result = " + it + '.');
        ap1.w wVar = this.f94204a;
        j75.f U6 = wVar.U6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U6);
        int ordinal = it.ordinal();
        if (ordinal == 0) {
            wVar.X6();
            return;
        }
        if (ordinal == 1) {
            U6.B3(new ap1.e2(wVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mym), null, null, null, 14, null));
            return;
        }
        if (ordinal == 2) {
            U6.B3(new ap1.e2(wVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.myl), null, null, null, 14, null));
        } else if (ordinal == 3) {
            U6.B3(new ap1.e2(wVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mzv), null, null, null, 14, null));
        } else {
            if (ordinal != 4) {
                return;
            }
            wVar.m158354x19263085().finish();
        }
    }
}
