package ag5;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f4705a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f4706b = 250;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4710f = true;

    /* renamed from: c, reason: collision with root package name */
    public long f4707c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f4708d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f4709e = -1;

    public b(ag5.c cVar) {
    }

    public void a() {
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f4705a;
            if (i17 >= sparseArray.size()) {
                sparseArray.clear();
                this.f4708d = -1;
                this.f4709e = -1;
                this.f4707c = -1L;
                this.f4710f = true;
                return;
            }
            ((android.animation.Animator) sparseArray.get(sparseArray.keyAt(i17))).cancel();
            i17++;
        }
    }
}
