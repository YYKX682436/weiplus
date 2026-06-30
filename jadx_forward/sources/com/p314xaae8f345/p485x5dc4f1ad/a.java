package com.p314xaae8f345.p485x5dc4f1ad;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.p485x5dc4f1ad.c0 {
    public com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad h() {
        f06.v[] vVarArr;
        double floatValue;
        com.p314xaae8f345.p485x5dc4f1ad.c cVar = this.f130144m;
        int i17 = com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad.f130119q;
        boolean z17 = false;
        try {
            vVarArr = com.p314xaae8f345.p485x5dc4f1ad.c0.I;
            floatValue = ((java.lang.Number) cVar.a(this, vVarArr[6])).floatValue();
        } catch (java.lang.Exception e17) {
            if (this.f130146o) {
                throw e17;
            }
        }
        if (!(0.0d <= floatValue && floatValue <= 1.0d)) {
            throw new java.lang.IllegalStateException(("GcFactor must in [0, 1], but " + ((java.lang.Number) cVar.a(this, vVarArr[6])).floatValue()).toString());
        }
        if (this.f130132a == null) {
            throw new java.lang.IllegalStateException("AndroidContext invalid.".toString());
        }
        if (this.f130133b == null) {
            throw new java.lang.IllegalStateException("JsThreadHandler invalid.".toString());
        }
        if (this.f130134c == null) {
            throw new java.lang.IllegalStateException("v8RawPointer invalid. Please define which JsEngine magicbrush should use.".toString());
        }
        fh.d.b(this);
        if (this.f130138g == null) {
            fh.d.a(this, "FileSystem invalid, BindingFileSystem can not use. BE CAUTIOUS!");
        }
        fh.d.c(this);
        z17 = true;
        if (z17) {
            return new com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad(this, null);
        }
        return null;
    }
}
