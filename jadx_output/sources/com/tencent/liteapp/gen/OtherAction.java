package com.tencent.liteapp.gen;

/* loaded from: classes15.dex */
public enum OtherAction {
    UNKNOWN(1),
    BATCH_CHECK_PACKAGE_UPDATE(2),
    BATCH_CHECK_PACKAGE_UPDATE_SUCCESS(3),
    BATCH_CHECK_PACKAGE_UPDATE_NO_NEED(4),
    BATCH_CHECK_PACKAGE_UPDATE_FAILED(5),
    BATCH_CHECK_PACKAGE_UPDATE_PARTIAL_FAILED(6),
    CHECK_BASE_LIBRARY_UPDATE(7),
    CHECK_BASE_LIBRARY_UPDATE_SUCCESS(8),
    CHECK_BASE_LIBRARY_UPDATE_NO_NEED(9),
    CHECK_BASE_LIBRARY_UPDATE_FAILED(10);

    private final int value;

    OtherAction(int i17) {
        this.value = i17;
    }

    public static com.tencent.liteapp.gen.OtherAction fromValue(int i17) {
        for (com.tencent.liteapp.gen.OtherAction otherAction : values()) {
            if (otherAction.value == i17) {
                return otherAction;
            }
        }
        return values()[0];
    }

    public int getValue() {
        return this.value;
    }
}
