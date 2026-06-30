package com.tencent.liteapp.gen;

/* loaded from: classes.dex */
public enum DirtyAction {
    UNKNOWN(1),
    DUPLICATE_ACTION(2),
    MISSING_ACTION(3);

    private final int value;

    DirtyAction(int i17) {
        this.value = i17;
    }

    public static com.tencent.liteapp.gen.DirtyAction fromValue(int i17) {
        for (com.tencent.liteapp.gen.DirtyAction dirtyAction : values()) {
            if (dirtyAction.value == i17) {
                return dirtyAction;
            }
        }
        return values()[0];
    }

    public int getValue() {
        return this.value;
    }
}
