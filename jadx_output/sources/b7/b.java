package b7;

/* loaded from: classes13.dex */
public class b implements a7.p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t6.k f18174b = t6.k.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    public final a7.n0 f18175a;

    public b(a7.n0 n0Var) {
        this.f18175a = n0Var;
    }

    @Override // a7.p0
    public /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return true;
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        java.lang.Object obj2;
        a7.c0 c0Var = (a7.c0) obj;
        a7.n0 n0Var = this.f18175a;
        if (n0Var != null) {
            a7.m0 a17 = a7.m0.a(c0Var, 0, 0);
            q7.k kVar = n0Var.f1844a;
            synchronized (kVar) {
                obj2 = ((java.util.LinkedHashMap) kVar.f360302a).get(a17);
            }
            java.util.Queue queue = a7.m0.f1839d;
            synchronized (queue) {
                ((java.util.ArrayDeque) queue).offer(a17);
            }
            a7.c0 c0Var2 = (a7.c0) obj2;
            if (c0Var2 == null) {
                kVar.c(a7.m0.a(c0Var, 0, 0), c0Var);
            } else {
                c0Var = c0Var2;
            }
        }
        return new a7.o0(c0Var, new u6.o(c0Var, ((java.lang.Integer) lVar.c(f18174b)).intValue()));
    }
}
