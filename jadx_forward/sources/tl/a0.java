package tl;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f501557d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f501558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tl.d0 f501559f;

    public a0(tl.d0 d0Var) {
        this.f501559f = d0Var;
        int i17 = d0Var.f501563e;
        this.f501557d = i17;
        this.f501558e = new byte[i17 * 2];
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int a17;
        int b17;
        this.f501559f.getClass();
        tl.d0 d0Var = this.f501559f;
        synchronized (d0Var.f501573o) {
            to.b bVar = d0Var.f501571m;
            i17 = bVar != null ? bVar.f502413a : -1;
        }
        int i18 = (int) (i17 * 0.8d);
        tl.d0 d0Var2 = this.f501559f;
        int i19 = d0Var2.f501563e;
        if (i18 < i19 * 8) {
            i18 = i19 * 8;
        }
        synchronized (d0Var2.f501573o) {
            to.b bVar2 = d0Var2.f501571m;
            a17 = bVar2 != null ? bVar2.a() : -1;
        }
        int i27 = a17 <= i18 ? 1 : 8;
        for (int i28 = 0; i28 < i27; i28++) {
            tl.d0 d0Var3 = this.f501559f;
            byte[] bArr = this.f501558e;
            int i29 = this.f501557d;
            synchronized (d0Var3.f501573o) {
                to.b bVar3 = d0Var3.f501571m;
                b17 = bVar3 != null ? bVar3.b(bArr, i29) : -1;
            }
            tl.c cVar = this.f501559f.f501572n;
            if (cVar != null && b17 == 0) {
                cVar.b(this.f501558e, this.f501557d);
            }
        }
    }
}
