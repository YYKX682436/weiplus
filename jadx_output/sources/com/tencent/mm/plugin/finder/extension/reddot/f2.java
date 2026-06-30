package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class f2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.k2 f105505d;

    public f2(com.tencent.mm.plugin.finder.extension.reddot.k2 k2Var) {
        this.f105505d = k2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        r45.f03 f03Var = z9Var != null ? z9Var.f105328b : null;
        if (kotlin.jvm.internal.o.b("FinderEntrance", z9Var.f105331e) && f03Var != null && z9Var.f105327a) {
            zy2.z9[] z9VarArr = zy2.z9.f477641d;
            this.f105505d.d(3, f03Var);
        }
    }
}
