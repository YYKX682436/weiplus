package eu2;

/* loaded from: classes2.dex */
public final class m extends do2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f338333d;

    public m(eu2.b0 b0Var) {
        this.f338333d = b0Var;
    }

    @Override // do2.f, cw2.fb
    public void F(r45.mb4 mb4Var) {
        eu2.b0 b0Var = this.f338333d;
        cw2.da daVar = b0Var.f338290d;
        cw2.wa f212289y = daVar != null ? daVar.getF212289y() : null;
        cw2.da daVar2 = b0Var.f338290d;
        java.lang.Long valueOf = daVar2 != null ? java.lang.Long.valueOf(daVar2.mo56685x3d7f3f1d()) : null;
        if (b0Var.Vi(f212289y, "onReplay")) {
            return;
        }
        b0Var.rj(f212289y, true, null, valueOf);
        b0Var.pj();
    }

    @Override // do2.f, cw2.fb
    public void h(r45.mb4 mb4Var) {
        eu2.b0 b0Var = this.f338333d;
        cw2.da daVar = b0Var.f338290d;
        cw2.wa f212289y = daVar != null ? daVar.getF212289y() : null;
        cw2.da daVar2 = b0Var.f338290d;
        java.lang.Long valueOf = daVar2 != null ? java.lang.Long.valueOf(daVar2.mo56685x3d7f3f1d()) : null;
        if (b0Var.Vi(f212289y, "onPlay")) {
            return;
        }
        b0Var.rj(f212289y, true, null, valueOf);
    }

    @Override // do2.f, cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        eu2.b0 b0Var = this.f338333d;
        cw2.da daVar = b0Var.f338290d;
        cw2.wa f212289y = daVar != null ? daVar.getF212289y() : null;
        cw2.da daVar2 = b0Var.f338290d;
        java.lang.Long valueOf = daVar2 != null ? java.lang.Long.valueOf(daVar2.mo56685x3d7f3f1d()) : null;
        if (b0Var.Vi(f212289y, "onPause")) {
            return;
        }
        b0Var.rj(f212289y, false, null, valueOf);
        b0Var.oj();
    }

    @Override // do2.f, cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
        eu2.b0 b0Var = this.f338333d;
        cw2.da daVar = b0Var.f338290d;
        cw2.wa f212289y = daVar != null ? daVar.getF212289y() : null;
        cw2.da daVar2 = b0Var.f338290d;
        b0Var.fj(f212289y, daVar2 != null ? java.lang.Long.valueOf(daVar2.mo56685x3d7f3f1d()) : null, null);
    }
}
