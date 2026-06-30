package in2;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f374470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f374471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in2.t f374472f;

    public z(int i17, in2.f0 f0Var, in2.t tVar) {
        this.f374470d = i17;
        this.f374471e = f0Var;
        this.f374472f = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar;
        in2.f0 f0Var = this.f374471e;
        int i17 = f0Var.f374365q;
        int i18 = this.f374470d;
        int i19 = i18 - i17;
        f0Var.f374365q = i18;
        int[] iArr = new int[2];
        in2.t tVar = this.f374472f;
        tVar.f3639x46306858.getLocationInWindow(iArr);
        yz5.q qVar = f0Var.f374363o;
        if (qVar != null) {
            qVar.mo147xb9724478(java.lang.Integer.valueOf(iArr[1] + tVar.f374435h.getHeight()), java.lang.Boolean.valueOf(f0Var.f374367s), java.lang.Integer.valueOf(i19));
        }
        if (i18 == f0Var.f374359h.size() - 2 && (lVar = f0Var.f374364p) != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(f0Var.f374359h.size() - 2));
        }
        tVar.f374435h.postDelayed(new in2.y(tVar), 300L);
        f0Var.f374367s = true;
    }
}
