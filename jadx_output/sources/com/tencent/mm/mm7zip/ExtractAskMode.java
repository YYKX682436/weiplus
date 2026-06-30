package com.tencent.mm.mm7zip;

/* loaded from: classes6.dex */
public enum ExtractAskMode {
    EXTRACT,
    TEST,
    SKIP,
    UNKNOWN_ASK_MODE;

    public static com.tencent.mm.mm7zip.ExtractAskMode getExtractAskModeByIndex(int i17) {
        return (i17 < 0 || i17 >= values().length) ? UNKNOWN_ASK_MODE : values()[i17];
    }
}
