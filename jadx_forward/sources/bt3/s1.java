package bt3;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f105932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zs3.y f105933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bt3.t1 f105934f;

    public s1(bt3.t1 t1Var, int i17, zs3.y yVar) {
        this.f105934f = t1Var;
        this.f105932d = i17;
        this.f105933e = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zs3.y yVar;
        int i17;
        java.util.Iterator it = this.f105934f.f105944e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            yVar = this.f105933e;
            i17 = this.f105932d;
            if (!hasNext) {
                break;
            } else {
                ((zs3.t) it.next()).B0(i17, yVar);
            }
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(zs3.x.class)).all().iterator();
        while (it6.hasNext()) {
            ((zs3.x) ((fs.q) it6.next()).get()).B0(i17, yVar);
        }
    }
}
