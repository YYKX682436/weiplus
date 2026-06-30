package com.tencent.cloud.component.common.ai.clipphoto;

/* loaded from: classes12.dex */
public class ClipPhotoHolder {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener f45866a;

    /* renamed from: b, reason: collision with root package name */
    public android.net.Uri f45867b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.File f45868c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45869d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45870e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f45871f = 1024;

    /* renamed from: g, reason: collision with root package name */
    public int f45872g = 1;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Point f45873h = null;

    /* renamed from: com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass1 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f45874a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f45875b;

        public AnonymousClass1(boolean z17, android.app.Activity activity) {
            this.f45874a = z17;
            this.f45875b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder clipPhotoHolder;
            byte[] a17;
            com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder clipPhotoHolder2 = com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.this;
            try {
                if (clipPhotoHolder2.f45867b == null) {
                    com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.a(clipPhotoHolder2, "get image data is null！");
                    return;
                }
                try {
                    a17 = this.f45874a ? com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.a(clipPhotoHolder2, this.f45875b) : com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.b(clipPhotoHolder2, this.f45875b);
                } catch (java.lang.Exception e17) {
                    e17.getLocalizedMessage();
                    com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.a(com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.this, "clip error!");
                    clipPhotoHolder = com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.this;
                }
                if (a17 == null) {
                    com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.a(com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.this, "clip error! bitmapBytes is null");
                    return;
                }
                com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder clipPhotoHolder3 = com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.this;
                java.lang.String encodeToString = android.util.Base64.encodeToString(a17, 2);
                com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener clipPhotoEventListener = clipPhotoHolder3.f45866a;
                if (clipPhotoEventListener != null) {
                    clipPhotoEventListener.sendBitmapWithBase64(encodeToString);
                }
                clipPhotoHolder = com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.this;
                com.tencent.cloud.component.common.ai.clipphoto.FileUtils.deleteFile(clipPhotoHolder.f45868c);
            } finally {
                com.tencent.cloud.component.common.ai.clipphoto.FileUtils.deleteFile(com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.this.f45868c);
            }
        }
    }

    public static byte[] a(com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder clipPhotoHolder, android.app.Activity activity) {
        android.graphics.Bitmap createBitMapByUri = com.tencent.cloud.component.common.ai.utils.ImageCompressUtils.createBitMapByUri(activity, clipPhotoHolder.f45867b, clipPhotoHolder.f45872g, clipPhotoHolder.f45873h);
        byte[] compressBitmap = com.tencent.cloud.component.common.ai.utils.ImageCompressUtils.compressBitmap(createBitMapByUri, clipPhotoHolder.f45871f, clipPhotoHolder.f45872g);
        if (createBitMapByUri != null) {
            createBitMapByUri.recycle();
        }
        return compressBitmap;
    }

    public static byte[] b(com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder clipPhotoHolder, android.app.Activity activity) {
        java.lang.String path = com.tencent.cloud.component.common.ai.utils.ImageCompressUtils.getPath(activity, clipPhotoHolder.f45867b);
        int bitmapDegree = !android.text.TextUtils.isEmpty(path) ? com.tencent.cloud.component.common.ai.utils.ImageCompressUtils.getBitmapDegree(path) : 0;
        android.graphics.Point point = clipPhotoHolder.f45873h;
        if (point != null && (bitmapDegree == 90 || bitmapDegree == 270)) {
            android.graphics.Point point2 = clipPhotoHolder.f45873h;
            point = new android.graphics.Point(point2.y, point2.x);
        }
        android.graphics.Bitmap rotateBitmapByDegree = com.tencent.cloud.component.common.ai.utils.ImageCompressUtils.rotateBitmapByDegree(com.tencent.cloud.component.common.ai.utils.ImageCompressUtils.createBitMapByUri(activity, clipPhotoHolder.f45867b, clipPhotoHolder.f45872g, point), bitmapDegree);
        byte[] compressBitmap = com.tencent.cloud.component.common.ai.utils.ImageCompressUtils.compressBitmap(rotateBitmapByDegree, clipPhotoHolder.f45871f, clipPhotoHolder.f45872g);
        if (rotateBitmapByDegree != null) {
            rotateBitmapByDegree.recycle();
        }
        return compressBitmap;
    }

    public void onActivityResult(android.app.Activity activity, int i17, int i18, android.content.Intent intent) {
        com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener clipPhotoEventListener;
        if (activity == null) {
            return;
        }
        if (i17 == 2000) {
            if (i18 != -1) {
                a("select photo error code: " + i18);
            } else if (intent == null) {
                com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener clipPhotoEventListener2 = this.f45866a;
                if (clipPhotoEventListener2 != null) {
                    clipPhotoEventListener2.sendClipPhotoError("user cancel select photo!");
                }
            } else if (this.f45869d) {
                java.io.File createImageFile = com.tencent.cloud.component.common.ai.clipphoto.FileUtils.createImageFile(activity, true);
                this.f45868c = createImageFile;
                if (createImageFile != null) {
                    android.content.Intent intent2 = new android.content.Intent("com.android.camera.action.CROP");
                    intent2.addFlags(1);
                    intent2.addFlags(2);
                    intent2.putExtra("crop", "true");
                    intent2.putExtra("scale ", true);
                    intent2.putExtra("return-data", false);
                    intent2.putExtra("outputFormat", android.graphics.Bitmap.CompressFormat.JPEG.toString());
                    intent2.setDataAndType(intent.getData(), "image/*");
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        android.net.Uri uri = com.tencent.cloud.component.common.ai.clipphoto.FileUtils.uri;
                        this.f45867b = uri;
                        intent2.putExtra("output", uri);
                    } else {
                        android.net.Uri fromFile = android.net.Uri.fromFile(this.f45868c);
                        this.f45867b = fromFile;
                        intent2.putExtra("output", fromFile);
                    }
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(3000);
                        arrayList.add(intent2);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.k(activity, arrayList.toArray(), "com/tencent/cloud/component/common/ai/clipphoto/ClipPhotoHolder", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    } catch (java.lang.Exception e17) {
                        e17.getLocalizedMessage();
                        a(activity, intent);
                    }
                } else {
                    a(activity, intent);
                }
            } else if (!this.f45870e || (clipPhotoEventListener = this.f45866a) == null) {
                a(activity, intent);
            } else {
                clipPhotoEventListener.getSelectPhotoUri(intent.getData());
            }
        }
        if (i17 == 3000) {
            if (i18 != -1) {
                a("clip error code: " + i18);
            } else {
                com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener clipPhotoEventListener3 = this.f45866a;
                if (clipPhotoEventListener3 != null) {
                    clipPhotoEventListener3.doStartCompressImage();
                }
                com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.AnonymousClass1(true, activity));
            }
        }
    }

    public void release() {
        if (this.f45866a != null) {
            this.f45866a = null;
        }
    }

    public void setClipPhotoEventListener(com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener clipPhotoEventListener) {
        this.f45866a = clipPhotoEventListener;
    }

    public void setCompressImageSize(android.graphics.Point point) {
        this.f45873h = point;
    }

    public void setCompressLevel(int i17) {
        this.f45872g = i17;
    }

    public void setReturnOnlyUri(boolean z17) {
        this.f45870e = z17;
    }

    public void startSelectAlbum(android.app.Activity activity, boolean z17) {
        startSelectAlbum(activity, z17, 1024);
    }

    public void startSelectAlbum(android.app.Activity activity, boolean z17, int i17) {
        if (activity == null) {
            com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener clipPhotoEventListener = this.f45866a;
            if (clipPhotoEventListener != null) {
                clipPhotoEventListener.sendClipPhotoError("activity is null");
                return;
            }
            return;
        }
        this.f45871f = i17;
        this.f45869d = z17;
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.PICK");
        intent.setType("image/*");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(2000);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/cloud/component/common/ai/clipphoto/ClipPhotoHolder", "startSelectAlbum", "(Landroid/app/Activity;ZI)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void a(android.app.Activity activity, android.content.Intent intent) {
        this.f45867b = intent.getData();
        com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener clipPhotoEventListener = this.f45866a;
        if (clipPhotoEventListener != null) {
            clipPhotoEventListener.doStartCompressImage();
        }
        com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder.AnonymousClass1(false, activity));
    }

    public static void a(com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoHolder clipPhotoHolder, java.lang.String str) {
        com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener clipPhotoEventListener = clipPhotoHolder.f45866a;
        if (clipPhotoEventListener != null) {
            clipPhotoEventListener.sendClipPhotoError(str);
        }
    }

    public final void a(java.lang.String str) {
        com.tencent.cloud.component.common.ai.clipphoto.ClipPhotoEventListener clipPhotoEventListener = this.f45866a;
        if (clipPhotoEventListener != null) {
            clipPhotoEventListener.sendClipPhotoError(str);
        }
    }
}
