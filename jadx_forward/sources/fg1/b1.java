package fg1;

/* loaded from: classes7.dex */
public class b1 implements ye1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg1.f1 f343385a;

    public b1(fg1.f1 f1Var) {
        this.f343385a = f1Var;
    }

    @Override // ye1.m
    public void a(ye1.e eVar) {
        this.f343385a.f343393c = true;
        fg1.f1 f1Var = this.f343385a;
        if (f1Var.f343392b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f343391a, "onLoadEnd from OnPreparedListener");
            fg1.f1 f1Var2 = this.f343385a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) f1Var2.f343392b).b(f1Var2);
        }
    }
}
