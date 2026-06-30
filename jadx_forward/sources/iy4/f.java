package iy4;

/* loaded from: classes11.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iy4.g f377492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f377493b;

    public f(iy4.g gVar, long j17) {
        this.f377492a = gVar;
        this.f377493b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        long j17 = this.f377493b;
        iy4.g gVar = this.f377492a;
        if (fVar == null) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.e eVar = gVar.f377496b;
            if (eVar != null) {
                eVar.W(j17, -1, "result is null");
                return f0Var;
            }
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.e eVar2 = gVar.f377496b;
            if (eVar2 != null) {
                int i17 = fVar.f152149b;
                java.lang.String str = fVar.f152150c;
                if (str == null) {
                    str = "";
                }
                eVar2.W(j17, i17, str);
                return f0Var;
            }
        }
        return null;
    }
}
