package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorBigImgData */
/* loaded from: classes14.dex */
public class C27937x22c90090 {

    /* renamed from: capture_time */
    public long f62457x2db8e026;

    /* renamed from: checksum */
    public java.lang.String f62458x5b9b5c43;

    /* renamed from: five_points */
    public java.util.ArrayList<java.lang.Float> f62459x3f7cd710;

    /* renamed from: image */
    public java.lang.String f62460x5faa95b;

    /* renamed from: getImage */
    public java.lang.String m121120x74984fa5() {
        return this.f62460x5faa95b;
    }

    /* renamed from: setCaptureTime */
    public void m121121x79f23571(long j17) {
        this.f62457x2db8e026 = j17;
    }

    /* renamed from: setChecksum */
    public void m121122xd22dfac5(java.lang.String str) {
        this.f62458x5b9b5c43 = str;
    }

    /* renamed from: setFivePoints */
    public void m121123x912af837(float[] fArr) {
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        this.f62459x3f7cd710 = arrayList;
        if (fArr != null) {
            arrayList.add(java.lang.Float.valueOf(fArr[176]));
            this.f62459x3f7cd710.add(java.lang.Float.valueOf(fArr[177]));
            this.f62459x3f7cd710.add(java.lang.Float.valueOf(fArr[178]));
            this.f62459x3f7cd710.add(java.lang.Float.valueOf(fArr[179]));
            this.f62459x3f7cd710.add(java.lang.Float.valueOf(fArr[64]));
            this.f62459x3f7cd710.add(java.lang.Float.valueOf(fArr[65]));
            this.f62459x3f7cd710.add(java.lang.Float.valueOf(fArr[90]));
            this.f62459x3f7cd710.add(java.lang.Float.valueOf(fArr[91]));
            this.f62459x3f7cd710.add(java.lang.Float.valueOf(fArr[102]));
            this.f62459x3f7cd710.add(java.lang.Float.valueOf(fArr[103]));
        }
    }

    /* renamed from: setImage */
    public void m121124x53266a19(java.lang.String str) {
        this.f62460x5faa95b = str;
    }
}
