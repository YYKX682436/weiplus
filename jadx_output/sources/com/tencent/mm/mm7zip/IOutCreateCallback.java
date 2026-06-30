package com.tencent.mm.mm7zip;

/* loaded from: classes12.dex */
public interface IOutCreateCallback<T extends com.tencent.mm.mm7zip.IOutItemBase> extends com.tencent.mm.mm7zip.IProgress {
    T getItemInformation(int i17, com.tencent.mm.mm7zip.impl.OutItemFactory<T> outItemFactory);

    com.tencent.mm.mm7zip.ISequentialInStream getStream(int i17);

    void setOperationResult(boolean z17);
}
