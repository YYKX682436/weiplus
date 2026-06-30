package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ih implements ju2.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103670a;

    public ih(in5.s0 s0Var) {
        this.f103670a = s0Var;
    }

    @Override // ju2.s
    public void a() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        android.content.Context context = this.f103670a.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        finderMsgContract.a(context, 1);
    }
}
