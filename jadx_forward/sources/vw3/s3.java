package vw3;

/* loaded from: classes12.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f522640d;

    public s3(r45.b50 b50Var) {
        this.f522640d = b50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.cx4 cx4Var = new r45.cx4();
        cx4Var.f453432e = c01.id.c();
        cx4Var.f453431d = 0L;
        vg3.w4 w4Var = (vg3.w4) vg3.v4.f518294a.get(5);
        if (w4Var != null) {
            r45.b50 b50Var = this.f522640d;
            r45.cu5 cu5Var = b50Var.f452064e;
            w4Var.a(null, b50Var, 0, cu5Var != null ? cu5Var.f453374f.f273689a : null, false, cx4Var, null);
        }
        ((ku5.t0) ku5.t0.f394148d).B(vw3.r3.f522629d);
    }
}
