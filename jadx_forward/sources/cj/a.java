package cj;

/* loaded from: classes12.dex */
public class a extends cj.c {
    @Override // cj.c
    public boolean b(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6 c4706x164388f6) {
        xi.e eVar = this.f123359b;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar = this.f123358a;
        if (eVar == null) {
            this.f123359b = new xi.e(fVar.f477391d);
        }
        java.io.File a17 = this.f123359b.a(true);
        if (a17 != null) {
            fVar.b(c4706x164388f6.f20017xf8a7db47, true);
            fVar.d();
            ti.w0 w0Var = new ti.w0(a17, c4706x164388f6.f20020x32b2b2, c4706x164388f6.f20017xf8a7db47);
            if (this.f123360c == null) {
                this.f123360c = new cj.b(this);
            }
            ((cj.b) this.f123360c).a(w0Var);
        } else {
            oj.j.c("Matrix.LeakProcessor.AutoDump", "heap dump for further analyzing activity with key [%s] was failed, just ignore.", c4706x164388f6.f20020x32b2b2);
        }
        return true;
    }
}
