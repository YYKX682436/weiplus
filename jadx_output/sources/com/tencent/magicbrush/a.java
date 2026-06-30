package com.tencent.magicbrush;

/* loaded from: classes7.dex */
public class a extends com.tencent.magicbrush.c0 {
    public com.tencent.magicbrush.MagicBrush h() {
        f06.v[] vVarArr;
        double floatValue;
        com.tencent.magicbrush.c cVar = this.f48611m;
        int i17 = com.tencent.magicbrush.MagicBrush.f48586q;
        boolean z17 = false;
        try {
            vVarArr = com.tencent.magicbrush.c0.I;
            floatValue = ((java.lang.Number) cVar.a(this, vVarArr[6])).floatValue();
        } catch (java.lang.Exception e17) {
            if (this.f48613o) {
                throw e17;
            }
        }
        if (!(0.0d <= floatValue && floatValue <= 1.0d)) {
            throw new java.lang.IllegalStateException(("GcFactor must in [0, 1], but " + ((java.lang.Number) cVar.a(this, vVarArr[6])).floatValue()).toString());
        }
        if (this.f48599a == null) {
            throw new java.lang.IllegalStateException("AndroidContext invalid.".toString());
        }
        if (this.f48600b == null) {
            throw new java.lang.IllegalStateException("JsThreadHandler invalid.".toString());
        }
        if (this.f48601c == null) {
            throw new java.lang.IllegalStateException("v8RawPointer invalid. Please define which JsEngine magicbrush should use.".toString());
        }
        fh.d.b(this);
        if (this.f48605g == null) {
            fh.d.a(this, "FileSystem invalid, BindingFileSystem can not use. BE CAUTIOUS!");
        }
        fh.d.c(this);
        z17 = true;
        if (z17) {
            return new com.tencent.magicbrush.MagicBrush(this, null);
        }
        return null;
    }
}
