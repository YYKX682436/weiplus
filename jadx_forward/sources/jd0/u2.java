package jd0;

@j95.b
/* loaded from: classes3.dex */
public final class u2 extends i95.w implements kd0.z2 {
    public boolean wi(int i17, int i18) {
        float f17 = (i18 * 1.0f) / i17;
        int i19 = gx5.b.f358988a;
        if (f17 <= i19 && f17 >= 1.0f / i19) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WordDetectImageCompressStrategy", "isOverRatioLimit ratio invalid " + f17);
        return true;
    }
}
