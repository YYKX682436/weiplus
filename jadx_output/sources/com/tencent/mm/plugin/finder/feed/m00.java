package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class m00 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v00 f107339a;

    public m00(com.tencent.mm.plugin.finder.feed.v00 v00Var) {
        this.f107339a = v00Var;
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var;
        kotlin.jvm.internal.o.g(reason, "reason");
        if (reason.f463523h <= 0) {
            java.lang.CharSequence charSequence = reason.f463518c;
            if ((charSequence == null || charSequence.length() == 0) || (d1Var = (com.tencent.mm.plugin.finder.viewmodel.component.d1) ((jz5.n) this.f107339a.f110853n).getValue()) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.viewmodel.component.d1.S6(d1Var, true, reason.f463518c, 0L, null, 12, null);
        }
    }
}
