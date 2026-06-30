package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteMgr$StartTask;", "it", "Ljz5/f0;", "invoke", "(Lcom/tencent/kinda/framework/kindalite/KindaLiteMgr$StartTask;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class KindaLiteMgr$processNext$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ com.tencent.kinda.framework.kindalite.KindaLiteMgr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KindaLiteMgr$processNext$1(com.tencent.kinda.framework.kindalite.KindaLiteMgr kindaLiteMgr) {
        super(1);
        this.this$0 = kindaLiteMgr;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.tencent.kinda.framework.kindalite.KindaLiteMgr.StartTask) obj);
        return jz5.f0.f302826a;
    }

    public final void invoke(com.tencent.kinda.framework.kindalite.KindaLiteMgr.StartTask it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.kinda.framework.kindalite.KindaLiteMgr.processNext$actuallyStartOrSkip(this.this$0, it);
    }
}
