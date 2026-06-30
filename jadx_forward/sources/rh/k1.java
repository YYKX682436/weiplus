package rh;

/* loaded from: classes12.dex */
public class k1 extends rh.g {

    /* renamed from: k, reason: collision with root package name */
    public wh.n1 f476968k;

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
        if (z17 || this.f476968k != null) {
            return;
        }
        this.f476827a.f444870f.post(new rh.d1(this));
    }

    @Override // rh.e3
    public int b() {
        return 0;
    }

    @Override // rh.g, rh.a, rh.e3
    public void c() {
        super.c();
        z();
    }

    @Override // rh.g, rh.a
    public java.lang.String i() {
        return "Matrix.battery.CpuStatFeature";
    }

    public rh.f1 w() {
        return x(android.os.Process.myPid());
    }

    public rh.f1 x(int i17) {
        rh.f1 f1Var = new rh.f1();
        try {
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.battery.CpuStatFeature", "Read cpu core state fail: " + e17.getMessage(), new java.lang.Object[0]);
            f1Var.f476898c = false;
        }
        if (!y()) {
            throw new java.io.IOException("PowerProfile not supported");
        }
        synchronized (this) {
            if (!y()) {
                throw new java.io.IOException("PowerProfile not supported");
            }
            if (i17 == android.os.Process.myPid()) {
                f1Var.f476918d = new java.util.ArrayList();
                for (int i18 = 0; i18 < this.f476968k.g(); i18++) {
                    wh.n1 n1Var = this.f476968k;
                    f1Var.f476918d.add(rh.y2.a(new wh.v0(i18, n1Var.i(n1Var.f(i18))).a()));
                }
            }
            int length = this.f476968k.f527375a.length;
            int[] iArr = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                iArr[i19] = this.f476968k.i(i19);
            }
            java.util.List a17 = new wh.w0(i17, iArr).a();
            f1Var.f476919e = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            while (it.hasNext()) {
                f1Var.f476919e.add(rh.y2.a((long[]) it.next()));
            }
        }
        return f1Var;
    }

    public boolean y() {
        return this.f476968k != null;
    }

    public final void z() {
        if (this.f476968k != null) {
            return;
        }
        synchronized (this) {
            if (this.f476968k != null) {
                return;
            }
            try {
                this.f476968k = wh.n1.j(this.f476827a.d());
                for (int i17 = 0; i17 < this.f476968k.g(); i17++) {
                    wh.n1 n1Var = this.f476968k;
                    new wh.v0(i17, n1Var.i(n1Var.f(i17))).b();
                }
                int length = this.f476968k.f527375a.length;
                int[] iArr = new int[length];
                for (int i18 = 0; i18 < length; i18++) {
                    iArr[i18] = this.f476968k.i(i18);
                }
                new wh.w0(android.os.Process.myPid(), iArr).b();
            } catch (java.io.IOException e17) {
                oj.j.f("Matrix.battery.CpuStatFeature", "Init cpuStat failed: " + e17.getMessage(), new java.lang.Object[0]);
                this.f476968k = null;
            }
        }
    }
}
