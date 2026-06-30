package uf5;

/* loaded from: classes10.dex */
public class s0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.t0 f508829d;

    public s0(uf5.t0 t0Var) {
        this.f508829d = t0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        uf5.t0 t0Var = this.f508829d;
        java.lang.String obj = t0Var.f508833e.f288641o.getText().toString();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            t0Var.f508833e.f288640n.m80406xcd1079b0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj));
        }
        uf5.w0 w0Var = t0Var.f508833e.f288636g;
        if (!w0Var.f508850q.equalsIgnoreCase(obj)) {
            w0Var.f508850q = obj;
        }
        w0Var.s();
        return false;
    }
}
