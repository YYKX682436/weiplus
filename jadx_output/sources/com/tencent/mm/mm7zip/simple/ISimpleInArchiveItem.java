package com.tencent.mm.mm7zip.simple;

/* loaded from: classes16.dex */
public interface ISimpleInArchiveItem {
    com.tencent.mm.mm7zip.ExtractOperationResult extractSlow(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream);

    com.tencent.mm.mm7zip.ExtractOperationResult extractSlow(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, java.lang.String str);

    java.lang.Integer getAttributes();

    java.lang.Integer getCRC();

    java.lang.String getComment();

    java.util.Date getCreationTime();

    java.lang.String getGroup();

    java.lang.String getHostOS();

    int getItemIndex();

    java.util.Date getLastAccessTime();

    java.util.Date getLastWriteTime();

    java.lang.String getMethod();

    java.lang.Long getPackedSize();

    java.lang.String getPath();

    java.lang.Integer getPosition();

    java.lang.Long getSize();

    java.lang.String getUser();

    java.lang.Boolean isCommented();

    boolean isEncrypted();

    boolean isFolder();
}
