package r9;

/* loaded from: classes15.dex */
public final class o implements r9.b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f474923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f474924b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.a[] f474925c;

    /* renamed from: d, reason: collision with root package name */
    public int f474926d;

    /* renamed from: e, reason: collision with root package name */
    public int f474927e;

    /* renamed from: f, reason: collision with root package name */
    public int f474928f;

    /* renamed from: g, reason: collision with root package name */
    public r9.a[] f474929g;

    public o(boolean z17, int i17) {
        t9.a.a(i17 > 0);
        this.f474923a = z17;
        this.f474924b = i17;
        this.f474928f = 0;
        this.f474929g = new r9.a[100];
        this.f474925c = new r9.a[1];
    }

    public synchronized void a(r9.a[] aVarArr) {
        boolean z17;
        int i17 = this.f474928f;
        int length = aVarArr.length + i17;
        r9.a[] aVarArr2 = this.f474929g;
        if (length >= aVarArr2.length) {
            this.f474929g = (r9.a[]) java.util.Arrays.copyOf(aVarArr2, java.lang.Math.max(aVarArr2.length * 2, i17 + aVarArr.length));
        }
        for (r9.a aVar : aVarArr) {
            byte[] bArr = aVar.f474873a;
            if (bArr != null && bArr.length != this.f474924b) {
                z17 = false;
                t9.a.a(z17);
                r9.a[] aVarArr3 = this.f474929g;
                int i18 = this.f474928f;
                this.f474928f = i18 + 1;
                aVarArr3[i18] = aVar;
            }
            z17 = true;
            t9.a.a(z17);
            r9.a[] aVarArr32 = this.f474929g;
            int i182 = this.f474928f;
            this.f474928f = i182 + 1;
            aVarArr32[i182] = aVar;
        }
        this.f474927e -= aVarArr.length;
        notifyAll();
    }

    public synchronized void b() {
        int i17 = this.f474926d;
        int i18 = this.f474924b;
        int i19 = t9.d0.f498031a;
        int max = java.lang.Math.max(0, (((i17 + i18) - 1) / i18) - this.f474927e);
        int i27 = this.f474928f;
        if (max >= i27) {
            return;
        }
        java.util.Arrays.fill(this.f474929g, max, i27, (java.lang.Object) null);
        this.f474928f = max;
    }
}
