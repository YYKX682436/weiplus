package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f92631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f92631d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        qo1.j0 it = (qo1.j0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it instanceof qo1.f0) {
            this.f92631d.f310123d = it;
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
