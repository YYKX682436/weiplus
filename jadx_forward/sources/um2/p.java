package um2;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510445d;

    public p(um2.x5 x5Var) {
        this.f510445d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um2.x5 m129745xca56ce03;
        um2.x5 x5Var = this.f510445d;
        fm2.c cVar = x5Var.f101139c;
        if (cVar != null) {
            org.json.JSONObject m57668xd2eca5dc = cVar != null ? cVar.m57668xd2eca5dc() : null;
            fm2.c cVar2 = x5Var.f101139c;
            org.json.JSONObject m57662xce9bcbce = cVar2 != null ? cVar2.m57662xce9bcbce() : null;
            fm2.c cVar3 = x5Var.f101139c;
            cVar.mo57711xfc876354(m57668xd2eca5dc, m57662xce9bcbce, cVar3 != null ? cVar3.m57651x2474a935() : null, true, null);
        }
        fm2.c cVar4 = x5Var.f101139c;
        if (cVar4 == null || (m129745xca56ce03 = cVar4.m129745xca56ce03()) == null) {
            return;
        }
        um2.x5.p(m129745xca56ce03, null, false, 3, null);
    }
}
