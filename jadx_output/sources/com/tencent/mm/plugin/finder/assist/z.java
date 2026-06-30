package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f102740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f102741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dk2.x4 x4Var, boolean z17) {
        super(0);
        this.f102740d = x4Var;
        this.f102741e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.live.api.LiveConfig d17 = this.f102740d.d();
        if (d17 != null && this.f102741e) {
            com.tencent.mm.sdk.platformtools.t8.K0(d17.f68545p);
        }
        return jz5.f0.f302826a;
    }
}
