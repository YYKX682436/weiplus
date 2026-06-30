package zl1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.t f555104d;

    public b(zl1.t tVar) {
        this.f555104d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            zl1.t tVar = this.f555104d;
            if (i17 >= tVar.f555153i.size()) {
                return;
            }
            tVar.g(tVar.f555149e.getChildAt(i17), (zl1.r) tVar.f555153i.get(i17));
            i17++;
        }
    }
}
