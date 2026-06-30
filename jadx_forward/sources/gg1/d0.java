package gg1;

/* loaded from: classes7.dex */
public final class d0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353084d;

    public d0(gg1.c1 c1Var) {
        this.f353084d = c1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        gg1.c1 c1Var = this.f353084d;
        x91.h b17 = c1Var.f353072e.b();
        gg1.c0 c0Var = new gg1.c0(c1Var);
        x91.l lVar = b17.f534182c;
        if (lVar == null) {
            return true;
        }
        b17.f534181b.g(new w91.a(b17.a(lVar), b17.f534182c.f534197a), c0Var);
        return true;
    }
}
