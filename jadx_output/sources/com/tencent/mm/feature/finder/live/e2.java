package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f66680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f66681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f66682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f66683g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(s40.t0 t0Var, long j17, int i17, com.tencent.mm.modelbase.f fVar) {
        super(0);
        this.f66680d = t0Var;
        this.f66681e = j17;
        this.f66682f = i17;
        this.f66683g = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s40.t0 t0Var = this.f66680d;
        if (t0Var != null) {
            t0Var.onLiveStatusCallback(this.f66681e, this.f66682f, this.f66683g.f70618d);
        }
        return jz5.f0.f302826a;
    }
}
