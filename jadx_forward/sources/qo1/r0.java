package qo1;

/* loaded from: classes5.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f447078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.v0 f447079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, qo1.v0 v0Var) {
        super(0);
        this.f447078d = f0Var;
        this.f447079e = v0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f447078d.f391649d;
        if (i17 != 0) {
            return java.lang.Integer.valueOf(i17);
        }
        qo1.v0 v0Var = this.f447079e;
        java.lang.Object obj = v0Var.f447025r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
        java.util.HashMap hashMap = (java.util.HashMap) obj;
        if (!hashMap.isEmpty()) {
            v0Var.f447025r = hashMap;
            v0Var.f447024q = new qo1.q0(v0Var);
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackupTask", "convs.size=" + hashMap.size());
        nf.e.f(qo1.p0.f447073d);
        return 1;
    }
}
