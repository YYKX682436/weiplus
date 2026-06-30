package cj4;

/* loaded from: classes.dex */
public final class q0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f42019d;

    public q0(android.content.Context context) {
        this.f42019d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.res.Resources resources;
        android.content.Context context = this.f42019d;
        g4Var.f(com.tencent.mm.R.id.jgi, (context == null || (resources = context.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.f493359jv2));
    }
}
