package nu0;

/* loaded from: classes5.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f421593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i17, nu0.q0 q0Var) {
        super(1);
        this.f421593d = i17;
        this.f421594e = q0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateSnapshotInternal] index:");
        int i17 = this.f421593d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", sb6.toString());
        nu0.q0 q0Var = this.f421594e;
        ((java.util.ArrayList) q0Var.f421610t).remove(i17);
        ((java.util.ArrayList) q0Var.f421610t).add(i17, path);
        nu0.q0.W6(q0Var);
        return jz5.f0.f384359a;
    }
}
