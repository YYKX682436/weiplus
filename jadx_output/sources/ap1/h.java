package ap1;

/* loaded from: classes5.dex */
public final class h implements fo1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ap1.w f12671a;

    public h(ap1.w wVar) {
        this.f12671a = wVar;
    }

    @Override // fo1.o
    public final void a(fo1.n it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.w(pf5.o.TAG, "Permission reauthorize result = " + it + '.');
        ap1.w wVar = this.f12671a;
        j75.f U6 = wVar.U6();
        kotlin.jvm.internal.o.d(U6);
        int ordinal = it.ordinal();
        if (ordinal == 0) {
            wVar.X6();
            return;
        }
        if (ordinal == 1) {
            U6.B3(new ap1.e2(wVar.getString(com.tencent.mm.R.string.mym), null, null, null, 14, null));
            return;
        }
        if (ordinal == 2) {
            U6.B3(new ap1.e2(wVar.getString(com.tencent.mm.R.string.myl), null, null, null, 14, null));
        } else if (ordinal == 3) {
            U6.B3(new ap1.e2(wVar.getString(com.tencent.mm.R.string.mzv), null, null, null, 14, null));
        } else {
            if (ordinal != 4) {
                return;
            }
            wVar.getActivity().finish();
        }
    }
}
