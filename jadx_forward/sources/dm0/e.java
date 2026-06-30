package dm0;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public org.p3367x5a555907.p3368x32b0ae.d f323162a;

    public e(java.lang.String str) {
    }

    public float[] a(float[] fArr, int i17) {
        org.p3367x5a555907.p3368x32b0ae.d dVar = this.f323162a;
        if (!(dVar != null && fArr != null && dVar.c() == 1 && this.f323162a.b(0).i() == fArr.length)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.TfLiteMultiClassifyPredict", "input data invalid");
            return null;
        }
        float[][] fArr2 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, i17);
        float[] fArr3 = fArr2[0];
        org.p3367x5a555907.p3368x32b0ae.d dVar2 = this.f323162a;
        if (!(dVar2 != null && fArr3 != null && dVar2.i() == 1 && this.f323162a.f(0).i() == fArr3.length)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.TfLiteMultiClassifyPredict", "output data invalid");
            return null;
        }
        org.p3367x5a555907.p3368x32b0ae.d dVar3 = this.f323162a;
        dVar3.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(0, fArr2);
        dVar3.j(new java.lang.Object[]{fArr}, hashMap);
        return fArr2[0];
    }
}
