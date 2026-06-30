package com.p314xaae8f345.mm.p930xc01b152a;

/* renamed from: com.tencent.mm.mm7zip.ExtractOperationResult */
/* loaded from: classes6.dex */
public enum EnumC11032xedd175c3 {
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

    /* renamed from: getOperationResult */
    public static com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 m47558x759d722e(int i17) {
        return (i17 < 0 || i17 >= m47560xcee59d22().length) ? UNKNOWN_OPERATION_RESULT : m47560xcee59d22()[i17];
    }
}
