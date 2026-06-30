package ad5;

/* loaded from: classes3.dex */
public final class d0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3243d;

    public d0(android.content.Context context) {
        this.f3243d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f3243d;
        g4Var.g(1, context.getString(com.tencent.mm.R.string.pcq), com.tencent.mm.R.raw.icons_outlined_download);
        g4Var.g(2, context.getString(com.tencent.mm.R.string.pb_), com.tencent.mm.R.raw.icons_outlined_download);
    }
}
