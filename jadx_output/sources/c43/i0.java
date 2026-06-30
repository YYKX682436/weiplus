package c43;

/* loaded from: classes8.dex */
public class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f38436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.x f38437e;

    public i0(c43.x xVar, boolean z17) {
        this.f38437e = xVar;
        this.f38436d = z17;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.f(11, this.f38437e.f38492g.getString(this.f38436d ? com.tencent.mm.R.string.bb7 : com.tencent.mm.R.string.i1p));
    }
}
