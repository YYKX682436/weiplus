package at4;

/* loaded from: classes9.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f95440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f95441f;

    public n1(int i17, java.util.Map map, java.lang.Object[] objArr) {
        this.f95439d = i17;
        this.f95440e = map;
        this.f95441f = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = at4.p1.f95459b;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                at4.i0 i0Var = (at4.i0) it.next();
                if (i0Var != null) {
                    i0Var.c6(this.f95439d, this.f95440e, this.f95441f);
                }
            }
        }
    }
}
