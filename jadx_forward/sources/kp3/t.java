package kp3;

/* loaded from: classes10.dex */
public final class t implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f392575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f392576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f392577f;

    public t(kp3.x xVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2) {
        this.f392575d = xVar;
        this.f392576e = f0Var;
        this.f392577f = f0Var2;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        ((ku5.t0) ku5.t0.f394148d).B(new kp3.s(this.f392575d, this.f392576e, this.f392577f));
        return true;
    }
}
