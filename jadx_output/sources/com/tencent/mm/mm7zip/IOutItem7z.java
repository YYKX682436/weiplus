package com.tencent.mm.mm7zip;

/* loaded from: classes16.dex */
public interface IOutItem7z extends com.tencent.mm.mm7zip.IOutItemBase {
    java.lang.Integer getPropertyAttributes();

    java.lang.Boolean getPropertyIsAnti();

    java.lang.Boolean getPropertyIsDir();

    java.util.Date getPropertyLastModificationTime();

    java.lang.String getPropertyPath();

    void setPropertyAttributes(java.lang.Integer num);

    void setPropertyIsAnti(java.lang.Boolean bool);

    void setPropertyIsDir(java.lang.Boolean bool);

    void setPropertyLastModificationTime(java.util.Date date);

    void setPropertyPath(java.lang.String str);
}
