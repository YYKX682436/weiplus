package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f66930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f66931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.o f66932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(s40.t0 t0Var, long j17, jz5.o oVar) {
        super(0);
        this.f66930d = t0Var;
        this.f66931e = j17;
        this.f66932f = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s40.t0 t0Var = this.f66930d;
        if (t0Var != null) {
            jz5.o oVar = this.f66932f;
            t0Var.onLiveStatusCallback(this.f66931e, ((java.lang.Number) oVar.f302841d).intValue(), oVar.f302843f);
        }
        return jz5.f0.f302826a;
    }
}
