package jf2;

/* loaded from: classes3.dex */
public final class e0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.k0 f380900d;

    public e0(jf2.k0 k0Var) {
        this.f380900d = k0Var;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        jf2.k0 k0Var = this.f380900d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(k0Var.f380912n.indexOf(java.lang.Integer.valueOf(((jf2.o) obj).mo57989x368f3a())));
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(k0Var.f380912n.indexOf(java.lang.Integer.valueOf(((jf2.o) obj2).mo57989x368f3a())));
        java.lang.Integer num = valueOf3.intValue() >= 0 ? valueOf3 : null;
        return mz5.a.b(valueOf2, java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE));
    }
}
