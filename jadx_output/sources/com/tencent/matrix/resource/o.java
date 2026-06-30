package com.tencent.matrix.resource;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.MemoryUtil.TaskResult f52963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.matrix.resource.MemoryUtil.TaskResult taskResult) {
        super(0);
        this.f52963d = taskResult;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean success;
        int i17;
        java.lang.Object waitException;
        int i18;
        int i19;
        java.lang.String state;
        int i27;
        java.lang.String state2;
        int i28;
        int i29;
        java.lang.String state3;
        com.tencent.matrix.resource.MemoryUtil.TaskResult taskResult = this.f52963d;
        success = taskResult.getSuccess();
        if (success) {
            return null;
        }
        i17 = taskResult.type;
        if (i17 == -1) {
            i18 = taskResult.code;
            waitException = new com.tencent.matrix.resource.MemoryUtil.WaitException(i18);
        } else if (i17 == 0) {
            i19 = taskResult.code;
            state = taskResult.getState();
            waitException = new com.tencent.matrix.resource.MemoryUtil.UnexpectedExitException(i19, state, taskResult.getError());
        } else if (i17 != 1) {
            i28 = taskResult.type;
            i29 = taskResult.code;
            state3 = taskResult.getState();
            waitException = new com.tencent.matrix.resource.MemoryUtil.UnknownAnalyzeException(i28, i29, state3, taskResult.getError());
        } else {
            i27 = taskResult.code;
            state2 = taskResult.getState();
            waitException = new com.tencent.matrix.resource.MemoryUtil.TerminateException(i27, state2, taskResult.getError());
        }
        return waitException;
    }
}
