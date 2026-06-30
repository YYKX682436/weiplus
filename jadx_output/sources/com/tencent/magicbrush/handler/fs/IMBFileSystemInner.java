package com.tencent.magicbrush.handler.fs;

/* loaded from: classes7.dex */
public interface IMBFileSystemInner {
    java.lang.String getAbsolutePath(java.lang.String str);

    void readDataFromURL(java.lang.String str);

    byte[] readDataFromURLSync(java.lang.String str);
}
