package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.h0 f105803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.s5 f105804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.ui.base.preference.h0 h0Var, com.tencent.mm.plugin.finder.extension.reddot.s5 s5Var) {
        super(0);
        this.f105803d = h0Var;
        this.f105804e = s5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.extension.reddot.s5 s5Var = this.f105804e;
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f105803d;
        if (h0Var != null) {
            h0Var.u(s5Var.f105857m);
        }
        s5Var.f105856l = false;
        return jz5.f0.f302826a;
    }
}
