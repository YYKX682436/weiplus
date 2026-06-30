package o20;

/* loaded from: classes14.dex */
public final class x implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb f423933a;

    public x(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb c10556x2b36b1cb) {
        this.f423933a = c10556x2b36b1cb;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        o20.c0 c0Var;
        o20.c0 c0Var2;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_exp");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb c10556x2b36b1cb = this.f423933a;
        if (b17) {
            if (!c10556x2b36b1cb.getAutoPlay() || (c0Var2 = c10556x2b36b1cb.f147471i) == null) {
                return null;
            }
            ((o20.i) c0Var2).e();
            return null;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_unexp")) {
            return null;
        }
        if (c10556x2b36b1cb.getAutoPlay() && (c0Var = c10556x2b36b1cb.f147471i) != null) {
            ((o20.i) c0Var).a();
        }
        q20.k kVar = c10556x2b36b1cb.f147472m;
        if (kVar == null) {
            return null;
        }
        kVar.d();
        return null;
    }
}
