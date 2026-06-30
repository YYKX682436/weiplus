package wp;

/* loaded from: classes16.dex */
public class i extends wp.f {
    public yp.o H;
    public boolean I;

    public i(xp.d dVar) {
        super(dVar);
        this.I = false;
    }

    @Override // wp.a
    public int j() {
        return -2147483647;
    }

    @Override // wp.a
    public zp.d r(zp.m mVar) {
        android.view.View d17;
        yp.o oVar = this.H;
        if (oVar != null && (d17 = oVar.d(mVar)) != null) {
            if (this.A) {
                vp.k.f520319p0.post(new wp.g(this, d17));
            } else {
                vp.d.f520272x0.post(new wp.h(this, d17));
            }
        }
        return super.r(mVar);
    }

    @Override // wp.a
    public void v() {
        super.v();
        this.I = false;
    }
}
