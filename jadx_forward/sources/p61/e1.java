package p61;

/* loaded from: classes5.dex */
public class e1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.g1 f433771d;

    public e1(p61.g1 g1Var) {
        this.f433771d = g1Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.setHeaderTitle(com.p314xaae8f345.mm.R.C30867xcad56011.agp);
        p61.g1 g1Var = this.f433771d;
        if ((g1Var.f433794d & 2) != 0) {
            g4Var.a(0, com.p314xaae8f345.mm.R.C30867xcad56011.ah9);
        }
        if ((g1Var.f433794d & 1) != 0) {
            g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.f572243ag1);
        }
    }
}
