package t23;

/* loaded from: classes10.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t23.x1 f496810d;

    public u1(t23.x1 x1Var) {
        this.f496810d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaQueryService", "real run, %s.", this);
        t23.x1 x1Var = this.f496810d;
        java.util.LinkedList b17 = x1Var.f496829e.b();
        java.util.HashSet hashSet = x1Var.f496825a;
        int size = hashSet.size();
        t23.k1[] k1VarArr = new t23.k1[size];
        hashSet.toArray(k1VarArr);
        for (int i17 = 0; i17 < size; i17++) {
            k1VarArr[i17].F6(b17);
        }
        android.net.Uri uri = t23.o2.f496749e;
        java.util.LinkedList f17 = t23.n2.f496742a.f();
        java.util.HashSet hashSet2 = x1Var.f496826b;
        int size2 = hashSet2.size();
        t23.k1[] k1VarArr2 = new t23.k1[size2];
        hashSet2.toArray(k1VarArr2);
        for (int i18 = 0; i18 < size2; i18++) {
            k1VarArr2[i18].F6(f17);
        }
    }

    /* renamed from: toString */
    public java.lang.String m165770x9616526c() {
        return super.toString() + "|queryAlbums";
    }
}
