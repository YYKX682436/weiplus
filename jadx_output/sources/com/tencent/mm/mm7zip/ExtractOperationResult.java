package com.tencent.mm.mm7zip;

/* loaded from: classes6.dex */
public enum ExtractOperationResult {
    OK,
    UNSUPPORTEDMETHOD,
    DATAERROR,
    CRCERROR,
    UNAVAILABLE,
    UNEXPECTED_END,
    DATA_AFTER_END,
    IS_NOT_ARC,
    HEADERS_ERROR,
    WRONG_PASSWORD,
    UNKNOWN_OPERATION_RESULT;

    public static com.tencent.mm.mm7zip.ExtractOperationResult getOperationResult(int i17) {
        return (i17 < 0 || i17 >= values().length) ? UNKNOWN_OPERATION_RESULT : values()[i17];
    }
}
