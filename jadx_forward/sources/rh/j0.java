package rh;

/* loaded from: classes12.dex */
public class j0 implements rh.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f476956a;

    public j0(rh.k0 k0Var, rh.o2 o2Var) {
        this.f476956a = o2Var;
    }

    @Override // rh.a1
    public long a(java.lang.String str) {
        long longValue;
        rh.o2 o2Var = this.f476956a;
        if (str != null) {
            for (rh.o2 o2Var2 : ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc) o2Var.f477019c).f134117f) {
                if (((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c).f134093f.equals(str)) {
                    longValue = ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c).f134094g.f477085a).longValue();
                }
            }
            return 0L;
        }
        longValue = ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc) o2Var.f477019c).f134115d.f477085a).longValue();
        return longValue * 10;
    }
}
