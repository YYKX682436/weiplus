package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f66693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f66694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(s40.t0 t0Var, long j17) {
        super(0);
        this.f66693d = t0Var;
        this.f66694e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s40.t0 t0Var = this.f66693d;
        if (t0Var != null) {
            t0Var.onLiveStatusCallback(this.f66694e, 1, new r45.l71());
        }
        return jz5.f0.f302826a;
    }
}
