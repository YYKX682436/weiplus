package com.tencent.mm.mm7zip;

/* loaded from: classes16.dex */
public interface IOutItemZip extends com.tencent.mm.mm7zip.IOutItemBase {
    java.lang.Integer getPropertyAttributes();

    java.util.Date getPropertyCreationTime();

    java.lang.Boolean getPropertyIsDir();

    java.util.Date getPropertyLastAccessTime();

    java.util.Date getPropertyLastModificationTime();

    java.lang.String getPropertyPath();

    void setPropertyAttributes(java.lang.Integer num);

    void setPropertyCreationTime(java.util.Date date);

    void setPropertyIsDir(java.lang.Boolean bool);

    void setPropertyLastAccessTime(java.util.Date date);

    void setPropertyLastModificationTime(java.util.Date date);

    void setPropertyPath(java.lang.String str);
}
