package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class KindaLiteMgr$stopDuplicateAndContinue$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ kotlin.jvm.internal.c0 $continued;
    final /* synthetic */ yz5.l $onContinue;
    final /* synthetic */ com.tencent.kinda.framework.kindalite.KindaLiteMgr.StartTask $task;
    final /* synthetic */ java.lang.Runnable $timeoutRunnable;
    final /* synthetic */ com.tencent.kinda.framework.kindalite.KindaLiteMgr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KindaLiteMgr$stopDuplicateAndContinue$1(kotlin.jvm.internal.c0 c0Var, com.tencent.kinda.framework.kindalite.KindaLiteMgr kindaLiteMgr, java.lang.Runnable runnable, com.tencent.kinda.framework.kindalite.KindaLiteMgr.StartTask startTask, yz5.l lVar) {
        super(0);
        this.$continued = c0Var;
        this.this$0 = kindaLiteMgr;
        this.$timeoutRunnable = runnable;
        this.$task = startTask;
        this.$onContinue = lVar;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m41invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m41invoke() {
        android.os.Handler handler;
        kotlin.jvm.internal.c0 c0Var = this.$continued;
        if (!c0Var.f310112d) {
            c0Var.f310112d = true;
            handler = this.this$0.mainHandler;
            handler.removeCallbacks(this.$timeoutRunnable);
            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.kindalite.KindaLiteMgr.TAG, "duplicatePayUseCase stopped, now start next url=" + this.$task.getUrl());
            this.$onContinue.invoke(this.$task);
            return;
        }
        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.kindalite.KindaLiteMgr.TAG, "duplicate.stop completion ignored (already continued)");
    }
}
