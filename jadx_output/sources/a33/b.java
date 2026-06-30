package a33;

/* loaded from: classes10.dex */
public final class b implements t23.m1 {

    /* renamed from: d, reason: collision with root package name */
    public long f1054d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public yz5.q f1055e;

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = this.f1054d;
        long j19 = currentTimeMillis - j18;
        jz5.f0 f0Var = null;
        if (!(j18 == j17)) {
            linkedList = null;
        }
        if (linkedList != null) {
            yz5.q qVar = this.f1055e;
            if (qVar != null) {
                qVar.invoke(java.lang.Boolean.TRUE, linkedList, java.lang.Long.valueOf(j19));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var != null) {
                return;
            }
        }
        yz5.q qVar2 = this.f1055e;
        if (qVar2 != null) {
            qVar2.invoke(java.lang.Boolean.FALSE, new java.util.LinkedList(), java.lang.Long.valueOf(j19));
        }
    }
}
