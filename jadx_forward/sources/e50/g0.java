package e50;

/* loaded from: classes15.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e50.z0 f331027d;

    public g0(e50.z0 z0Var) {
        this.f331027d = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 m137427x4255efe8;
        e50.z0 z0Var = this.f331027d;
        pi0.q qVar = z0Var.f331091e;
        if (qVar == null || (c28580x69eec95e = qVar.f436234e) == null || (m137427x4255efe8 = c28580x69eec95e.m137427x4255efe8()) == null) {
            return;
        }
        e50.m1 Di = z0Var.Di();
        Di.getClass();
        Di.f331055a = m137427x4255efe8;
        java.util.ArrayList arrayList = (java.util.ArrayList) Di.f331056b;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e50.l1 l1Var = (e50.l1) it.next();
                m137427x4255efe8.mo126982x35cf88(l1Var.f331051a, l1Var.f331052b, l1Var.f331053c);
            }
            arrayList.clear();
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) Di.f331057c;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                e50.k1 k1Var = (e50.k1) it6.next();
                m137427x4255efe8.mo126983x12ef5e45(k1Var.f331047a, k1Var.f331048b);
            }
            arrayList2.clear();
        }
    }
}
