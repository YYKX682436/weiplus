package com.tencent.cloud.component.common.ai.clipphoto;

/* loaded from: classes12.dex */
public interface ClipPhotoEventListener {
    void doStartCompressImage();

    void getSelectPhotoUri(android.net.Uri uri);

    void sendBitmapWithBase64(java.lang.String str);

    void sendClipPhotoError(java.lang.String str);
}
