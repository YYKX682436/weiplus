package ad5;

/* loaded from: classes3.dex */
public final class v implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3320d;

    public v(android.content.Context context) {
        this.f3320d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f3320d;
        g4Var.f(1, context.getString(com.tencent.mm.R.string.pcu));
        g4Var.f(2, context.getString(com.tencent.mm.R.string.pbb));
    }
}
