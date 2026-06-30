package com.tencent.mapsdk.engine.jni.models;

/* loaded from: classes13.dex */
public class IconImageInfo {
    public float anchorPointX1;
    public float anchorPointY1;
    public android.graphics.Bitmap bitmap;
    public float scale;

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("IconImageInfo{bitmap=");
        if (this.bitmap != null) {
            str = this.bitmap.getWidth() + ":" + this.bitmap.getHeight();
        } else {
            str = null;
        }
        stringBuffer.append(str);
        stringBuffer.append(", scale=");
        stringBuffer.append(this.scale);
        stringBuffer.append(", anchorPointX1=");
        stringBuffer.append(this.anchorPointX1);
        stringBuffer.append(", anchorPointY1=");
        stringBuffer.append(this.anchorPointY1);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
