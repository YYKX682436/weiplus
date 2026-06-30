package com.tencent.mm.mm7zip;

/* loaded from: classes12.dex */
public interface IOutItemBase {
    com.tencent.mm.mm7zip.ArchiveFormat getArchiveFormat();

    java.lang.Long getDataSize();

    int getIndex();

    com.tencent.mm.mm7zip.IOutArchive<?> getOutArchive();

    java.lang.Boolean getUpdateIsNewData();

    java.lang.Boolean getUpdateIsNewProperties();

    java.lang.Integer getUpdateOldArchiveItemIndex();

    void setDataSize(java.lang.Long l17);

    void setUpdateIsNewData(java.lang.Boolean bool);

    void setUpdateIsNewProperties(java.lang.Boolean bool);

    void setUpdateOldArchiveItemIndex(java.lang.Integer num);
}
