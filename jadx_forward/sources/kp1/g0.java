package kp1;

/* loaded from: classes11.dex */
public final class g0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 f392435d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3) {
        this.f392435d = c12881xbe3683d3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3 = this.f392435d;
        gp1.o onEnterPlayerCallback = c12881xbe3683d3.getOnEnterPlayerCallback();
        if (onEnterPlayerCallback != null) {
            ((oh4.a) onEnterPlayerCallback).a();
        }
        qk.e9 e9Var = (qk.e9) i95.n0.c(qk.e9.class);
        bw5.xb0 xb0Var = c12881xbe3683d3.f174547x;
        java.lang.String str = c12881xbe3683d3.f174548y;
        rk4.p6 p6Var = (rk4.p6) e9Var;
        if (p6Var.Ai()) {
            p6Var.Zi(new rk4.n6(p6Var, xb0Var, str));
        }
        return jz5.f0.f384359a;
    }
}
