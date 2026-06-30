package b04;

/* loaded from: classes3.dex */
public final class b0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f16880d;

    public b0(b04.j0 j0Var) {
        this.f16880d = j0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        b04.j0 j0Var = this.f16880d;
        j0Var.getClass();
        menu.add(0, 0, 0, j0Var.getString(com.tencent.mm.R.string.nli));
    }
}
