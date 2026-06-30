package com.tencent.mm.mm7zip;

/* loaded from: classes16.dex */
public interface IArchiveExtractCallback extends com.tencent.mm.mm7zip.IProgress {
    com.tencent.mm.mm7zip.ISequentialOutStream getStream(int i17, com.tencent.mm.mm7zip.ExtractAskMode extractAskMode);

    void prepareOperation(com.tencent.mm.mm7zip.ExtractAskMode extractAskMode);

    void setOperationResult(com.tencent.mm.mm7zip.ExtractOperationResult extractOperationResult);
}
