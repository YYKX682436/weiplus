package fu5;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    public static volatile fu5.d f348444e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f348445a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f348446b = false;

    /* renamed from: c, reason: collision with root package name */
    public android.util.SparseArray f348447c = new android.util.SparseArray(10);

    /* renamed from: d, reason: collision with root package name */
    public android.content.SharedPreferences f348448d = null;

    public static fu5.d b() {
        fu5.d dVar;
        if (f348444e != null) {
            return f348444e;
        }
        synchronized (fu5.d.class) {
            if (f348444e == null) {
                f348444e = new fu5.d();
            }
            dVar = f348444e;
        }
        return dVar;
    }

    public android.util.SparseArray a() {
        android.util.SparseArray sparseArray;
        synchronized (fu5.d.class) {
            sparseArray = this.f348447c;
        }
        return sparseArray;
    }

    public android.content.SharedPreferences c() {
        android.content.SharedPreferences sharedPreferences;
        synchronized (fu5.d.class) {
            sharedPreferences = this.f348448d;
        }
        return sharedPreferences;
    }

    public boolean d() {
        boolean z17;
        synchronized (fu5.d.class) {
            z17 = this.f348445a;
        }
        return z17;
    }

    public boolean e() {
        boolean z17;
        synchronized (fu5.d.class) {
            z17 = this.f348446b;
        }
        return z17;
    }
}
