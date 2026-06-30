package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class wb implements k91.d5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.yb f85340a;

    public wb(com.tencent.mm.plugin.appbrand.launching.yb ybVar) {
        this.f85340a = ybVar;
    }

    @Override // k91.d5
    public r45.y50 a() {
        r45.y50 y50Var = new r45.y50();
        com.tencent.mm.plugin.appbrand.launching.vb vbVar = this.f85340a.f85443d;
        y50Var.f390797d = vbVar.f85290s;
        if (vbVar.K) {
            y50Var.f390799f = 1;
        } else {
            y50Var.f390799f = 101;
        }
        vbVar.f85294w.a(y50Var);
        return y50Var;
    }

    @Override // k91.d5
    public int b() {
        return 0;
    }

    @Override // k91.d5
    public java.lang.String c() {
        return this.f85340a.f85443d.D;
    }
}
