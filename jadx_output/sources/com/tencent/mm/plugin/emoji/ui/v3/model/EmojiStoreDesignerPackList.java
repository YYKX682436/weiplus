package com.tencent.mm.plugin.emoji.ui.v3.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreDesignerPackList;", "", "", "Lr45/zj0;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "", "reqBuffer", "[B", "getReqBuffer", "()[B", "setReqBuffer", "([B)V", "<init>", "(Ljava/util/List;[B)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class EmojiStoreDesignerPackList {
    public static final int $stable = 8;
    private final java.util.List<r45.zj0> dataList;
    private byte[] reqBuffer;

    /* JADX WARN: Multi-variable type inference failed */
    public EmojiStoreDesignerPackList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final java.util.List<r45.zj0> getDataList() {
        return this.dataList;
    }

    public final byte[] getReqBuffer() {
        return this.reqBuffer;
    }

    public final void setReqBuffer(byte[] bArr) {
        this.reqBuffer = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmojiStoreDesignerPackList(java.util.List<? extends r45.zj0> dataList, byte[] bArr) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.dataList = dataList;
        this.reqBuffer = bArr;
    }

    public /* synthetic */ EmojiStoreDesignerPackList(java.util.List list, byte[] bArr, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? new java.util.LinkedList() : list, (i17 & 2) != 0 ? null : bArr);
    }
}
