package com.tencent.liteapp.gen;

/* loaded from: classes.dex */
public enum RunningAction {
    UNKNOWN(1),
    NOT_FIND_STORE(2),
    CHANGE_APP_UUID(3),
    NOT_FIND_PAGE(4),
    PKG_CHECK_SUM(5);

    private final int value;

    RunningAction(int i17) {
        this.value = i17;
    }

    public static com.tencent.liteapp.gen.RunningAction fromValue(int i17) {
        for (com.tencent.liteapp.gen.RunningAction runningAction : values()) {
            if (runningAction.value == i17) {
                return runningAction;
            }
        }
        return values()[0];
    }

    public int getValue() {
        return this.value;
    }
}
