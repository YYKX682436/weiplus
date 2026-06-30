package com.tencent.liteapp.gen;

/* loaded from: classes5.dex */
public enum LogType {
    UNDEFINED(1),
    PRELOAD(2),
    START(3),
    RUNNING(4),
    END(5),
    DOWNLOAD(6),
    OTHER(100),
    DESKTOP(101),
    DIRTY(102),
    DESKTOP_START(200),
    DESKTOP_END(299);

    private final int value;

    LogType(int i17) {
        this.value = i17;
    }

    public static com.tencent.liteapp.gen.LogType fromValue(int i17) {
        for (com.tencent.liteapp.gen.LogType logType : values()) {
            if (logType.value == i17) {
                return logType;
            }
        }
        return values()[0];
    }

    public int getValue() {
        return this.value;
    }
}
