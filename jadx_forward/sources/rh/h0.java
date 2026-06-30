package rh;

/* loaded from: classes12.dex */
public class h0 implements rh.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f476939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.i0 f476940b;

    public h0(rh.i0 i0Var, rh.o2 o2Var) {
        this.f476940b = i0Var;
        this.f476939a = o2Var;
    }

    @Override // rh.a1
    public long a(java.lang.String str) {
        long j17;
        long longValue;
        uh.g gVar = (uh.g) this.f476939a.f477019c;
        if (str == null) {
            longValue = ((java.lang.Long) gVar.f509246v.f477085a).longValue();
            j17 = ((java.lang.Long) gVar.f509248w.f477085a).longValue();
        } else {
            rh.i0 i0Var = this.f476940b;
            qh.f0 f0Var = i0Var.f476954a.f476975b.f477015d.f476862k;
            j17 = 0;
            if (f0Var == null) {
                return 0L;
            }
            java.lang.String packageName = f0Var.d().getPackageName();
            if (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29.equals(str)) {
                packageName = i0Var.f476954a.f476975b.f477015d.f476862k.d().getPackageName() + ":" + str;
            }
            rh.x2 x2Var = (rh.x2) gVar.f509245u0.get(packageName);
            rh.x2 x2Var2 = (rh.x2) gVar.f509247v0.get(packageName);
            longValue = x2Var == null ? 0L : ((java.lang.Long) x2Var.f477085a).longValue();
            if (x2Var2 != null) {
                j17 = ((java.lang.Long) x2Var2.f477085a).longValue();
            }
        }
        return longValue + j17;
    }
}
