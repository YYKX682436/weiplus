package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p327xa15e2ce2;

/* renamed from: com.tencent.cloud.component.common.ai.clipphoto.FileUtils */
/* loaded from: classes12.dex */
public class C2898x28705875 {
    public static android.net.Uri uri;

    /* renamed from: createImageFile */
    public static java.io.File m21619x744dc7db(android.content.Context context, boolean z17) {
        java.lang.String str;
        try {
            java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
            if (z17) {
                str = "txc_ocr_" + format + "_crop.jpg";
            } else {
                str = "txc_ocr_" + format + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(m21621xfa3b0f25(context));
            java.lang.String str2 = java.io.File.separator;
            sb6.append(str2);
            sb6.append("capture");
            java.io.File file = new java.io.File(sb6.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            if (android.os.Build.VERSION.SDK_INT < 30) {
                return new java.io.File(file.getAbsolutePath() + str2 + str);
            }
            java.io.File file2 = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_PICTURES) + str2 + str);
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("_data", file2.getAbsolutePath());
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", "image/jpeg");
            uri = context.getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            return file2;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: deleteFile */
    public static void m21620x692721c7(java.io.File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }

    /* renamed from: getAppRootDirPath */
    public static java.io.File m21621xfa3b0f25(android.content.Context context) {
        return context.getExternalFilesDir(null).getAbsoluteFile();
    }
}
