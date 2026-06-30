package com.tencent.mm.opensdk.diffdev.a;

/* loaded from: classes11.dex */
public enum g {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);

    private int code;

    g(int i17) {
        this.code = i17;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "UUIDStatusCode:" + this.code;
    }
}
