package com.tencent.mm.mm7zip.impl;

/* loaded from: classes16.dex */
public final class OutItem implements com.tencent.mm.mm7zip.IOutItemAllFormats {
    private java.lang.Long dataSize;
    private int index;
    private com.tencent.mm.mm7zip.IOutArchive<?> outArchive;
    private java.lang.Integer propertyAttributes;
    private java.util.Date propertyCreationTime;
    private java.lang.String propertyGroup;
    private java.lang.String propertyHardLink;
    private java.lang.Boolean propertyIsAnti;
    private java.lang.Boolean propertyIsDir;
    private java.util.Date propertyLastAccessTime;
    private java.util.Date propertyLastModificationTime;
    private java.lang.String propertyPath;
    private java.lang.Integer propertyPosixAttributes;
    private java.lang.String propertySymLink;
    private java.lang.String propertyUser;
    private java.lang.Boolean updateIsNewData;
    private java.lang.Boolean updateIsNewProperties;
    private java.lang.Integer updateOldArchiveItemIndex;

    public OutItem(com.tencent.mm.mm7zip.IOutArchive<?> iOutArchive, int i17) {
        this.outArchive = iOutArchive;
        this.index = i17;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public com.tencent.mm.mm7zip.ArchiveFormat getArchiveFormat() {
        return this.outArchive.getArchiveFormat();
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public java.lang.Long getDataSize() {
        return this.dataSize;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public int getIndex() {
        return this.index;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public com.tencent.mm.mm7zip.IOutArchive<?> getOutArchive() {
        return this.outArchive;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z, com.tencent.mm.mm7zip.IOutItemZip
    public java.lang.Integer getPropertyAttributes() {
        return this.propertyAttributes;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemZip
    public java.util.Date getPropertyCreationTime() {
        return this.propertyCreationTime;
    }

    public java.lang.String getPropertyGroup() {
        return this.propertyGroup;
    }

    public java.lang.String getPropertyHardLink() {
        return this.propertyHardLink;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z
    public java.lang.Boolean getPropertyIsAnti() {
        return this.propertyIsAnti;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z, com.tencent.mm.mm7zip.IOutItemZip
    public java.lang.Boolean getPropertyIsDir() {
        return this.propertyIsDir;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemZip
    public java.util.Date getPropertyLastAccessTime() {
        return this.propertyLastAccessTime;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z, com.tencent.mm.mm7zip.IOutItemZip
    public java.util.Date getPropertyLastModificationTime() {
        return this.propertyLastModificationTime;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z, com.tencent.mm.mm7zip.IOutItemZip
    public java.lang.String getPropertyPath() {
        return this.propertyPath;
    }

    public java.lang.Integer getPropertyPosixAttributes() {
        return this.propertyPosixAttributes;
    }

    public java.lang.String getPropertySymLink() {
        return this.propertySymLink;
    }

    public java.lang.String getPropertyUser() {
        return this.propertyUser;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public java.lang.Boolean getUpdateIsNewData() {
        return this.updateIsNewData;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public java.lang.Boolean getUpdateIsNewProperties() {
        return this.updateIsNewProperties;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public java.lang.Integer getUpdateOldArchiveItemIndex() {
        return this.updateOldArchiveItemIndex;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public void setDataSize(java.lang.Long l17) {
        this.dataSize = l17;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z, com.tencent.mm.mm7zip.IOutItemZip
    public void setPropertyAttributes(java.lang.Integer num) {
        this.propertyAttributes = num;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemZip
    public void setPropertyCreationTime(java.util.Date date) {
        this.propertyCreationTime = date;
    }

    public void setPropertyGroup(java.lang.String str) {
        this.propertyGroup = str;
    }

    public void setPropertyHardLink(java.lang.String str) {
        this.propertyHardLink = str;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z
    public void setPropertyIsAnti(java.lang.Boolean bool) {
        this.propertyIsAnti = bool;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z, com.tencent.mm.mm7zip.IOutItemZip
    public void setPropertyIsDir(java.lang.Boolean bool) {
        this.propertyIsDir = bool;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemZip
    public void setPropertyLastAccessTime(java.util.Date date) {
        this.propertyLastAccessTime = date;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z, com.tencent.mm.mm7zip.IOutItemZip
    public void setPropertyLastModificationTime(java.util.Date date) {
        this.propertyLastModificationTime = date;
    }

    @Override // com.tencent.mm.mm7zip.IOutItem7z, com.tencent.mm.mm7zip.IOutItemZip
    public void setPropertyPath(java.lang.String str) {
        this.propertyPath = str;
    }

    public void setPropertyPosixAttributes(java.lang.Integer num) {
        this.propertyPosixAttributes = num;
    }

    public void setPropertySymLink(java.lang.String str) {
        this.propertySymLink = str;
    }

    public void setPropertyUser(java.lang.String str) {
        this.propertyUser = str;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public void setUpdateIsNewData(java.lang.Boolean bool) {
        this.updateIsNewData = bool;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public void setUpdateIsNewProperties(java.lang.Boolean bool) {
        this.updateIsNewProperties = bool;
    }

    @Override // com.tencent.mm.mm7zip.IOutItemBase
    public void setUpdateOldArchiveItemIndex(java.lang.Integer num) {
        this.updateOldArchiveItemIndex = num;
    }

    public void verify(boolean z17) {
        if (z17) {
            if (this.updateIsNewData == null) {
                throw new com.tencent.mm.mm7zip.SevenZipException("updateIsNewData can't be null");
            }
            if (this.updateIsNewProperties == null) {
                throw new com.tencent.mm.mm7zip.SevenZipException("updateIsNewProperties can't be null");
            }
            java.lang.Integer num = this.updateOldArchiveItemIndex;
            if (num == null) {
                throw new com.tencent.mm.mm7zip.SevenZipException("updateOldArchiveItemIndex can't be null");
            }
            if (num.intValue() == -1) {
                if (!this.updateIsNewData.booleanValue()) {
                    throw new com.tencent.mm.mm7zip.SevenZipException("updateOldArchiveItemIndex must be provided (updateIsNewData is false)");
                }
                if (!this.updateIsNewProperties.booleanValue()) {
                    throw new com.tencent.mm.mm7zip.SevenZipException("updateOldArchiveItemIndex must be provided (updateIsNewProperties is false)");
                }
            }
            if (this.updateIsNewData.booleanValue() && !this.updateIsNewProperties.booleanValue()) {
                throw new com.tencent.mm.mm7zip.SevenZipException("updateIsNewProperties must be set (updateIsNewData is true)");
            }
        }
    }
}
