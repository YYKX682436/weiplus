package cw4;

/* loaded from: classes8.dex */
public final class j0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f305763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305764e;

    public j0(cw4.m0 m0Var, java.lang.String str) {
        this.f305763d = m0Var;
        this.f305764e = str;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        cw4.m0 m0Var = this.f305763d;
        m0Var.f305784t++;
        java.lang.String str = this.f305764e;
        m0Var.f305771d.mo14660x738236e6(str, new cw4.h0(m0Var, str));
        return false;
    }
}
