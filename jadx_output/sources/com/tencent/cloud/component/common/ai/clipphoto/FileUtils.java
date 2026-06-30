package com.tencent.cloud.component.common.ai.clipphoto;

/* loaded from: classes12.dex */
public class FileUtils {
    public static android.net.Uri uri;

    public static java.io.File createImageFile(android.content.Context context, boolean z17) {
        java.lang.String str;
        try {
            java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
            if (z17) {
                str = "txc_ocr_" + format + "_crop.jpg";
            } else {
                str = "txc_ocr_" + format + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(getAppRootDirPath(context));
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

    public static void deleteFile(java.io.File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }

    public static java.io.File getAppRootDirPath(android.content.Context context) {
        return context.getExternalFilesDir(null).getAbsoluteFile();
    }
}
