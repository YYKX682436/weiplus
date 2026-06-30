package com.tencent.mars.cdn.proto;

/* loaded from: classes.dex */
public enum TaskStatus implements com.tencent.mm.protobuf.h {
    TASK_STATUS_RUNNING(0),
    TASK_STATUS_WAITING(1),
    TASK_STATUS_NOT_EXISTS(2),
    TASK_STATUS_COMPLETED(3);

    public static final int TASK_STATUS_COMPLETED_VALUE = 3;
    public static final int TASK_STATUS_NOT_EXISTS_VALUE = 2;
    public static final int TASK_STATUS_RUNNING_VALUE = 0;
    public static final int TASK_STATUS_WAITING_VALUE = 1;
    public final int value;

    TaskStatus(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.TaskStatus forNumber(int i17) {
        if (i17 == 0) {
            return TASK_STATUS_RUNNING;
        }
        if (i17 == 1) {
            return TASK_STATUS_WAITING;
        }
        if (i17 == 2) {
            return TASK_STATUS_NOT_EXISTS;
        }
        if (i17 != 3) {
            return null;
        }
        return TASK_STATUS_COMPLETED;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.TaskStatus valueOf(int i17) {
        return forNumber(i17);
    }
}
