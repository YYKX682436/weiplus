package at2;

/* loaded from: classes3.dex */
public final class e0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.h0 f13652d;

    public e0(at2.h0 h0Var) {
        this.f13652d = h0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            at2.h0 h0Var = this.f13652d;
            g4Var.d(8, h0Var.f13676e.getResources().getColor(com.tencent.mm.R.color.f478532ac), h0Var.f13676e.getResources().getString(com.tencent.mm.R.string.eae));
        }
    }
}
