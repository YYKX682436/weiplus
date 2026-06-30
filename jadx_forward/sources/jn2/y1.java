package jn2;

/* loaded from: classes8.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f382291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f382292e;

    public y1(jn2.z1 z1Var, int i17) {
        this.f382291d = z1Var;
        this.f382292e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f382291d.f382305n;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(this.f382292e));
        }
    }
}
