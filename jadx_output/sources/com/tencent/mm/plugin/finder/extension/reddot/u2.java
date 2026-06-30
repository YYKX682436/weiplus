package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.x2 f105884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.plugin.finder.extension.reddot.x2 x2Var) {
        super(0);
        this.f105884d = x2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.extension.reddot.x2 x2Var = this.f105884d;
        if (((com.tencent.mm.plugin.finder.extension.reddot.l5) x2Var.f105977e).f105664p) {
            com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
            if (aj0Var.A() || aj0Var.x() || ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "发现页红点频控使用AI预测", e42.c0.clicfg_finder_reddot_freq_ctrl_use_mode_predict, java.lang.Boolean.FALSE, false, com.tencent.mm.plugin.finder.storage.ug0.f128138d, 8, null)).booleanValue()) {
                return new kc2.g1(x2Var);
            }
        }
        return null;
    }
}
