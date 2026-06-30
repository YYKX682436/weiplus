package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class s4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i22.b0 f98187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.p4 f98188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.u4 f98189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(i22.b0 b0Var, com.tencent.mm.plugin.emoji.ui.p4 p4Var, com.tencent.mm.plugin.emoji.ui.u4 u4Var) {
        super(0);
        this.f98187d = b0Var;
        this.f98188e = p4Var;
        this.f98189f = u4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.emoji.ui.p4 p4Var = this.f98188e;
        i22.b0 b0Var = this.f98187d;
        b0Var.f287935d = p4Var;
        com.tencent.mm.plugin.emoji.ui.u4 u4Var = this.f98189f;
        b0Var.f287940i = new g22.u0(u4Var.f98210e, b0Var);
        b0Var.b();
        u4Var.f98217o.invoke(new com.tencent.mm.plugin.emoji.ui.r4(b0Var));
        return jz5.f0.f302826a;
    }
}
