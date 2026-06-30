package at4;

/* loaded from: classes9.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f13907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f13908f;

    public n1(int i17, java.util.Map map, java.lang.Object[] objArr) {
        this.f13906d = i17;
        this.f13907e = map;
        this.f13908f = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = at4.p1.f13926b;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                at4.i0 i0Var = (at4.i0) it.next();
                if (i0Var != null) {
                    i0Var.c6(this.f13906d, this.f13907e, this.f13908f);
                }
            }
        }
    }
}
