package bj5;

/* loaded from: classes.dex */
public final class x0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f21244d;

    public x0(int i17, bj5.d1 d1Var, int i18) {
        this.f21244d = d1Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        bj5.d1 d1Var = this.f21244d;
        g4Var.f(1, d1Var.getContext().getString(com.tencent.mm.R.string.mbh));
        g4Var.d(2, d1Var.getContext().getResources().getColor(com.tencent.mm.R.color.f479483a32), d1Var.getContext().getString(com.tencent.mm.R.string.mb7));
    }
}
