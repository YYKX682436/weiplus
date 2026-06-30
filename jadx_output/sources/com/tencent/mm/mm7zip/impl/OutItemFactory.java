package com.tencent.mm.mm7zip.impl;

/* loaded from: classes16.dex */
public class OutItemFactory<T extends com.tencent.mm.mm7zip.IOutItemBase> {
    private static final java.lang.Long ZERO = 0L;
    private int index;
    private com.tencent.mm.mm7zip.IOutArchive<?> outArchive;

    /* renamed from: com.tencent.mm.mm7zip.impl.OutItemFactory$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$mm$mm7zip$ArchiveFormat;

        static {
            int[] iArr = new int[com.tencent.mm.mm7zip.ArchiveFormat.values().length];
            $SwitchMap$com$tencent$mm$mm7zip$ArchiveFormat = iArr;
            try {
                iArr[com.tencent.mm.mm7zip.ArchiveFormat.SEVEN_ZIP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$mm$mm7zip$ArchiveFormat[com.tencent.mm.mm7zip.ArchiveFormat.ZIP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public OutItemFactory(com.tencent.mm.mm7zip.IOutArchive<?> iOutArchive, int i17) {
        this.outArchive = iOutArchive;
        this.index = i17;
    }

    private com.tencent.mm.mm7zip.impl.OutItem createOutItemIntern() {
        com.tencent.mm.mm7zip.impl.OutItem outItem = new com.tencent.mm.mm7zip.impl.OutItem(this.outArchive, this.index);
        fillDefaultValues(outItem);
        return outItem;
    }

    private void fillDefaultValues(com.tencent.mm.mm7zip.impl.OutItem outItem) {
        if (this.outArchive.getConnectedInArchive() != null) {
            outItem.setUpdateOldArchiveItemIndex(-1);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            outItem.setUpdateIsNewData(bool);
            outItem.setUpdateIsNewProperties(bool);
        }
        outItem.setDataSize(ZERO);
        outItem.setPropertyLastModificationTime(new java.util.Date());
        int i17 = com.tencent.mm.mm7zip.impl.OutItemFactory.AnonymousClass1.$SwitchMap$com$tencent$mm$mm7zip$ArchiveFormat[outItem.getArchiveFormat().ordinal()];
        if (i17 == 1) {
            fillDefaultValues7z(outItem);
        } else {
            if (i17 == 2) {
                fillDefaultValuesZip(outItem);
                return;
            }
            throw new java.lang.RuntimeException("No default values strategy for the archive format '" + outItem.getArchiveFormat() + "'");
        }
    }

    private void fillDefaultValues7z(com.tencent.mm.mm7zip.IOutItem7z iOutItem7z) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        iOutItem7z.setPropertyIsAnti(bool);
        iOutItem7z.setPropertyIsDir(bool);
        iOutItem7z.setPropertyAttributes(0);
    }

    private void fillDefaultValuesZip(com.tencent.mm.mm7zip.IOutItemZip iOutItemZip) {
        iOutItemZip.setPropertyIsDir(java.lang.Boolean.FALSE);
        iOutItemZip.setPropertyAttributes(0);
    }

    public T createOutItem() {
        return createOutItemIntern();
    }

    public T createOutItemAndCloneProperties(int i17) {
        com.tencent.mm.mm7zip.IInArchive connectedInArchive = this.outArchive.getConnectedInArchive();
        if (connectedInArchive == null) {
            throw new java.lang.RuntimeException("Not an update operation");
        }
        com.tencent.mm.mm7zip.impl.OutItem createOutItemIntern = createOutItemIntern();
        createOutItemIntern.setUpdateOldArchiveItemIndex(java.lang.Integer.valueOf(i17));
        createOutItemIntern.setUpdateIsNewData(java.lang.Boolean.FALSE);
        createOutItemIntern.setUpdateIsNewProperties(java.lang.Boolean.TRUE);
        createOutItemIntern.setPropertyPath((java.lang.String) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.PATH));
        createOutItemIntern.setPropertyAttributes((java.lang.Integer) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.ATTRIBUTES));
        createOutItemIntern.setPropertyPosixAttributes((java.lang.Integer) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.POSIX_ATTRIB));
        createOutItemIntern.setPropertyUser((java.lang.String) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.USER));
        createOutItemIntern.setPropertyGroup((java.lang.String) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.GROUP));
        createOutItemIntern.setPropertyCreationTime((java.util.Date) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.CREATION_TIME));
        createOutItemIntern.setPropertyLastModificationTime((java.util.Date) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.LAST_MODIFICATION_TIME));
        createOutItemIntern.setPropertyLastAccessTime((java.util.Date) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.LAST_ACCESS_TIME));
        createOutItemIntern.setPropertyIsAnti((java.lang.Boolean) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.IS_ANTI));
        createOutItemIntern.setPropertyIsDir((java.lang.Boolean) connectedInArchive.getProperty(i17, com.tencent.mm.mm7zip.PropID.IS_FOLDER));
        return createOutItemIntern;
    }

    public T createOutItem(int i17) {
        if (this.outArchive.getConnectedInArchive() != null) {
            com.tencent.mm.mm7zip.impl.OutItem createOutItemIntern = createOutItemIntern();
            createOutItemIntern.setUpdateOldArchiveItemIndex(java.lang.Integer.valueOf(i17));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            createOutItemIntern.setUpdateIsNewData(bool);
            createOutItemIntern.setUpdateIsNewProperties(bool);
            return createOutItemIntern;
        }
        throw new java.lang.RuntimeException("Not an update operation");
    }
}
