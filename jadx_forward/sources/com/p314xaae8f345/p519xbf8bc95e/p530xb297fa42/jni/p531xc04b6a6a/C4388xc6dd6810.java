package com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a;

/* renamed from: com.tencent.mapsdk.engine.jni.models.IconImageInfo */
/* loaded from: classes13.dex */
public class C4388xc6dd6810 {

    /* renamed from: anchorPointX1 */
    public float f17349x578b8bf4;

    /* renamed from: anchorPointY1 */
    public float f17350x578b8c13;

    /* renamed from: bitmap */
    public android.graphics.Bitmap f17351xad38f12f;

    /* renamed from: scale */
    public float f17352x683094a;

    /* renamed from: toString */
    public java.lang.String m36378x9616526c() {
        java.lang.String str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("IconImageInfo{bitmap=");
        if (this.f17351xad38f12f != null) {
            str = this.f17351xad38f12f.getWidth() + ":" + this.f17351xad38f12f.getHeight();
        } else {
            str = null;
        }
        stringBuffer.append(str);
        stringBuffer.append(", scale=");
        stringBuffer.append(this.f17352x683094a);
        stringBuffer.append(", anchorPointX1=");
        stringBuffer.append(this.f17349x578b8bf4);
        stringBuffer.append(", anchorPointY1=");
        stringBuffer.append(this.f17350x578b8c13);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
