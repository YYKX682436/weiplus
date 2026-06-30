package fe;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: l, reason: collision with root package name */
    public static final android.util.SparseArray f342885l = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public yg.h f342891f;

    /* renamed from: a, reason: collision with root package name */
    public int f342886a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f342887b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f342888c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342889d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f342890e = false;

    /* renamed from: g, reason: collision with root package name */
    public int f342892g = -1;

    /* renamed from: h, reason: collision with root package name */
    public float f342893h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f342894i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final fe.f f342895j = new fe.f(null);

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f342896k = new fe.c(this);

    public static fe.g a(java.lang.String str) {
        fe.g gVar;
        int hashCode = str.hashCode();
        android.util.SparseArray sparseArray = f342885l;
        synchronized (sparseArray) {
            gVar = (fe.g) sparseArray.get(hashCode);
            if (gVar == null) {
                gVar = new fe.g();
                sparseArray.put(hashCode, gVar);
            }
        }
        return gVar;
    }

    public static void b(java.lang.String str) {
        fe.g gVar;
        int hashCode = str.hashCode();
        android.util.SparseArray sparseArray = f342885l;
        synchronized (sparseArray) {
            int indexOfKey = sparseArray.indexOfKey(hashCode);
            if (indexOfKey >= 0) {
                gVar = (fe.g) sparseArray.valueAt(indexOfKey);
                sparseArray.removeAt(indexOfKey);
            } else {
                gVar = null;
            }
        }
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: release!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(gVar.f342889d, gVar.f342896k);
        }
    }
}
