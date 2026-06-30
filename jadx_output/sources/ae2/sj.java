package ae2;

/* loaded from: classes.dex */
public final class sj implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f4177d;

    public sj(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f4177d = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f4177d.o(null);
        g4Var.clear();
        for (int i17 = 1; i17 < 16; i17++) {
            g4Var.f(i17, java.lang.String.valueOf(i17));
        }
    }
}
