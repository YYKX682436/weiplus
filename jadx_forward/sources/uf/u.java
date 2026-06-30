package uf;

/* loaded from: classes7.dex */
public final class u implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508641d;

    public u(uf.o0 o0Var) {
        this.f508641d = o0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        uf.o0 o0Var = this.f508641d;
        x91.h c17 = o0Var.f508595e.c();
        uf.t tVar = new uf.t(o0Var);
        x91.l lVar = c17.f534182c;
        if (lVar == null) {
            return true;
        }
        c17.f534181b.g(new w91.a(c17.a(lVar), c17.f534182c.f534197a), tVar);
        return true;
    }
}
