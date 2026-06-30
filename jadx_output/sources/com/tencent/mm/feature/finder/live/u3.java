package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class u3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f66956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f66957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(s40.t0 t0Var, long j17) {
        super(0);
        this.f66956d = t0Var;
        this.f66957e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s40.t0 t0Var = this.f66956d;
        if (t0Var != null) {
            t0Var.onLiveStatusCallback(this.f66957e, 1, new r45.l71());
        }
        return jz5.f0.f302826a;
    }
}
