package g04;

/* loaded from: classes12.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f349002a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final int f349003b;

    public l(g04.k kVar) {
        this.f349003b = -1;
        if (kVar != null) {
            this.f349003b = kVar.f348998a;
        } else {
            this.f349003b = -1;
        }
        if (kVar == null || kVar.f349001d == null) {
            return;
        }
        for (int i17 = 0; i17 < kVar.f349001d.length; i17++) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WordDetectDetailResultWrapper", "%d ratio %f", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(kVar.f349001d[i17]));
            this.f349002a.add(java.lang.Float.valueOf(kVar.f349001d[i17]));
        }
    }
}
